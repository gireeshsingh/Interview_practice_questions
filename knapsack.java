import java.util.HashMap;
import java.util.Map;

public class knapsack {

    public int bottomUpDP(int val[], int wt[], int W){
        int K[][] = new int[val.length+1][W+1];
        for(int i=0; i <= val.length; i++){
            for(int j=0; j <= W; j++){
                if(i == 0 || j == 0){
                    K[i][j] = 0;
                    continue;
                }
                if(j - wt[i-1] >= 0){
                    K[i][j] = Math.max(K[i-1][j], K[i-1][j-wt[i-1]] + val[i-1]);
                }else{
                    K[i][j] = K[i-1][j];
                }
            }
        }
        return K[val.length][W];
    }

    class Index {
        int remainingWeight;
        int remainingItems;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Index index = (Index) o;

            if (remainingWeight != index.remainingWeight) return false;
            return remainingItems == index.remainingItems;

        }

        @Override
        public int hashCode() {
            int result = remainingWeight;
            result = 31 * result + remainingItems;
            return result;
        }
    }

    public int topDownRecursive(int values[], int weights[], int W) {
        Map<Index, Integer> map = new HashMap<>();
        return topDownRecursiveUtil(values, weights, W, values.length, 0, map);
    }

    public int topDownRecursiveUtil(int values[], int weights[], int remainingWeight, int totalItems, int currentItem, Map<Index, Integer> map) {
        if(currentItem >= totalItems || remainingWeight <= 0) {
            return 0;
        }

        Index key = new Index();
        key.remainingItems = totalItems - currentItem -1;
        key.remainingWeight = remainingWeight;

        if(map.containsKey(key)) {
            return map.get(key);
        }
        int maxValue;
        if(remainingWeight < weights[currentItem]) {
            maxValue = topDownRecursiveUtil(values, weights, remainingWeight, totalItems, currentItem + 1, map);
        } else {
            //try to get maximumValue of either by picking the currentItem or not picking currentItem
            maxValue = Math.max(values[currentItem] + topDownRecursiveUtil(values, weights, remainingWeight - weights[currentItem], totalItems, currentItem + 1, map),
                    topDownRecursiveUtil(values, weights, remainingWeight, totalItems, currentItem + 1, map));
        }
        map.put(key, maxValue);
        return maxValue;

    }

    public static void main(String args[]){
        knapsack k = new knapsack();
        int val[] = {22, 20, 15, 30, 24, 54, 21, 32, 18, 25};
        int wt[] = {4, 2, 3, 5, 5, 6, 9, 7, 8, 10};
        int r = k.bottomUpDP(val, wt, 30);
        int r1 = k.topDownRecursive(val, wt, 30);
        System.out.println(r);
        System.out.println(r1);
    }
}
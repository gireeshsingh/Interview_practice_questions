class Solution {
    public int[][] highFive(int[][] items) {
        Arrays.sort(items, (a,b)->Integer.compare(b[1], a[1]));
        int[] score=new int[1001];
        int[] count=new int[1001];
        int[][] answer;
        List<Integer> list = new ArrayList();
        for(int[] item: items){
            if(count[item[0]]==5) continue;
            score[item[0]]+=item[1];
            count[item[0]]++;
        }
        for(int i=1; i<1001; i++){
            if(count[i]==5){
                list.add(i);
                list.add(score[i]/5);
            }
        } 
        answer= new int[list.size()/2][2];
        int j=0;
        for(int i=0; i<list.size(); i++){
            answer[j][0]=list.get(i++);
            answer[j++][1]=list.get(i);
        }
        return answer;
    }
}
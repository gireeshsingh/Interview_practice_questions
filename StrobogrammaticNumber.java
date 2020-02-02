class Solution {
    public boolean isStrobogrammatic(String num) {
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        map.put(0,0);
        map.put(1,1);
        map.put(2,-1);
        map.put(3,-1);
        map.put(4,-1);
        map.put(5,-1);
        map.put(6,9);
        map.put(7,-1);
        map.put(8,8);
        map.put(9,6);
        int i=0, j=num.length()-1;
        while(i<=j){
            int left=(int)(num.charAt(i++)-'0'), right=(int)(num.charAt(j--)-'0');
            if(map.get(left)!=right) return false;
        }
        return true;
    }
}
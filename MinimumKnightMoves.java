class Solution {
    public int minKnightMoves(int x, int y) {
        Map<String, Integer> map=new HashMap<>();
        map.put("0,0",0);
        map.put("1,0",3);
        map.put("1,1",2);
        map.put("2,1",1);
        return helper(map, x, y);
    }
    public int helper(Map<String, Integer> map, int x, int y){
        x=Math.abs(x);
        y=Math.abs(y);
        if(x<y){
            int temp=x;
            x=y;
            y=temp;
        }
        String s=x+","+y;
        if(map.containsKey(s)) return map.get(s);
        int temp=Math.min(helper(map, x-2, y-1), helper(map, x-1, y-2))+1;
        map.put(s, temp);
        return temp;
    }
}
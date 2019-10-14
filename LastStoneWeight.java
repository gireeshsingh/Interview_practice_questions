class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        int heavystone=0, lightstone=0, smashed=0, heavyindex=-1, lightindex=-1;
        while(smashed<= stones.length-2){
            for(int i=0;i<stones.length;i++){
                if(stones[i]>heavystone){
                    heavyindex=i; heavystone=stones[i];
                }
            }
            for(int i=0;i<stones.length;i++){
                if(stones[i]>lightstone && i!=heavyindex){
                    lightindex=i; lightstone=stones[i];
                }
            }
            if(heavystone==lightstone){
                smashed+=2;
                stones[heavyindex]=-1;
                stones[lightindex]=-1;
            }
            else if(heavystone>lightstone){
                smashed++;
                stones[heavyindex]-=lightstone;
                stones[lightindex]=-1;
            }
            heavystone=0; lightstone=0; heavyindex=-1; lightindex=-1;
        }
        for (int i : stones){
            if (i >= 0){
                return i;
            }
        }
        return 0;
    }
}
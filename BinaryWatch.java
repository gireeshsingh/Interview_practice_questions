class BinaryWatch {
    List<String> res;
	//fisrt 3 element represent hours, other represent minute 
    int[] val = {1, 2, 4, 8, 1, 2, 4, 8, 16, 32};
    public List<String> readBinaryWatch(int num) {
        res = new ArrayList<>();
        if (num < 0){
            return res;
        }
        generateWatch(num, 0, 0, 0);
        return res;
    }

    private void generateWatch(int step, int cur, int hour, int min){
        if (step == 0 && hour < 12 && min < 60){
            String m = min > 9 ? String.valueOf(min) : min == 0 ? "00" : "0" + min;
            String h = hour == 0 ? "0" : String.valueOf(hour);
            res.add(h + ":" + m);
            return;
        }

        for (int i = cur ; i < val.length; i ++){
            if (hour > 11) continue;
            if (min > 59) continue;

            if (i <= 3){
                generateWatch(step - 1, i + 1, hour + val[i], min);
            } else {
                generateWatch(step - 1, i + 1, hour, min + val[i]);
            }
        }
    }
}
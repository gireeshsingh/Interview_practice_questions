class ComplementOfBase10 {
    public int bitwiseComplement(int N) {
        String str=Integer.toBinaryString(N);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++) if(str.charAt(i)=='0') sb.append("1"); else sb.append("0");
        return Integer.parseInt(sb.toString(), 2);
    }
}
class Result {
    public static int marsExploration(String s) {
        int res = 0;
        String str = "SOS";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != str.charAt(i % 3))
                res += 1;
        }
        return res;
    }
}
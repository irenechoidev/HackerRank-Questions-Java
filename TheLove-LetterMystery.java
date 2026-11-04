class Result {
    public static int theLoveLetterMystery(String s) {
        int res = 0;
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            char left = s.charAt(i);
            char right = s.charAt(n - 1 - i);

            res += Math.abs(left - right);
        }
        return res;
    }
}
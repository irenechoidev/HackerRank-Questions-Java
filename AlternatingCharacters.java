class Result {
    public static int alternatingCharacters(String s) {
        int res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                res += 1;
            }
        }
        return res;
    }
}
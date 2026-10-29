class Result {
    public static int beautifulBinaryString(String b) {
        int res = 0;
        int idx = 0;
        while (idx <= b.length() - 3) {
            if (b.charAt(idx) == '0' &&
                    b.charAt(idx + 1) == '1' &&
                    b.charAt(idx + 2) == '0') {
                res += 1;
                idx += 3;
            } else {
                idx += 1;
            }
        }
        return res;
    }
}

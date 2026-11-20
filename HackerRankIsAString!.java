class Result {
    public static String hackerrankInString(String s) {
        String h = "hackerrank";
        int sPointer = 0;
        int hPointer = 0;
        while (sPointer < s.length() && hPointer < h.length()) {
            if (s.charAt(sPointer) == h.charAt(hPointer)) {
                hPointer += 1;
            }
            sPointer += 1;
        }
        return hPointer == h.length() ? "YES" : "NO";
    }
}

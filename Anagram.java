class Result {
    public static int anagram(String s) {
        int res = 0;
        if (s.length() % 2 != 0)
            return -1;
        int len = s.length() / 2;

        int[] arr = new int[26];
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            arr[c - 'a']++;
        }

        for (int i = len; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c - 'a']--;
        }

        for (int n : arr) {
            if (n > 0)
                res += n;
        }
        return res;
    }
}
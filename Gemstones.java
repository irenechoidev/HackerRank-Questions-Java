class Result {
    public static int gemstones(List<String> arr) {
        int res = 0;
        int[] bucket = new int[26];

        for (String s : arr) {
            boolean[] inThisRock = new boolean[26];
            for (char c : s.toCharArray()) {
                inThisRock[c - 'a'] = true;
            }

            for (int i = 0; i < 26; i++) {
                if (inThisRock[i])
                    bucket[i] += 1;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (bucket[i] == arr.size())
                res += 1;
        }

        return res;
    }
}
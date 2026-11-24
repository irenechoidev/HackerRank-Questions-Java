class Result {
    public static int makeAnagram(String a, String b) {
        int res = 0;
        int[] bucket = new int[26];
        for (char c : a.toCharArray())
            bucket[c - 'a']++;
        for (char c : b.toCharArray())
            bucket[c - 'a']--;

        for (int n : bucket)
            res += Math.abs(n);

        return res;

    }

}

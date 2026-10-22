class Result {
    public static String pangrams(String s) {
        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                set.add(Character.toLowerCase(c));
            }
        }

        return set.size() == 26 ? "pangram" : "not pangram";
    }
}
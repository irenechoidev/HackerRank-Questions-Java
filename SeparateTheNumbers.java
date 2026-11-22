class Result {
    public static void separateNumbers(String s) {
        if (s.charAt(0) == 0) {
            System.out.println("NO");
            return;
        }
        for (int i = 1; i <= s.length() / 2; i++) {
            long unit = Long.parseLong(s.substring(0, i));
            long curr = unit;
            StringBuilder sb = new StringBuilder();
            while (sb.length() < s.length()) {
                sb.append(curr);
                curr += 1;
            }
            if (sb.toString().equals(s)) {
                System.out.println("YES " + unit);
                return;
            }
        }
        System.out.println("NO");
    }
}

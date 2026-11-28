class Result {
    public static int alternate(String s) {
        int res = 0;
        if (s.length() < 2)
            return res;

        for (char a = 'a'; a <= 'z'; a++) {
            for (char b = (char) (a + 1); b <= 'z'; b++) {

                int len = 0;
                char prev = 0;
                boolean valid = true;
                for (char c : s.toCharArray()) {
                    if (c != a && c != b)
                        continue;
                    if (c == prev) {
                        valid = false;
                        break;
                    }
                    prev = c;
                    len += 1;
                }

                if (valid) {
                    res = Math.max(res, len);
                }
            }
        }

        return res;
    }
}

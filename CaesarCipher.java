class Result {
    public static String caesarCipher(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    sb.append((char) ((c - 'A' + k) % 26 + 'A'));
                } else {
                    sb.append((char) ((c - 'a' + k) % 26 + 'a'));
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
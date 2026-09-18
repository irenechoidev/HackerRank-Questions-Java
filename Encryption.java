public class Encryption {
    public static String encryption(String s) {

        int len = s.length();
        int row = (int) Math.floor(Math.sqrt(len));
        int col = (int) Math.ceil(Math.sqrt(len));

        if (row * col < len)
            row += 1;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < col; i++) {

            for (int j = i; j < len; j += col) {
                sb.append(s.charAt(j));
            }
            if (i < len)
                sb.append(" ");
        }

        return sb.toString();
    }
}

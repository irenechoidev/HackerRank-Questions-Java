public static String timeInWords(int h, int m) {
    if (m == 0)
        return toWords(h) + " o' clock";

    String direction = "";
    int hour = 0;
    int min = 0;
    if (m <= 30) {
        direction = "past";
        hour = h;
        min = m;
    } else {
        direction = "to";
        hour = h % 12 + 1;
        min = 60 - m;
    }

    String amount = "";
    if (min == 15)
        amount = "quarter";
    else if (min == 30)
        amount = "half";
    else {
        amount = toWords(min) + (min == 1 ? " minute" : " minutes");
    }

    return amount + " " + direction + " " + toWords(hour);
}

private static String toWords(int n) {
    String[] arr = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
            "twenty" };

    if (n < 20) {
        return arr[n];
    } else {
        return n == 20 ? "twenty" : "twenty " + arr[n - 20];
    }
}

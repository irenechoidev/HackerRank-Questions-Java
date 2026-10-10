class Result {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxHeightCandle = 0;
        int res = 0;
        for (int c : candles) {
            if (c > maxHeightCandle) {
                maxHeightCandle = c;
                res = 1;
            } else if (maxHeightCandle == c) {
                res += 1;
            }
        }
        return res;
    }
}
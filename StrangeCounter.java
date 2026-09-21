public class StrangeCounter {
    public static long strangeCounter(long t) {
        long cycleLength = 3;

        while (t > cycleLength) {
            t -= cycleLength;
            cycleLength = cycleLength * 2;
        }

        return cycleLength - t + 1;
    }
}

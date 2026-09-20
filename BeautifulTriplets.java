public class BeautifulTriplets {
    public static int beautifulTriplets(int d, List<Integer> arr) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int n = entry.getKey();
            if (map.containsKey(n + d) && map.containsKey(n + 2 * d)) {
                res += map.get(n) * map.get(n + d) * map.get(n + 2 * d);
            }
        }
        return res;

    }
}

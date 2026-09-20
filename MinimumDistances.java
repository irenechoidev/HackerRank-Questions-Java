import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumDistances {
    public static int minimumDistances(List<Integer> a) {
        int res = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            int n = a.get(i);
            if (map.containsKey(n)) {
                res = Math.min(res, i - map.get(n));
            }
            map.put(n, i);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}

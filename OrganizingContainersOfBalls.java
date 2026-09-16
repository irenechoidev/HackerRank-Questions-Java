import java.util.Arrays;
import java.util.List;

public class OrganizingContainersOfBalls {
    public static String organizingContainers(List<List<Integer>> container) {

        int n = container.size();
        int[] containers = new int[n];
        int[] ballTypes = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = container.get(i).get(j);
                containers[i] += val;
                ballTypes[j] += val;
            }
        }

        Arrays.sort(containers);
        Arrays.sort(ballTypes);

        for (int i = 0; i < n; i++) {
            if (containers[i] != ballTypes[i]) {
                return "Impossible";
            }
        }

        return "Possible";
    }
}

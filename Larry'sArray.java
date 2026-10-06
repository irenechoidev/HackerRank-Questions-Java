class Result {
    public static String larrysArray(List<Integer> A) {
        int inversions = 0;

        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (A.get(i) > A.get(j))
                    inversions += 1;
            }
        }

        return inversions % 2 == 0 ? "YES" : "NO";
    }
}
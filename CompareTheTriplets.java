class Result {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> res = new ArrayList<>();
        int aCount = 0;
        int bCount = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i))
                aCount += 1;
            else if (a.get(i) < b.get(i))
                bCount += 1;

        }
        res.add(aCount);
        res.add(bCount);

        return res;
    }
}
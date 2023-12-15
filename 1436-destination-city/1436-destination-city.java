class Solution {

    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> path : paths) {
            for (String str : path) {
                set.add(str);
            }
        }
        Set<String> s = new HashSet<>();
        for (List<String> path : paths) {
            s.add(path.get(0));
        }
        for (String val : set) {
            if (s.contains(val) == false) return val;
        }
        return "";
    }
}

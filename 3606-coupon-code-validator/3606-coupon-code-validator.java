import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        List<String> allowed = Arrays.asList(
            "electronics", "grocery", "pharmacy", "restaurant"
        );
        List<String[]> valid = new ArrayList<>();
        for (int i = 0; i < code.length; i++) {
            if(!isActive[i] || !allowed.contains(businessLine[i]) || !code[i].matches("[A-Za-z0-9_]+")) continue;
            valid.add(new String[]{businessLine[i], code[i]});
        }
        List<String> order = Arrays.asList(
            "electronics", "grocery", "pharmacy", "restaurant"
        );
        Collections.sort(valid, (a, b) -> {
            int p1 = order.indexOf(a[0]);
            int p2 = order.indexOf(b[0]);
            if (p1 != p2) return p1 - p2;
            return a[1].compareTo(b[1]);
        });
        List<String> result = new ArrayList<>();
        for (String[] v : valid) {
            result.add(v[1]);
        }
        return result;
    }
}

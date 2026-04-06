package stefdef;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("electricity");
        set.add("petrol");
        set.add("wastage");
        System.out.println(set);
    }
}

package stefdef;

import java.util.LinkedList;

public class ListExample {
    public static void   main(String[] args){
        java.util.List<String>
                list = new LinkedList<>();
        list.add("electricity");
        list.add("petrol");
        list.add("wastage");
        System.out.println(list);
    }
}

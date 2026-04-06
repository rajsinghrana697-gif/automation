import java.util.HashMap;
import java.util.Map;

public class Api {
    public static void main(String[] args) {
        Map<String, Double>
                map = new HashMap<>();
        map.put("electricity", 20.0);
        map.put("Petrol", 20.0);
        map.put("wastage", 30.0);
        System.out.println(map);
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());

        }
    }

}
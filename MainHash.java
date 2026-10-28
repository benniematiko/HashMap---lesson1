import java.util.TreeMap;
import java.util.Map;

public class MainHash {
    public static void main(String[] args) {
        TreeMap<String, Integer> fruitPrices = new TreeMap<>();
        fruitPrices.put("Zebra Apple", 3);
        fruitPrices.put("Apple", 5);
        fruitPrices.put("Mango", 7);

        System.out.println("Sorted fruit prices: " + fruitPrices);

        // Iterate over entries (key -> value)
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
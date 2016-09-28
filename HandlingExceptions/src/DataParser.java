import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataParser {

    public static void main(String[] args) {


        List<Map<String, String>> myList = new ArrayList<>();


        HashMap myMap = new HashMap<String, String>();
        HashMap myMap1 = new HashMap<String, String>();
        HashMap myMap2 = new HashMap<String, String>();

        myMap.put("name", "Ed");
        myMap.put("weight", "74.1");
        myMap.put("height", "1.70");

        myMap1.put("name", "Frank");
        myMap1.put("weight", "81,5");
        myMap1.put("height", "1.83");

        myMap2.put("name", "Carl");
        myMap2.put("weight", "65.9");
        myMap2.put("height", "1.62");

        myList.add(myMap);
        myList.add(myMap1);
        myList.add(myMap2);

    }
}

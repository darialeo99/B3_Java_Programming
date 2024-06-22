package day42_b_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {

    public static void main(String[] args) {

        // Map works with KEY - VALUE
        // KEYS have to be UNIQUE, they can not be duplicate
        Map <Integer , String > map = new HashMap<>();
        map.put(1, "one"); // we use put(); method to add elements
        map.put(3, "three");
        map.put(10, "ten");
        map.put(5, "five");
        System.out.println(map); // Insertion order in HashMap is Random

        //Q: How do we read key/value from map
        System.out.println(map.get(10)); // this is NOT index. This is the KEY object

        String value = map.get(3); // this returns the value assigned to KEY (3) ---> "three"
        System.out.println(value);

        //Q: How do I remove the key/value?

        map.remove(1); // remove(KEY); will remove the ENTRY (KEY+VALUE) which is associated with KEY 1
        System.out.println(map);

        //Q: How can I check if specific key is in the map
        //A: .containsKey

        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(3));

        //Q: How can I check if the specific VALUE is in the Map
        //A: containsValue(VALUE);

        System.out.println(map.containsValue("five"));
        System.out.println(map.containsValue("10"));
        //System.out.println(map.containsValue(10)); //since containsValue(Object obj) method accepts as Object, sending 10 is fine, but will return false

        // HashMap can accept hull --> as KEY and as VALUE
        map.put(null, null);
        System.out.println(map);

        map.put(5, "fivefive"); // Since KEY in map does not allow duplicates, it will update the value of the KEY is it existed already
        System.out.println(map);

        map.put(null, "java"); // null KEY already existed, so I updated VALUE
        System.out.println(map);

        map.put(null, "api"); // null KEY already existed, so I updated VALUE
        System.out.println(map);

        map.put(3, "March");
        System.out.println(map);

        map.put(7, "March"); // Duplicate VALUES are ok but duplicate KEYS are not ok
        System.out.println(map);

        // This is holding Map as a VALUE inside anther Map
        System.out.println();

        Map <String, Map<String, String>> infoPeopleAndCountry = new HashMap<>();

        Map <String, String> mapOne = new HashMap<>();
        mapOne.put("Tom", "Jerry");
        mapOne.put("Mickey", "Mouse");

        Map <String , String> mapTwo = new HashMap<>();
        mapTwo.put("Turkey", "Ankara");
        mapTwo.put("Azerbaijan", "Baku");

        infoPeopleAndCountry.put("people", mapOne);
        infoPeopleAndCountry.put("countries", mapTwo);
        System.out.println(infoPeopleAndCountry);
        //infoPeopleAndCountry.put(3, map); //can NOT add it because it is <Integer, String>
        System.out.println(  infoPeopleAndCountry.get("countries")  );
        System.out.println(  infoPeopleAndCountry.get("countries").get("Turkey")  );



    }
}

package LearnCollectionFramework.res1;
import java.util.*;
public class MapImplHashMap {
    public static void main(String[] args) {

        // the key must dbe unique but values can have similar values


        Map<String, Integer> hashmap = new HashMap<>();

        hashmap.put("Narendra",10);
        hashmap.put("Arun",20);
        hashmap.put("Arun",10);
        hashmap.put("Prabha",40);

        System.out.println(hashmap);

        System.out.println("The value for the Key Narendra = " + hashmap.get("Narendra"));
        System.out.println("The value for the Key Rajarshi = " + hashmap.get("Rajarshi"));
        System.out.println("The value for the Key Rajarshi = " + hashmap.getOrDefault("Rajarshi", 0));

        System.out.println("is Arun present : " + hashmap.containsKey("Arun"));
        hashmap.remove("Arun");
        System.out.println("is Arun present : " + hashmap.containsKey("Arun"));



        //lets traverse a map


    }
}

package DSAInJava.BroCode;

import java.util.Hashtable;

public class HashtableLearn {
    public static void main(String[] args) {
//        Hashtable<Integer, String> table = new Hashtable<>(10);
//        table.put(100, "Spongebob");
//        table.put(123, "Patrick");
//        table.put(321, "Sandy");
//        table.put(555, "Squidward");
//        table.put(777, "Gary");
//
//        //table.remove(777);
//        for(Integer key : table.keySet())
//            System.out.println(key.hashCode() %10 + " " + key + " " + table.get(key));



        Hashtable<String, String> table = new Hashtable<>(21);
        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        //table.remove(777);
        for(String key : table.keySet())
            System.out.println(key.hashCode() %21 + " " + key + " " + table.get(key));


    }
}

package LearnCollectionFramework.res1;
import java.util.*;
public class MapImplNavigableMap {
    public static void main(String[] args) {
        //NavigableMap<Integer, String> tmap = new TreeMap<>();
        //descending 0rder
        NavigableMap<Integer, String> tmap = new TreeMap<>((a, b) -> b - a);
        tmap.put(1, "Ram");
        tmap.put(2,"Sita");
        tmap.put(7, "Laxman");
        tmap.put(4, "Ravan");
        tmap.remove(4);

        System.out.println(tmap);
        System.out.println(tmap.pollFirstEntry() + " " + tmap.pollLastEntry());
        System.out.println(tmap.get(tmap.ceilingKey(3)));
    }
}

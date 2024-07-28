package LearnCollectionFramework.res1;

import java.util.*;

public class SetImplHastSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> al = new ArrayList<>();
//        for(int i = 0; i<10; i++)
//            al.add(sc.nextInt());
//
//        Set<Integer> st = new HashSet<>(al);
//        st.add(2);
//        st.remove(2);
//
//        System.out.println("The set : " +st);


        //retainAll()
        Set<Integer> st1 = new HashSet<>();
        st1.add(1);
        st1.add(2);
        st1.add(3);

        Set<Integer> st2 = new HashSet<>();
        st2.add(2);
        st2.add(3);
        st2.add(4);


        System.out.println("Before Retaining : ");
        System.out.println("Set 1 : " + st1);
        System.out.println("Set 2 : " + st2);
        System.out.println("st1.retainAll(st2);");
        System.out.println("After Retaining : ");
        st1.retainAll(st2);
        System.out.println("Set 1 : " + st1);
        System.out.println("Set 2 : " + st2);


        // total opposite of retainAll is removeAll
        Set<Integer> st3 = new HashSet<>();
        st3.add(1);
        st3.add(2);
        st3.add(3);

        Set<Integer> st4 = new HashSet<>();
        st4.add(2);
        st4.add(3);
        st4.add(4);


        System.out.println("Before Remove : ");
        System.out.println("Set 3 : " + st3);
        System.out.println("Set 4 : " + st4);
        System.out.println("st3.removeAll(st4);");
        System.out.println("After Remove : ");
        st3.removeAll(st4);
        System.out.println("Set 3 : " + st3);
        System.out.println("Set 4 : " + st4);



        //Union operation
        Set<Integer> st5 = new HashSet<>();
        st5.add(1);
        st5.add(2);
        st5.add(3);

        Set<Integer> st6 = new HashSet<>();
        st6.add(2);
        st6.add(3);
        st6.add(4);


        System.out.println("Before Union : ");
        System.out.println("Set 5 : " + st5);
        System.out.println("Set 6 : " + st6);
        System.out.println("st5.addAll(st6);");
        System.out.println("After Union : ");
        st5.addAll(st6);
        System.out.println("Set 5 : " + st5);
        System.out.println("Set 6 : " + st6);



        // let's learn about LinkedHashSet
        // LinkedHashSet<>() actually maintains the order of the insertion;

        Set<Integer> st7 = new HashSet<>();
        st7.add(8);
        st7.add(0);
        st7.add(2);
        st7.add(-1);
        st7.add(8);
        st7.add(3);
        st7.add(1);
        System.out.println("Check the set 7 using a HashSet<>()");
        for(int x : st7) System.out.print(x + " ");
        Set<Integer> st8 = new LinkedHashSet<>();
        st8.add(8);
        st8.add(0);
        st8.add(2);
        st8.add(-1);
        st8.add(8);
        st8.add(3);
        st8.add(1);
        System.out.println("\nCheck the set 8 using a LinkedHashSet<>()");
        for(int y : st8) System.out.print(y + " ");



    }
}

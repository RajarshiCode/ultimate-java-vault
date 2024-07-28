package LearnCollectionFramework.res1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ListImplArrayList {
    public static void main(String[] args) {

        /*

        in dsa whenever you required a list or array use arraylist that's it
        * list with predefined size
        * List<Integer> arr = Arrays.asList(new Integer[10]);
        *
        * */


        List<Integer> arList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elemets in the Arraylist:");
        for(int i = 0; i<10 ;i++)
        {
            //add method
            arList.add(sc.nextInt());
        }


        System.out.println(arList);
        System.out.println("Element that go replaced = " + arList.set(0,100));

        //arList.set(10,100); //runtime exception
        System.out.println("Alteration:");
        System.out.println(arList);
        System.out.println("Size = " + arList.size());


        // copy a arraylist
        List<Integer> arList2 = new ArrayList<>(arList);
//        for(int x : arList)
//        {
//            arList2.add(x);
//        }
        // another way
         //arList2.addAll(arList);
        System.out.println("The second arrayList:" + arList2);
        // Suppose if we have certain elements already in the arraylist and want to addAll after that then

        List<Integer> arList3 = new ArrayList<>();
        arList3.add(10);
        arList3.add(20);
        arList3.add(30);
        arList3.add(40);

        arList3.addAll(arList2);
        System.out.println("The third arrayList:" + arList3);
        //index
        System.out.println("Index of 100 in third arraylist : " + arList3.indexOf(100));
        arList3.add(20);
        System.out.println("The third arrayList:" + arList3);
        System.out.println("Last Index of 20 in third arraylist : " + arList3.indexOf(20));

        // get the last method
        System.out.println("Last element of third arraylist: "  + arList3.get(arList3.size() - 1));


        // Sublist

        List<Integer> arList4 = arList3.subList(3,7);
        System.out.println("The sublist of arrayList3 : " + arList4);
        System.out.println("\nAfter the alteration : \n\n");
        // check for the alteration in the sub-arrayList also affects the main arrayList too
        arList4.set(1, 400);
        System.out.println("The third arrayList:" + arList3);
        System.out.println("The sublist of arrayList3 : " + arList4);

//        List<Integer> lk = new LinkedList<>();
//        ArrayList<Integer> meow  = new ArrayList<>();
//        LinkedList<Integer> listyt = new LinkedList<>();

    }
}

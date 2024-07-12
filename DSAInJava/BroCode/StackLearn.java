package DSAInJava.BroCode;


import java.util.Stack;
public class StackLearn {
    public static void main(String[] args) {
        // LIFO data structure. Last In First Out.
        // push() , pop(), search(), peek(), empty().
        //  stores object like a vertical tower
        Stack<String> stack = new Stack<String>();




            stack.push("Rupak");
            stack.push("Jaya");
            stack.push("Lubdhak");
            stack.push("Aindriya");



            System.out.println(stack.empty());




            System.out.println(stack);

            String nameCheck = stack.pop(); // gonna store the top element which will get deleted

            // stack.pop(); // the last elements gets deleted,
//            stack.pop();
//            stack.pop();
//            stack.pop();
//            stack.pop();

            System.out.println(stack);

            System.out.println("Name in the top, which got deleted = " + nameCheck);
            System.out.println("Current top element = " + stack.peek());


            System.out.println("For each loop to traverse");
            for(String str : stack)
            {
                System.out.print(str + "\t");
            }

            System.out.println("\nSearch for an element");
            if(stack.search("Rupak")>0)
                System.out.println("Present");
            else
                System.out.println("Not Present");


            /*
            * use of stacks?
            *
            * undo/redo features in text editors
            * moving back/forward through browser history
            * backtracking algorithms
            * calling function(call stack)
            *
            * */


    }
}

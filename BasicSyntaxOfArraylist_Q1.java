//Q1 : W.A.P that implement all Basics Syntax of ArrayList.
package Java.Arraylist;
import java.util.Scanner;
import java.util.ArrayList;
public class BasicSyntaxOfArraylist_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l1=new ArrayList<Integer>();
        //add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        //get an element at index i
        System.out.println(l1.get(1));
        //print with for loop
        for(int i=0;i<l1.size();i++) {
            System.out.println(l1.get(i));
        }
        //printing ArrayList Directly
        System.out.println(l1);
        //Adding element at some index i 
        l1.add(1,100);
        System.out.println(l1);
        //Modifying Element at index i
        l1.set(1,9);
        System.out.println(l1);
        //Removing an element at index i
        l1.remove(1);
        System.out.println(l1);
        //Removing an Element e
        l1.remove(Integer.valueOf(7));      //it is an boolean method that returns true or false
        System.out.println(l1);
        //Checking if an element exists
        boolean ans=l1.contains(Integer.valueOf(60));
        System.out.println(ans);
        //if you don't specify class, you can put anything inside l
        ArrayList l=new ArrayList();
        l.add("HUNTER");
        l.add(8);
        l.add(true);
        System.out.println(l);
        sc.close();
    }
}

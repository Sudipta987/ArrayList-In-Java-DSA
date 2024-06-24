//Q3 : W.A.P to sort an ArrayList of Strings in Descending Order.
package Java.Arraylist;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class SortOfArrayList_Q3 {
    public static void main(String[] args) {
        ArrayList<String> l1=new ArrayList<>();
        l1.add("Sudipta ");
        l1.add("Hunter");
        l1.add("Hi");
        l1.add("Surya");
        System.out.println("Original ArrayList: "+l1);
        Collections.sort(l1);
        System.out.println("Ascending Order of ArrayList: "+l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Descending Order of ArrayList: "+l1);
        
    }
}

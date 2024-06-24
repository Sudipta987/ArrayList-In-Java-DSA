//Q2 : W.A.P to Reverse the given ArrayList.
package Java.Arraylist;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ReverseArrayList_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer> ();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original ArrayList is : "+list);
       //Reverse the list
        Collections.reverse(list);
        // reverseList(list);
        System.out.println("Reverse ArrayList is : "+list);
        //sort the list in Ascendign Order
        Collections.sort(list);
        System.out.println("Ascending order of ArrayList: "+list);
        //sort the list in Descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending Order of ArrayList: "+list);
        sc.close();
    }
    public static void reverseList(ArrayList<Integer> list) {
        int i=0,j=list.size()-1;
        while(i<j) {
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
}

import java.util.ArrayList;

public class Arraylist {
 public static void main(String[] args) {

    //Syntax
        ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(4);
    //access
    System.out.println(arr.get(0)); //prints 1
    System.out.println(arr.get(3));
    //remove
    System.out.println(arr.remove(1));
    System.out.println(arr.get(0));
    //update
    arr.set(0,10);
    System.out.println(arr.get(0));
 }


 
    


}

// import java.util.Collections;
import java.util.*;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> Name = new ArrayList<>();

        // add element
        Name.add(1);
        Name.add(5);
        Name.add(3);
        Name.add(7);
        Name.add(5);
        Name.add(2);
        Name.add(0);
        System.out.println(Name);
        Collections.sort(Name);
        System.out.println(Name);
        }
}

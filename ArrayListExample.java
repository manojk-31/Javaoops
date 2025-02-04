import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Initial List: " + numbers);

        
        numbers.remove(2);  
        System.out.println("After removing the third element: " + numbers);

        numbers.set(1, 25);  
        System.out.println("After updating the second element: " + numbers);

        System.out.println("Final list elements:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

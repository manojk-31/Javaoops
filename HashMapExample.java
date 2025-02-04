import java.util.*;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");
        students.put(105, "Eve");

        System.out.println("Initial Student Records: " + students);

        int rollNumberToFind = 103;
        if (students.containsKey(rollNumberToFind)) {
            System.out.println("Student with roll number " + rollNumberToFind + ": " + students.get(rollNumberToFind));
        } else {
            System.out.println("Student with roll number " + rollNumberToFind + " not found.");
        }

        int rollNumberToRemove = 104;
        students.remove(rollNumberToRemove);
        System.out.println("Updated Student Records after removing roll number " + rollNumberToRemove + ": " + students);

        System.out.println("Final Student Records:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

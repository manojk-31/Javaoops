import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();

        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("New York"); 

        System.out.println("Cities in the HashSet: " + cities);

        String cityToCheck = "Chicago";
        if (cities.contains(cityToCheck)) {
            System.out.println(cityToCheck + " exists in the set.");
        } else {
            System.out.println(cityToCheck + " does not exist in the set.");
        }

        cities.remove("Houston");
        System.out.println("Updated Cities in the HashSet after removal: " + cities);
    }
}

import java.util.HashMap;

public class ShoppingCart {
    public static void main(String[] args) {
        // Creating a user object using HashMap
        HashMap<String, Object> user = new HashMap<>();

        // Initial properties
        user.put("name", "John Doe");
        user.put("age", 25);
        user.put("city", "New York");

        // Updating age property
        user.put("age", 26);

        // Adding new property: profession
        user.put("profession", "Software Engineer");

        // Deleting city property
        user.remove("city");

        // Printing final object
        System.out.println("Final User Object: " + user);
    }
}
import java.util.HashMap;
import java.util.Map;

public class UserObject {
    public static void main(String[] args) {
        // Creating the user object
        Map<String, Object> user = new HashMap<>();
        user.put("name", "John Doe");
        user.put("age", 30);
        user.put("city", "New York");

        // Updating the age property
        user.put("age", 35);

        // Adding a new property: profession
        user.put("profession", "Software Engineer");

        // Deleting the city property
        user.remove("city");

        // Printing the final object
        System.out.println(user);
    }
}
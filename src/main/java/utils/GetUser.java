/*
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
userdetails.1={username=Alice,password=25,role=test}
userdetails.2={username=Bob,password=30,role=test1}
public class ConfigReader {
    private List<UserDetails> people = new ArrayList<>();

    public ConfigReader() {
        Properties properties = new Properties();
        // Load properties from file or other source

        for (int i = 1; ; i++) {
            String userDetailsProperty = properties.getProperty("userdetails." + i);
            if (userDetailsProperty == null) {
                break; // Break loop if no more userdetails.X property exists
            }

            // Extract values from the property string
            String[] userDetails = userDetailsProperty
                    .replace("{", "")
                    .replace("}", "")
                    .split(",");

            String username = "";
            String password = "";
            String role = "";

            for (String detail : userDetails) {
                String[] parts = detail.split("=");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    switch (key) {
                        case "username":
                            username = value;
                            break;
                        case "password":
                            password = value;
                            break;
                        case "role":
                            role = value;
                            break;
                        // Add more cases if needed for other properties
                    }
                }
            }

            // Create UserDetails object and add to the list
            people.add(new UserDetails(username, password, role));
        }
    }

    public List<UserDetails> getPeopleList() {
        return people;
    }

    // ... other methods
}*/

package utils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConfigReader {
     Properties properties= new Properties();
    List<UserDetails> people = new ArrayList<>();

    /*public ConfigReader() {
        properties = new Properties();
        try (InputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
            // Handle the exception (logging, throw RuntimeException, etc.)
        }
    }*/

    public ConfigReader() {
        try {
            InputStream is = ConfigReader.class.getResourceAsStream("/config.properties");
            if(is != null) {
                properties.load(is);
                // Read userdetails property (array of objects)
                /*String loginInfo = properties.getProperty("userdetails");
                // Remove square brackets and split by closing curly braces followed by an opening curly brace
                String[] parts = loginInfo.substring(1, loginInfo.length() - 1).split("\\}\\s*\\{");


                // Pattern to match username and password within curly braces
                Pattern pattern = Pattern.compile("username=(.*?),password=(\\d+),role=(.*?)");

                for (String part : parts) {
                    Matcher matcher = pattern.matcher(part);
                    if (matcher.find()) {
                        String name = matcher.group(1);
                        String password = matcher.group(2);
                        String role = matcher.group(3);
                        //int age = Integer.parseInt(matcher.group(2));
                        people.add(new UserDetails(name, password,role));
                    }
                }*/
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public List<UserDetails> getPeopleList() {
        return people;
    }

   /* public UserDetails getUserByRole(String role) throws Exception {
        List<UserDetails> a =getPeopleList();
        for (UserDetails person : a) {
            System.out.println(person.getRole());
           if(person.getRole().equalsIgnoreCase(role)){
                System.out.println(person.getRole());
                return  person;
            }
        }
        throw new Exception("User with role" + role + " not found");
    }*/
}

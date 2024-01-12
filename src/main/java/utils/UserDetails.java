package utils;

import java.util.ArrayList;
import java.util.List;

public class UserDetails {
    private String name;
    private String password;

    private String role;

    public UserDetails(String name, String password,String role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }


}

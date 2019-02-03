package com.sousouit.entity;

import java.util.List;
import java.util.Map;

public class User {
    private String username;
    private String password;
    private String email;
    private String points;
    private List<String> hisbooks;
    private Map<String, String> hisprocess;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public void setHisbooks(List<String> hisbooks) {
        this.hisbooks = hisbooks;
    }

    public void setHisprocess(Map<String, String> hisprocess) {
        this.hisprocess = hisprocess;
    }

    public String getUsername() {

        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPoints() {
        return points;
    }

    public List<String> getHisbooks() {
        return hisbooks;
    }

    public Map<String, String> getHisprocess() {
        return hisprocess;
    }
}

package com.example.ashish.mynewgithub;

import java.util.ArrayList;

/**
 * Created by ashish on 6/7/17.
 */

public class UserList {

    ArrayList<User> items;

    public ArrayList<User> getUserArrayList() {
        return items;
    }

    public void setUserArrayList(ArrayList<User> userArrayList) {
        this.items = userArrayList;
    }

    public UserList(ArrayList<User> userArrayList) {

        this.items = userArrayList;
    }
}

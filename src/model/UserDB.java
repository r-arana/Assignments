package model;

import java.util.ArrayList;

/**
 * Created by Rene on 6/4/2017.
 *
 */
public class UserDB {

    private static ArrayList <User> users = new ArrayList<User>();

    public static ArrayList<User> getUsers(){
        return users;
    }

    public static void setUsers(ArrayList<User> users){
        UserDB.users = users;
    }

}

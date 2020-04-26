package org.project2.DataBase;


import org.project2.model.Message;
import org.project2.model.Profile;

import java.util.HashMap;
import java.util.Map;

public class DataBase {

    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<String, Profile> profiles = new HashMap<>();

    public static Map<Long, Message> getMessages(){
        return messages;
    }

    public static Map<String, Profile> getProfiles(){
        return profiles;
    }

}

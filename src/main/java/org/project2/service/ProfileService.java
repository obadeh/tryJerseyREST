package org.project2.service;

import org.project2.model.Message;
import org.project2.model.Profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProfileService {

    private static Map<String, Profile> profiles = new HashMap<>();


    public ProfileService(){
        profiles.put("obadaProfile",new Profile(1l,"obadaProfile","obada","quran"));
    }

    public List<Profile> getAllProfiles(){

        return new ArrayList<>(profiles.values());
    }

    public Profile getOneProfile(String profileName){
        return profiles.get(profileName);
    }

    public Profile addProfile(Profile profile){
        profile.setId(profiles.size()+1);
        profiles.put(profile.getProfileName(),profile);
        return profile;
    }

    public Profile updateProfile(Profile profile){
        if(profile.getProfileName().isEmpty()){
            return null;
        }
        profiles.put(profile.getProfileName(),profile);
        return profile;
    }

    public String removeProfile(String profileName){
        profiles.remove(profileName);
        return "item deleted";
    }
}

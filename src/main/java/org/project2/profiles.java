package org.project2;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.project2.model.Profile;
import org.project2.service.ProfileService;

import java.util.List;

@Path("profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class profiles {

  ProfileService profileService = new ProfileService();


    @GET
    public List<Profile> getAllProfiles(){

        return profileService.getAllProfiles();
    }

    @POST
    public Profile addProfile(Profile profile){
        return profileService.addProfile(profile);
    }

    @GET
    @Path("/{profileName}")
    public Profile getAllProfiles(@PathParam("profileName") String profileName){

        return profileService.getOneProfile(profileName);
    }


    @DELETE
    @Path("/{profileName}")
    public String deleteProfile(@PathParam("profileName") String profileName){
        return profileService.removeProfile(profileName);
    }


    @PUT
    @Path("/{profileName}")
    public Profile updateProfile(@PathParam("profileName") String profileName, Profile profile){
        return profileService.updateProfile(profile);
    }




}

package org.project2;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.project2.model.Message;
import org.project2.service.MessageService;

import java.util.List;


@Path("messeges")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Messeges {


    MessageService messageService = new MessageService();

    @GET
    public List<Message> getIt(
            @QueryParam("start") int start,
            @QueryParam("length") int length
    ) throws Exception {

        return messageService.getLimited(start,length);
    }

    @GET
    @Path("/{messageid}")
    public Message getOneMessege(@PathParam("messageid") String id) {
        long longId = Long.parseLong(id);
        return messageService.getMessage(longId);
    }

    @POST
    public Message addMessage(Message message) {
        return messageService.addMessage(message);
    }

    @PUT
    @Path("/{messageid}")
    public Message updateMessage(@PathParam("messageid") long id,Message message){

        return messageService.updateMessage(message);
    }

    @DELETE
    @Path("/{messageid}")
    public String deleteMessage(@PathParam("messageid") long id){

        return messageService.deleteMessage(id);
    }


    @Path("/{messageid}/comments")
    public CommentResourse updateProfile(){
        return new CommentResourse();
    }

}

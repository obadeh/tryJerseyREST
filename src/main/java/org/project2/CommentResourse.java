package org.project2;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.project2.model.Comment;
import org.project2.service.CommentService;

import java.util.List;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommentResourse {

    private CommentService commentService = new CommentService();

    @GET
    public List<Comment> getComments(@PathParam("messageid") long messageid){
        return commentService.getAllComments(messageid);
    }

    @POST
    public Comment addComment(@PathParam("messageid") long messageid,Comment comment){
        return commentService.addComment(messageid,comment);
    }

}

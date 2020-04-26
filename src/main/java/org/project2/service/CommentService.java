package org.project2.service;

import org.project2.DataBase.DataBase;
import org.project2.model.Comment;
import org.project2.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CommentService {


    private Map<Long, Message> messages = DataBase.getMessages();

//    public CommentService(){
//        messages.get(1L).getComments();
//    }

    public List<Comment> getAllComments(long meesegeId){

        Map<Long,Comment> comments = messages.get(meesegeId).getComments();

        return new ArrayList<Comment>(comments.values());
    }

    public Comment addComment(long messegeId, Comment comment){
        Map<Long,Comment> comments = messages.get(messegeId).getComments();
        comment.setId(comments.size()+1);
        comments.put(comment.getId(),comment);
        return comment;
    }
}

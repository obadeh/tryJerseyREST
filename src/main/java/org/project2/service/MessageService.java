package org.project2.service;

import org.project2.model.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageService {

    private static Map<Long, Message> messages = new HashMap<>();

    public MessageService(){
        messages.put(1L,new Message(1,"first message","obada"));
        messages.put(2L,new Message(2,"second message","obada"));

    }

    public List<Message> getAllMessages(){

        return new ArrayList<>(messages.values());
    }

    public List<Message> getLimited(int start,int length) throws Exception {

        ArrayList<Message> list = new ArrayList<>(messages.values());
        if (length==0){
            return list;
        }
        if (length>list.size()){
           throw new Exception("length greater than size");
        }

        return list.subList(start,length);
    }

    public Message getMessage(long id){
        return messages.get(id);
    }

    public Message addMessage(Message message){
        message.setId(messages.size()+1);
        messages.put(message.getId(),message);
        return message;
    }

    public Message updateMessage(Message message){
        if(message.getId() <= 0){
            return null;
        }
        messages.put(message.getId(),message);
        return message;
    }

    public String deleteMessage(long id){
         messages.remove(id);
         return "item deleted";
    }
}

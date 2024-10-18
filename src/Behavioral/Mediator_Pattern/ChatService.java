package Mediator_Pattern;

import java.util.ArrayList;
import java.util.List;

public class ChatService implements ChatMediator{

    private List<User>users;

    public ChatService(){
        this.users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {

        for(User user : users){
            if(user!=sender){
                user.receiveMessage(message);
            }
        }
        
    }
    
}

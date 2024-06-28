package Mediator_Pattern;

public class ChatUser implements User{

    private ChatService chatService;
    private String username;

    public ChatUser(ChatService chatService, String username){
        this.chatService = chatService;
        this.username = username;
        chatService.addUser(this);
    }

    public void send(String message){
        System.out.println(username+" sends message: "+message);
        chatService.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {

        System.out.println(username + " received message: "+ message);
        
    }
    
}

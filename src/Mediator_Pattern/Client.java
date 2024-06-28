package Mediator_Pattern;

public class Client {
    public static void main(String[] args) {

        ChatService chatService = new ChatService();

        ChatUser user1 = new ChatUser(chatService, "Sadia");
        ChatUser user2 = new ChatUser(chatService, "Farzana");
        ChatUser user3 = new ChatUser(chatService, "Jessia");

        user1.send("Hello Everyone!!!...");
        
    }
    
}

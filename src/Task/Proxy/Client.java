package Task.Proxy;

public class Client {
    public static void main(String[] args) {

        Proxy proxy = new Proxy();

        proxy.run("mkdir Design Pattern", "User");
        proxy.run("rm -rf", "User");  //regular user cannot use this command
        proxy.run("rm -rf", "Admin");
        
    }
    
}

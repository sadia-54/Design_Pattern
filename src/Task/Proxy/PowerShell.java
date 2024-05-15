package Task.Proxy;

public class PowerShell implements Terminal{
    @Override
    public void run(String command, String user) {
        
        System.out.println(command + " Run As " + user + " Successfully!");
    }
}

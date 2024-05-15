package Task.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements Terminal{
    private PowerShell powershell;
    private List<String> vulnerableCmd;
    
    public Proxy() {

        vulnerableCmd = new ArrayList<>();
        vulnerableCmd.add("rm -rf");
        powershell = new PowerShell();
    }

    @Override
    public void run(String command, String user) {
        if(vulnerableCmd.contains(command) && user != "Admin"){ //only admin can run this command
            System.out.println("Regular User Cannot Run This Command: " + command);
        }
        else{
            powershell.run(command,user);
        }
    }

}

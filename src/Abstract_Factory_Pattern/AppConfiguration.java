package Abstract_Factory_Pattern;

public class AppConfiguration {

    private static Application configureApplication(){
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        // String osName = "mac";

        if(osName.contains("mac")){
            factory = new MacFactory();
        }
        else{
            factory = new WindowsFactory();
        }
        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.show();
    }
    
}

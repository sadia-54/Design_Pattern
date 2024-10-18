package Abstract_Factory_Pattern;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory)
    {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void show(){
        button.show();
        checkbox.show();
    }
    
}

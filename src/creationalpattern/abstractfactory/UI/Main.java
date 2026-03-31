package creationalpattern.abstractfactory.UI;

public class Main {
    public static void main(String[] args) {
        UIFactory uiFactory=new LightFactory();

        Button button=uiFactory.createButton();
        Checkbox checkbox=uiFactory.createCheckBox();
        checkbox.checkBox();
        button.render();
    }
}

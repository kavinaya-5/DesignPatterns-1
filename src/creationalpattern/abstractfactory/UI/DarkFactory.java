package creationalpattern.abstractfactory.UI;

public class DarkFactory implements UIFactory {
    public Button createButton()
    {
        return new LightButton();
    }

    public Checkbox createCheckBox()
    {
        return new LightCheckBox();
    }
}

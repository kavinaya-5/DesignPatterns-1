package creationalpattern.abstractfactory.UI;

public class LightFactory implements UIFactory{

    public Button createButton()
    {
        return new LightButton();
    }

    public Checkbox createCheckBox()
    {
        return new LightCheckBox();
    }
}

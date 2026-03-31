package creationalpattern.factorypattern.documentgenerator;

public class WordFactory extends DocumentFactory{

    public Document generateDocument()
    {
        return new WordDocument();
    }
}

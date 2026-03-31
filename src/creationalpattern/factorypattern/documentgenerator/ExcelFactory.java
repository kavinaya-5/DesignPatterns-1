package creationalpattern.factorypattern.documentgenerator;

public class ExcelFactory extends DocumentFactory{

    public Document generateDocument()
    {
        return new ExcelDocument();
    }
}

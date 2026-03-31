package creationalpattern.factorypattern.documentgenerator;

public class PdfFactory extends DocumentFactory{

    public Document generateDocument()
    {
        return new PdfDocument();
    }
}

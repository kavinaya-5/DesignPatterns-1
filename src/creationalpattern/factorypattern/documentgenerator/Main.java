package creationalpattern.factorypattern.documentgenerator;

public class Main {
    public static void main(String[] args) {
        DocumentFactory documentFactory=new PdfFactory();
        Document document=documentFactory.generateDocument();
        document.generate();
    }
}

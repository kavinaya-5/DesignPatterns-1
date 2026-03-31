package structuralpattern.adapterpattern.adaptee;

public class OpenAi {
    public String generateCompletion(String prompt)
    {
        return "The idea is generated for the prompt:"+prompt;
    }
}

package structuralpattern.adapterpattern.adaptee;

public class Local {
    public String generateMessage(String prompt)
    {
        return "The message is generated for the prompt:"+prompt;
    }
}

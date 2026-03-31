package structuralpattern.adapterpattern.adapter;

import structuralpattern.adapterpattern.adaptee.Local;

public class LocalAdapter {
    Local local;

    public LocalAdapter(Local local)
    {
        this.local=local;
    }

    public String generateResponse(String prompt)
    {
        return local.generateMessage(prompt);
    }
}

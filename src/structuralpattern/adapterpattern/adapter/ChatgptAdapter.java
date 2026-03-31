package structuralpattern.adapterpattern.adapter;

import structuralpattern.adapterpattern.adaptee.Chatgpt;

public class ChatgptAdapter {

    Chatgpt chatgpt;
    public ChatgptAdapter(Chatgpt chatgpt)
    {
        this.chatgpt=chatgpt;
    }

    public String generateImage(String prompt)
    {
        return chatgpt.generateImage(prompt);
    }
}

package structuralpattern.bridgepattern.messageformatter.concreteabstraction;

import structuralpattern.bridgepattern.messageformatter.abstraction.MessageSender;

public class EmailSender implements MessageSender {
    public void sendMessage(String context)
    {
        System.out.println("Email message is:"+context);
    }
}

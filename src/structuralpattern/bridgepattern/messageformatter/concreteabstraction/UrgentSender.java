package structuralpattern.bridgepattern.messageformatter.concreteabstraction;

import structuralpattern.bridgepattern.messageformatter.abstraction.MessageSender;

public class UrgentSender implements MessageSender {
    @Override
    public void sendMessage(String context)
    {
        System.out.println("urgent message is:"+context);
    }
}

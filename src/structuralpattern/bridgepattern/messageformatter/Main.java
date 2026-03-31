package structuralpattern.bridgepattern.messageformatter;

import structuralpattern.bridgepattern.messageformatter.abstraction.MessageSender;
import structuralpattern.bridgepattern.messageformatter.concreteabstraction.EmailSender;
import structuralpattern.bridgepattern.messageformatter.concreteabstraction.UrgentSender;
import structuralpattern.bridgepattern.messageformatter.concreteimplementor.EmojiMessage;
import structuralpattern.bridgepattern.messageformatter.concreteimplementor.TextMessage;
import structuralpattern.bridgepattern.messageformatter.implementor.Message;

public class Main {
    public static void main(String[] args) {
        MessageSender email = new EmailSender();
        MessageSender sms = new UrgentSender();

        Message m1 = new TextMessage(email, "Hello there");
        Message m2 = new EmojiMessage(sms, "Server is down");

        m1.send();
        m2.send();
    }
}

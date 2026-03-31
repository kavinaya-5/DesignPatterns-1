package structuralpattern.bridgepattern.messageformatter.concreteimplementor;

import structuralpattern.bridgepattern.messageformatter.abstraction.MessageSender;
import structuralpattern.bridgepattern.messageformatter.implementor.Message;

public class TextMessage extends Message {
    public TextMessage(MessageSender sender, String content) {
        super(sender, content);
    }

    @Override
    public void send() {
        sender.sendMessage(content);
    }
}

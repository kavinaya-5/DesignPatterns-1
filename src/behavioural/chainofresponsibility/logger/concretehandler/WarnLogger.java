package behavioural.chainofresponsibility.logger.concretehandler;

import behavioural.chainofresponsibility.logger.request.LogMessage;

public class WarnLogger extends BaseLogger{

    public void log(LogMessage msg) {

        if (msg.level >= 3) {
            System.out.println("[WARN] " + msg.message);
        }

        forward(msg);
    }
}

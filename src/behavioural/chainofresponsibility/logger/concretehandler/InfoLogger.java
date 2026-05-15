package behavioural.chainofresponsibility.logger.concretehandler;

import behavioural.chainofresponsibility.logger.request.LogMessage;

public class InfoLogger extends BaseLogger{
    public void log(LogMessage msg) {

        if (msg.level >= 2) {
            System.out.println("[INFO] " + msg.message);
        }

        forward(msg);
    }
}

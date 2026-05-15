package behavioural.chainofresponsibility.logger.concretehandler;

import behavioural.chainofresponsibility.logger.request.LogMessage;

public class DebugLogger extends BaseLogger{
    public void log(LogMessage msg) {

        if (msg.level >= 1) {
            System.out.println("[DEBUG] " + msg.message);
        }

        forward(msg);
    }
}

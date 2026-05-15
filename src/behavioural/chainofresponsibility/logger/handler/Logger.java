package behavioural.chainofresponsibility.logger.handler;

import behavioural.chainofresponsibility.logger.request.LogMessage;

public interface Logger {
    void setNext(Logger next);
    void log(LogMessage msg);
}

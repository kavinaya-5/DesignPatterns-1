package behavioural.chainofresponsibility.logger.concretehandler;

import behavioural.chainofresponsibility.logger.handler.Logger;
import behavioural.chainofresponsibility.logger.request.LogMessage;

public abstract class BaseLogger implements Logger {
    public Logger next;

    public void setNext(Logger next)
    {
        this.next=next;
    }

    public  void forward(LogMessage msg)
    {
        if(next!=null)
        {
            next.log(msg);
        }
    }
}

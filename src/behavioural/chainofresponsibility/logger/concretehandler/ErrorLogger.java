package behavioural.chainofresponsibility.logger.concretehandler;

import behavioural.chainofresponsibility.logger.request.LogMessage;

public class ErrorLogger extends  BaseLogger{

    public void log(LogMessage msg)
    {
        if(msg.level>=4)
        {
            System.out.println("Error"+msg.message);
        }
        forward(msg);
    }
}

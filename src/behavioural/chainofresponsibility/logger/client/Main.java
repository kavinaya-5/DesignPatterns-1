package behavioural.chainofresponsibility.logger.client;

import behavioural.chainofresponsibility.logger.concretehandler.DebugLogger;
import behavioural.chainofresponsibility.logger.concretehandler.ErrorLogger;
import behavioural.chainofresponsibility.logger.concretehandler.InfoLogger;
import behavioural.chainofresponsibility.logger.concretehandler.WarnLogger;
import behavioural.chainofresponsibility.logger.handler.Logger;
import behavioural.chainofresponsibility.logger.request.LogMessage;

public class Main {

    public static void main(String[] args) {

        Logger error = new ErrorLogger();
        Logger warn = new WarnLogger();
        Logger info = new InfoLogger();
        Logger debug = new DebugLogger();

        // Chain creation
        error.setNext(warn);
        warn.setNext(info);
        info.setNext(debug);

        error.log(new LogMessage(2, "User logged in"));
        System.out.println();

        error.log(new LogMessage(4, "Database connection lost"));
    }
}

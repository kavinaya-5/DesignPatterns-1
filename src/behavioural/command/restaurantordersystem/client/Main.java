package behavioural.command.restaurantordersystem.client;

import behavioural.command.restaurantordersystem.command.OrderCommand;
import behavioural.command.restaurantordersystem.concretecommand.PrepareOrderCommand;
import behavioural.command.restaurantordersystem.invoker.Waiter;
import behavioural.command.restaurantordersystem.receiver.Kitchen;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen=new Kitchen();
        OrderCommand orderCommand=new PrepareOrderCommand(kitchen,"Dosa");

        Waiter waiter=new Waiter(orderCommand);
        waiter.prepare();

    }
}

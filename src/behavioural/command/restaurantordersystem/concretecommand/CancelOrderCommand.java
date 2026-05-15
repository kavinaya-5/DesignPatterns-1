package behavioural.command.restaurantordersystem.concretecommand;

import behavioural.command.restaurantordersystem.command.OrderCommand;
import behavioural.command.restaurantordersystem.receiver.Kitchen;

public class CancelOrderCommand implements OrderCommand {

    Kitchen kitchen;
    String dish;
    public CancelOrderCommand(Kitchen kitchen,String dish)
    {
        this.dish=dish;
        this.kitchen=kitchen;
    }

    public void execute()
    {
        kitchen.prepareDish(dish);
    }

    public void cancel()
    {
        kitchen.cancelDish(dish);
    }
}

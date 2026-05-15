package behavioural.command.restaurantordersystem.invoker;

import behavioural.command.restaurantordersystem.command.OrderCommand;

public class Waiter {

    OrderCommand orderCommand;

    public Waiter(OrderCommand orderCommand) {
        this.orderCommand = orderCommand;
    }

    public void prepare() {
        orderCommand.execute();
    }

    public void cancel() {
        orderCommand.cancel();
    }
}

//    public void prepare() {
//    }
//}

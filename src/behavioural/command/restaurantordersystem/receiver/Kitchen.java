package behavioural.command.restaurantordersystem.receiver;

public class Kitchen {

    public void prepareDish(String dish)
    {
        System.out.println("Preparing:"+dish);
    }

    public void cancelDish(String dish)
    {
        System.out.println("Cancelling:"+dish);
    }
}

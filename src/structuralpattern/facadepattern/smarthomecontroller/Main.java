package structuralpattern.facadepattern.smarthomecontroller;

import structuralpattern.facadepattern.smarthomecontroller.facade.Home;

public class Main {
    public static void main(String[] args) {
        Home home=new Home();

        home.leave();
    }
}

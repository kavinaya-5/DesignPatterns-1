package creationalpattern.builderpattern;

public class Main {
    public static void main(String[] args) {


        House house = new House();
        HouseBuilder houseBuilder = new ConcreteHouse(house);
        Director director = new Director(houseBuilder);

        House home = director.constructHouse();
        System.out.println(home.showHouse());
    }
}

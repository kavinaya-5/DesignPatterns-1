package creationalpattern.builderpattern;

public class ConcreteHouse implements HouseBuilder{

    private House house;

    public ConcreteHouse(House house)
    {
        this.house=house;
    }

   public void buildFoundation()
    {
        house.setFoundation("ConcreteFoundation");
    }

    public void buildWalls()
    {
        house.setWalls("Colour Walls");
    }

    public void buildRoof()
    {
        house.setRoof("Wooden roof");
    }

    public House getHouse()
    {
        return house;
    }
}

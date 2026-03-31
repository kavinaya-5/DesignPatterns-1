package creationalpattern.builderpattern;

public class Director {
    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder)
    {
        this.houseBuilder=houseBuilder;
    }

    public House constructHouse()
    {
        houseBuilder.buildFoundation();
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        return houseBuilder.getHouse();
    }
}

package creationalpattern.builderpattern;

public class House {
    private String foundation;
    private String walls;
    private String roof;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String showHouse()
    {
        return "Foundation is:"+foundation+"\n"
        +"Walls is:"+walls+"\n"+
                "Roof is:"+roof;
    }
}

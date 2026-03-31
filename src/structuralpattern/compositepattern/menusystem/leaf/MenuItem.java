package structuralpattern.compositepattern.menusystem.leaf;

import structuralpattern.compositepattern.menusystem.component.Menu;

public class MenuItem implements Menu {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private String name;
    private int count;

    public MenuItem(String name,int count)
    {
        this.name=name;
        this.count=count;
    }

    public void display()
    {
        System.out.println(this.name);
    }

    public int getItemCount()
    {
        return 1;
    }
}

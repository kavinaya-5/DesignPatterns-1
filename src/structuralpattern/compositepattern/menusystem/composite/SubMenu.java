package structuralpattern.compositepattern.menusystem.composite;

import structuralpattern.compositepattern.menusystem.component.Menu;

import java.util.ArrayList;

public class SubMenu implements Menu {

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

    public ArrayList<Menu> getMenuArrayList() {
        return menuArrayList;
    }

    public void setMenuArrayList(ArrayList<Menu> menuArrayList) {
        this.menuArrayList = menuArrayList;
    }

    private String name;
    private int count;
    private ArrayList<Menu> menuArrayList=new ArrayList<>();

    public SubMenu(String name,int count)
    {
        this.count=count;
        this.name=name;
    }

    public void addItem(Menu menu)
    {
        menuArrayList.add(menu);
    }

    public void remove(Menu menu)
    {
        menuArrayList.remove(menu);
    }

    public int getItemCount()
    {
        int ans=1;
        for(Menu menu:menuArrayList)
        {
            ans+=menu.getItemCount();
        }
        return ans;
    }

    public void display()
    {
        for(Menu m:menuArrayList)
        {
            m.display();
//            System.out.println("\n");
        }
    }
}

package structuralpattern.compositepattern.menusystem;

import structuralpattern.compositepattern.menusystem.composite.SubMenu;
import structuralpattern.compositepattern.menusystem.leaf.MenuItem;

public class Main {
    public static void main(String[] args) {
        MenuItem menuItem=new MenuItem("Dosa",1);
        MenuItem menuItem1=new MenuItem("Idli ",2);

        SubMenu subMenu=new SubMenu("Dinner",1);
        subMenu.addItem(menuItem1);
        subMenu.addItem(menuItem);

        subMenu.display();
    }
}

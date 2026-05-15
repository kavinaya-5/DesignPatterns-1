package structuralpattern.flyweightpattern;

import structuralpattern.flyweightpattern.flyweight.Tree;
import structuralpattern.flyweightpattern.flyweightfactory.TreeFactory;

public class Main {
    public static void main(String[] args) {
        Tree t1 = TreeFactory.getTree("Oak");
        t1.display(1, 2);

        Tree t2 = TreeFactory.getTree("Oak");
        t2.display(3, 4);

        Tree t3 = TreeFactory.getTree("Pine");
        t3.display(5, 6);
    }
}

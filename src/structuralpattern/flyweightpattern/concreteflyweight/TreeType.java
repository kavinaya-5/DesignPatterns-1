package structuralpattern.flyweightpattern.concreteflyweight;


import structuralpattern.flyweightpattern.flyweight.Tree;

public class TreeType implements Tree {
        private String type; // intrinsic

        public TreeType(String type) {
            this.type = type;
        }

        public void display(int x, int y) {
            System.out.println(type + " tree at (" + x + "," + y + ")");
        }
    }


package structuralpattern.flyweightpattern.flyweightfactory;

import structuralpattern.flyweightpattern.concreteflyweight.TreeType;
import structuralpattern.flyweightpattern.flyweight.Tree;

import java.util.*;

public class TreeFactory {
    private static Map<String, Tree> map = new HashMap<>();

    public static Tree getTree(String type) {
        if (!map.containsKey(type)) {
            map.put(type, new TreeType(type)); // create once
        }
        return map.get(type); // reuse
    }
}
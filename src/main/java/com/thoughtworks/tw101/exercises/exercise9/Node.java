package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;
import java.util.ArrayList;

public class Node {
    private String name;
    private Node left;
    private Node right;
//    private List<String> nameList = new ArrayList<>();

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if (nameOfNewNode.compareTo(name) > 0) {
            if (right == null) {
                right = new Node(nameOfNewNode);
            } else {
                right.add(nameOfNewNode);
            }
        } else {
            if (left == null) {
                left = new Node(nameOfNewNode);
            } else {
                left.add(nameOfNewNode);
            }
        }
    }

    public ArrayList<String> names() {
        ArrayList<String> nameList = new ArrayList<>();

        if (left != null) {
            nameList.addAll(left.names());
        }

        nameList.add(name);

        if (right != null) {
            nameList.addAll(right.names());
        }

        return nameList;
    }

}

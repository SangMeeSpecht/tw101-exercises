package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;

public class Node {
    public String name;
    public Node left;
    public Node right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if (nameOfNewNode.compareTo(name) > 0) {
            if (right == null) {
                Node node = new Node(nameOfNewNode);
                right = node;
            } else {
                right.add(nameOfNewNode);
            }
        } else {
            if (left == null) {
                Node node = new Node(nameOfNewNode);
                left = node;
            } else {
                left.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        return null;
    }
}

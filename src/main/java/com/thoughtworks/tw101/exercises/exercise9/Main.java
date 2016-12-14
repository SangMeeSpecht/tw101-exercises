package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;

// Exercise #9: Create a class Node that implements a binary tree for Strings. It should have an add(String name) method
// that recursively finds the correct place to add a new node and a names() method that returns the names of all of the
// nodes in alphabetical order (this should also be implemented using recursion).

public class Main {
    public static void main(String[] args) {
        Node root = new Node("Cecil");
//        System.out.println(root.name);
        root.add("Michelle");
//        System.out.println(root.name);
        root.add("Bill");
//        System.out.println(root.left.name);
        root.add("Jagruti");
//        System.out.println(root.right.left.name);
        root.add("Tess");
//        System.out.println(root.right.right.name);
        root.add("Sue-Ellen");
//        System.out.println(root.right.right.left.name);
        root.add("Sara");
//        System.out.println(root.right.right.left.left.name);
        root.add("Casey");
//        System.out.println(root.left.right.name);

        List<String> names = root.names();

        for (String name : names) {
            System.out.println(name);
        }
    }
}

package de.hs_mannheim.oot.ss17.specht.alex_alex_kevin.testat1;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(5);
        tree.addNode(3);
        tree.addNode(1);
        tree.addNode(5);
        tree.addNode(9);
        tree.addNode(-1);
        tree.addNode(10);

        System.out.println(tree);
        if (tree.toString().equals("-1,1,3,5,9,10")) {
            System.out.println("Anscheinend korrekt implementierte toString Funktion");
        } else {
            System.out.println(tree + ": Nicht korrekt implementierte print Funktion");
        }

        if (tree.contains(3) && !tree.contains(2)){
            System.out.println("Anscheinend korrekt implementierte contains Funktion");
        } else {
            System.out.println("Nicht korrekt implementierte contains Funktion");
        }

    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Administrator
 */
public class Tree {

    private List<Node> nodes;

    public Tree() {
        nodes = new ArrayList<>();
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public void readTree() {
        try {
            File myObj = new File("F:\\For Job\\Java\\java_core\\src\\basic\\Tree.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String str = myReader.nextLine();
                String[] arr = str.split(" ");
                Node n = new Node(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]));
                this.nodes.add(n);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void printTree() {
        this.nodes.forEach(System.out::println);
    }

    public List<Node> getChildren(int idNode) {
        Node n = this.findNode(idNode);
        return this.nodes.stream()
                .filter((nd) -> (nd.getParent() == n.getId()))
                .collect(Collectors.toList());
    }
    
    public Node findNode(int idNode) {
        return this.nodes.stream()
                .filter(nd -> nd.getId() == idNode)
                .findFirst().get();
    }
    
    public boolean isLeaf(int idNode){
        Node n = this.findNode(idNode);
        for (Node nd : this.nodes){
            if (nd.getParent() == n.getId()) {
                return false;
            }
        }
        return true;
    } 
    
    public boolean isLeafOf(int idRoot, int idLeaf) {
        Node root = this.findNode(idRoot), leaf = this.findNode(idLeaf);
        boolean flag = false;
        while (leaf.getParent() != root.getId() && !flag) {
            if (leaf.getParent() != -1)
                leaf = this.findNode(leaf.getParent());
            else
                flag = true;
        }
        return leaf.getParent() != -1;
    }
    
    public List<Node> getLeaves(int rootId) {
        List<Node> leaves = this.nodes.stream()
                .filter(nd -> isLeaf(nd.getId()))
                .collect(Collectors.toList());
        return leaves.stream()
                .filter(nd -> isLeafOf(rootId, nd.getId()))
                .collect(Collectors.toList());
    }

    public void startOrder(int idStart) {
        Node start = this.findNode(idStart);
        System.out.println(start);
        List<Node> children = this.getChildren(idStart);
        for (Node child : children) {
            this.startOrder(child.getId());
        }
    }

    public void middleOrder(int idStart) {
        Node start = this.findNode(idStart);        
        List<Node> children = this.getChildren(idStart);
        if (!children.isEmpty()) {
            this.middleOrder(children.get(0).getId());
        }
        System.out.println(start);
        for (int i = 1; i < children.size(); i++) {
            this.middleOrder(children.get(i).getId());
        }
    }

    public void endOrder(int idStart) {
        Node start = this.findNode(idStart);        
        List<Node> children = this.getChildren(idStart);
        for (Node child : children) {
            this.endOrder(child.getId());
        }
        System.out.println(start);
    }
}

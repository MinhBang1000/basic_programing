/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author Administrator
 */
public class Node {
    private int id;
    private String value;
    private int parent;
    
    public Node(int id, String value, int parent) {
        this.id = id;
        this.value = value;
        this.parent = parent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public int getParent() {
        return parent;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }
    
    public String toString() {
        return this.id+" "+this.value+" "+this.parent;
    }
    
}

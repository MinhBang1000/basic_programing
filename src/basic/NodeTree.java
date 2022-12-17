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
public class NodeTree {
    private String data;
    private int parent;
    private boolean mark;
    private int id;
    private static int increment = 0;

    public NodeTree(String data, int parent, boolean mark) {
        this.data = data;
        this.parent = parent;
        this.mark = mark;
        this.id = increment;
        increment ++;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public boolean isMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String toString(){
        return "ID: "+this.getId();
    }
    
}

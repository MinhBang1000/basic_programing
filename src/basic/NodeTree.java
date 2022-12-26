/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.List;

/**
 *
 * @author Administrator
 */
public class NodeTree {

    private boolean mark;
    private String value;
    private int parent;

    public NodeTree() {
        this.mark = false;
        this.value = "none";
        this.parent = -1;
    }

    public NodeTree(boolean mark, String value, int parent) {
        this.mark = mark;
        this.value = value;
        this.parent = parent;
    }

    public boolean isMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

}

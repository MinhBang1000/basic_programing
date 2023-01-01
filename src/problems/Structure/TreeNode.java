/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems.Structure;

/**
 *
 * @author Administrator
 */
public class TreeNode {

    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
        this.value = 0;
        this.left = null;
        this.right = null;
    }

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

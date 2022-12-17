/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 * @objective: To print tree folder like this:
 * - A
 * - - B
 * - - C
 * - - - E
 * - - - F
 * - - D
 * - - - G
 */
public class TreeFolder {
    public static ArrayList<NodeTree> folders = new ArrayList();
    public static int level = 1;
    public static void printTreeFolder(NodeTree node){
        if (!node.isMark()) {
            if (node.getParent() != -1){
                level ++;
            }
            for (int i=0;i<level;i++)
                System.out.print(" - ");
            System.out.println(node.getData());
            for (int i=0;i<folders.size();i++){
                NodeTree child = folders.get(i);
                if (child.getParent() == node.getId()){
                    printTreeFolder(child);
                    level--;
                }
            }
        }
    }
}

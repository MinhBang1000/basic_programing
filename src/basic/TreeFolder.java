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
 * @objective: To print tree folder like this: - A - - B - - C - - - E - - - F -
 * - D - - - G
 */
public class TreeFolder {

    private List<NodeTree> folders;
    private int level;
    private String structure = "";

    public TreeFolder(List<NodeTree> folders) {
        this.folders = folders;
        this.level = 0;
    }

    public TreeFolder() {
        List<NodeTree> folders = new ArrayList<>();
        this.level = 0;
    }

    public List<NodeTree> getFolders() {
        return this.folders;
    }

    public void setFolders(List<NodeTree> folders) {
        this.folders = folders;
    }

    public List<Integer> children(int index) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < this.folders.size(); i++) {
            NodeTree node = this.folders.get(i);
            if (node.getParent() == index) {
                temp.add(i);
            }
        }
        return temp;
    }

    public void readFolders() {
        try {
            File myObj = new File("F:\\For Job\\Java\\java_core\\src\\basic\\TreeFolder.txt");
            Scanner myReader = new Scanner(myObj);
            List<NodeTree> lst = new ArrayList<>();
            while (myReader.hasNextLine()) {
                String str = myReader.nextLine();
                String[] arr = str.split(" ");
                NodeTree n = new NodeTree(false, arr[0], Integer.parseInt(arr[1]));
                lst.add(n);
            }
            this.folders = lst;
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void printFolders(int index) {
        NodeTree node = this.folders.get(index);
        if (!node.isMark()) {
            // Marked
            this.level ++;
            String space = "";
            for (int i=0;i<this.level;i++){
                space+="-";
            }
            System.out.print(space+node.getValue()+"\n");
            structure += space+node.getValue()+"\n";
            node.setMark(true);
            List<Integer> children = this.children(index);
            children.forEach((child) -> {
                this.printFolders(child);
            });
        }
        this.level --;
    }

    public String getStructure() {
        return structure.substring(0,this.structure.length()-1);
    }
    
    
}

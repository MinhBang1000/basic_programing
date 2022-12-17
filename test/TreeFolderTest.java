/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import basic.TreeFolder;
import basic.NodeTree;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class TreeFolderTest {
    
    @Test
    public void test1() {
        TreeFolder.folders.add(new NodeTree("A", -1, false));
        TreeFolder.folders.add(new NodeTree("B", 0, false));
        TreeFolder.folders.add(new NodeTree("C", 0, false));
        TreeFolder.folders.add(new NodeTree("D", 0, false));
        TreeFolder.folders.add(new NodeTree("E", 2, false));
        TreeFolder.folders.add(new NodeTree("F", 2, false));
        TreeFolder.folders.add(new NodeTree("G", 3, false));
//        System.out.println(TreeFolder.folders);
        int first = 0;
        TreeFolder.printTreeFolder(TreeFolder.folders.get(first));
    }
}

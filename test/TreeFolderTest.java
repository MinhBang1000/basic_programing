/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import basic.TreeFolder;
import basic.NodeTree;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
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
        TreeFolder tree = new TreeFolder();
        tree.readFolders();
        tree.printFolders(0);
        String expected = 
                  "-A\n"
                + "--B\n"
                + "--C\n"
                + "---E\n"
                + "---F\n"
                + "--D\n"
                + "---G\n"
                + "---H";
        Assert.assertEquals(expected, tree.getStructure());
    }
}

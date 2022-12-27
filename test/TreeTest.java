/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import basic.Node;
import basic.Tree;
import java.util.List;
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
public class TreeTest {

    @Test
    public void test1() {
        System.out.println("****Start Order****");
        Tree t = new Tree();
        t.readTree();
        t.startOrder(1);
    }

    @Test
    public void test2() {
        System.out.println("****Middle Order****");
        Tree t = new Tree();
        t.readTree();
        t.middleOrder(1);
    }

    @Test
    public void test3() {
        System.out.println("****End Order****");
        Tree t = new Tree();
        t.readTree();
        t.endOrder(1);
    }
    
    @Test
    public void test4(){
        Tree t = new Tree();
        t.readTree();
        List<Node> leaves = t.getLeaves(4);
        System.out.println("****Leaves****");
        leaves.forEach(System.out::println);
    }
}

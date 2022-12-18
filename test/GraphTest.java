/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import basic.Graph;
import java.util.ArrayList;
import java.util.Arrays;
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
public class GraphTest {
    
    @Test
    public void breathFirstSearchTest1() {
        Graph g = new Graph();
        g.readGraph();
        g.breathFirstSearch(1);
    }
    
    @Test
    public void traversalTest1() {
//        System.out.println();
        Graph g = new Graph();
        g.readGraph();
        g.traversalGraph(1);
    }
    
}

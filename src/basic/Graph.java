/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Graph {

    private int[][] data;
    private boolean[] mark;
    private int n;

    // Start at one
    public void initGraph(int n) {
        int i, j;
        this.n = n;
        this.data = new int[n+1][n+1];
        this.mark = new boolean[n+1];
        for (i = 1; i <= n; i++) {
            this.mark[i] = false;
            for (j = 1; j <= n; j++) {
                this.data[i][j] = -1;
            }
        }
    }
    
    public void resetMark() {
        for (int i=1;i<=this.n;i++) {
            this.mark[i] = false;
        }
    }

    public void addEdge(int x, int y, int w) {
        this.data[x][y] = w;
        this.data[y][x] = w;
    }

    public void readGraph() {
        try {
            File myObj = new File("F:\\For Job\\Java\\java_core\\src\\basic\\Graph.txt");
            Scanner myReader = new Scanner(myObj);
            int top = 1;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (top == 1) {
                    this.initGraph(Integer.parseInt(data));
                }else{
                    String[] dataList = data.split(" ");
                    this.addEdge(Integer.parseInt(dataList[0]), Integer.parseInt(dataList[1]), Integer.parseInt(dataList[2]));
                }
                top ++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public ArrayList<Integer> neighbors(int x) {
        ArrayList<Integer> neighbors = new ArrayList();
        for (int i = 1; i <= this.n; i++) {
            if (this.data[x][i] != -1) {
                neighbors.add(i);
            }
        }
        return neighbors;
    }

    public void breathFirstSearch(int first) {
        Queue<Integer> q = new LinkedList();
        ArrayList<Integer> result = new ArrayList();
        this.mark[first] = true;
        q.add(first);
        while (!q.isEmpty()) {
            int top = q.remove();
            // Find out 
            System.out.print(top+" ");
            ArrayList<Integer> adj = this.neighbors(top);
            for (int i = 0; i < adj.size(); i++) {
                if (!this.mark[adj.get(i)]) {
                    this.mark[adj.get(i)] = true;
                    q.add(adj.get(i));
                }
            }
        }
    }

    public void traversalGraph(int node) {
        if (!this.mark[node]) {
            System.out.print(node+" ");
            this.mark[node] = !this.mark[node];
            ArrayList<Integer> adj = this.neighbors(node);
            for (int i=0;i<adj.size();i++){
                int item = adj.get(i);
                this.traversalGraph(item);
            }
        }
    }
}

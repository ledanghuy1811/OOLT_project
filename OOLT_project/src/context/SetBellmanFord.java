package context;

import java.util.Scanner;

import algorithms.*;
import graph.*;

public class SetBellmanFord implements SetAlgorithms {
	@Override
	public Algorithms setAlgorithms() {
		Scanner keyBoard = new Scanner(System.in);
		
		Graph aGraph = SetGraph.setGraph();
		int numVertex = aGraph.getVertex().size();
		System.out.println("Enter node source id: ");
		int sourceId = keyBoard.nextInt();
		
		return new BellmanFord(aGraph, numVertex, new Vertex(sourceId));
	}
}

package graph;

import java.util.Comparator;

public class Edge implements Comparator<Edge> {
	//attribute
	private int nodeSource;
	private int nodeTarget;
	private double weight;
	
	//getter
	public int getNodeSource() {
		return nodeSource;
	}
	public int getNodeTarget() {
		return nodeTarget;
	}
	public double getWeight() {
		return weight;
	}
	
	//constructor
	public Edge() {
		
	}
	public Edge(int source, int target) {
		this.nodeSource = source;
		this.nodeTarget = target;
		this.weight = 0;
	}
	public Edge(int source, int target, double weight) {
		this.nodeSource = source;
		this.nodeTarget = target;
		this.weight = weight;
	}
	
	//override
	@Override
	public int compare(Edge e1, Edge e2)
	{
		if (e1.getWeight() < e2.getWeight())
			return -1;

		if (e1.getWeight() > e2.getWeight())
			return 1;

		return 0;
	}
}

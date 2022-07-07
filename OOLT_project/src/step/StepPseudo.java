package step;

import java.util.ArrayList;

public class StepPseudo {
	private ArrayList<String> pseudo = new ArrayList<String>(); 
	private int index;
	
	public StepPseudo() {
		
	}
	
	public ArrayList<String> getPseudo() {
		return this.pseudo;
	}
	public void setPseudo(ArrayList<String> pseudo) {
		this.pseudo = pseudo;
	}
	public int getIndex() {
		return this.index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	public void printPseudo() {
		System.out.println(this.getPseudo().get(this.getIndex()));
	}
}

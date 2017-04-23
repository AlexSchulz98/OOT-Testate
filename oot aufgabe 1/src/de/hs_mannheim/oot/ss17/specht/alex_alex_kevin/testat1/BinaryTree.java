package de.hs_mannheim.oot.ss17.specht.alex_alex_kevin.testat1;

public class BinaryTree {
	
	private TreeNode wurzel =null;
	
	/**
	 * @param i erster Wert 
	 */	
	public BinaryTree(int i) {
		addNode(i);
	}
	
	/**
	 * Fügt einen neuen Wert in den Baum ein
	 * @param wert Wert, welcher eingefügt wird
	 */
	public void addNode(int wert) { 
		wurzel = addNode(wurzel, wert);
	}
	
	/**
	 * Sucht die richtige Seite und fügt einen neuen Wert in den Baum ein
	 * @param knoten 
	 * @param wert Wert, welcher eingefügt wird
	 * @return
	 */
	public TreeNode addNode(TreeNode knoten, int wert) { 
		if (wurzel == null){
			wurzel = new TreeNode(wert);	
		}
		else {
			if(wurzel.getRechts() == null){
				wurzel.rechts = addNode(wurzel.rechts, wert);
			}
			else {
				wurzel.links = addNode(wurzel.links, wert);
			}
		}
		return wurzel;
	}	
	/**
	 * Prüft, ob der Baum leer ist
	 * @return Gibt true zurück, wenn die Wurzel null ist
	 */
	public boolean isEmpty(){
		return wurzel == null;
	}
	
	
	public boolean contains(int i) {
		if (wurzel == null){
			return false;
		} else if(wurzel.inhalt == i){
			return true;
		} else if(wurzel.inhalt > i){
			//muss noch imlementiert werden
		}
		return false;
		
	}
	
	
	public void durchlauf(TreeNode knoten) { //??
		if (knoten != null) {
			durchlauf(knoten.links);
			durchlauf(knoten.rechts);
		}

	}

	public void laufedurch() { //???
		if (wurzel != null) {
			durchlauf(wurzel.links);
			durchlauf(wurzel.rechts);
		}
	}

	
	
	public String toString(){
		String s ="";
		return s;
	}
}

package de.hs_mannheim.oot.ss17.specht.alex_alex_kevin.testat1;

public class BinaryTree {
	
	private TreeNode wurzel =null;
	private int count = 0;
	
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
		count = count++;
	}
	/**
	 * Sucht die richtige Seite und fügt einen neuen Wert in den Baum ein
	 * @param knoten 
	 * @param wert Wert, welcher eingefügt wird
	 * @return
	 */
	public TreeNode addNode(TreeNode knoten, int wert) { 
		if (knoten == null){
			knoten = new TreeNode(wert);	
		}
		else {
			if(wert < knoten.inhalt){				
				knoten.links = addNode(knoten.links, wert);
			}
			else {
				knoten.rechts = addNode(knoten.rechts, wert);
				}
			}	
		return knoten;		
	}	

	/**
	 * Prüft, ob der Baum leer ist
	 * @return Gibt true zurück, wenn die Wurzel null ist
	 */
	public boolean isEmpty(){
		return wurzel == null;
	}
	
	/**
	 * Überprüft, ob ein Wert vorhanden ist oder nicht.
	 * @param wert Wert, der enthalten sein soll
	 * @return true: Der Wert ist im Baum; false: Der Wert st nicht im Baum
	 */
	public boolean contains(int wert) {
		return (contains(wurzel, wert))	;
	}

	public boolean contains(TreeNode knoten, int wert) {
		if (knoten.getInhalt() == wert){
			return true;
		}
		boolean a = false;
		if(knoten.hasLeft() == true){
			a = contains(knoten.getLinks(), wert);
		}
		if(a == false && knoten.hasRight() == true){
			a = contains(knoten.getRechts(), wert);
		}
		return a;
	}
	
	/**
	 * Gibt den Baum als String aus
	 */
	public String toString(){
		return getString(wurzel);
	}
	public String getString(TreeNode hauptknoten){
		
		String s = "";
			
			if(hauptknoten.hasLeft() == true){
				s = s + hauptknoten.inhalt;
				getString(hauptknoten.getLinks());
			}
			else {
				s = hauptknoten.inhalt + s;
			}
			if(hauptknoten.hasRight() == true){
				getString(hauptknoten.getRechts());
			}
			else {
				// Ich komm nicht weiter
			}
		return s;
	}
	
}

	
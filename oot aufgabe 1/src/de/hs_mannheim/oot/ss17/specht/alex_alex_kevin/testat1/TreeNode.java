package de.hs_mannheim.oot.ss17.specht.alex_alex_kevin.testat1;

public class TreeNode {
	
	int inhalt;
	TreeNode links;
	TreeNode rechts;
	/**
	 * 
	 * @param wert Wert
	 */
	TreeNode(int wert) {
		this.inhalt = wert;
		this.links = null;
		this.rechts = null;
	}
	
	/**
	 * 
	 * @param a neuer linker Wert
	 */
	public void setLinks(TreeNode a){
		links = a;
	}	
	
	/**
	 * 
	 * @param aneuer rechter Wert
	 */
	public void setRechts(TreeNode a){
		rechts = a;
	}
	
	/**
	 * 
	 * @param i neuer Inhalt
	 */
	public void setInhalt(int i){
		inhalt = i;
	}
	
	/**
	 * 
	 * @return Gibt linken Knoten zur�ck
	 */
	public TreeNode getLinks(){
		return links;
	}
	
	/**
	 * 
	 * @return Gibt rechten Knoten zur�ck
	 */
	public TreeNode getRechts(){
		return rechts;
	}
	
	/**
	 * 
	 * @return Gibt Inhalt zur�ck
	 */
	public int getInhalt(){
		return inhalt;
	}
	
	/**
	 * �berpr�ft, ob ein linker Knoten vorhanden ist
	 * @return true oder false
	 */
	public boolean hasLeft(){
		if(links == null){
			return false;
		}
		else {
			return true;	
		}
	}
	
	/**
	 * �berpr�ft, ob ein rechter Knoten vorhanden ist
	 * @return true oder false
	 */
	public boolean hasRight(){
		if(rechts == null){
			return false;
		}
		else {
			return true;	
		}
	}
}

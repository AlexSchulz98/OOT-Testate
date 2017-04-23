package de.hs_mannheim.oot.ss17.specht.alex_alex_kevin.testat1;

public class TreeNode {
	
	int inhalt;
	TreeNode links;
	TreeNode rechts;

	TreeNode(int wert) {
		this.inhalt = wert;
		this.links = null;
		this.rechts = null;
	}
	
	public void setLinks(TreeNode a){
		links = a;
	}	
	public void setRechts(TreeNode a){
		rechts = a;
	}
	public void setInhalt(int i){
		inhalt = i;
	}
	public TreeNode getLinks(){
		return links;
	}
	public TreeNode getRechts(){
		return rechts;
	}
	public int getInhalt(){
		return inhalt;
	}
	public boolean hasLeft(){
		if(links == null){
			return false;
		}
		else {
			return true;	
		}
	}
	public boolean hasRight(){
		if(rechts == null){
			return false;
		}
		else {
			return true;	
		}
	}
}

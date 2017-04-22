package de.hs_mannheim.oot.ss17.spechtl.alex_alex_kevin.testat1;

public class BinaryTree {
	
	Ast wurzel = null;
	protected int wert = 0;

	public BinaryTree(int i) {
		this.wert = i;
	}

	public void seite(Ast ast, int wert) { //?
		if (wert < ast.inhalt) {
			if (ast.links == null)
				ast.links = new Ast(wert);
			else
				seite(ast.links, wert);
		} else {
			if (ast.rechts == null)
				ast.rechts = new Ast(wert);
			else
				seite(ast.rechts, wert);

		}

	}

	public void addNode(int wert) { 
		if (wurzel == null)
			wurzel = new Ast(wert);
		else
			seite(wurzel, wert);

	}

	public void durchlauf(Ast ast) { //??
		if (ast != null) {
			durchlauf(ast.links);
			System.out.print(ast.inhalt);
			System.out.println();
			durchlauf(ast.rechts);
		}

	}

	public void laufedurch() { //???
		if (wurzel != null) {
			durchlauf(wurzel.links);
			System.out.print(wurzel.inhalt);
			System.out.println();
			durchlauf(wurzel.rechts);
		}
	}

	protected boolean contains(int i) {
		//muss noch implementiert werden
		return false;
	}

}

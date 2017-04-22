package de.hs_mannheim.oot.ss17.spechtl.alex_alex_kevin.testat1;

public class Ast {
	
	int inhalt;
	Ast links;
	Ast rechts;

	Ast(int wert) {
		this.inhalt = wert;
		this.links = null;
		this.rechts = null;

	}
}

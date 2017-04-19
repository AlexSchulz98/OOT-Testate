
public class Binaer_Baum {
	Ast wurzel=null;
	
	public void seite(Ast ast,int wert){
		if(wert<ast.inhalt){
			if(ast.links==null)ast.links= new Ast(wert);
			else seite(ast.links,wert);
		}
		else{if(ast.rechts==null)ast.rechts=new Ast(wert);
		else seite(ast.rechts,wert);
			
		}
		
		
	}
	public void einfuegem(int wert){
		if(wurzel==null) wurzel =new Ast(wert);
		else seite(wurzel,wert);
		
	}
	public void durchlauf(Ast ast){
		if(ast!=null){
			durchlauf(ast.links);
			System.out.print(ast.inhalt);
			System.out.println();
			durchlauf(ast.rechts);
		}
		
	}
	public void laufedurch(){
		if(wurzel!=null){
			durchlauf(wurzel.links);
			System.out.print(wurzel.inhalt);
			System.out.println();
			durchlauf(wurzel.rechts);
		}
	}

}

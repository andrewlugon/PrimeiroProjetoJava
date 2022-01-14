package projetoFinal;

public class Livros {
	Receitas receitas;
	String tituloUnico;  
	String editorLivro;
	int codigo;
	String relatorio;
	int totalReceitas;
	boolean status;

public void AbrirLivro() {
	status= true; 
}
public void FecharLivro() {
	status= false; 
}
}
package pessoa;
import java.util.Date;

import projetoFinal.Funcionario;
public class Degustadores extends Funcionario{
	
	Date dataAvaliacao;
	int nota;
	Degustadores degustador;

public Degustadores getDegustador() {
	return degustador;
}
public void setDegustador(Degustadores degustador) {
	this.degustador = degustador;
}
public Date getDataAvaliacao() {
	return dataAvaliacao;
}
public void setDataAvaliacao(Date dataAvaliacao) {
	this.dataAvaliacao = dataAvaliacao;
}
public int getNota() {
	return nota;
}
public void setNota(int nota) {
	this.nota = nota;
}
}


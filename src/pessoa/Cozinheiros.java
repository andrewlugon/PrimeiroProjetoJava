package pessoa;

import java.util.Date;

import projetoFinal.Funcionario;
import interacaoUsuario.AddChef;

public class Cozinheiros extends Funcionario{

	

	Cozinheiros cozinheiro;
	String ondeTrabalhou;
	int receitasMes;

	

public String getOndeTrabalhou() {
	return ondeTrabalhou;
}

public void setOndeTrabalhou(String ondeTrabalhou) {
	this.ondeTrabalhou = ondeTrabalhou;
}

public int getReceitasMes() {
	return receitasMes;
}

public void setReceitasMes(int receitasMes) {
	this.receitasMes = receitasMes;
}
public Cozinheiros getCozinheiro() {
	return cozinheiro;
}

public void setCozinheiro(Cozinheiros cozinheiro) {
	this.cozinheiro = cozinheiro;
}
}

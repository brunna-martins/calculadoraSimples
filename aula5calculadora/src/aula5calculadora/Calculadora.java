package aula5calculadora;

public class Calculadora {
	// definição de atributos
	int op1,
		op2;
	
	float resultado;
	

	
	// metodo construtor alternativo
	public Calculadora(int o1, int o2) {
		op1 = o1;
		op2 = o2;
	}

	// getters e setters gerados automaticamente
	public int getOp1() {
		return op1;
	}

	public void setOp1(int op1) {
		this.op1 = op1;
	}

	public int getOp2() {
		return op2;
	}

	public void setOp2(int op2) {
		this.op2 = op2;
	}

	public float getResultado() {
		return resultado;
	}
	
	// operacoes
	float somar() {
		resultado = op1 + op2;
		return resultado;
	}
	
	float subtrair() {
		resultado = op1 - op2;
		return resultado;
	}
	
	float multiplicar() {
		resultado = op1*op2;
		return resultado;
	}
	
	float dividir() {
		resultado = (float) op1/op2;
		return resultado;
	}
	
}

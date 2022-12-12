package Banco;

public class Acao extends InstrumentoFinanceiro {
	private int cotas = 2;
	
	
	public Acao(float saldo, int cotas) {
		super(saldo);
		this.cotas = cotas;
	}

	public int getCotas() {
		return cotas;
	}

	public void setCotas(int cotas) {
		this.cotas = cotas;
	}
	
	public float CalcularSaldoTotal() {
		return (float) cotas * getSaldo();
	}
}

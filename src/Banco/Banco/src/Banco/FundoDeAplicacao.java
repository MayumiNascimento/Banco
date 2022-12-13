package Banco;

public class FundoDeAplicacao extends InstrumentoFinanceiro {
	
	private	float rentabilidade;

	public FundoDeAplicacao(float saldo, float rentabilidade) {
		super(saldo);
		this.rentabilidade = rentabilidade;
	}

	public float getRentabilidade() {
		return rentabilidade;
	}

	public void setRentabilidade(float rentabilidade) {
		this.rentabilidade = rentabilidade;
	}
	
	public float CalcularSaldoTotal() {
		return rentabilidade + getSaldo();
	}
	
}

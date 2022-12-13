package Banco;

import java.util.Scanner;

public class Banco {
	
	private int numInstrumentos;
	private float saldo;
	private float limite;
	private float rentabilidade;
	private int cotas;
	
	public void adicionar(int opt, InstrumentoFinanceiro instrumento) {
		if (opt == 1) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Informe o saldo: ");
			saldo = entrada.nextFloat();
			System.out.println("Informe o limite: ");
			limite = entrada.nextFloat();
        	instrumento = new ContaCorrente(saldo, limite);
			System.out.println("Conta corrente criada com sucesso!");
			// mostrar cadastro e de utilização de metodo da subclasse
			System.out.println(instrumento.CalcularSaldoTotal());
        }
		if (opt == 2) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Informe o saldo: ");
			saldo = entrada.nextFloat();
			System.out.println("Informe as cotas: ");
			cotas = entrada.nextInt();
        	instrumento = new Acao(saldo, cotas);
			System.out.println("Ação cadstrada com sucesso!");
			System.out.println(instrumento.CalcularSaldoTotal());
        }
		if (opt == 3) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Informe o saldo: ");
			saldo = entrada.nextFloat();
			System.out.println("Informe a rentabilidade: ");
			rentabilidade = entrada.nextFloat();
        	instrumento = new FundoDeAplicacao(saldo, rentabilidade);
			System.out.println("Fundo de Aplicação criada com sucesso!");
			System.out.println(instrumento.CalcularSaldoTotal());
        }
	}

	//public float CalcularSaldos(InstrumentoFinanceiro instrumento) {
	//	return numInstrumentos;
	//}
	
	public static void main(String[] args) {
		Banco b = new Banco();
		
		//InstrumentoFinanceiro instrumento = new ContaCorrente(5f, 10);
		InstrumentoFinanceiro instrumento = null;
		
		int opcao = 0;
	    Scanner entrada = new Scanner(System.in);
		while(opcao !=3) {
			System.out.println("\tBanco");

            System.out.println("1. Adicionar");
            System.out.println("2. CalcularSaldos");
            System.out.println("3. Sair");
            System.out.println("Opcao: ");
            
            opcao = entrada.nextInt();
            
            if(opcao == 1) {
            	int opcao2 = 0;

            	System.out.println("\tMenu de Cadastro");
                System.out.println("1. Cadastrar Conta Corrente");
                System.out.println("2. Cadastrar Ação");
                System.out.println("3. Cadastrar Fundo de Aplicação");
                
                opcao2 = entrada.nextInt();
                
                if (opcao2 == 1) {
                	b.adicionar(opcao2, instrumento);
                }
                else if (opcao2 == 2) {
                	b.adicionar(opcao2, instrumento);
                }
                else if (opcao2 == 3) {
                	b.adicionar(opcao2, instrumento);
                }
            }
            else if(opcao == 2) {
            	//b.CalcularSaldos((ContaCorrente)instrumento);
            	//b.CalcularSaldos((Acao)instrumento);
            	//b.CalcularSaldos((FundoDeAplicacao)instrumento);
            }
		}
		System.out.println("Saindo...");
}
}

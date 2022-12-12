package Banco;

import java.util.Scanner;

public class Banco {
	
	private int numInstrumentos;
	
	//adiciona oq?
	public void adicionar(int opt, InstrumentoFinanceiro instrumento) {
		
		
	}
	
	public void mostrar(int opt, InstrumentoFinanceiro instrumento) {
		if(opt ==1) {
			instrumento.getSaldo();
		}
	}

	public float CalcularSaldos() {
		return numInstrumentos;
	}

	public static void main(String[] args) {
		Banco ban = new Banco();

        int opcao = 0;
        Scanner entrada = new Scanner(System.in);

               
        while(opcao !=8){
        	System.out.println("\tBanco");

            System.out.println("1. Adicionar"); 
            System.out.println("2. Mostrar saldo");
            System.out.println("3. Mostrar limite");
            System.out.println("4. Mostrar rentabilidade");
            System.out.println("5. Mostrar cotas");
            System.out.println("8. Sair");
            System.out.println("Opcao: ");
            
            opcao = entrada.nextInt();
            
            if(opcao ==1) {
            	int opcao2 = 0;

            	System.out.println("\tMenu de Adição");
                System.out.println("1. Adicionar saldo");
                System.out.println("2. Adicionar cota");
                System.out.println("3. Adicionar rentabilidade");
                System.out.println("4. Adicionar limite");
                
                opcao2 = entrada.nextInt();
                
                if (opcao2 == 1) {

				} else if (opcao2 == 2) {

				}
				else if (opcao2 == 3) {

				}
				else if (opcao2 == 4) {

				}else {
					System.out.println("Escolha outra opção.");
				}
				
            }
            
            else if (opcao == 2) {
				
			}
            
            else if (opcao == 3) {
            	
			}
            
			else if (opcao == 4) {
				
			}
            
			else if (opcao == 5) {
							
			}
            
			
        }
		

	}

}

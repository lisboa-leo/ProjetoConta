package contaunica;

import java.util.Scanner;


public class contaunica {
   public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
		String aux;
		int opcao;
		double valor;
		
		System.out.println("Digite o Titular Da Conta: ");
		aux = in.nextLine();
		
		conta c1 = new conta(aux);
		
		do{
			System.out.println("--- MENU ---");
			System.out.println("1) Dados Bancários");
			System.out.println("2) Depósito");
			System.out.println("3) Saque");
			System.out.println("0) Sair");
			
			System.out.println("Opção: ");
			opcao = in.nextInt();
			
			if(opcao == 1) {
				c1.DadosBancarios();
			}
			else if(opcao == 2){
				System.out.println("Digite o valor do depósito: ");
				valor = in.nextDouble();
				
				c1.Depositar(valor);
			}
			else if(opcao == 3){
				System.out.println("Digite o valor do saque: ");
				valor = in.nextDouble();
				
				c1.Sacar(valor);
			}
			
		} while(opcao != 0);
}
}

package contaunica;

public class conta {
	private int numero;
	private String titular;
	private double saldo;
	static int qtdcontas = 0;
	
	public conta(String pTitular) {
		this.titular = pTitular;
		qtdcontas++;
		this.numero = qtdcontas;
		this.saldo = 0;
	}
	
	public void DadosBancarios() {
		System.out.println("--Dados Bancarios--");
		System.out.println("--N�mero: " + this.numero);
		System.out.println("--Titular: "+ this.titular);
		System.out.println("--Saldo: "  + this.saldo);
		System.out.println("---Fim Dados Banc�rios ---");
		System.out.println("");
	}
	
	public void Depositar(double pValor) {
		System.out.println("");
		System.out.println("--- Realizando Deposito ---");
		System.out.println("-- Saldo Anterior: "+ this.saldo);
		
		this.saldo += pValor; //this.saldo = this.saldo + pValor;
		
		System.out.println("- Saldo Posterior: "+ this.saldo);
		System.out.println("--- Fim Do Dep�sito ---");
		System.out.println("");
	}
	
	public void Sacar(double pValor) {
		System.out.println("");
		System.out.println("--- Realizando Saque ---");
		System.out.println("- Saldo anterior: "+ this.saldo);
		

		if(pValor <= this.saldo) {//caso eu tenha saldo 
		    this.saldo -=pValor;
		}
		else{ //caso eu n�o tenha saldo
			System.out.println("- Saldo Insuficiente");
		}
	    System.out.println("--- Fim Do Saque ---");
	    System.out.println("");
	    
		
	}

}

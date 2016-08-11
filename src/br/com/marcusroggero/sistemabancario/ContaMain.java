package br.com.marcusroggero.sistemabancario;

public class ContaMain {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta("Marcus", 10000);
		
		conta.depositar(5000);
		conta.sacar(2500.11);
		
		System.out.println(Conta.limiteCredito);
				
	}
	
}

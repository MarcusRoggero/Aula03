package br.com.marcusroggero.sistemabancario;

public class Conta {
	
	private String nome;
	private double saldo;
	
	public static double limiteCredito = 500;
	
	public Conta(String nome, double saldo) {
		
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void depositar(double valorDepositado) {
		this.saldo = saldo + valorDepositado;		
	}
	
	public void sacar(double ValorDepositado) {
		this.saldo = saldo - ValorDepositado;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public String toString() {		
		return "Nome " + this.nome + "\n" +
				"Saldo " + this.saldo;
	}
}

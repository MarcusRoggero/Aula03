package br.com.marcusroggero.sistemaautomotivo;

public class Carro {
	
	String 	marca;
	double 	motor;
	String 	modelo;
	String 	cor;
	int 	ano;
	String 	renavam;
	
	public Carro(String marca, double motor, String modelo, String cor
				, int ano, String renavam) {
		this.marca = marca;
		this.motor = motor;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.renavam = renavam;
	}
	
	public Carro() {
		this.marca = "";
		this.motor = 0;
		this.modelo = "";
		this.cor = "";
		this.ano = 0;
		this.renavam = "";
	}
	
	@Override
	public String toString() {
		return "Modelo: " + this.modelo + "\n" +
				"Marca: " + this.marca + "\n" +
				"Cor: " + this.cor + "\n" +
				"Ano: " + this.ano + "\n" +
				"Renavam: " + this.renavam;
	}
	
}

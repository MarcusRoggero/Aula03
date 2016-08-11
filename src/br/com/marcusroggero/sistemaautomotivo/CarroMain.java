package br.com.marcusroggero.sistemaautomotivo;

public class CarroMain {

	public static void main(String[] args) {

		Carro fusca 	= new Carro();
		fusca.ano 		= 1965;
		fusca.cor 		= "Azul";
		fusca.marca 	= "Volkswagen";
		fusca.modelo 	= "Fusca Itamar";
		fusca.motor 	= 1.5;
		fusca.renavam 	= "1234567890";
		
		Carro monza 	= new Carro();
		monza.ano 		= 1987;
		monza.cor		= "Preto";
		monza.marca		= "GM";
		monza.modelo	= "Monza Classic";
		monza.motor		= 2.0;
		monza.renavam	= "9876543210";
		
		Carro corcel 	= new Carro("Ford", 1.4, "Corcel", "Bege", 1972, "2345678901");
		
		Carro corolla = new Carro();
		
		System.out.println(fusca + "\n");
		System.out.println(corcel + "\n");
		System.out.println(corolla);
		
		
	}

}

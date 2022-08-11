package edu.alvacir.dispositivos;


import edu.alvacir.dispositivos.ReprodutorMusical.ReprodutorMusical;

public class Ipod implements ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("Tocando de Ipod");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando de Ipod");
		
	}

	@Override
	public void SelecionarMusica() {
		System.out.println("Selecionando Musica de Ipod");
		
	}

	

}

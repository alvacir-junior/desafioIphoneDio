package edu.alvacir.dispositivos;

import edu.alvacir.dispositivos.ReprodutorMusical.ReprodutorMusical;

public class DispositivoMp3 implements ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Tocando musica de MP3");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica de MP3");
		
	}

	@Override
	public void SelecionarMusica() {
		System.out.println("Selecionando Musica de MP3");
		
	}

}

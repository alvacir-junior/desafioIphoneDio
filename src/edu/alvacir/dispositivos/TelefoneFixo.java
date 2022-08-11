package edu.alvacir.dispositivos;

import edu.alvacir.dispositivos.AparelhoTelefonico.AparelhoTelefonico;

public class TelefoneFixo implements AparelhoTelefonico{

	@Override
	public void ligar() {
		System.out.println("Ligando de telefone fixo...");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo de telefone fixo");
		
	}

	@Override
	public void iniciarCorreioVoz() {
			System.out.println("Iniciando Correio de voz de telefone fixo...");
		
	}

}

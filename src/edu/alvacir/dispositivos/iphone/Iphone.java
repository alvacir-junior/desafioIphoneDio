package edu.alvacir.dispositivos.iphone;

import edu.alvacir.dispositivos.AparelhoTelefonico.AparelhoTelefonico;
import edu.alvacir.dispositivos.NavegadorInternet.NavegadorInternet;
import edu.alvacir.dispositivos.ReprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("Tocando musica de Iphone...");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica de Iphone...");
		
	}

	@Override
	public void SelecionarMusica() {
		System.out.println("Selecionando musica de Iphone...");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina de IPHONE");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando pagina de IPHONE");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina de IPHONE");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando de Iphone");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo de Iphone");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de voz de Iphone");
		
	}

}

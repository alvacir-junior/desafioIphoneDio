package edu.alvacir.usuario;

import edu.alvacir.dispositivos.DispositivoMp3;
import edu.alvacir.dispositivos.NavegadorInternetExplorer;
import edu.alvacir.dispositivos.TelefoneFixo;
import edu.alvacir.dispositivos.AparelhoTelefonico.AparelhoTelefonico;
import edu.alvacir.dispositivos.NavegadorInternet.NavegadorInternet;
import edu.alvacir.dispositivos.ReprodutorMusical.ReprodutorMusical;
import edu.alvacir.dispositivos.iphone.Iphone;

public class Usuario {
	public static void main(String[] args) {
		Iphone iphone1 = new Iphone();
		
		ReprodutorMusical mp3 = new DispositivoMp3() ;
		AparelhoTelefonico telefone = new TelefoneFixo();
		NavegadorInternet nav = new NavegadorInternetExplorer();
		
		
		mp3.tocar();
		iphone1.tocar();
		
		nav.exibirPagina();
		iphone1.exibirPagina();
		
		telefone.ligar();
		iphone1.ligar();
		
	}

}

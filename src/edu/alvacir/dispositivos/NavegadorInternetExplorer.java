package edu.alvacir.dispositivos;

import edu.alvacir.dispositivos.NavegadorInternet.NavegadorInternet;

public class NavegadorInternetExplorer implements NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina de InternetExplorer...");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Nova Aba de InternetExplorer");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina de InternetExplorer");
		
	}

}

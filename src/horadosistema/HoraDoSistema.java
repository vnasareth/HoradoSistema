package horadosistema;

//importado biblioteca date 

import java.util.Date;

public class HoraDoSistema {

	public static void main(String[] args) {

		// essa classe Date mostra data e hora do sistema // a palavra " new " � um
		// indicativo que estou criando um novo objeto
		// o objeto nesse caso � o relogio como sei que ele � o objeto porque tem a
		// palavra new logo em seguida

		Date relogio = new Date();

		// linha para imprimir nesse caso o texto " A hora do Sistema � "

		System.out.println(" A hora do Sistema � ");

		// Esse metodo ToString converte esse objeto Data para string
		System.out.println(relogio.toString());
		
	}

}

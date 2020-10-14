package AnalisesSintatica;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		System.out.println("** Testando Coamndo Simples **");
		Comando analiseSintatica = new ComandoSimples("funcaoSimples()");
		analiseSintatica.execute();
		System.out.println("-------------------------");
		System.out.println("");
		
		System.out.println("** Testando Comandos Compostos **");
		ArrayList<Comando> comandos = new ArrayList<Comando>();
		comandos.add(new ComandoSimples("funcao1()"));
		comandos.add(new ComandoSimples("funcao2()"));
		comandos.add(new ComandoSimples("funcao3()"));
		analiseSintatica = new ComandoComposto(comandos);
		analiseSintatica.execute();
		System.out.println("-------------------------");
		System.out.println("");
		
		System.out.println("** Testando Comando Condicional **");
		analiseSintatica = new ComandoCondicional(new ComandoSimples("funcaoCasoSejaIf()"), new ComandoSimples("funcaoCasoSejaElse()"));
		analiseSintatica.execute();
		System.out.println("-------------------------");
		System.out.println("");
		
		System.out.println("** Testando todos juntos**");
		Comando comandoIf = new ComandoSimples("funcaoSimples()");
		
		ArrayList<Comando> comandosElse = new ArrayList<Comando>();
		comandosElse.add(new ComandoSimples("funcao1()"));
		comandosElse.add(new ComandoSimples("funcao2()"));
		Comando comandoComposto = new ComandoComposto(comandosElse);
		
		Comando comandoCondicional = new ComandoCondicional(comandoIf, comandoComposto);
		
		ArrayList<Comando> comandos2 = new ArrayList<Comando>();
		comandos2.add(new ComandoSimples("printBoasVindas()"));
		comandos2.add(comandoCondicional);
		analiseSintatica = new ComandoComposto(comandos2);
		
		analiseSintatica.execute();
	}

}

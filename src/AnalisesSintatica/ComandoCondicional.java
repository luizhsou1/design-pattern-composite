package AnalisesSintatica;

import java.util.Random;

public class ComandoCondicional implements Comando {
 private Comando comandoIf, comandoElse;

 public ComandoCondicional(Comando comandoIf, Comando comandoElse){
	 this.comandoIf =  comandoIf;
	 this.comandoElse =  comandoElse;
 }

 public void execute(){
	 Random randomico = new Random();
	 Double num = randomico.nextDouble();
	 if (num < 0.5) {
		 comandoIf.execute();
	 } else {
		 comandoElse.execute();
	 }
 }

}
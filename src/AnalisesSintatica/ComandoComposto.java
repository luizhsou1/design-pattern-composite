package AnalisesSintatica;

import java.util.ArrayList;

public class ComandoComposto implements Comando {
 private ArrayList<Comando> comandos;

 public ComandoComposto(ArrayList<Comando> comandos){
	 this.comandos =  comandos;
 }

 public void execute(){
	 for (int i=0; i<comandos.size(); i++) {
		 this.comandos.get(i).execute();
	 }
 }

}
package AnalisesSintatica;

public class ComandoSimples implements Comando {
 private String conteudo;

 public ComandoSimples(String conteudo){
	 this.conteudo = conteudo;
 }

 public void execute(){
	 System.out.println(this.conteudo);
 }

}
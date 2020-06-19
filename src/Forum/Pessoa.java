package Forum;

public class Pessoa {
	
	package Classes;

import Classes.Data;

public class Forum {
		
		
		  private String nome;
		  private String sobreNome;
		  private Data dataNascimento;
		  

		  // Construtor
		  public Pessoa(String nome, String sobreNome, int dia, int mes, int ano) {
		  this.nome = nome;
		  this.sobreNome = sobreNome;
		  dataNascimento = new Data ( dia, mes, ano );
		 
		  }

		  public Pessoa() {
		  }

		  
		  public String getNome() {
		  return nome;
		  }

		  public void setNome(String nome) {
		  this.nome = nome;
		  }

		  public String getSobreNome() {
		  return sobreNome;
		  }

		  public void setSobreNome(String sobreNome) {
		  this.sobreNome = sobreNome;
		  }

	      @Override
		  public String toString (){
		  return "Nome Completo: " + this.getNome()+ " " + this.getSobreNome() +
		  "\nData de Nascimento: "+this.dataNascimento.imprimirData();
		  }

		}


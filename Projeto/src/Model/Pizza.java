package Model;

import java.util.Scanner;

public class Pizza {

	
     private int pesoMassa ;
     private String recheio ;
     private int tamanho ;
     private String tipo ; 
	 private Scanner scan = new Scanner(System.in);
	

     
 public Pizza() {
	 
	 this.pesoMassa = pesoMassa;
	 this.recheio = recheio ;
	 this.tamanho = tamanho ;
	 this.tipo = tipo;
	 
	 
 }

 
 
 
 public void fazerPizza() {
	 

	 
	 System.out.println("Digite os dados para fazer Pizza ");
	 
	 
	 System.out.println("Digite o peso da pizza em gramas ");
	 setPesoMassa( Integer.parseInt(scan.nextLine()));
	 
	 System.out.println("digite o tamanho em centimetros ");
	 setTamanho( Integer.parseInt(scan.nextLine()));
	 
	 System.out.println("  Digite o sabor do recheio ");
	 setRecheio(scan.nextLine()) ;
	 
	 System.out.println("Digite o tipo de Pizza ");
	 setTipo(scan.nextLine());
	 
	 
	 System.out.println("Pizza montada !!!!!");
	 
 }
 
	
 public int getPesoMassa() {
	return pesoMassa;
}




public void setPesoMassa(int pesoMassa) {
	this.pesoMassa = pesoMassa;
}




public String getRecheio() {
	return recheio;
}




public void setRecheio(String recheio) {
	this.recheio = recheio;
}




public int getTamanho() {
	return tamanho;
}




public void setTamanho(int tamanho) {
	this.tamanho = tamanho;
}




public String getTipo() {
	return tipo;
}




public void setTipo(String tipo) {
	this.tipo = tipo;
}




@Override
 
 public String toString() {
	 
	 return "Tipo  : "+tipo+ " Peso : "+pesoMassa+" Tamanho : "+tamanho+" recheio "+recheio;
 }
 
 
 
}

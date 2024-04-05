package Model;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Forno {

	private int temperatura;
	private int quantidadePizza ;
	
	 
	
	
	public Forno() {
		
		
		
		this.quantidadePizza = quantidadePizza ; 
		this.temperatura =temperatura;
		
	}
	
	
	
	
	public int getTemperatura() {
		return temperatura;
	}




	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}




	public int getQuantidadePizza() {
		return quantidadePizza;
	}




	public void setQuantidadePizza(int quantidadePizza) {
		this.quantidadePizza = quantidadePizza;
	}



	public void assarPizza() {
		
	   Pizza p = new Pizza();
	   
	   double tempoPreparo ; 
	   double pizzaPronta ; 
	   double inicio ; 
		  	
	   
	  Scanner scan = new Scanner(System.in);
	  
	  
	  p.fazerPizza();  
	  
	  System.out.println(p);
	  
	  System.out.println("Pizza pronta para entrar no forno !  ");
	
	  System.out.println("Digite a temperatura ");
	  setTemperatura(Integer.parseInt(scan.nextLine()));
	   
	  System.out.println("Digite a Quantidade de pizzas  ");
	  setQuantidadePizza(Integer.parseInt(scan.nextLine()));
	  
	  
	   
	
	    tempoPreparo = (( p.getTamanho() * getQuantidadePizza() ) / getTemperatura() ) ; 
	  
	    pizzaPronta =  (tempoPreparo * 60) ; 
	    
	    
	    System.out.println(" tempo de preparo :  "+pizzaPronta);
	    
	    System.out.println(" tempo de preparo variavel  :  "+tempoPreparo);
	    
	    inicio = 0 ;
	    
	    while (inicio < pizzaPronta) {
	    	
	    	
	    	
	    	System.out.println("Pizza fazendo ....");
	    	
	    	System.out.println(" em andamento faltando :"+inicio);
	    	
	    	    
	    	
	    	inicio++;
	    }
	    
	    
	         if (inicio == pizzaPronta ) {
        	
        	
	        System.out.println("Pizza pronta  ! ");
	        System.out.println(p);
	        
	        
	        }
	       
	        
	}
	
	
	
}

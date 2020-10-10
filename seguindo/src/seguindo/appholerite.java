package seguindo;

 import java.util.Scanner;

public class appholerite {
	
  public static void main(String [] args) {
	
	Scanner scan =new Scanner(System.in);
	
	 System.out.println("insira valor hora ?");
	 
	   double valorHora =scan.nextDouble();
	   
	      System.out.println("insira as horas do mes");
	         
	         double horas = scan.nextDouble();
	         
	           double salariobruto = valorHora * horas;
	           
	             double inss = salariobruto / 100 * 8;
	           
	               double sindicato = salariobruto / 100 * 5;
	             
	                 double ir = salariobruto / 100 * 11;
	                  
	                   double totaldescontos = inss + sindicato + ir ;
	                   
	                     double salarioliquido = salariobruto - totaldescontos;
	           
	                       System.out.println("salario bruto: " + salariobruto);
	                       
	                        System.out.println("inss: " + inss);
	                       
	                          System.out.println("sindicato: " + sindicato);
	                          
	                            System.out.println("ir: " + ir);
	                            
	                               System.out.println("totaldescontos: " + totaldescontos);
	             
	                                 System.out.println("salarioliquido: " + salarioliquido);
	}
} 

		
import java.util.Scanner;


public class Media{
	

public static void main(String [] args){
	//int QtNotas;
	
	Scanner leitor = new Scanner(System.in);
	
	//System.out.println("Quantas notas você vai digitar?");
	
	//QtNotas=leitor.nextInt();
	
	//System.out.println("digite as " + QtNotas + " notas do bimestre");

	System.out.println("digite as notas do bimestre");
	
	//int [] notas = new int [QtNotas];
	int [] notas = new int [4];
		
	
	for(int i=0; i<notas.length; i++){
		
		notas[i]=leitor.nextInt();
		
	}
	
	for(int i=0; i<notas.length; i++) {
		
		System.out.println("voce digitou: " + notas[i] + ", na posição: " + (i+1));		
		
	}
	
	//int media = notas[0] + notas[1]+ notas [2] + notas[3] /4 ;
	
	int media = (notas[0] + notas[1]+ notas [2] + notas[3]) /4 ; 
	System.out.println("a media é " + media);
	
	/*int[] media = notas;
	
for(int i=0; i<media.length; i++) {
	
		
	media[i] +=leitor.nextInt() ;
	media[i] = media[i]/4;
		
	System.out.println("voce digitou: " + media[i] + ", na posição: " + (i+1));	
	}

for(int i=0; i<media.length; i++) {
	
	System.out.println("a media dos valores digitados é " + media[i] );		
	
}*/
	
	leitor.close();

}

	

}


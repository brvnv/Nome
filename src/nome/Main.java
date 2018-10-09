package nome;

import java.util.Scanner;

public class Main {
public static void main (String[] args) {
System.out.println("Diga seu nome.");
Scanner sc=new Scanner(System.in);
String nome=sc.nextLine();
System.out.println("É um prazer, " + nome + ". \n Qual sua idade?");
int idade=sc.nextInt();
System.out.println(idade + "? \n Digite s ou n");
Scanner sc1=new Scanner(System.in);
String sOuN=sc1.nextLine();
if(sOuN.equals("s")) {
	System.out.println("Entendi. Tchau");
}
else if(sOuN.equals("n")) {
		System.out.println("Deveria ter maneirado no Black Metal quando mais novo, estou quase surdo.");
}
else
	System.out.println("Se você não faz questão, nem eu");
}
}
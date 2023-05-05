package serializacao;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ManipuladorArquivo {
	public static void leitor (String path) throws IOException{
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		
		while(true) {
			if(linha!=null) {
				System.out.print(linha);
			}else {
				break;
			}
			linha = buffRead.readLine();
		}
		buffRead.close();		
	}
	
	public static void escritor(String path) throws IOException{
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0 ; i < 3 ; i++) {
		System.out.printf("Escreva: ");
		linha = ler.nextLine();		
		buffWrite.append(linha + "\n");
		}
		buffWrite.close();
	}
}

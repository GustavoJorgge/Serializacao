package atividadeserializacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipulandoArquivo {
	
	public static void leitor(String pathNome, String pathSobrenome, String pathCompleto) throws IOException{
		BufferedReader buffNome = new BufferedReader(new FileReader(pathNome));
		BufferedReader buffSobrenome = new BufferedReader(new FileReader(pathSobrenome));
		BufferedWriter buffCompleto = new BufferedWriter(new FileWriter(pathCompleto));
		String nome = "";
		String sobrenome = "";
		String completo = "";
		while(true) {
			nome = buffNome.readLine();
			sobrenome = buffSobrenome.readLine();
			if(nome != null & sobrenome != null) {
				completo = nome + " " + sobrenome;
				System.out.printf("%s\n",completo);
				buffCompleto.append(completo + "\n");
			}else {
				break;
			}
		}
		buffNome.close();
		buffSobrenome.close();
		buffCompleto.close();
	}
	
}

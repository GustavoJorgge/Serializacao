package atividadeserializacao;
import java.io.IOException;

public class Main {
	public static void main(String[]args)throws IOException{
		String pathNome = "C:\\Users\\gusta\\OneDrive\\Área de Trabalho\\programas\\programas original\\Linguagem\\AulaSerializacao\\Serializacao\\src\\atividadeserializacao\\Arquivos\\nomes.txt";
		String pathSobrenome = "C:\\Users\\gusta\\OneDrive\\Área de Trabalho\\programas\\programas original\\Linguagem\\AulaSerializacao\\Serializacao\\src\\atividadeserializacao\\Arquivos\\SobreNome.txt";
		String pathCompleto = "C:\\Users\\gusta\\OneDrive\\Área de Trabalho\\programas\\programas original\\Linguagem\\AulaSerializacao\\Serializacao\\src\\atividadeserializacao\\Arquivos\\Completo.txt";
		
		ManipulandoArquivo.leitor(pathNome,pathSobrenome, pathCompleto);
			
	}
}

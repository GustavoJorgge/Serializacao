package serializacao;
import java.io.IOException;

public class ArquivoPrincipal {
	
	public static void main(String[]args)throws IOException{
		String path = "C:\\Teste\\Teste.txt";
		
		ManipuladorArquivo.escritor(path);
		ManipuladorArquivo.leitor(path);
	}
	
}

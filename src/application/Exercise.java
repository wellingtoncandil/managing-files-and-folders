package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		// instancia uma lista de produtos
		List<Produto> produtos = new ArrayList<>();

		//atribui a string strPath com o caminho do arquivo que será lido
		String strPath = "c:\\Temp\\exercise\\source.csv";
		File path = new File(strPath);
//cria a variavel br do tipo bufferedReader que recebe uma outro objeto FileReader instanciado com aa variavel path do tipo File
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine(); //variavel line recebe o conteudo da primeira linha do arquivo

			while (line != null) { //enquanto o arquivo conter linhas não lidas, a logica do bloco será executada
				String[] sepText = line.split(",");//cria um array e aloca em suas posições cada trecho de texto separado por ","
				Produto produto = new Produto();
				produto.setNome(sepText[0]); //instancia o nome do produto com o conteudo da posição 0 do array e assim sucessivamente
				double preco = Double.parseDouble(sepText[1]);
				produto.setPreco(preco);
				int quantidade = Integer.parseInt(sepText[2]);
				produto.setQuantidade(quantidade);
				double total = produto.getPreco() * produto.getQuantidade();
				produto.setTotal(total);
				line = br.readLine();//pula para a proxima linha a ser lida
				produtos.add(produto);// instancia a lista de produtos com as informações do produto que foram coletadas
			}

		} catch (IOException e) {
			e.getMessage();
		}
    
		//cria a pasta "out" a partir do diretorio que foi atribuido a "path"
		boolean success = new File(path.getParent() + "\\out").mkdir();
		System.out.println("Directory created succesfully: " + success);//informa se a pasta foi criada corretamente

		strPath = path.getParent() + "\\out\\summary.csv";//informa o novo caminho a ser trabalhado 
		path = new File(strPath);

		//bloco cria um novo arquivo no caminho informado e imprime as informações desejadas
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (Produto produto : produtos) {//percorre a lista de produtos e para cada produto executa a logica nele contida
				bw.write(produto.getNome());
				bw.write(", ");
				bw.write(String.valueOf(produto.getTotal()));
				bw.newLine();//pula de linha no arquivo
			}
			bw.newLine();//pula para a proxima linha a ser lida
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(produtos.toString());

		tec.close();

	}

}

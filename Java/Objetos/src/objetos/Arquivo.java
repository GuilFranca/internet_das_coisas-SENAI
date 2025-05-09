package objetos;

import java.io.*;

public class Arquivo {

    private final String nomeArquivo = "resultado.txt";
    
    public void escrever (String conteudo) {
        try (BufferedWriter bw = new BufferedWriter (new FileWriter(nomeArquivo))) {
            bw.write(conteudo);
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
    
    public void ler() {
        try (BufferedReader br = new BufferedReader (new FileReader (nomeArquivo))){
            String linha;
            System.out.println("\n--- Conteúdo do Arquivo ---");
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo" + e.getMessage());
        }
    }
    
}

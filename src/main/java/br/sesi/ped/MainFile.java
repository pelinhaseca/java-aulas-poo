package br.sesi.ped;

import java.io.IOException;

public class MainFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Aluno\\Documents\\Java-git\\git-repost\\java-aulas-poo\\File.txt";
        ManipuladorArquivos arquivo  = new ManipuladorArquivos();
        arquivo.leitor(path);
    }
}

package com.consultaapicep.main;

import java.io.IOException;
import java.util.Scanner;

import com.consultaapicep.model.DadosCep;
import com.consultaapicep.repository.ConsultaCep;
import com.consultaapicep.repository.GeradorArquivoJson;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        GeradorArquivoJson geradorDeArquivo = new GeradorArquivoJson();
        
        System.out.println("Digite um número de CEP para consulta:");
        var cep = leitura.nextLine();

        try {
            DadosCep novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            geradorDeArquivo.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação!");
        }

        leitura.close();
    }
}
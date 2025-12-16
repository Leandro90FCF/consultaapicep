package com.consultaapicep.repository;

import java.io.FileWriter;
import java.io.IOException;

import com.consultaapicep.config.GsonConfig;
import com.consultaapicep.model.DadosCep;

public class GeradorArquivoJson {
    public void salvaJson(DadosCep endereco) throws IOException {
        String nomeDoArquivo = endereco.cep() + ".json";
        try (FileWriter escrita = new FileWriter(nomeDoArquivo)) {
            escrita.write(GsonConfig.getGson().toJson(endereco));
        }
    }
}

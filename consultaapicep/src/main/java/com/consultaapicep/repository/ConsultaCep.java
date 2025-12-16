package com.consultaapicep.repository;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.consultaapicep.config.GsonConfig;
import com.consultaapicep.exception.ErroCepInvalido;
import com.consultaapicep.model.DadosCep;
import com.consultaapicep.model.ErroViaCep;

public class ConsultaCep {
    public DadosCep buscaEndereco(String cep) {
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json");

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            ErroViaCep erro = GsonConfig.getGson().fromJson(json, ErroViaCep.class);

            validarResposta(erro, cep);
            return GsonConfig.getGson().fromJson(json, DadosCep.class);

        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar o CEP: " + e.getMessage(), e);
        }
    }

    private void validarResposta(ErroViaCep erro, String cep) {
        if (Boolean.TRUE.equals(erro.erro())) {
            throw new ErroCepInvalido("CEP inválido ou não encontrado: " + cep);
        }
    }
}

# Consulta CEP – Java 17

## Descrição

Aplicação Java desenvolvida para demonstrar consumo de API REST externa, modelagem de dados imutáveis e tratamento explícito de erros de domínio, utilizando recursos nativos do Java moderno.

O projeto consulta CEPs por meio da API pública ViaCEP, processa a resposta JSON e persiste o resultado em arquivo local.

---

## Competências Demonstradas

- Consumo de API REST com `HttpClient`
- Manipulação de JSON com Gson
- Uso de `record` para modelagem de dados imutáveis
- Validação de respostas da API
- Implementação de exceções customizadas
- Escrita de arquivos JSON
- Separação clara de responsabilidades
- Código orientado à legibilidade e manutenção

---

## Tecnologias

- Java 17
- HttpClient (`java.net.http`)
- Gson (dependência externa)
- API ViaCEP

---

## Estrutura do Projeto

```
src/
 └── main/
     └── java/
         └── com/consultaapicep/
             ├── main/        -> Ponto de entrada da aplicação
             ├── config/      -> Configuração de serialização JSON
             ├── exception/   -> Exceções de domínio
             ├── model/       -> Records de dados
             └── repository/  -> Comunicação HTTP e persistência
```

---

## Execução

### Pré-requisitos

- Java 17 ou superior
- Biblioteca Gson adicionada ao projeto

### Passos

1. Execute a classe `Main`
2. Informe um CEP válido no console
3. O resultado será exibido e salvo em um arquivo `.json`

---

## Observações Técnicas

- Projeto sem uso de frameworks
- Foco em Java puro e recursos modernos da linguagem
- Estrutura preparada para extensão ou substituição do provider de CEP

---

## API Utilizada

- ViaCEP – https://viacep.com.br/

---

> English version available in **README_EN.md**


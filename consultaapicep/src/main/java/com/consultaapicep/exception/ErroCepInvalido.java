package com.consultaapicep.exception;

public class ErroCepInvalido extends RuntimeException {
    public ErroCepInvalido(String mensagem) {
        super(mensagem);
    }
}

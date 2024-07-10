package br.com.alura.screenmatch.exception;

public class ErroDeconversaoException extends RuntimeException {
    private String mensagem;

    public ErroDeconversaoException(String mensagem) {
    this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}


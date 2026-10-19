package org.example;

public class EroeNonIdoneoException extends RuntimeException {
    public EroeNonIdoneoException(String message, String nome, int livello) {
        super(message + "\n" + "nome : " + nome + "\n" + "forza : "+ livello);
    }
}

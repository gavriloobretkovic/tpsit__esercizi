package org.example;

public class SaldoInsufficienteException extends Exception {
    public SaldoInsufficienteException(String message, float saldo, float preleva) {
        super(message + "\n" + "saldo: " + saldo +  "\n" + "tentativo di prelevare: "  + preleva);
    }
}

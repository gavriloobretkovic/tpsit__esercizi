package org.example;

public class ContoBancario {
    float saldo;

    public ContoBancario(float saldo) {
        this.saldo = saldo;
    }

    public void Preleva(float preleva) throws SaldoInsufficienteException{
        if (saldo - preleva < 0) {
            throw new SaldoInsufficienteException("negativo non si puo", saldo, preleva);
        } else {
            IO.println(saldo-preleva);
        }
    }
}

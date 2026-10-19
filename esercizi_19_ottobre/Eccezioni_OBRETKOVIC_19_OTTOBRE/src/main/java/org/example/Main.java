package org.example;

class Main {
    static void main() throws SaldoInsufficienteException {
        float prelievo;
        ContoBancario conto1 = new ContoBancario(1000);

        IO.println("Inserisci l'importo da prelevare");

        prelievo = Float.parseFloat(IO.readln());

        if (prelievo > 100000000 || prelievo <= 0) {
            throw new ImportoNonValidoException("numero impossibile");
        } else {
            conto1.Preleva(prelievo);
        }
    }
}
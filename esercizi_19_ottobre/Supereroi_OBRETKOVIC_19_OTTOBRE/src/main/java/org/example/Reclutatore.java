package org.example;
import net.datafaker.Faker;

import java.util.logging.ConsoleHandler;

public class Reclutatore {
    Faker faker;
    String nome;
    int forza;

    public Reclutatore() {
        faker = new Faker();
        nome = faker.superhero().name();
        forza = faker.number().numberBetween(0, 100);
    }

    public void Confronta(int missione) {
        try {
            if (missione > forza) {
                throw new EroeNonIdoneoException("troppa poca forza", nome, forza);
            } else {
                IO.println("missione completata nome: " + nome + " forza: " + forza);

            }
        }
        catch (EroeNonIdoneoException e) {
            e.printStackTrace();
        }
    }
}

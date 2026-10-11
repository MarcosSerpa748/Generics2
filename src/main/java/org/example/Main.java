package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = List.of(
                new Animal(),
                new Cachorro(),
                new Cachorro(),
                new Gato(),
                new Gato(),
                new Gato(),
                new Bulldog()
        );

        Utilitarios.visualizarSons(animals);
    }
}
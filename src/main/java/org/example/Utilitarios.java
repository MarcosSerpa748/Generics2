package org.example;

import java.util.List;

public class Utilitarios {

    public static void visualizarSons(List<? extends Animal> animals){

        animals.forEach(e ->e.emitirSom());
    }
}

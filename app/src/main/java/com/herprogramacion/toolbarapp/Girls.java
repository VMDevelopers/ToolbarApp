package com.herprogramacion.toolbarapp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Envoltura para generar una lista de ejemplo
 */
public class Girls {
    //String[] cosasPorHacer = new String[]
    public static final String[] nameFrutas = {
            "Durazno", "Chirimoya", "Ciruela", "Coco", "Cocona",
            "Fresa", "Granadilla", "Guanábana", "Higo negro", "Higo seco", "Lúcuma",
            "Mandarina", "Mango", "Manzana nacional", "Jugo de Maracuyá", "Melón", "Membrillo",
            "Naranja", "Níspero", "Papaya", "Pasas sin pepas", "Pepino dulce", "Pera chilena", "Piña",
            "Plátano de Isla", "Plátano de Seda", "Plátano Manzano", "Plátano Maduro", "Sandia", "Tuna", "Uva italia",
            "Uva negra", "Kiwi", "Jugo de Naranja"
    };
    //List<String> milista = Arrays.asList(nameFrutas);
    /**
     * Genera una lista de objetos {@link Girl} con un tamaño determinado
     *
     * @param count Tamaño
     * @return Lista aleatoria
     */
    public static List<Girl> randomList(int count) {
        Random random = new Random();
        List<Girl> items = new ArrayList<>();

        // Restricción de tamaño
        count = Math.min(count, nameFrutas.length);

        while (items.size() < count) {
            items.add(new Girl(nameFrutas[random.nextInt(nameFrutas.length)]));
        }


        return new ArrayList<>(items);
    }
}

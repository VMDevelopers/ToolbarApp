package com.herprogramacion.toolbarapp;

import java.util.List;
import java.util.Random;

/**
 * POJO de las frutas
 */
public class Girl {

    private String name;
    private int idDrawable;

    public Girl(String name, int idDrawable) {
        this.name = name;
        this.idDrawable = idDrawable;
    }

    public Girl(String name) {
        this.name = name;
        this.idDrawable = getListGirlDrawable();
    }

    public String getName() {
        return name;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    /**
     * Asigna un drawable en forma aleatoria
     *
     * @return id del drawable
     */
    private int getListGirlDrawable() {
        Random rnd = new Random();

        switch (rnd.nextInt(18)) {
            default:
            case 0:
                return R.drawable.duraz;
            case 1:
                return R.drawable.chiri;
            case 2:
                return R.drawable.uvang;
            case 3:
                return R.drawable.coco;
            case 4:
                return R.drawable.cirue;
            case 5:
                return R.drawable.mango;
            case 6:
                return R.drawable.higon;
            case 8:
                return R.drawable.higos;
            case 9:
                return R.drawable.higos;
            case 10:
                return R.drawable.fresa;
            case 11:
                return R.drawable.mndrn;
            case 12:
                return R.drawable.ggrnd;
            case 13:
                return R.drawable.tuna;
            case 14:
                return R.drawable.sndia;
            case 15:
                return R.drawable.ppaya;
            case 16:
                return R.drawable.pina;
            case 17:
                return R.drawable.pera;
        }
    }
}

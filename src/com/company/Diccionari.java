package com.company;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by 23814360e on 24/01/2017.
 */
public class Diccionari {

    String paraules = "hola:adeu:benvinguts:programmacio:classe:suspens:contrasenya:idiota";
    String[] arrayParaules = paraules.split(":");

    public String getRandomParaules (){

        int randomNum = ThreadLocalRandom.current().nextInt(0, arrayParaules.length);
        return arrayParaules[randomNum];
    }

}

package com.company;

/**
 * Created by 23814360e on 24/01/2017.
 */
public class GameState {

    private String paraula;
    private int intents;
    private boolean[] encerts;

    public GameState() {

        Diccionari diccionari = new Diccionari();
        this.paraula = diccionari.getRandomParaules();
        this.encerts = new boolean[paraula.length()];
        this.intents = 0;

    }


    public boolean isOver(){

        boolean pendingLetter = false;

        for(int i = 0; i<encerts.length; i++) {
            if (encerts[i] == false) {
                pendingLetter = true;
                break;
            }
        }

        if((pendingLetter == true && intents == 10) || pendingLetter == false){
            return true;
        }else {
            return false;
        }
    }

    public String getCurrentResult(){

        String result = "";

        for(int i = 0; i<paraula.length(); i++){
            if(encerts[i] == false){
                result = result + "_ ";
            }else{
                result = result + paraula.charAt(i);
            }
        }

        result = result + System.lineSeparator();
        result = result + "You have "+ (10-intents) + " attempts left.";

        return result;
    }

    public void checkLetter(char letter){

        int coincidence = 0;

        for(int i = 0; i<paraula.length(); i++){
            if(paraula.charAt(i) == letter) {
                encerts[i] = true;
                coincidence++;
            }
        }
        if(coincidence==0){

            intents++;
            System.out.println("This letter doesn't match.");

        }
        else{
            System.out.println("This letter matches!");
        }

    }
    public boolean hasWon(){

        if(isOver() && intents<10){
            return true;
        }
        else{
            return false;
        }
    }

}


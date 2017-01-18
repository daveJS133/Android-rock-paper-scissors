package example.codeclan.com.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 18/01/2017.
 */



public class Game {

    private String com_C;
    int choice;
    Random com_C_num = new Random();
    String result;
    public Game() {
        result = "";
        com_C = "";
        choice = com_C_num.nextInt(2);

    }


    public String make_choice() {


        if (choice == 0) {
            com_C = "Rock";
        }

        if (choice == 1) {
            com_C = "Paper";
        }

        if (choice == 2) {
            com_C = "Scissors";
        }
        return com_C;
    }

    public String play(String player_C,String com_C){
        if (player_C.equals("Rock")){
            if (com_C.equals("Paper")){
                result = "You Lose";
            }
            if (com_C.equals( "Scissors")){
                result = "You Win";
            }
        }
        if (player_C.equals("Paper")){
            if (com_C.equals("Rock")){
                result = "You Win";
            }
            if (com_C.equals("Scissors")){
                result = "You Lose";
            }
        }
        if (player_C.equals("Scissors")){
            if (com_C.equals("Rock")){
                result = "You Lose";
            }
            if (com_C.equals("Paper")){
                result = "You Win";
            }
        }

        if (player_C.equals(com_C)){
            result = "Draw";
        }
        return result;
    }
}

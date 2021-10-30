package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private int number;
    private int guessesLeft;
    private int guessedNumber;


    public void setRandomNumber(){
        Random rng = new Random();
        number = rng.nextInt(101);
        guessesLeft= 6;
    }
    public void gameStart(){
        setRandomNumber();
        guessIt();

    }
    public void guessIt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("még ennyi tipped van:" +guessesLeft);
        System.out.println("Tippelj");
        setGuessedNumber(sc.nextInt());
        sc.nextLine();
        isItCorrect();
    }
    public void isItCorrect(){
        if (number > guessedNumber){
            System.out.println("a szám amire gondoltam nagyobb");
        } else if (number == guessedNumber){
            System.out.println("nyertél");
            return;
        } else {System.out.println("aszám amire gondoltam kisebb"); }
        guessesLeft--;
        isTheGameStillOn();
    }

    public void isTheGameStillOn(){
        if (guessesLeft ==0){
            System.out.println("GAME OVER");
            System.out.println("A szám amire gondoltam: "+  number);
        } else {
            guessIt();
        }

    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGuessesLeft() {
        return guessesLeft;
    }

    public void setGuessesLeft(int guessesLeft) {
        this.guessesLeft = guessesLeft;
    }

    public int getGuessedNumber() {
        return guessedNumber;
    }

    public void setGuessedNumber(int guessedNumber) {
        this.guessedNumber = guessedNumber;
    }
}

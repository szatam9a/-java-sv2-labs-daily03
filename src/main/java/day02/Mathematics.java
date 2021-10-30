package day02;

public class Mathematics {
    public boolean isPrime(int number){
        int counter = 0;
        if ((number ==0) | (number ==1)){return false;}

        for (int i = 2;i<number;i++){
            if ((number%i==0)) {
                return false;
            }
        }
    return true ;}
}


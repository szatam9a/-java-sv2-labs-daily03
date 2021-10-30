package day04;

public class Prison {
    boolean[] cell = new boolean[100];
    public void openFreeCells(){
        for (int i = 0; i < cell.length ; i++) {
            for (int j = i; j < cell.length ; j++) {
                if ((j+1)%(i+1)==0){
                    cell[j]=!cell[j];
                }
            }
        }
    }
    public void showTheCells(){
        for (int i = 0; i < cell.length ; i++) {
            if (cell[i]==true){
                System.out.println(i+1);
            }
            
        }
    }
}

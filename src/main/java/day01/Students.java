package day01;

import java.util.*;

public class Students {
    private List<Integer> height = new ArrayList<>();

    public void addHeight(int height){
        this.height.add(height);
    }
    public boolean isHeightsIncreasing(){
        List<Integer> control = new ArrayList<>();
        control.addAll(height);
        Collections.sort(control);
       return (control.equals((height)));
    }


}

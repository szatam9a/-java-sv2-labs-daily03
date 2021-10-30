package day01;

public class School {

    public static void main(String[] args) {
        Students st = new Students();
        st.addHeight(3);
        st.addHeight(5);
        st.addHeight(8);
        st.addHeight(9);
        System.out.println("növekvő a sorrend? "+ st.isHeightsIncreasing());

    }
}

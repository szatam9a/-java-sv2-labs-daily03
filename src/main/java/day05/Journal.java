package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Journal {
    List<String> lista = new ArrayList<>();

    public boolean addStudent(String studentName) {
        if (studentName.contains(" ")) {
            lista.add(studentName);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.addStudent("Pista Pista");
        journal.addStudent("PistaPista");
    }
}

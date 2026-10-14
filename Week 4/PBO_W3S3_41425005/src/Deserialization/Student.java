package Deserialization;

import java.io.Serializable;

class Student implements Serializable {
    int id;
    String n;

    public Student(int id, String n) {
        this.id = id;
        this.n = n;
    }

    Student(String alice) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Student:" + n;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_w3s3_41425005;

/**
 *
 * @author Nikolas
 */
public class Main {
    public static void main(String[] args) {
        try {
           Class<?> c = Class.forName("Student");
           Student s2 = (Student) c.getDeclaredConstructor().newInstance();
           System.out.println("Object created: " + s2);
        } catch (ClassNotFoundException e) {
           System.err.println("Class not found!");
        } catch (NoSuchMethodException e) {
           System.err.println("No default constructor!");
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}


package co.pragra.demo;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;

public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("Line10");
       try {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter a number");
           String line = scanner.nextLine();
           int i = Integer.parseInt(line);
           greeting("Alisha");

          // System.out.println(2/0);
           System.out.println("Line11");
           System.out.println("Line12");
       }catch (PragraException ex){
           System.out.println(ex.getMessage());

       }catch (Exception ex){

       }
       finally {
           System.out.println("*** I AM RUNNING ANYWAY****");
       }


        System.out.println("Line13");
        System.out.println("Line14");
        System.out.println("Line15");
        System.out.println("Line16");
        System.out.println("Line17");

        User user  = new User();
        user.register("Asc");
    }

    public static void greeting(String name) {
        System.out.println("I am dummy");
        if(name.length()<4) {
            throw new PragraException("NOT A VALID NAME");
        }else {
            System.out.println("Hello "+ name);
        }
    }
}

package jfarrow.co.za;

import java.util.ArrayList;
import java.util.Scanner;

import gyurix.bencoder.BEncoder;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            BEncoder be = new BEncoder();
            System.out.print("Enter Encoded Data: ");
            String in = scan.nextLine();
            be.setInput(in);
            ArrayList<Object> list = be.readAll();
            System.out.println("Decoded:\n" + list);
            be.resetOutput();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
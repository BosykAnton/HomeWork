package com.company;

import java.io.*;

public class HomeWork16 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("aplana.txt"));

            String  textOutput;
            while ((textOutput = br.readLine()) != null){
                System.out.println(textOutput);
            }
        } catch (IOException ex){
            System.out.print("Error" + ex);
        }
    }
}

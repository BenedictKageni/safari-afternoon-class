package xyz;

import javax.swing.*;

public class File6 {
    public static void main(String[] args) {
        String Num;
        Integer NumConverted;
        String[] voters;
        Num = JOptionPane.showInputDialog("How many Voters?");
        NumConverted =Integer.parseInt(Num);
        voters = new String[NumConverted];
        for (int i=0; i<NumConverted; i++){
          voters[i]  =JOptionPane.showInputDialog("Enter voter "+(i++)){
               
        for (int i=0; i<NumConverted;i++){
            System.out.println((i+1)+""+voters[i];

        }
    }
}

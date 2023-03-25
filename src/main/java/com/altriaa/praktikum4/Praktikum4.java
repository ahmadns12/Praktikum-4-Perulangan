/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.altriaa.praktikum4;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author User
 */
public class Praktikum4 {

    public static void main(String[] args) {
        // Tugas No 1 (Do While)
        
        Scanner sc = new Scanner(System. in);
        Random rand = new Random();
        int upperbound = 10;
        int x,y,yy,r;
        y = rand.nextInt(upperbound);
        System.out.println("The number is y = " + y);
        yy = y;
        r = 0;
        System.out.println("Input multiple number: ");
        do {
            x=sc.nextInt();
            if(x%y == 0){
                r++;
            }
        }while(x%y==0);
        System.out.println("Amount of right answer: " + r);
    }
}

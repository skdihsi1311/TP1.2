/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;



import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX7 TP1.2
public class Mavenproject2 {

    public static void main(String[] args) {
                System.out.println("Entrer l'age puis le sexe ");
                Scanner in=new Scanner(System.in);
                int age=in.nextInt();
                in.nextLine();
                String sexe=in.nextLine();
                    switch(sexe){
                        case "Homme":
                            if(age>20)
                                System.out.println("vous êtes imposable");
                            else
                                System.out.println("vous n'êtes pas imposable");
                            break;
                        case "Femme":
                            if(age>18 && age<35)
                                System.out.println("vous êtes imposable");
                            else
                                System.out.println("vous n'êtes pas imposable");
                            break;                    
                    }
            
        }       
}

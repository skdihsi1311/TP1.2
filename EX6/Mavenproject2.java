/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;



import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX6 TP1.2
public class Mavenproject2 {

    public static void main(String[] args) {
                
                System.out.println("Entrer le poids en Kg,puis la taille en metre,le sexe(Femme ou Homme)");
                Scanner in=new Scanner(System.in);                
                float poids=in.nextFloat();
                float taille=in.nextFloat();
                in.nextLine();
                String sexe=in.nextLine();
                double IMC=poids/pow(taille,2);
                    switch(sexe){
                        case "Homme":
                            if(IMC<20)
                                System.out.println("Maigreur");
                            else if(20<IMC && IMC<25)
                                System.out.println("Poids normal");
                            else if(25<IMC && IMC<30)
                                System.out.println("Surcharge pondérale");
                            else if(30<IMC && IMC<40)
                                System.out.println("Adiposité");
                            else 
                                System.out.println("Obésité");
                            break;
                        case "Femme":
                            if(IMC<19)
                                System.out.println("Maigreur");
                            else if(19<IMC && IMC<24)
                                System.out.println("Poids normal");
                            else if(24<IMC && IMC<30)
                                System.out.println("Surcharge pondérale");
                            else if(30<IMC && IMC<40)
                                System.out.println("Adiposité");
                            else 
                                System.out.println("Obésité");   
                            break;
                            
                    }
        }       
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;




import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX3 TP1.2
public class Mavenproject2 {

    public static void main(String[] args) {
                
                System.out.println("Entrer un entier pour determiner s'il est parfait");
                Scanner hh=new Scanner(System.in);
                int n=hh.nextInt();
                int somme=0;
                    for(int i=1;i<n;i++){
                        if(n%i==0)
                            somme+=i;
                    }
                    if(n==somme)
                        System.out.println("Le nombre est parfait");
                    else
                        System.out.println("Le nombre n'est pas parfait");
                            
                    }
        }       


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;




import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX1 TP1.2
public class Mavenproject2 {

    public static void main(String[] args) {
                
                System.out.println("Entrer un entier : ");
                Scanner in=new Scanner(System.in);
                int n=in.nextInt(); 
                int nbrediv=0,sommediv=0;               
                    for(int i=1;i<=n;i++){
                        if(n%i==0){
                            System.out.println("Le nombre : "+i+" divise "+n);
                            nbrediv++;
                            sommediv+=i;
                        }                        
                    }
                System.out.println("Le nombre de ces diviseurs est : "+nbrediv+
                        "\nLa somme de ces diviseurs est : "+sommediv);
                            
                    }
        }       


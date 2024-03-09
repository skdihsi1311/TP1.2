/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;




import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX4 TP1.2
public class Mavenproject2 {

    public static void main(String[] args) {
                
                System.out.println("Entrer deux entiers pour determiner s'ils sont qualifiés d’amis");
                Scanner in=new Scanner(System.in);
                int n=in.nextInt();
                int m=in.nextInt();
                int sommeN=0,sommeM=0;
                        for(int i=2;i<n;i++){
                            if(n%i==0)
                                sommeN+=i;
                        }
                        for(int i=2;i<m;i++){
                            if(m%i==0)
                                sommeM+=i;
                    }
                        if(sommeM==n && sommeN==m)
                            System.out.println("Les deux entiers sont qualifiés d’amis");
                        else
                            System.out.println("Les deux entiers ne sont pas qualifiés d’amis");
                            
                    }
        }       


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

//EX5 TP1.2
public class Mavenproject2 {

    public static void main(String[] args) {
                
                int[] buts=new int[22];
                Scanner in=new Scanner(System.in);                
                    //nombre de buts pour chaque joueur
                    for(int i=0;i<buts.length;i++){
                        System.out.println("Entrer le nombre de buts inscrits par le joueur num "+(i+1));
                        buts[i]=in.nextInt();                        
                    }
                    //le buteur
                    int nbrebuts=0,buteur=0;
                    int total=0;
                    int nobuts=0;
                    for(int i=0;i<buts.length;i++){
                        if(buts[i]>nbrebuts)
                            nbrebuts=buts[i];
                        total+=buts[i];
                        if(buts[i]==0)
                            nobuts++;
                    }
                    for(int i=0;i<buts.length;i++){
                        if(buts[i]==nbrebuts){
                            buteur=i;
                            break;
                        }
                    }
                    //affichege du buteur
                    System.out.println("le buteur de l'equipe est le numero: "+buteur);
                    //nbre total des buts inscrits par cette equipe
                    System.out.println("nombre total des buts inscrits par cette equipe : "+total);
                    //nbre des joueurs qui n’ont pas marqué de buts
                    System.out.println("nombre des joueurs qui n’ont pas marqué de buts : "+nobuts);
                    //Le joueur n° 9 vient d’inscrire 2 buts
                    buts[8]=buts[8]+2;
                            
                    }
        }       


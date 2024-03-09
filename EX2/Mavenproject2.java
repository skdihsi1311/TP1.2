/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;




import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX2 TP1.2
public class Mavenproject2 {

    public static void main(String[] args) {
                
               System.out.println("Entrer l'heure précise,puis les minutes "); 
               Scanner in=new Scanner(System.in);
               int heure=in.nextInt();
               int minute=in.nextInt();
               System.out.println(heure+"heure(s)"+(minute+1));
                            
                    }
        }       


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equation_du_premier_degre;

import java.util.Scanner;

/**
 *
 * @author CHRISTIAN KILONGO
 */
public class Equation_du_premier_degre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println ("calcul de l'equation du premier degre ") ;
         Scanner sc = new Scanner(System.in);
        
         int a;
         int b;
         double x;
         System.out.println ("Entrez la valeur de a ") ;
        a = sc.nextInt();
        System.out.println ("Entre la valeur de b ") ;
        b = sc.nextInt();
        if (a==0)
        {
           if (b==0)
               
           {
            System.out.println ("tout nombre x est  solution ") ;
           }
           else
           {
            System.out.println ("aucun nombre x n ’ est solution");
           }
        
        }
        else
        {
        x=  -b*1./a; 
         System.out.println ("la solution x a pour  valeur approchée  : "+x);
        }
        
        
    }
    
}

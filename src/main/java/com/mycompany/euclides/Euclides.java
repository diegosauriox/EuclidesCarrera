/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.euclides;

/**
 *
 * @author diegosaurio
 */
public class Euclides {
    //euclides iterativo
   public static int Iterativo(int num1, int num2){
      int mcd;
      int aux;
      while (num1%num2!=0){
         aux=num1%num2;
         num1=num2;
         num2=aux;
      }
      mcd=num2;
      return mcd;
   }
    
   
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_1_intermedios;

import java.util.*;
public class EVA1_1_INTERMEDIOS {

    public static void main(String[] args) {
        Scanner C = new Scanner(System.in);
        int[] iLin = new int[15];                
        for ( int i = 0 ; i < iLin.length; i++){
            System.out.println("Ingresa el valor: ");
            iLin[i] = C.nextInt();
            for (int j = iLin.length -1 ; j>=0; j--){
                System.out.print(" ["+ iLin[j]+ "] ");
            }
        }
        System.out.println("");
    }
}
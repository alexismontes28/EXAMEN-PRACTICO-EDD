 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Scanner;

public class EVA1_2_PRINCIPIANTES {

    public static void main(String[] args) {
        //2.- Capturar valores en arreglos y comparar
        Scanner C = new Scanner(System.in);
        int[] iArreg1 = new int[10];
        int[] iArreg2 = new int[10];
        int i, j;
        for (i = 0; i < iArreg1.length ; i++) {
            System.out.println("Ingresa los valores de tu primer arreglo: ");
            int iVal = C.nextInt();
            iArreg1[i]=iVal;
        }

        for (j=0; j<iArreg2.length; j++){
            System.out.println("Ingresa los valores de tu segundo arreglo: ");
            int iVal2 = C.nextInt();
            iArreg2[j]=iVal2;
        }
 
        System.out.println("Primer arreglo:");
        for (i = 0; i< iArreg2.length; i++) {
            System.out.print("[" + iArreg1[i] + "]");
        }
        System.out.println("");

        System.out.println("Segundo arreglo: ");
        for (j = 0; j<iArreg2.length;j++){
            System.out.print("[" + iArreg2[j] + "]");
        }

        System.out.println("");
        
        if (Arrays.equals(iArreg1,iArreg2)){
            System.out.println("Los arreglos son idénticos");
        }else{
            System.out.println("No son iguales");
        }
    }
}

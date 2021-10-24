/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_1_principiantes;

/**
 *
 * @author cristian
 */
public class EVA1_1_PRINCIPIANTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        int[] iArray = new int[15];
         for (int i = 0; i < iArray.length; i++) {
              iArray[i] = (int)(Math.random() * 50); 
             int mult = iArray[i]*2; 
              if( mult%2 == 0) 
                 
               System.out.print("[" + mult + "]");
        }
    }
    
}

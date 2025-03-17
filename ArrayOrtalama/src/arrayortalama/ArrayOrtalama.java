/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayortalama;

/**
 *
 * @author Kevser
 */
public class ArrayOrtalama {

    /**
     * @param args the command line arguments
     */
    public static double ortalamabulma(int [] array){
        int toplam=0;
          for (int i = 0; i < array.length ; i++) {
              toplam+=array[i];
            
        }
          return ((double)toplam / array.length);
    }
    public static void main(String[] args) {
     
        // TODO code application logic here
        
        int b[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("ortalama:"+ortalamabulma(b));
    }
    
}

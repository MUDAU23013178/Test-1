/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author DR Eminem
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static int findProductIndex (){
 Scanner obj = new Scanner(System.in) ;
 System.out.print("Input product Id: ");
int productId = obj.nextInt();
int[] productIDs = {104,105,106,107,101,102,103};
    return Arrays.binarySearch(productIDs, productId); 
    }
    
}

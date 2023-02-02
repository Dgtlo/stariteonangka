
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public class Quizwile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,z;
    Scanner input = new Scanner(System.in);
         System.out.print("Masukkan Tinggi angka = ");
        x=input.nextInt();
        for(int i = 1;i<=x;i++)
        {
            z=i;
            System.out.print(i+" ");
            for(int j=1;j<i;j++ )
            {
                z=z+(x-j);
                System.out.print(z+" ");
            }
            System.out.println("");
        }
    }
    }
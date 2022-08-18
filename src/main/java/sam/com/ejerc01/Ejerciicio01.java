/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package sam.com.ejerc01;

/**
 *
 * @author shsolano
 */
import java.util.Scanner;
import java.io.*;

public class Ejerciicio01 {
    
    public static void main(String[] args) {
        //Clase_uno dt = new Clase_uno();
        //dt.uno();
         clase_3Matriz cm = new clase_3Matriz();
         cm.matriz();
        
    }
    public static class  clase_3Matriz{
        public void matriz(){
            double[][] mat = new double[2][2];
            Scanner SC = new Scanner(System.in);
            System.out.println("Elija la Valor: ");        
            double val =SC.nextDouble();
            mat[1][1] = val;
            System.out.println("Matriz: "+ mat[1][1]);
            
            
        }
        public void matrizIdentidad(){
            
        }

    }
    public void uno_interna(){
    Scanner SC = new Scanner(System.in);
    int op;
        System.out.println("Merecado Libre");
        System.out.println("--------------");
        System.out.println("1. Ssumar");
        System.out.println("2. Restar");
        System.out.println("3. Dividir");        
        System.out.println("Elija la opción 1 2 ó 3 ");        
        
        op = SC.nextInt()
    switch (op) {
        case 1:
            System.out.println(" Signo ++ ");            
            break;
        case 2:
            System.out.println(" Signo -- ");                        
            break;
        case 3:
            System.out.println(" Signo  */* ");                                    
            break;
        default:
        System.out.print("Opción no valida.... ");                                    
            break;
    }
    int [] nn={1,2,3};
    nn[1]=2;
    

//    String linea  = SC.nextLine();        
        


/*
    char a= 'a';
    char b = 'b';
    
    System.out.println(a);                                
    System.out.println(b);                                
    System.out.println(a+b);                                    
    System.out.println(a+" "+b);                
*/
        
  /*
    System.out.print("Hello word\n");
    System.out.println("Hello word");
    System.out.println("Caracteres ASCCI b ç ï  ☺ æ ├");        
    char let;
        for (let = 'a' ; let  <='z'; let++) {
            System.out.println("El número  ASCCI de : "+(int)let +" y su letra es: "+ let);                        
        }
    System.out.print("\n");

        for (let = 'z' ; let >='a'; let--) {
            System.out.println(" El número  ASCCI de : "+(int)let +" y su letra es: "+ let);                        
        }

*/

/*
    System.out.println("    Articulo    precio/Caja     Nro Cajas");                        
    System.out.println("--------------!--------------!-------------- ");                        
    System.out.printf("%-10S     %8.2f   %6d\n","Manzana",4.987,58);                        

*/

/**
    String name ;
    name = "Samir";
    System.out.print("Digite su nombre: \n");                        
    //name = System.console().readLine();
    System.out.println("Hola "+ name +" Como esta");

    Scanner SC = new Scanner(System.in);
    System.out.print("Digite su nombre: \n");                        
    String nombre  = SC.nextLine();
    
    System.out.print("Ingrese la Edad: \n");                        
    int edad = Integer.parseInt(SC.nextLine());
    System.out.println("nombre  "+ nombre +" edad "+ edad );
    
*/

    }

    public static class Clase_uno{
        public void uno(){
        Scanner SC = new Scanner(System.in);
        int op;
            System.out.println("Merecado Libre");
            System.out.println("--------------");
            System.out.println("1. Ssumar");
            System.out.println("2. Restar");
            System.out.println("3. Dividir");        
            System.out.println("Elija la opción 1 2 ó 3 ");        

            op = SC.nextInt()
        switch (op) {
            case 1:
                System.out.println(" Signo ++ ");            
                break;
            case 2:
                System.out.println(" Signo -- ");                        
                break;
            case 3:
                System.out.println(" Signo  */* ");                                    
                break;
            default:
            System.out.print("Opción no valida.... ");                                    
                break;
        }
        int [] nn={1,2,3};
        nn[1]=2;


    //    String linea  = SC.nextLine();        



    /*
        char a= 'a';
        char b = 'b';

        System.out.println(a);                                
        System.out.println(b);                                
        System.out.println(a+b);                                    
        System.out.println(a+" "+b);                
    */

      /*
        System.out.print("Hello word\n");
        System.out.println("Hello word");
        System.out.println("Caracteres ASCCI b ç ï  ☺ æ ├");        
        char let;
            for (let = 'a' ; let  <='z'; let++) {
                System.out.println("El número  ASCCI de : "+(int)let +" y su letra es: "+ let);                        
            }
        System.out.print("\n");

            for (let = 'z' ; let >='a'; let--) {
                System.out.println(" El número  ASCCI de : "+(int)let +" y su letra es: "+ let);                        
            }

    */

    /*
        System.out.println("    Articulo    precio/Caja     Nro Cajas");                        
        System.out.println("--------------!--------------!-------------- ");                        
        System.out.printf("%-10S     %8.2f   %6d\n","Manzana",4.987,58);                        

    */

    /**
        String name ;
        name = "Samir";
        System.out.print("Digite su nombre: \n");                        
        //name = System.console().readLine();
        System.out.println("Hola "+ name +" Como esta");

        Scanner SC = new Scanner(System.in);
        System.out.print("Digite su nombre: \n");                        
        String nombre  = SC.nextLine();

        System.out.print("Ingrese la Edad: \n");                        
        int edad = Integer.parseInt(SC.nextLine());
        System.out.println("nombre  "+ nombre +" edad "+ edad );

    */

        }
        
    }
    
}
    

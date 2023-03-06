/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_arreglos_multi;

import java.util.Scanner;

/**
 *
 * @author Marisol G
 */
public class EVA1_12_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int arregloMutli [][] = new int [3][];
        // grupo 1: 40 alumnos 
       arregloMutli[0]= new int [40];
       // grupo 2: 10 alumnos 
       arregloMutli[1] = new int  [10];
       // grupo 3: 25 alumnos 
       arregloMutli[2]= new int [25];*/
        // Capturar la cantidad de grupos 
        // Por cada grupo, capturar calificaiones
        int arreGpos [][];
        Scanner input = new Scanner (System.in);
        // solicitar la cantidad de grupos
        System.out.println("Introduce la cantidad de grupos");
        int grupos = input.nextInt();
        arreGpos = new int [grupos][]; // declarando un arreglo de arreglos 
        // llenarlos datos
        for (int i = 0; i< arreGpos.length; i++) {
            System.out.println(" Grupo " + i );
            System.out.println(" ¿Cuantos estudiantes tiene? ");
            int estu = input.nextInt();
            arreGpos [i] = new int [estu];
            for (int j = 0; j < arreGpos[i].length; j++) {
                System.out.println(" Estudiante " + j );
                System.out.println(" Calificacion: ");
                int califa = input.nextInt();
                arreGpos[i][j] = califa;
                
            }
        }
         for (int i = 0; i < arreGpos.length; i++) {//filas
            for (int j = 0; j < arreGpos[i].length; j++) { // segudno ciclo_segunda dimension columnas 
                System.out.print("[" + arreGpos[i][j] + "]"); 
            } 
            System.out.println();
        }
        
    }
    
    
}

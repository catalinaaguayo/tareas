/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa02;

import java.util.Scanner;
import java.util.Random;
        
public class Programa02 
{

    public static void main(String[] args) 
    {
    Scanner leer=new Scanner(System.in);
    Random azar=new Random();
    int[][] M=new int[3][3];
    int i,j,resultado;
    
    //i=posición de las filas
    //j=posición de las columnas
    
    //genera matriz M
    i=0;
        while (i<3) 
        {            
            j=0;
            while (j<3) 
            {                
                M[i][j]=(azar.nextInt(8)+1);
                //falta comprobar que no se repitan dentro del cuadrado
                j=j+1;
            }
        i=i+1;
        }
   
    resultado=verifica_cuadrado(M);
    if (resultado==1) 
    {
        System.out.println("El cuadrado generado es mágico");
    }
    else
    {
        System.out.println("El cuadrado generado NO es mágico");
    }    
    }
   
    
    public static int verifica_cuadrado(int M[][])
    {
    int i,j,totalfila,totalcolumna,totaldiagonal1,totaldiagonal2,cuadrado=2;
    
    //verifica que filas sumen 15
    i=0;
    while (i<3)
    {
        j=0;
        totalfila=0;
        while (j<3) 
        {            
            totalfila=totalfila+M[i][j];
            j=j+1;     
        }
        if (totalfila==15)
        {
            i=i+1;
            cuadrado=1;
        }
        else
        {
            cuadrado=0;
        }
    }
    
    //verifica que columnas sumen 15
    j=0;
    while (j<3)
    {
        i=0;
        totalcolumna=0;
        while (i<3) 
        {            
            totalcolumna=totalcolumna+M[i][j];
            i=i+1;     
        }
        if (totalcolumna==15)
        {
            j=j+1;
            cuadrado=1;
        }
        else
        {
            System.out.println("La matriz generada no corresponde a un cuadrado mágico");
            cuadrado=0;
        }
    }
    
    //verifica que diagonales sumen 15
    totaldiagonal1=M[0][0]+M[1][1]+M[2][2];
        if (totaldiagonal1==15) 
        {
            totaldiagonal2=M[0][2]+M[1][1]+M[2][0];
            if (totaldiagonal2==15) 
            {
                cuadrado=1;
            }
            else
            {
                System.out.println("La matriz generada no corresponde a un cuadrado mágico");
                cuadrado=0;
            }
        }
    
    //retorna un 0 si no es un cuadrado mágico y 1 si lo es
    return cuadrado;
    }
}


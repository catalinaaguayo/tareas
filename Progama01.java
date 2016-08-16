/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progama01;
import java.util.Scanner;
public class Progama01 {

    static int i,N=0,total_aprueban=0,total_desaprueban=0,aprobacion,porcentaje_ap;
    static char[][] respuestas=new char[N][2];
    static int genero_entrevistado,ultimo_entrevistado,total_entrevistados,genero;
    static char opinion_entrevistado;
    static Scanner leer=new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        //conocer género del entrevistado
        while(N>=0)
        {
            
        //validación del género del entrevistado
        genero_entrevistado=3;
        while (genero_entrevistado==3)
        {
            System.out.println("¿Cuál es el género del entrevistado? ingrese '1' para masculino y '2' para femenino");
            genero_entrevistado=leer.nextInt();
            if (genero_entrevistado!=1 && genero_entrevistado!=2)
            {
                System.out.println("Error, ingrese género nuevamente");
            }
        }
        
        //guardar en la matriz el género del entevistado
        respuestas[N][1]=genero_entrevistado;
        //llamar a la función para almacenar a los hombres que aprueban la gestión
        hombres_aprueban(genero_entrevistado);
        //llamar a la función para almacenar a las mujeres que desaprueban la gestión
        mujeres_desaprueban(genero_entrevistado);
        
        System.out.println("¿Fue éste el último entrevistado? ingrese '1' para si y '2' para no");
        ultimo_entrevistado=leer.nextInt();
            if (ultimo_entrevistado==2) 
            {
                N=N+1;  
            }
            else
            {
            total_entrevistados=N;
            }
        
        System.out.println("La cantidad de hombres que aprueba la gestión del gobierno es "+total_aprueban);
        System.out.println("La cantidad de mujeres de desarpueban la gestión del gobierno es "+total_desaprueban);
        System.out.println("El porcentaje total de encuestados que aprueba la gestión del gobierno es de "+porcentaje_ap);
        System.out.println("En total participaron "+N+" personas en la encuesta");
        }
    }
  
    public static int hombres_aprueban(int genero_entrevistado)
    {
    //función que cuenta los hombres que aprueban al gobierno

    if (genero_entrevistado==1)
    {
        System.out.println("¿Cuál es la opinión del entrevistado? Ingrese 's' si aprueba, 'n' si desaprueba o 'x' si no sabe o no responde");
        opinion_entrevistado=leer.nextChar();
        
        //se almacena la respuesta en la matriz
        respuestas[N][2]=opinion_entrevistado;
        
        //se almacenan los hombres que aprueban el gobierno
        if (opinion_entrevistado=="s")
        {
            total_aprueban=total_aprueban+1;
        }
    }
    
    //retorna el total de los hombres que aprueban el gobierno
    return total_aprueban;
   }
    
   public static int mujeres_desaprueban(int genero_entrevistado)
   {
   //función que cuenta las mujeres que desaprueban al gobierno

    if (genero_entrevistado==1)
    {
        System.out.println("¿Cuál es la opinión del entrevistado? Ingrese 's' si aprueba, 'n' si desaprueba o 'x' si no sabe o no responde");
        opinion_entrevistado=leer.nextChar();
        
        //se almacena la respuesta en la matriz
        respuestas[N][2]=opinion_entrevistado;
        
        //se almacenan las mujeres que desaprueban el gobierno
        if (opinion_entrevistado=="n")
        {
            total_desaprueban=total_desaprueban+1;
        }
    }
    
    //retorna el total de mujeres que desaprueban el gobierno
    return total_desaprueban;
   }
   
   public static int porcentaje_aprobación(int respuestas)
   {
   //función que cuenta las personas que aprueban el gobierno y calcula el porcentaje respecto al total
       
   //se recorre la matriz para contar cuantas personas aprueban la gestión
   N=0;
       while (N<=0 && N<total_entrevistados)
       {
            if (respuestas[N][2]=="s")
            {
                aprobacion=aprobacion+respuestas[N][2];
                N=N+1;
            }
       }
       
   //se saca el porcentaje respecto al total de entrevistados
   porcentaje_ap=((100*aprobacion)/total_entrevistados);
   
   //retorna el porcentaje de aprobación del gobierno
   return porcentaje_ap;
   }
}
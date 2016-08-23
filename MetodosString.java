/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosstring;

import java.util.Scanner;

public class MetodosString 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    String cadena;
    
    //le asigna a cadena el valor que retorna la función leerString
        cadena=leerString();
    //imprime los resultados de cada método
        imprimirResultados(cadena);    
    }
    
    public static String leerString()
    {
    //lee lo que ingresa el usuario
        System.out.println("Ingrese palabra");
        String palabra=new String();
    
    return palabra.toLowerCase();
    }
    
    public static int largoCadena(String cadena)
    {
    //retorna un valor más ya que comienza del 0
        return cadena.length()+1;
    }
    
    public static int contarVocales(String cadena)
    {
        int contador_vocales=0;
        
        for(int i=0; i<cadena.length(); i++)
        {
            if(cadena.charAt(i)=='a' || cadena.charAt(i)=='e' || cadena.charAt(i)=='i' || cadena.charAt(i)=='o' || cadena.charAt(i)=='u')
            contador_vocales=contador_vocales+1;
        }
    //retorna un valor más ya que comienza del 0
    return contador_vocales+1;
    }
    
    public static int contarConsonantes(String cadena)
    {
    int contador_consonantes=0;
        
        for(int i=0; i<cadena.length(); i++)
        {
            if(cadena.charAt(i)!='a' || cadena.charAt(i)!='e' || cadena.charAt(i)!='i' || cadena.charAt(i)!='o' || cadena.charAt(i)!='u')
            contador_consonantes=contador_consonantes+1;
        }
    //retorna un valor más ya que comienza del 0
    return contador_consonantes;
    }
    
    public static String invertirString(String cadena)
    {
    //invierte la cadena
        String cadena_invertida="";
        for (int i=cadena.length();i>=0;i--)
        {
            cadena_invertida=cadena_invertida+cadena.charAt(i);
        }
    return cadena_invertida;
    }
    
    public static char ingresarChar()
    {
    //pide ingresar el caracter a consultar
    Scanner leer=new Scanner(System.in);
    char ch;
        System.out.println("Ingrese caracter a consultar en la cadena");
        ch=leer.nextLine().charAt(0);
    return ch;
    }
    
    public static boolean existeChar(String cadena,char ch)
    {
    //busca si existe el caracter consultado en la cadena
        String caracter=String.valueOf(ch);
            if (cadena.indexOf(caracter)!=-1)
            {            
                return true;
            }
            else
            {
                return false;
            }
    }
    
   public static String ingresarSubString()
   {
   //pide ingresar la sub cadena a consultar
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese sub cadena a consultar en la cadena");
        String sub_cadena=new String();
    return sub_cadena;
    }
    
    public static boolean existeSubString(String cadena,String sub_cadena)
    {
    //busca si existe la sub cadena consultada en la subcadena
        if (cadena.indexOf(sub_cadena)!=-1) 
            return true; 
        else 
            return false;
    }
    
    public static char [] crearArrayChar(String cadena)
    {
    //crea un arreglo con cada uno de los caracteres de la cadena
    char A[]=new char[cadena.length()+1];
    int i=0;
        while (i>=0 && i<cadena.length()+1) 
        {            
            A[i]=cadena.charAt(i);
            i=i+1;
        }
    return A;
    }
    
    public static void imprimirResultados(String cadena)
    {
    //muestra todos los retornos de los métodos
    char ch;
    String sub_cadena;

        System.out.println("El largo de la cadena es "+largoCadena(cadena));
        System.out.println("El número de vocales en la cadena es "+contarVocales(cadena));
        System.out.println("El número de consonantes en la cadena es "+contarConsonantes(cadena));
        System.out.println("La cadena invertida es "+invertirString(cadena));
        ch=ingresarChar();
        System.out.println("Es "+existeChar(cadena,ch)+" que "+ch+" está en "+cadena);
        sub_cadena=ingresarSubString();
        System.out.println("Es "+existeSubString(cadena,sub_cadena)+" que "+sub_cadena+" está en "+cadena);
        System.out.println("El arreglo en base a los caractéres entregados es "+crearArrayChar(cadena));

    }
}

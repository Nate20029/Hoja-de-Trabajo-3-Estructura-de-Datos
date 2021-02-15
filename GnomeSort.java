//--------------------------------------------------------------
//Hoja de Trabajo #3
//Creada por Natanael Girón 20029 y Jessica Ortíz 20192
//Algoritmos y Estructura de Datos
//Ultima modificación: 14/02/2021
//-----------------------------------------------------------------

import java.util.Arrays;

public class GnomeSort {
     public  void gnome(int array[], int n) 
    { 
        int contador = 0; 
  
        while (contador < n) { 
            if (contador == 0) 
                contador++; 
            if (array[contador] >= array[contador - 1]) 
                contador++; 
            else { 
                int temp = 0; 
                temp = array[contador]; 
                array[contador] = array[contador - 1]; 
                array[contador - 1] = temp; 
                contador--; 
               } 
        } 
        return; 
    }
}
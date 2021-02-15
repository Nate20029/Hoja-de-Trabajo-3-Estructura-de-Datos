//--------------------------------------------------------------
//Hoja de Trabajo #3
//Creada por Natanael Girón 20029 y Jessica Ortíz 20192
//Algoritmos y Estructura de Datos
//Ultima modificación: 14/02/2021
//-----------------------------------------------------------------

import java.util.Arrays;

public class SelectSort{

     public int [] seles(int [] array){

          int tam = array.length;
          
          for (int i =0; i< tam-1; i++){

               //Encontrar el minimo elemento
               int minimo = i;
               for (int j= i+1; j < tam; j++){
                    if (array[j] < array[minimo]){
                         minimo = j;
                    }
               }

               int temp = array[minimo];
               array[minimo] = array[i];
               array[i] = temp;
          }
          return array;
     }
}

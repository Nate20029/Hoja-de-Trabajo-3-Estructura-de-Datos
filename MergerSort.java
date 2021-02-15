//--------------------------------------------------------------
//Hoja de Trabajo #3
//Creada por Natanael Girón 20029 y Jessica Ortíz 20192
//Algoritmos y Estructura de Datos
//Ultima modificación: 14/02/2021
//-----------------------------------------------------------------


import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
     
     //Devolverá enteros
     public int [] merges(int[] array) {

          //Si el array es menor o igual a uno
          if (array.length <= 1){
               return array;
          }

          //Definimos los lados, derecho e izquierdo y un punto medio
          int puntomedio = array.length /2;
          int [] izquierda = new int [puntomedio];
          int [] derecha;

          //Definimos cuantos valores irán en cada lado
          if (array.length % 2 == 0){
               derecha = new int [puntomedio];
          }else {
               derecha = new int [puntomedio + 1];
          }

          //Llenamos los lados izquierdo y derecho
          for(int i=0; i< puntomedio; i++){

               izquierda[i] = array [i];          
          } 
          //Nos aseguramos que se inicialicen los valores correctos
          for (int j=0; j < derecha.length; j++){

               derecha [j] = array[puntomedio +j];
     
          }  

          //Creamos un lugar para guardar nuestros valores
          int [] resultado = new int [array.length]; 
          
          //Definimos las combinaciones
          izquierda = merges(izquierda);
          derecha = merges(derecha);
          //Definimos nuestro resultado
          resultado = merge(izquierda,derecha);
          //Retornamos el resultado
          return resultado;
     }

     //Método que unirá los resultados obtenidos anteriormente
     private static int [] merge(int [] izquierda, int [] derecha){
          //Definimos en donde guardaremos nuestro resultado
        int [] resultado = new int [izquierda.length + derecha.length];  
        
        int ladoizquierdo, ladoderecho, resultPointer;
        ladoizquierdo = ladoderecho = resultPointer = 0;

        while(ladoizquierdo < izquierda.length || ladoderecho < derecha.length) {

          if (ladoizquierdo < izquierda.length && ladoderecho < derecha.length) {

               if (izquierda[ladoizquierdo] < derecha[ladoderecho]){

                    resultado[resultPointer++] = izquierda[ladoizquierdo++];
               }else {
                    resultado[resultPointer++] = derecha[ladoderecho++];
               }
          }
          else if (ladoizquierdo < izquierda.length){

               resultado[resultPointer++] = izquierda[ladoizquierdo++];
          }
          else if (ladoderecho < derecha.length){

               resultado[resultPointer++] = derecha[ladoderecho++];
          }
        }
        return resultado;
     }

}
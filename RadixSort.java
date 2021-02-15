//--------------------------------------------------------------
//Hoja de Trabajo #3
//Creada por Natanael Girón 20029 y Jessica Ortíz 20192
//Algoritmos y Estructura de Datos
//Ultima modificación: 14/02/2021
//-----------------------------------------------------------------

import java.io.*;
import java.util.*;

public class RadixSort {
    /*
    el radix lo que hace es pilas, las amontona en un lugar,las unidades, decenas, centenas, etc
     */
    // obtener el valor maximo
    static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    //hace un counting sort dependiendo del digito exp
    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // almacenar el recuento de count
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // creando el arreglo final
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        //copiando el arreglo ordenado al anterior
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    public void radixsort(int arr[], int n)
    {
        //encontranto el maximo para saber la cantidad de digitos
        int m = getMax(arr, n);
        
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

}

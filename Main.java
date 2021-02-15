//--------------------------------------------------------------
//Hoja de Trabajo #3
//Creada por Natanael Girón 20029 y Jessica Ortíz 20192
//Algoritmos y Estructura de Datos
//Ultima modificación: 14/02/2021
//-----------------------------------------------------------------



import java.util.Arrays;

//--------------------------------------------------------------
//Hoja de Trabajo #3
//Creada por Natanael Girón 20029 y Jessica Ortíz 20192
//Algoritmos y Estructura de Datos
//Ultima modificación: 13/02/2021
//-----------------------------------------------------------------

public class Main {
    public static void main(String[] args) {
        Nrandoms n = new Nrandoms();
        n.Escribir("numeros.txt");
        QuickSort q = new QuickSort();
        RadixSort r = new RadixSort();
        GnomeSort g = new GnomeSort();
        MergeSort m = new MergeSort();
        SelectSort s = new SelectSort();

        int[] array = new int[n.Lectura().length];
        for(int i = 0; i < n.Lectura().length;i++)
        {
            array[i] = n.Lectura()[i];
        }
        System.out.println("Numeros normales:");
        System.out.println(Arrays.toString(array));

        System.out.println("Numeros con QuickSort: ");
        q.quick(array);

        for (int j : array) {
            System.out.println(j);
         }

        System.out.println("Numeros con RadixSort: ");
        r.radixsort(array,array.length);

        for (int j : array) {
            System.out.println(j);
        }

        System.out.println("Numeros con GnomeSort: ");
        gnomeSort.gnome(array, array.length); 
        System.out.println(Arrays.toString(array)); 


        System.out.println("Numeros con SelectSort: ");
        array = selectsort.seles(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Numeros con MergeSort: ");
        array = mergesort.merges(array);
        System.out.println(Arrays.toString(array)); 
    }
}



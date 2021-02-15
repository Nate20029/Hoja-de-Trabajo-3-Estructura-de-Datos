import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {

    @Test
    void getMax() {

    }

    @Test
    void countSort() {
    }

    @Test
    void radixsort() {
        int[] arreglo = new int[3000];

        int mx = arreglo[0];
        for (int i = 1; i < arreglo.length; i++)
            if (arreglo[i] > mx)
                mx = arreglo[i];

        int exp = 1;
        for (exp = 1; mx / exp > 0; exp *= 10)

        for(int i = 0; i<3000;i++)
        {
            int valorentero = (int) Math.floor(Math.random()*50);
            arreglo[i] = valorentero;
        }

        for (int i = 1; i < arreglo.length; i++)
            if (arreglo[i] > mx)
                mx = arreglo[i];

        int output[] = new int[arreglo.length]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // almacenar el recuento de count
        for (i = 0; i < arreglo.length; i++)
            count[(arreglo[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // creando el arreglo final
        for (i = arreglo.length - 1; i >= 0; i--) {
            output[count[(arreglo[i] / exp) % 10] - 1] = arreglo[i];
            count[(arreglo[i] / exp) % 10]--;
        }

        //copiando el arreglo ordenado al anterior
        for (i = 0; i < arreglo.length; i++)
            arreglo[i] = output[i];
    }
}
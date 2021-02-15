import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void quick() {
        int[] arreglo = new int[3000];
    }

    @Test
    void quick1(int[] arreglo) {

    }

    @Test
    void quick2() {
        int[] arreglo = new int[3000];

        for(int i = 0; i<3000;i++)
        {
            int valorentero = (int) Math.floor(Math.random()*50);
            arreglo[i] = valorentero;
        }

        int iz = 0;
        int de = arreglo.length-1;
        if(iz >= de)
        {
            arreglo = arreglo;
        }
        int i = iz, d= de;
        if(iz != de)
        {
            int pivote;
            int aux;
            pivote = iz;
            while(iz!=de)
            {
                while (arreglo[de] >= arreglo[pivote] && iz < de)
                    de--;
                while (arreglo[iz]<arreglo[pivote] && iz<de)
                    iz++;


                if(de != iz)
                {
                    aux = arreglo[de];
                    arreglo[de] = arreglo[iz];
                    arreglo[iz] = aux;
                }
            }

        }
        else
        {

        }

    }
}
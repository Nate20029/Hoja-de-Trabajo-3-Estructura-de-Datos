import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SelectSortTest {

    @Test
    public void testSeles() {
        int[] array = new int[3000];

        for(int i = 0; i<3000;i++)
        {
            int valorentero = (int) Math.floor(Math.random()*50);
            array[i] = valorentero;
        }

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
    }
}
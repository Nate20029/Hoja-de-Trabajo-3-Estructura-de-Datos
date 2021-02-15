import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GnomeSortTest {

    @Test
    public void testGnome() {

        int[] array = new int[3000];
        int n = 3000;
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
    }
}
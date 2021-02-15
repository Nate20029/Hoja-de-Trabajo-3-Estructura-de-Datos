import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MergeSortTest {

    @Test
    public void testMerges() {

        int[] array = new int[3000];


        if (array.length <= 1){

        }


        int puntomedio = array.length /2;
        int [] izquierda = new int [puntomedio];
        int [] derecha;


        if (array.length % 2 == 0){
            derecha = new int [puntomedio];
        }else {
            derecha = new int [puntomedio + 1];
        }


        for(int i=0; i< puntomedio; i++){

            izquierda[i] = array [i];
        }

        for (int j=0; j < derecha.length; j++){

            derecha [j] = array[puntomedio +j];

        }


        int [] resultado = new int [array.length];



    }

}
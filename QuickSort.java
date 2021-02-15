//--------------------------------------------------------------
//Hoja de Trabajo #3
//Creada por Natanael Girón 20029 y Jessica Ortíz 20192
//Algoritmos y Estructura de Datos
//Ultima modificación: 14/02/2021
//-----------------------------------------------------------------
public class QuickSort {

    public void quick(int[] arreglo)
    {
        arreglo = quick1(arreglo);

    }
    public int[] quick1(int[] L)
    {
        return quick2(L,0,L.length-1);
    }
    public int[] quick2(int[] L, int iz,int de)
    {
        if(iz >= de)
        {
            return L;
        }
        int i = iz, d= de;
        if(iz != de)
        {
            int pivote;
            int aux;
            pivote = iz;
            while(iz!=de)
            {
                while (L[de] >= L[pivote] && iz < de)
                    de--;
                    while (L[iz]<L[pivote] && iz<de)
                        iz++;


                if(de != iz)
                {
                    aux = L[de];
                    L[de] = L[iz];
                    L[iz] = aux;
                }
            }
            if(iz == de)
            {
                quick2(L,i,iz-1);
                quick2(L,iz+1,d);
            }
        }
        else
        {
            return L;
        }
        return L;
    }
}

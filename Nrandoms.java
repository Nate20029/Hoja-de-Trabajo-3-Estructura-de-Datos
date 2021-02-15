//--------------------------------------------------------------
//Hoja de Trabajo #3
//Creada por Natanael Girón 20029 y Jessica Ortíz 20192
//Algoritmos y Estructura de Datos
//Ultima modificación: 14/02/2021
//-----------------------------------------------------------------

import javax.swing.*;
import java.io.*;


public class Nrandoms {

        public void Escribir(String nombre)
        {
            File f;
            FileWriter w;
            BufferedWriter bw;
            PrintWriter wr;

            try
            {
                f = new File(nombre);
                w = new FileWriter(f);
                bw = new BufferedWriter(w);
                wr = new PrintWriter(bw);


                for(int i = 0; i<3000;i++)
                {
                    int valorentero = (int) Math.floor(Math.random()*50);
                    wr.write(valorentero+"");
                    wr.append("\n");
                }


                wr.close();
                bw.close();
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,"ha sucedido un error"+e);
            }
        }

    public void Escribir2(int[] array,String nombre)
    {
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;

        try
        {
            f = new File(nombre);
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);


            for(int i = 0; i<3000;i++)
            {
                wr.write(array[i]+"");
                wr.append("\n");
            }


            wr.close();
            bw.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"ha sucedido un error"+e);
        }
    }

        public int[] Lectura()
        {
            int[] arreglo = new int[3000];
            File archivo;
            FileReader fr;
            BufferedReader br;

            try
            {
                archivo = new File("numeros.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                String linea;
                int cont = 0;
                while ((linea=br.readLine()) != null){
                      arreglo[cont++]= Integer.parseInt(linea);

                }

                br.close();
                fr.close();
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,"Hubo un error al leer el archivo"+e);
            }
            return arreglo;
        }


}

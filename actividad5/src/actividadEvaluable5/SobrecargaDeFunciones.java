package actividadEvaluable5;
import java.util.Arrays;


/**
 
    @author AdrianBaileCampos
    @version 1.0
    @since 2025-01-21

 
 */






public class SobrecargaDeFunciones {


    public static void main(String[] args) {

            int [] arrayNumeros={2,4,8,6};
            System.out.println(calcular(arrayNumeros));


            double[] numerosDecimales={2.1,3.5,2.0,7.0,19.23};  
            System.out.println(calcular(numerosDecimales)); 

            String[] arrayCadenas={"Zebra","Avión","Música","Flor","Abeja"};
            System.out.println(calcular(arrayCadenas));


    }


    public static int calcular(int[] numeros){

            int suma=0;
            int cantidadNumeros=0;

            for(int fila=0; fila<numeros.length;fila++){

                    suma+=numeros[fila];

                     cantidadNumeros++;
             }

            return suma/cantidadNumeros;


    }



    public static double calcular(double[] numeros){


      
        int longitud=numeros.length;
        int[] computo= new int[longitud];
        int posicionNumeroMaximo=0;

        /* 
           Mediante un bucle "for", vamos comparando cada valor de la posicion
           (filaNumeros) con todos los valores de cada posicion(filaClon).

           Si el valor es el mismo, se sumará al array "computo" +1 en la misma posicion del
           valor principal que estamos comparando(filaNumeros).

           Dicho array debe tener el mismo numero de posiciones que el array principal.  
        */


      
        for(int filaNumeros=0; filaNumeros<numeros.length; filaNumeros++){

            for(int filaClon=0; filaClon<numeros.length;filaClon++){

                if(numeros[filaNumeros]==numeros[filaClon]){

                    computo[filaNumeros]+=1;
                }
            }
        }


        /* 
           Mediante otro bucle "for", vamos comparando los valores dentro del 
           array "computo" mediante la posicion dada por el valor de (posicionNumeroMaximo).
           
           Comenzando por 0 y cambiando su valor, si el valor de este en computo, es menos o igual a
           el valor de computo en la posicion de la fila correspondiente en el bucle.
        */




        for(int filaRespuesta=0; filaRespuesta<computo.length; filaRespuesta++){

            if(computo[posicionNumeroMaximo]<=computo[filaRespuesta]){
                
                posicionNumeroMaximo=filaRespuesta;
            }

        }
        


         /* 
           Finalizamos devolviendo el valor del array original en la posicion donde se ubica el
           mayor valor entre todos 
        */

       
        return numeros[posicionNumeroMaximo];

    }





    public static String[] calcular(String[] cadenas){

     
       Arrays.sort(cadenas);

        for(int fila=0; fila<cadenas.length;fila++){

            System.out.println(cadenas[fila]);
        }


       return cadenas;



    }
    

}







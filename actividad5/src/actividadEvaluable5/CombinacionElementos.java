package actividadEvaluable5;
import java.util.Scanner;


/**
 
    @author AdrianBaileCampos
    @version 1.0
    @since 2025-01-21

 
 */




public class CombinacionElementos {

public static void main(String[] args) {

    Scanner escaner=new Scanner(System.in);

    System.out.println("Introduce el valor para el tamaño del conjunto");
    int tamañoConjunto=escaner.nextInt();

    System.out.println("Introduce el valor para el tamaño del subconjunto");
    int tamañoSubconjunto=escaner.nextInt();

    System.out.println("El numero total de combinaciones posibles es " + 
                        numeroTotalCombinaciones(tamañoConjunto,tamañoSubconjunto));

     escaner.close();

}


    public static int numeroTotalCombinaciones(int n, int k){

        if(k==0 || k==n)return 1;

        if(k>0 && k<n){

            return numeroTotalCombinaciones(n-1, k-1)+numeroTotalCombinaciones(n-1, k);

        }else{
            
            return 0;
        }
    }


}


/*     

        +-----------------------------------------------------------------------------+
        |                     EXPLICACIÓN GIT - ENTORNOS DE DESARROLLO                |
        +-----------------------------------------------------------------------------+
        
        
          * COMMIT :

                Los cambios que se hacen en los archivos, esto es, el estado del 
                proyecto, se guardan de forma local mediante snapshots o instantaneas. 
                Por cada cambio realizado se crea un commit o instantanea.


          * PUSH : 

                Su función se basa en enviar los commits desde tu 
                repositorio o carpeta local al repositorio remoto.


          * PULL:

                Su función es la inversa que el push, esto es, se basa en 
                descargar o traer "pull" las actualizaciones, archivos nuevos,
                cambios realizados, etc. en el respositorio remoto, a tu 
                repositorio local.

                Lo hace usando dos comandos:

                1- FETCH: Descarga los archivos del servidor remoto 
                          (Repositorio Remoto).
                2- MERGE: Une los cambios con los archivos del repositorio local



       */








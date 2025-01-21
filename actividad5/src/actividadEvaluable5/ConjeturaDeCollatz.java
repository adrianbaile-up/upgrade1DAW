package actividadEvaluable5;

/**
 
    @author AdrianBaileCampos
    @version 1.0
    @since 2025-01-21

 
 */




public class ConjeturaDeCollatz {

    public static void main(String[] args) {
        
        
    System.out.println("La sucesión de 42 es:");
    sucesion(42);
        

    }


    public static int sucesion(int n){
       
     
        if(n==1)return 1;
        if(n%2==0){
             
            System.out.println(n/2);

            return sucesion(n/2);
        
        }else{

            System.out.println((3*n)+1);
            
            return sucesion((3*n)+1);
        }


    }










}

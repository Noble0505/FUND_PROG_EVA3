package eva3_2_funciones_2;

import java.util.Scanner;


public class EVA3_2_FUNCIONES_2 {
    
    static int x = 100;
    public static void main(String[] args) {
        // TODO code application logic here
        /* Scanner input = new Scanner(System.in);
        System.out.println(x);
        EVA3_2_FUNCIONES_2 objeto = new EVA3_2_FUNCIONES_2();
        System.out.println(objeto.x);*/ 
        int num1 = 100, num2 = 200;
        //System.out.println(buscarMax(num1, num2) );
        int valor = buscarMax(num1, num2);
        System.out.println(valor);
    }
    public static int buscarMax(int num1, int num2){
        /*int resu;
        if (num1 > num2) 
          resu = num1; 
        else
         resu = num2;
        return resu;*/        
         if (num1 > num2) 
          return num1; 
        else
         return num2;
    }
    
}

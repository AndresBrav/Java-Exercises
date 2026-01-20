/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_java.NumeroEspecial;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Solucion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero positivo ");
        int numero = scanner.nextInt();
        
        NumeroEspecial num = new NumeroEspecial();
        boolean resultado = num.esNumeroEspecial(numero);
        System.out.println("el resultado es "+resultado);
    }
}

class NumeroEspecial {
    
    private int[] divisores = {2,3,5,7};

    public boolean esNumeroEspecial(int numero) {
        boolean respuesta = false;
        int suma = 0;
        int copiaNumero = numero;
        while( numero !=0){
            int modulo = numero % 10;
            numero = numero /10;
            suma +=modulo;
        }
        
        System.out.println("el numero es "+ copiaNumero);
        
        if( suma %3 ==0){
            for ( int i : divisores) {
                if( copiaNumero % i ==0){
                    return true;
                }
            }
        }
        else {
            return false;
        }
        
        //System.out.println("la suma es "+suma);
        return respuesta;
    }

}

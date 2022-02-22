import Ejercicios.ContarLetras;
import Ejercicios.Opcional;
import Ejercicios.Palindromo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Resultado ejercicio Palíndromo");
        System.out.println(Palindromo.isPalindrome("ojo")); 
        System.out.println(Palindromo.isPalindrome("Somos")); 
        System.out.println(Palindromo.isPalindrome("azul")); 
        System.out.println("--------");
        System.out.println("Resultado Ejercicio contar letras");
        String[] letras = {"A","A","A","B","B","C","C","C","D"};
        System.out.println(ContarLetras.contarLetras(letras));
        System.out.println("--------");
        System.out.println("Resultado Ejercicio opcional");
        int[] arr = {8,5,1,8,2,3};
        Opcional.ordenarSinDuplicados(arr);
        
    }
}

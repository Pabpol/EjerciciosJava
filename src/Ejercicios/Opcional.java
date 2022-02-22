package Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class Opcional {

    public static void ordenarSinDuplicados(int[] arr){

       Arrays.sort(arr);
       ArrayList<Integer> newArr = new ArrayList<Integer>();
      
      for (int integer : arr) {
          if (!(newArr.contains(integer))) {
              newArr.add(integer);
          }
      }
      for (int integer : newArr)
      System.out.printf("%d ", integer);

    }
    
}

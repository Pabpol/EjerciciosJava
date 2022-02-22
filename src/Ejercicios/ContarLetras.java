package Ejercicios;

import java.util.Arrays;
import java.util.Collections;

public class ContarLetras {

    public static String contarLetras(String[] letras) {

        String res = "";
        int i = 0;
        while (i < letras.length) {
            res += Collections.frequency(Arrays.asList(letras), letras[i]) + letras[i];
            i += Collections.frequency(Arrays.asList(letras), letras[i]);
        }
        return res;
    }
}


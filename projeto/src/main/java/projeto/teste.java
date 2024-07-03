/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author uilso
 */
public class teste {

    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>();
        List<String> numeros2 = new ArrayList<>();
        List<String> numeros3 = new ArrayList<>();
        List<String> numeros4 = new ArrayList<>();

        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        

        numeros3.add("1");
        numeros3.add("2");
        numeros3.add("3");
       

        
        numeros2.add("3");
        numeros2.add("2");
        numeros2.add("1");

        Collections.shuffle(numeros);
        Collections.shuffle(numeros2);
        Collections.shuffle(numeros3);

        while (numeros2.equals(numeros)) {
            Collections.shuffle(numeros2);
        }
        System.out.println("L");
        while (numeros3.equals(numeros) && numeros3.equals(numeros2)) {
            Collections.shuffle(numeros3);
        }
        numeros4 = numeros3;
        Collections.shuffle(numeros4);
        while (numeros4.equals(numeros) && numeros4.equals(numeros2)&& numeros4.equals(numeros3)) {
            Collections.shuffle(numeros4);
            System.out.println("1");
        }
        System.out.println(" foi");

        if (!numeros.equals(numeros3) && !numeros.equals(numeros2)) {
            System.out.println("Deu Boa");
        } else {
            System.out.println("Deu Ruim");

        }
        for (String i : numeros) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (String i : numeros2) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (String i : numeros3) {
            System.out.print(i + " ");
        }
        System.out.println("Lista 4");
        for (String i : numeros4) {
            System.out.print(i + " ");
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
// 012   456   8 9 10  12 13
// ### . ### . # #  # - #  #

public class VerificaCpf {

    String cpfBruto;
    int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11;
    int soma1, soma2, dv1, dv2;
    boolean resultado;

    public void validaCpf(String cpf) {
        cpfBruto = cpf.replaceAll(".-", "");
        System.out.println(cpfBruto);
        d1 = Integer.parseInt(String.valueOf(cpfBruto.charAt(0)));
        d2 = Integer.parseInt(String.valueOf(cpfBruto.charAt(1)));
        d3 = Integer.parseInt(String.valueOf(cpfBruto.charAt(2)));
        d4 = Integer.parseInt(String.valueOf(cpfBruto.charAt(3)));
        d5 = Integer.parseInt(String.valueOf(cpfBruto.charAt(4)));
        d6 = Integer.parseInt(String.valueOf(cpfBruto.charAt(5)));
        d7 = Integer.parseInt(String.valueOf(cpfBruto.charAt(6)));
        d8 = Integer.parseInt(String.valueOf(cpfBruto.charAt(7)));
        d9 = Integer.parseInt(String.valueOf(cpfBruto.charAt(8)));
        d10 = Integer.parseInt(String.valueOf(cpfBruto.charAt(9)));
        d11 = Integer.parseInt(String.valueOf(cpfBruto.charAt(10)));

        soma1 = (d1 * 10) + (d2 * 9) + (d3 * 8) + (d4 * 7) + (d5 * 6) + (d6 * 5) + (d7 * 4) + (d8 * 3) + (d9 * 2);

        dv1 = 11 - (soma1 % 11);
        if (dv1 >= 10) {
            dv1 = 0;
        }

        soma2 = (d1 * 11) + (d2 * 10) + (d3 * 9) + (d4 * 8) + (d5 * 7) + (d6 * 6) + (d7 * 5) + (d8 * 4) + (d9 * 3) + (dv1 * 2);
        dv2 = 11 - (soma2 % 11);
        if (dv2 >= 10) {
            dv2 = 0;
        }
        
         if(dv1 == d10 && dv2 == d11){
            resultado = true;
    }else{
    resultado =  false;
}
       
    }

    public boolean isResultado() {
        return resultado;
    }
    
    public boolean resultadoValidaçao(){
        if(dv1 == d10 && dv2 == d11){
            return true;
    }else{
    return false;
}
    }
    public void imprime() {
        System.out.println(cpfBruto.replaceAll("[.-]", ""));
       // System.out.println("cpf" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11);
        System.out.println(resultadoValidaçao());
    }
}

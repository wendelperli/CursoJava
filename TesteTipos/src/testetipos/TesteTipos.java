/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testetipos;

/**
 *
 * @author Allan
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int idade = 30;
       // String valor = Integer.toString(idade); //Converte a idade (inteiro) para 'String' e a joga dentro de 'valor' (String)
        
        
        //String valor = "40";
        //int idade = Integer.parseInt(valor);//Converte o valor(String) para 'int' e a joga dentro de 'idade' (inteiro)
        
        String valor = "40.5";
        float idade = Float.parseFloat(valor);//Converte o valor(String) para 'float' e a joga dentro de 'idade' (float)
        System.out.println(valor);
    }
    
}

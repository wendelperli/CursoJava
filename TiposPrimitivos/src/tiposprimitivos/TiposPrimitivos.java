/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Allan
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);//cria o objeto  WendelEntrada de dados
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();//Entrada de dados
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();//Entrada de dados
        
        //String nome = "Wendel";
        //float nota = (float)8.5;
        System.out.println("A sua noa é " + nota); //Concatenação
        System.out.printf("A nota de %s é %.2f \n", nome, nota); //Duas casas decimais
        System.out.format("A nota de %s é %.3f \n", nome, nota); // Três casas decimais
    }
    
}

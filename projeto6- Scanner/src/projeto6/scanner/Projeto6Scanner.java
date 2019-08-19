/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto6.scanner;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Projeto6Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //classe scanner deve ser importada de
        //dentro do pacote java.util.scanner
        //Definir um projeto'entrada' da classe Scanner
        //Usando a palavra NEW
        //que é responsavel pela instanciacao de objetos
        //de uma classe Java
        
        String nome = "Moraes";
        Scanner entrada = new Scanner(System.in);
        
        //criar um program que receba ENTRADA de
        //2 (dois) valor(num1 e num2) e verifique
        //qual o maior numero entre os dois
        
        int num1, num2;
        System.out.println("Digite o primenro Numero:");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo Numero:");
        num2 = entrada.nextInt();
        //valor atribuidos a num1 e num2
        System.out.println("Valor Numero1:"+num1);
        System.out.println("Valor Numero2:"+num2);
        
        if (num1 > num2){
        System.out.println("Numero 1 é maior:");
        System.out.println("Numero 2 é menor:");
}   
else{ 
        System.out.println("Numero 2 é maior:");
        System.out.println("Numero 1 é menor9"
                + "6"
                + "9:");
    }
    
}

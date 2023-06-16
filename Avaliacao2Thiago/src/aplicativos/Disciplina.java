/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicativos;

import java.util.Scanner;
import tiposDados.TipoDisciplina;
/**
 *
 * @author a2459728
 */
public class Disciplina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int qtdDisciplinas = 0;
        
        while(qtdDisciplinas<=0){
            
            System.out.print("Quantas disciplinas serao cadastradas: ");
            qtdDisciplinas = scan.nextInt();
            
        }
        
        TipoDisciplina[] disciplinas = new TipoDisciplina[qtdDisciplinas];
        
        scan.nextLine();
        
        for(int i=0; i < qtdDisciplinas; i++){
            
            System.out.print("Digite o codigo da disciplina: ");
            String codigo = scan.nextLine();
            
            
            System.out.print("Digite o nome da disciplina: ");
            String nome = scan.nextLine();
            
            
            System.out.print("Digite o conteudo programatico da disciplina: ");
            String conteudo = scan.nextLine();
            
            
            System.out.print("Modalidade da disciplina\n1- Presencial\n0- A distancia\nDigite: ");
            int modalidade = scan.nextInt();
            
            System.out.print("Digite a carga horaria da disciplina: ");
            int carga = scan.nextInt();
            
            scan.nextLine();
        
            disciplinas[i] = new TipoDisciplina(codigo, nome, conteudo, modalidade, carga);
        
        }
        
        for (TipoDisciplina disciplina : disciplinas) {
            System.out.println(disciplina.toString());
        }
    }
    
}

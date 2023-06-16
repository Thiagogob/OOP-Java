/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposDados;

/**
 *
 * @author a2459728
 * 
 * O Departamento Acadêmico de Informática deseja automatizar o processo de criação de disciplinas 
 * para os seus cursos. Desenvolva um sistema que seja capaz de criar novas disciplinas. 
 * Em uma conversa com os coordenadores de cursos foi possível identificar que uma disciplina
 * é constituída de seu código, nome, modalidade (Presencial ou A Distância), 
 * carga horária (em horas) e conteúdo programático. Cada disciplina pode exibir um relatório 
 * (uma espécie de resumo), ilustrando ao usuário do sistema os valores de seus dados. 
 * Para efetuar a instanciação de cada disciplina, atribuição de valores e invocação dos métodos,
 * utilize uma classe de teste.

Avaliando:
- Encapsulamento e métodos acessadores - 50% da questão

- Método construtor - 20% da questão

- Entrada de dados -  20% da questão

- Completude do enunciado - 10% da questão
 */
public class TipoDisciplina {
    private String codigo;
    private String nome;
    private String conteudo;
    private int modalidade;
    private int carga;

    
    public TipoDisciplina(String codigo, String nome, String conteudo, int modalidade, int carga){
        this.codigo = codigo;
        this.nome = nome;
        this.conteudo = conteudo;
        if(modalidade == 0 || modalidade == 1){
            this.modalidade = modalidade;
        }
        else{
            System.out.println("Modalidade invalida. Definida como presencial");
            this.modalidade = 1;
        }
        
        this.carga = carga;
    }
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the conteudo
     */
    public String getConteudo() {
        return conteudo;
    }

    /**
     * @return the modalidade
     */
    public int getModalidade() {
        return modalidade;
    }

    /**
     * @return the carga
     */
    public int getCarga() {
        return carga;
    }

    
    
    public String toString(){
        if (modalidade == 0){
            return "Codigo: " + getCodigo() + "\n" +"Nome: "+ getNome() + "\n"+ "Conteudo Programatico: " + getConteudo() + "\n"
                    + "Modalidade: A distancia" + "\n" +"Carga: " + getCarga() + "h";
        }
        else{
            return "Codigo: " + getCodigo() + "\n" +"Nome: "+ getNome() + "\n"+ "Conteudo Programatico: " + getConteudo() + "\n"
                    + "Modalidade: Presencial" + "\n" +"Carga: " + getCarga() + "h";
        }
        
    }
    
}

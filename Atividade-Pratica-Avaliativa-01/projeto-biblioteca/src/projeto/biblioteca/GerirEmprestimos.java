/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.biblioteca;

import java.util.ArrayList;
/**
 *
 * @author Aluno
 */
public class GerirEmprestimos {
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();   
    
    // <editor-fold defaultstate="collapsed" desc="cadastrarEmprestimo">
    public void cadastrarEmprestimo(Emprestimo emprestimo){
        if (emprestimo.getLivros().isEmpty()){
            System.out.println("Nenhum livro cadastrado!");
            return;
        }
        
        emprestimos.add(emprestimo);
        System.out.println("Emprestimo cadastrado com sucesso!");       
    }
    // </editor-fold>
}

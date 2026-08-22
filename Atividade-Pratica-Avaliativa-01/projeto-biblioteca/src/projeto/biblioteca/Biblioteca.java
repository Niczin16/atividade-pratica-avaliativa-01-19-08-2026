/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.biblioteca;

import java.util.ArrayList;
import java.util.Map;


/**
 *
 * @author Aluno
 */
public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>();
    
    public void incluirLivro(Livro livro){
        livros.add(livro);
        System.out.println(" \n Livro adicionado com sucesso!");        
    }
    
    public void editarLivro(Livro livro, String titulo){
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado na biblioteca.");
            return; 
        }
        
        for(Livro lLivro: livros){
            if(lLivro.getTitulo().equalsIgnoreCase(titulo)){
                livros.clear();
                System.out.println("O livro foi limpo, adicione as informacoes correta!");
                livros.add(livro);
                System.out.println("Livro editado com sucesso!");
            }            
        }
    }
    
    public void removerLivro(Livro livro, String titulo){
        for (Livro lLivro: livros){
            if(lLivro.getTitulo().equalsIgnoreCase(titulo)){
                livros.remove(livro);
                System.out.println("Livro removido com sucesso!");                      
            }
        }
    }
    
    public void listarLivros(){
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado na biblioteca.");
            return; 
        }
        
        for (Livro lLivro : livros) {
            lLivro.descricao();
        }    
    }
    
    public Livro buscarLivroTitulo(String titulo){
        for (Livro lLivro : livros){
            if (lLivro.getTitulo().equalsIgnoreCase(titulo)){
                return lLivro;
            }
        }
        return null;
    }    
}

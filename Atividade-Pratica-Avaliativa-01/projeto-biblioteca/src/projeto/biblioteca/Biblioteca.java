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
    
    public void adicionarLivro(Livro livro){
        livros.add(livro);
        System.out.println(" \n Livro adicionado com sucesso!");        
    }
    
    public void listarLivros(){
        for (Livro lLivro : livros ){
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

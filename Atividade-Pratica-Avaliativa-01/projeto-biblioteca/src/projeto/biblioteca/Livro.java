/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.biblioteca;

/**
 *
 * @author Aluno
 */

/* Lembrete de estudo - classe abstrata nunca é instanciada, ela é somente uma base para as outras que a herdarão */
public class Livro {
//    private Integer Controle; -Pensar em colocar depois
    private String Titulo;
    private String Autor;
    private Integer NumeroPaginas;

    public Livro(String Titulo, String Autor, Integer NumeroPaginas) {      
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPaginas = NumeroPaginas;
    }    
    
    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public Integer getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(Integer NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;    
    }
    
    public void descricao() {
        System.out.printf("%-25s |  %-20s | %3d págs.\n", 
                Titulo, Autor, NumeroPaginas);
    }

}

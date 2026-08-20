/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.biblioteca;

/**
 *
 * @author Aluno
 */
public class LivroFisico extends Livro{
    private double Peso;

    public LivroFisico(double Peso, String Titulo, String Autor, Integer NumeroPaginas) {
        super(Titulo, Autor, NumeroPaginas);
        this.Peso = Peso;
    }    
    
    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    @Override
    public void descricao() {
               System.out.print(
                " \n O livro se chama: " + getTitulo()        +
                ", o autor e: "          + getAutor()         + 
                ", ele tem "             + getNumeroPaginas() + 
                "paginas!"                                    +
                ", ele e um livro fisico com um peso de: "    + 
                getPeso()
        ); 
    }    
    
}

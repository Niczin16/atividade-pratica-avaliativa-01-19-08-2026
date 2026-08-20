/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.biblioteca;

/**
 *
 * @author Aluno
 */
public class EBook extends Livro{
    private double TamanhoArquivo;

    public EBook(double TamanhoArquivo, String Titulo, String Autor, Integer NumeroPaginas) {
        super(Titulo, Autor, NumeroPaginas);
        this.TamanhoArquivo = TamanhoArquivo;
    }    
    
    public double getTamanhoArquivo() {
        return TamanhoArquivo;
    }

    public void setTamanhoArquivo(double TamanhoArquivo) {
        this.TamanhoArquivo = TamanhoArquivo;
    }

    @Override
    public void descricao() {
                System.out.print(
                " \n O livro se chama: "    + getTitulo()     +
                ", o autor e: "          + getAutor()         + 
                ", ele tem "             + getNumeroPaginas() + 
                "paginas!"                                    +
                ", ele e um eBook com um tamanho de: "        + 
                getTamanhoArquivo()
        ); 
    }               

}

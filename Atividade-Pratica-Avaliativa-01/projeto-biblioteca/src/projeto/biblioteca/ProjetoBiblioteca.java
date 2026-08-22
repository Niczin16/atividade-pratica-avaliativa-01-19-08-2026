/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto.biblioteca;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ProjetoBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 
        Biblioteca biblioteca = new Biblioteca();       
        Scanner scanner       = new Scanner(System.in);
        
        Integer controle = 0; //Variável para gerir a interface
        
        do {            
                                                
            System.out.println(" -- Projeto Biblioteca -- ");            
            
            System.out.println("Selecione a opcao desejada:  ");
            System.out.println(" [ 1]  - Gerir Livros.           ");
            System.out.println(" [ 2]  - Gerir Membros.          ");
            System.out.println(" [ 3]  - Gerir Emprestimos       ");
            System.out.println(" [-1]  - Sair do Programa        ");
            
            System.out.print("Opcao: ");
            controle = Integer.parseInt(scanner.nextLine());
            
            if (controle < -1){
                System.out.println("Nao digite valores menores que -1. ");
            }else if (controle > 3){
                System.out.println("Nao digite valores fora das opcoes.");
            }
                        
            switch (controle) {
                case 1:
                    
                    // <editor-fold defaultstate="collapsed" desc="Gestão de Livros">
                    do {                        
                        
                        System.out.println("\n\n");
                        
                        System.out.println(" -- Gerir Livros -- "); 

                        System.out.println(" [ 1] - Incluir Livro.              ");
                        System.out.println(" [ 2] - Editar Livro.               ");
                        System.out.println(" [ 3] - Remover Livro.              ");
                        System.out.println(" [ 4] - Listar Livros.              ");
                        System.out.println(" [ 5] - Buscar Livro.               ");
                        System.out.println(" [ 6] - Voltar ao menu principal.   ");

                        System.out.print("Opcao: ");
                        controle = Integer.parseInt(scanner.nextLine());                                               
                        
                        if ((controle > 6) || (controle < 1)){
                            System.out.println("Voce esta digitando valores indisponiveis nas opcoes");
                        }
                                                
                        switch (controle) {
                            case 1:                                                                
                        
                                // <editor-fold defaultstate="collapsed" desc="Incluir Livros">
                                
                                Double lTmArquivo;//E-book
                                Double lPeso     ;//Livro Fisico
                                
                                //Ambos
                                String lTitulo ;
                                String lAutor  ;
                                Integer lNumPag; 
                                
                                System.out.println("\n\n");
                                
                                System.out.println(" -- Adicionar Livro -- ");
                                
                                System.out.println(" [ 1] - E-Book            ");
                                System.out.println(" [ 2] - Livro Fisico.     ");
                                
                                System.out.print("Opcao: ");
                                
                                while (true) {
                                try {
                                    controle = Integer.parseInt(scanner.nextLine());
                                    if (controle == 1 || controle == 2) {
                                        break;
                                    }
                                    System.out.print("Opcao invalida. Digite 1 ou 2: ");
                                } catch (NumberFormatException e) {
                                        System.out.print("Entrada invalida. Digite um numero inteiro (1 ou 2): ");
                                    }
                                }
                                
                                switch (controle) {
                                    case 1:
                                        while (true){
                                            try{
                                                System.out.print("Informe o tamanho do arquivo (MB): ");
                                                lTmArquivo = Double.parseDouble(scanner.nextLine());
                                                if (lTmArquivo > 0) break;
                                                System.out.println("O tamanho deve ser maior que zero.");
                                            } catch (NumberFormatException e) {
                                                System.out.println("Erro: Digite um numero decimal valido (Ex: 10.5).");
                                            }
                                        }                                    

                                        while (true) {
                                            System.out.print("Informe o titulo do livro: ");
                                            lTitulo = scanner.nextLine().trim();
                                            if (!lTitulo.isEmpty()) break;
                                            System.out.println("O titulo não pode ficar em branco.");
                                        }                                      

                                        while (true) {
                                            System.out.print("Informe o autor do livro: ");
                                            lAutor = scanner.nextLine().trim();
                                            if (!lAutor.isEmpty()) break;
                                            System.out.println("O autor nao pode ficar em branco.");
                                        }                                        

                                        while (true) {
                                            try {
                                                System.out.print("Informe o numero de paginas: ");
                                                lNumPag = Integer.parseInt(scanner.nextLine());
                                                if (lNumPag > 0) break;
                                                System.out.println("O numero de páginas deve ser maior que zero.");
                                            } catch (NumberFormatException e) {
                                                System.out.println("Erro: Digite um numero inteiro valido.");
                                            }
                                        }                                          
                                        
                                        EBook eBook = new EBook(lTmArquivo, lTitulo, lAutor, lNumPag);
                                        
                                        biblioteca.incluirLivro(eBook);
                                        
                                        controle = 0;
                                        
                                        break;
                                        
                                    case 2:
                                        while (true) {
                                            try {
                                                System.out.print("Informe o peso do Livro (kg): ");
                                                lPeso = Double.parseDouble(scanner.nextLine());
                                                if (lPeso > 0) break;
                                                System.out.println("O peso deve ser maior que zero.");
                                            } catch (NumberFormatException e) {
                                                System.out.println("Erro: Digite um numero decimal valido (Ex: 0.5).");
                                            }
                                        }

                                        while (true) {
                                            System.out.print("Informe o titulo do livro: ");
                                            lTitulo = scanner.nextLine().trim();
                                            if (!lTitulo.isEmpty()) break;
                                            System.out.println("O titulo nao pode ficar em branco.");
                                        }

                                        while (true) {
                                            System.out.print("Informe o autor do livro: ");
                                            lAutor = scanner.nextLine().trim();
                                            if (!lAutor.isEmpty()) break;
                                            System.out.println("O autor nao pode ficar em branco.");
                                        }

                                        while (true) {
                                            try {
                                                System.out.print("Informe o numero de paginas: ");
                                                lNumPag = Integer.parseInt(scanner.nextLine());
                                                if (lNumPag > 0) break;
                                                System.out.println("O numero de paginas deve ser maior que zero.");
                                            } catch (NumberFormatException e) {
                                                System.out.println("Erro: Digite um número inteiro valido.");
                                            }
                                        }                                           
                                                                                
                                        LivroFisico livroFisico = new LivroFisico(lPeso, lTitulo, lAutor, lNumPag);
                                        
                                        biblioteca.incluirLivro(livroFisico);
                                        
                                        controle = 0;
                                        
                                        break;
                                        
                                    default:
                                        System.out.println("Opcao invalida!");
                                        
                                        controle = 0;
                                        
                                        break;
                                }
                                
                                // </editor-fold>
                                
                                break;                                                                
                                
                            case 2:
                                
                                // <editor-fold defaultstate="collapsed" desc="Editar Livros">                                                                                                                             
                                
                                System.out.println("\n\n");
                                
                                System.out.println(" -- Editar Livro -- ");
                                
                                System.out.println(" [ 1] - E-Book            ");
                                System.out.println(" [ 2] - Livro Fisico.     ");
                                
                                System.out.print("Opcao: ");
                                
                                while (true) {
                                try {
                                    controle = Integer.parseInt(scanner.nextLine());
                                    if (controle == 1 || controle == 2) {
                                        break;
                                    }
                                    System.out.print("Opcao invalida. Digite 1 ou 2: ");
                                } catch (NumberFormatException e) {
                                        System.out.print("Entrada invalida. Digite um numero inteiro (1 ou 2): ");
                                    }
                                }
                                
                                switch (controle) {
                                    case 1:
                                        while (true){
                                            try{
                                                System.out.print("Informe o tamanho do arquivo (MB): ");
                                                lTmArquivo = Double.parseDouble(scanner.nextLine());
                                                if (lTmArquivo > 0) break;
                                                System.out.println("O tamanho deve ser maior que zero.");
                                            } catch (NumberFormatException e) {
                                                System.out.println("Erro: Digite um numero decimal valido (Ex: 10.5).");
                                            }
                                        }                                    

                                        while (true) {
                                            System.out.print("Informe o titulo do livro: ");
                                            lTitulo = scanner.nextLine().trim();
                                            if (!lTitulo.isEmpty()) break;
                                            System.out.println("O titulo não pode ficar em branco.");
                                        }                                      

                                        while (true) {
                                            System.out.print("Informe o autor do livro: ");
                                            lAutor = scanner.nextLine().trim();
                                            if (!lAutor.isEmpty()) break;
                                            System.out.println("O autor nao pode ficar em branco.");
                                        }                                        

                                        while (true) {
                                            try {
                                                System.out.print("Informe o numero de paginas: ");
                                                lNumPag = Integer.parseInt(scanner.nextLine());
                                                if (lNumPag > 0) break;
                                                System.out.println("O numero de páginas deve ser maior que zero.");
                                            } catch (NumberFormatException e) {
                                                System.out.println("Erro: Digite um numero inteiro valido.");
                                            }
                                        }                                          
                                        
                                        System.out.println("Informe o titulo do livro para edita-lo: ");
                                        lTitulo = scanner.nextLine().trim();   
                                       
                                        EBook eBook = new EBook(lTmArquivo, lTitulo, lAutor, lNumPag);
                                        
                                        biblioteca.editarLivro(eBook, lTitulo);
                                        
                                        controle = 0;
                                        
                                        break;
                                        
                                    case 2:
                                        while (true) {
                                            try {
                                                System.out.print("Informe o peso do Livro (kg): ");
                                                lPeso = Double.parseDouble(scanner.nextLine());
                                                if (lPeso > 0) break;
                                                System.out.println("O peso deve ser maior que zero.");
                                            } catch (NumberFormatException e) {
                                                System.out.println("Erro: Digite um numero decimal valido (Ex: 0.5).");
                                            }
                                        }

                                        while (true) {
                                            System.out.print("Informe o titulo do livro: ");
                                            lTitulo = scanner.nextLine().trim();
                                            if (!lTitulo.isEmpty()) break;
                                            System.out.println("O titulo nao pode ficar em branco.");
                                        }

                                        while (true) {
                                            System.out.print("Informe o autor do livro: ");
                                            lAutor = scanner.nextLine().trim();
                                            if (!lAutor.isEmpty()) break;
                                            System.out.println("O autor nao pode ficar em branco.");
                                        }

                                        while (true) {
                                            try {
                                                System.out.print("Informe o numero de paginas: ");
                                                lNumPag = Integer.parseInt(scanner.nextLine());
                                                if (lNumPag > 0) break;
                                                System.out.println("O numero de paginas deve ser maior que zero.");
                                            } catch (NumberFormatException e) {
                                                System.out.println("Erro: Digite um número inteiro valido.");
                                            }
                                        }                                           
                                         
                                        System.out.println("Informe o titulo do livro para edita-lo: ");
                                        lTitulo = scanner.nextLine().trim();   
                                        
                                        LivroFisico livroFisico = new LivroFisico(lPeso, lTitulo, lAutor, lNumPag);
                                        
                                        biblioteca.editarLivro(livroFisico, lTitulo);
                                        
                                        controle = 0;                                                                     
                                
                                      break;
                                        
                                default:
                                    System.out.println("Opcao invalida!");
                                        
                                    controle = 0;
                                        
                                    break;
                                }    
                                
                                // </editor-fold>
                                
                                break;
                                
                            case 3:
                                
                                break;
                                
                            case 4:
                                
                                // <editor-fold defaultstate="collapsed" desc="Listar Livros">
                                
                                System.out.println("\n\n");
                                System.out.println(" --Livros Disponiveis-- ");
                                
                                biblioteca.listarLivros();
                                
                                // </editor-fold>
                                
                                break;
                                
                            case 5:
                                
                                break;
                            
                            case 6:
                                System.out.println("Voce voltou ao menu principal.");
                                break;    
                                
                            default:
                                System.out.println("Opcao nao encontrada.");
                                break;
                        }                        
                        
                    } while (controle != 6);                                        
                    
                    // </editor-fold>
                    
                    break;
                    
                case 2:
                    System.out.println("0p 2");
                    break;
                   
                case 3:
                    System.out.println("0p 3");
                    break;
                
                case -1:
                    System.out.println("Voce saiu!");
                    break;
                    
                default:
                    System.out.println("Opcao nao encontrada!");
                    break;
            }
            
            System.out.println("\n\n");
            
        } while (controle != -1);
        
        scanner.close();
    }
    
}

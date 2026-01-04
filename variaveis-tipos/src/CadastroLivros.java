public class CadastroLivros {

    String titulo = "O Pequeno Príncipe";
    String autor = "Antoine de Saint-Exupéry";
    int numeroPaginas = 96;
    double preco = 39.90;
    char categoria = 'F';

    void main() {
        String descricaoCategoria;

        switch (categoria) {
            case 'F':
                descricaoCategoria = "Ficção";
                break;
            case 'N':
                descricaoCategoria = "Não-ficção";
                break;
            case 'T':
                descricaoCategoria = "Tecnologia";
                break;
            case 'H':
                descricaoCategoria = "História";
                break;
            default:
                descricaoCategoria = "Categoria Desconhecida";
                break;
        }

        System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor +
                ". Ele possui " + numeroPaginas + " páginas, custa R$" + preco +
                " e pertence à categoria " + descricaoCategoria + ".");
    }

}

package Backend.Model.Entidade

/**
 * Classe responsável pela definição do objeto do tipo Empresa
 */
class Empresa {
    String nome, emailCorporativo, estado, pais, descricao
    long cnpj
    int cep


    @Override
    String toString() {
        return nome + ';' +
                emailCorporativo + ';' +
                cnpj + ';' +
                cep + ';' +
                estado + ';' +
                pais + ';' +
                descricao
    }
}

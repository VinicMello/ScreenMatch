package br.com.screenmatch.calculations;
/**
 * Interface que define um contrato para classificação de conteúdo audiovisual.
 *
 * Classes que implementam essa interface devem fornecer uma maneira de obter
 * a classificação de um conteúdo, representada por um número inteiro.
 */
public interface Classification {
    int getClassification();
}

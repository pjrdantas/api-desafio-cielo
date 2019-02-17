
package br.com.cielo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "codigoBanco",
    "numeroAgencia",
    "numeroContaCorrente"
})
public class DadosDomicilioBancario {

    @JsonProperty("codigoBanco")
    private Long codigoBanco;
    @JsonProperty("numeroAgencia")
    private Long numeroAgencia;
    @JsonProperty("numeroContaCorrente")
    private String numeroContaCorrente;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DadosDomicilioBancario() {
    }

    /**
     * 
     * @param numeroAgencia
     * @param codigoBanco
     * @param numeroContaCorrente
     */
    public DadosDomicilioBancario(Long codigoBanco, Long numeroAgencia, String numeroContaCorrente) {
        super();
        this.codigoBanco = codigoBanco;
        this.numeroAgencia = numeroAgencia;
        this.numeroContaCorrente = numeroContaCorrente;
    }

    @JsonProperty("codigoBanco")
    public Long getCodigoBanco() {
        return codigoBanco;
    }

    @JsonProperty("codigoBanco")
    public void setCodigoBanco(Long codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public DadosDomicilioBancario withCodigoBanco(Long codigoBanco) {
        this.codigoBanco = codigoBanco;
        return this;
    }

    @JsonProperty("numeroAgencia")
    public Long getNumeroAgencia() {
        return numeroAgencia;
    }

    @JsonProperty("numeroAgencia")
    public void setNumeroAgencia(Long numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public DadosDomicilioBancario withNumeroAgencia(Long numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
        return this;
    }

    @JsonProperty("numeroContaCorrente")
    public String getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    @JsonProperty("numeroContaCorrente")
    public void setNumeroContaCorrente(String numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public DadosDomicilioBancario withNumeroContaCorrente(String numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
        return this;
    }

}

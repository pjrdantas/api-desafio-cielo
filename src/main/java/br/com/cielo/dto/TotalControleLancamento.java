
package br.com.cielo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "quantidadeLancamentos",
    "quantidadeRemessas",
    "valorLancamentos"
})
public class TotalControleLancamento {

    @JsonProperty("quantidadeLancamentos")
    private Long quantidadeLancamentos;
    
    @JsonProperty("quantidadeRemessas")
    private Long quantidadeRemessas;
    
    @JsonProperty("valorLancamentos")
    private Double valorLancamentos;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TotalControleLancamento() {
    }

    /**
     * 
     * @param quantidadeLancamentos
     * @param valorLancamentos
     * @param quantidadeRemessas
     */
    public TotalControleLancamento(Long quantidadeLancamentos, Long quantidadeRemessas, Double valorLancamentos) {
        super();
        this.quantidadeLancamentos = quantidadeLancamentos;
        this.quantidadeRemessas = quantidadeRemessas;
        this.valorLancamentos = valorLancamentos;
    }

    @JsonProperty("quantidadeLancamentos")
    public Long getQuantidadeLancamentos() {
        return quantidadeLancamentos;
    }

    @JsonProperty("quantidadeLancamentos")
    public void setQuantidadeLancamentos(Long quantidadeLancamentos) {
        this.quantidadeLancamentos = quantidadeLancamentos;
    }

    public TotalControleLancamento withQuantidadeLancamentos(Long quantidadeLancamentos) {
        this.quantidadeLancamentos = quantidadeLancamentos;
        return this;
    }

    @JsonProperty("quantidadeRemessas")
    public Long getQuantidadeRemessas() {
        return quantidadeRemessas;
    }

    @JsonProperty("quantidadeRemessas")
    public void setQuantidadeRemessas(Long quantidadeRemessas) {
        this.quantidadeRemessas = quantidadeRemessas;
    }

    public TotalControleLancamento withQuantidadeRemessas(Long quantidadeRemessas) {
        this.quantidadeRemessas = quantidadeRemessas;
        return this;
    }

    @JsonProperty("valorLancamentos")
    public Double getValorLancamentos() {
        return valorLancamentos;
    }

    @JsonProperty("valorLancamentos")
    public void setValorLancamentos(Double valorLancamentos) {
        this.valorLancamentos = valorLancamentos;
    }

    public TotalControleLancamento withValorLancamentos(Double valorLancamentos) {
        this.valorLancamentos = valorLancamentos;
        return this;
    }

}


package br.com.cielo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numeroRemessaBanco",
    "nomeSituacaoRemessa",
    "dadosDomicilioBancario",
    "nomeTipoOperacao"
})
public class LancamentoContaCorrenteCliente {

    @JsonProperty("numeroRemessaBanco")
    private Long numeroRemessaBanco;
    @JsonProperty("nomeSituacaoRemessa")
    private String nomeSituacaoRemessa;
    @JsonProperty("dadosDomicilioBancario")
    private DadosDomicilioBancario dadosDomicilioBancario;
    @JsonProperty("nomeTipoOperacao")
    private String nomeTipoOperacao;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LancamentoContaCorrenteCliente() {
    }

    /**
     * 
     * @param nomeTipoOperacao
     * @param dadosDomicilioBancario
     * @param numeroRemessaBanco
     * @param nomeSituacaoRemessa
     */
    public LancamentoContaCorrenteCliente(Long numeroRemessaBanco, String nomeSituacaoRemessa, DadosDomicilioBancario dadosDomicilioBancario, String nomeTipoOperacao) {
        super();
        this.numeroRemessaBanco = numeroRemessaBanco;
        this.nomeSituacaoRemessa = nomeSituacaoRemessa;
        this.dadosDomicilioBancario = dadosDomicilioBancario;
        this.nomeTipoOperacao = nomeTipoOperacao;
    }

    @JsonProperty("numeroRemessaBanco")
    public Long getNumeroRemessaBanco() {
        return numeroRemessaBanco;
    }

    @JsonProperty("numeroRemessaBanco")
    public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
        this.numeroRemessaBanco = numeroRemessaBanco;
    }

    public LancamentoContaCorrenteCliente withNumeroRemessaBanco(Long numeroRemessaBanco) {
        this.numeroRemessaBanco = numeroRemessaBanco;
        return this;
    }

    @JsonProperty("nomeSituacaoRemessa")
    public String getNomeSituacaoRemessa() {
        return nomeSituacaoRemessa;
    }

    @JsonProperty("nomeSituacaoRemessa")
    public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
        this.nomeSituacaoRemessa = nomeSituacaoRemessa;
    }

    public LancamentoContaCorrenteCliente withNomeSituacaoRemessa(String nomeSituacaoRemessa) {
        this.nomeSituacaoRemessa = nomeSituacaoRemessa;
        return this;
    }

    @JsonProperty("dadosDomicilioBancario")
    public DadosDomicilioBancario getDadosDomicilioBancario() {
        return dadosDomicilioBancario;
    }

    @JsonProperty("dadosDomicilioBancario")
    public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
        this.dadosDomicilioBancario = dadosDomicilioBancario;
    }

    public LancamentoContaCorrenteCliente withDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
        this.dadosDomicilioBancario = dadosDomicilioBancario;
        return this;
    }

    @JsonProperty("nomeTipoOperacao")
    public String getNomeTipoOperacao() {
        return nomeTipoOperacao;
    }

    @JsonProperty("nomeTipoOperacao")
    public void setNomeTipoOperacao(String nomeTipoOperacao) {
        this.nomeTipoOperacao = nomeTipoOperacao;
    }

    public LancamentoContaCorrenteCliente withNomeTipoOperacao(String nomeTipoOperacao) {
        this.nomeTipoOperacao = nomeTipoOperacao;
        return this;
    }

}

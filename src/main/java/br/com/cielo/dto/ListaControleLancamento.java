
package br.com.cielo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lancamentoContaCorrenteCliente",
    "dataEfetivaLancamento",
    "dataLancamentoContaCorrenteCliente",
    "numeroEvento",
    "descricaoGrupoPagamento",
    "codigoIdentificadorUnico",
    "nomeBanco",
    "quantidadeLancamentoRemessa",
    "numeroRaizCNPJ",
    "numeroSufixoCNPJ",
    "valorLancamentoRemessa",
    "dateLancamentoContaCorrenteCliente",
    "dateEfetivaLancamento"
})
public class ListaControleLancamento {

    @JsonProperty("lancamentoContaCorrenteCliente")
    private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
    @JsonProperty("dataEfetivaLancamento")
    private String dataEfetivaLancamento;
    @JsonProperty("dataLancamentoContaCorrenteCliente")
    private String dataLancamentoContaCorrenteCliente;
    @JsonProperty("numeroEvento")
    private Long numeroEvento;
    @JsonProperty("descricaoGrupoPagamento")
    private String descricaoGrupoPagamento;
    @JsonProperty("codigoIdentificadorUnico")
    private String codigoIdentificadorUnico;
    @JsonProperty("nomeBanco")
    private String nomeBanco;
    @JsonProperty("quantidadeLancamentoRemessa")
    private Long quantidadeLancamentoRemessa;
    @JsonProperty("numeroRaizCNPJ")
    private String numeroRaizCNPJ;
    @JsonProperty("numeroSufixoCNPJ")
    private String numeroSufixoCNPJ;
    @JsonProperty("valorLancamentoRemessa")
    private Long valorLancamentoRemessa;
    @JsonProperty("dateLancamentoContaCorrenteCliente")
    private Long dateLancamentoContaCorrenteCliente;
    @JsonProperty("dateEfetivaLancamento")
    private Long dateEfetivaLancamento;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListaControleLancamento() {
    }

    /**
     * 
     * @param valorLancamentoRemessa
     * @param quantidadeLancamentoRemessa
     * @param numeroRaizCNPJ
     * @param dataEfetivaLancamento
     * @param numeroEvento
     * @param descricaoGrupoPagamento
     * @param dataLancamentoContaCorrenteCliente
     * @param dateEfetivaLancamento
     * @param codigoIdentificadorUnico
     * @param dateLancamentoContaCorrenteCliente
     * @param numeroSufixoCNPJ
     * @param lancamentoContaCorrenteCliente
     * @param nomeBanco
     */
    public ListaControleLancamento(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente, String dataEfetivaLancamento, String dataLancamentoContaCorrenteCliente, Long numeroEvento, String descricaoGrupoPagamento, String codigoIdentificadorUnico, String nomeBanco, Long quantidadeLancamentoRemessa, String numeroRaizCNPJ, String numeroSufixoCNPJ, Long valorLancamentoRemessa, Long dateLancamentoContaCorrenteCliente, Long dateEfetivaLancamento) {
        super();
        this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
        this.dataEfetivaLancamento = dataEfetivaLancamento;
        this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
        this.numeroEvento = numeroEvento;
        this.descricaoGrupoPagamento = descricaoGrupoPagamento;
        this.codigoIdentificadorUnico = codigoIdentificadorUnico;
        this.nomeBanco = nomeBanco;
        this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
        this.numeroRaizCNPJ = numeroRaizCNPJ;
        this.numeroSufixoCNPJ = numeroSufixoCNPJ;
        this.valorLancamentoRemessa = valorLancamentoRemessa;
        this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
        this.dateEfetivaLancamento = dateEfetivaLancamento;
    }

    @JsonProperty("lancamentoContaCorrenteCliente")
    public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
        return lancamentoContaCorrenteCliente;
    }

    @JsonProperty("lancamentoContaCorrenteCliente")
    public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
        this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
    }

    public ListaControleLancamento withLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
        this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
        return this;
    }

    @JsonProperty("dataEfetivaLancamento")
    public String getDataEfetivaLancamento() {
        return dataEfetivaLancamento;
    }

    @JsonProperty("dataEfetivaLancamento")
    public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
        this.dataEfetivaLancamento = dataEfetivaLancamento;
    }

    public ListaControleLancamento withDataEfetivaLancamento(String dataEfetivaLancamento) {
        this.dataEfetivaLancamento = dataEfetivaLancamento;
        return this;
    }

    @JsonProperty("dataLancamentoContaCorrenteCliente")
    public String getDataLancamentoContaCorrenteCliente() {
        return dataLancamentoContaCorrenteCliente;
    }

    @JsonProperty("dataLancamentoContaCorrenteCliente")
    public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
        this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
    }

    public ListaControleLancamento withDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
        this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
        return this;
    }

    @JsonProperty("numeroEvento")
    public Long getNumeroEvento() {
        return numeroEvento;
    }

    @JsonProperty("numeroEvento")
    public void setNumeroEvento(Long numeroEvento) {
        this.numeroEvento = numeroEvento;
    }

    public ListaControleLancamento withNumeroEvento(Long numeroEvento) {
        this.numeroEvento = numeroEvento;
        return this;
    }

    @JsonProperty("descricaoGrupoPagamento")
    public String getDescricaoGrupoPagamento() {
        return descricaoGrupoPagamento;
    }

    @JsonProperty("descricaoGrupoPagamento")
    public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
        this.descricaoGrupoPagamento = descricaoGrupoPagamento;
    }

    public ListaControleLancamento withDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
        this.descricaoGrupoPagamento = descricaoGrupoPagamento;
        return this;
    }

    @JsonProperty("codigoIdentificadorUnico")
    public String getCodigoIdentificadorUnico() {
        return codigoIdentificadorUnico;
    }

    @JsonProperty("codigoIdentificadorUnico")
    public void setCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
        this.codigoIdentificadorUnico = codigoIdentificadorUnico;
    }

    public ListaControleLancamento withCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
        this.codigoIdentificadorUnico = codigoIdentificadorUnico;
        return this;
    }

    @JsonProperty("nomeBanco")
    public String getNomeBanco() {
        return nomeBanco;
    }

    @JsonProperty("nomeBanco")
    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public ListaControleLancamento withNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        return this;
    }

    @JsonProperty("quantidadeLancamentoRemessa")
    public Long getQuantidadeLancamentoRemessa() {
        return quantidadeLancamentoRemessa;
    }

    @JsonProperty("quantidadeLancamentoRemessa")
    public void setQuantidadeLancamentoRemessa(Long quantidadeLancamentoRemessa) {
        this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
    }

    public ListaControleLancamento withQuantidadeLancamentoRemessa(Long quantidadeLancamentoRemessa) {
        this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
        return this;
    }

    @JsonProperty("numeroRaizCNPJ")
    public String getNumeroRaizCNPJ() {
        return numeroRaizCNPJ;
    }

    @JsonProperty("numeroRaizCNPJ")
    public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
        this.numeroRaizCNPJ = numeroRaizCNPJ;
    }

    public ListaControleLancamento withNumeroRaizCNPJ(String numeroRaizCNPJ) {
        this.numeroRaizCNPJ = numeroRaizCNPJ;
        return this;
    }

    @JsonProperty("numeroSufixoCNPJ")
    public String getNumeroSufixoCNPJ() {
        return numeroSufixoCNPJ;
    }

    @JsonProperty("numeroSufixoCNPJ")
    public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
        this.numeroSufixoCNPJ = numeroSufixoCNPJ;
    }

    public ListaControleLancamento withNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
        this.numeroSufixoCNPJ = numeroSufixoCNPJ;
        return this;
    }

    @JsonProperty("valorLancamentoRemessa")
    public Long getValorLancamentoRemessa() {
        return valorLancamentoRemessa;
    }

    @JsonProperty("valorLancamentoRemessa")
    public void setValorLancamentoRemessa(Long valorLancamentoRemessa) {
        this.valorLancamentoRemessa = valorLancamentoRemessa;
    }

    public ListaControleLancamento withValorLancamentoRemessa(Long valorLancamentoRemessa) {
        this.valorLancamentoRemessa = valorLancamentoRemessa;
        return this;
    }

    @JsonProperty("dateLancamentoContaCorrenteCliente")
    public Long getDateLancamentoContaCorrenteCliente() {
        return dateLancamentoContaCorrenteCliente;
    }

    @JsonProperty("dateLancamentoContaCorrenteCliente")
    public void setDateLancamentoContaCorrenteCliente(Long dateLancamentoContaCorrenteCliente) {
        this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
    }

    public ListaControleLancamento withDateLancamentoContaCorrenteCliente(Long dateLancamentoContaCorrenteCliente) {
        this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
        return this;
    }

    @JsonProperty("dateEfetivaLancamento")
    public Long getDateEfetivaLancamento() {
        return dateEfetivaLancamento;
    }

    @JsonProperty("dateEfetivaLancamento")
    public void setDateEfetivaLancamento(Long dateEfetivaLancamento) {
        this.dateEfetivaLancamento = dateEfetivaLancamento;
    }

    public ListaControleLancamento withDateEfetivaLancamento(Long dateEfetivaLancamento) {
        this.dateEfetivaLancamento = dateEfetivaLancamento;
        return this;
    }

}

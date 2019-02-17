
package br.com.cielo.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalControleLancamento",
    "listaControleLancamento",
    "indice",
    "tamanhoPagina",
    "totalElements"
})
public class LancamentoContaLegado {

    @JsonProperty("totalControleLancamento")
    private TotalControleLancamento totalControleLancamento;
    
    @JsonProperty("listaControleLancamento")
    private List<ListaControleLancamento> listaControleLancamento = null;
    
    @JsonProperty("indice")
    private Long indice;
    
    @JsonProperty("tamanhoPagina")
    private Long tamanhoPagina;
    
    @JsonProperty("totalElements")
    private Long totalElements;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LancamentoContaLegado() {
    }

    /**
     * 
     * @param listaControleLancamento
     * @param totalControleLancamento
     * @param totalElements
     * @param indice
     * @param tamanhoPagina
     */
    public LancamentoContaLegado(TotalControleLancamento totalControleLancamento, List<ListaControleLancamento> listaControleLancamento, Long indice, Long tamanhoPagina, Long totalElements) {
        super();
        this.totalControleLancamento = totalControleLancamento;
        this.listaControleLancamento = listaControleLancamento;
        this.indice = indice;
        this.tamanhoPagina = tamanhoPagina;
        this.totalElements = totalElements;
    }

    @JsonProperty("totalControleLancamento")
    public TotalControleLancamento getTotalControleLancamento() {
        return totalControleLancamento;
    }

    @JsonProperty("totalControleLancamento")
    public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
        this.totalControleLancamento = totalControleLancamento;
    }

    public LancamentoContaLegado withTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
        this.totalControleLancamento = totalControleLancamento;
        return this;
    }

    @JsonProperty("listaControleLancamento")
    public List<ListaControleLancamento> getListaControleLancamento() {
        return listaControleLancamento;
    }

    @JsonProperty("listaControleLancamento")
    public void setListaControleLancamento(List<ListaControleLancamento> listaControleLancamento) {
        this.listaControleLancamento = listaControleLancamento;
    }

    public LancamentoContaLegado withListaControleLancamento(List<ListaControleLancamento> listaControleLancamento) {
        this.listaControleLancamento = listaControleLancamento;
        return this;
    }

    @JsonProperty("indice")
    public Long getIndice() {
        return indice;
    }

    @JsonProperty("indice")
    public void setIndice(Long indice) {
        this.indice = indice;
    }

    public LancamentoContaLegado withIndice(Long indice) {
        this.indice = indice;
        return this;
    }

    @JsonProperty("tamanhoPagina")
    public Long getTamanhoPagina() {
        return tamanhoPagina;
    }

    @JsonProperty("tamanhoPagina")
    public void setTamanhoPagina(Long tamanhoPagina) {
        this.tamanhoPagina = tamanhoPagina;
    }

    public LancamentoContaLegado withTamanhoPagina(Long tamanhoPagina) {
        this.tamanhoPagina = tamanhoPagina;
        return this;
    }

    @JsonProperty("totalElements")
    public Long getTotalElements() {
        return totalElements;
    }

    @JsonProperty("totalElements")
    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }

    public LancamentoContaLegado withTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }

}

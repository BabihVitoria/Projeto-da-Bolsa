package com.example.algamoney.api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.algamoney.api.model.TipoLancamento;

public class LancamentoEstatisticaDia {
	private TipoLancamento tipo;
	private LocalDate data;
	private BigDecimal total;
	
	public LancamentoEstatisticaDia(TipoLancamento tipo, LocalDate data, BigDecimal total) {
		this.tipo = tipo;
		this.data = data;
		this.total = total;
	}
	
	public TipoLancamento getTipo() {
		return tipo;
	}
	public void setTipo(TipoLancamento tipo) {
		this.tipo = tipo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	
}

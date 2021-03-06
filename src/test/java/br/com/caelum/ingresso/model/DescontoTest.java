package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

public class DescontoTest {

	@Test
	public void naoDeveConcederDescontoParaIngressoNormal() {
		Sala sala = new Sala("Eldorado - IMax", new BigDecimal("22.50"));
		Lugar lugar = new Lugar("A", 1);
		Filme filme = new Filme("Rogue One", Duration.ofMinutes(120), "SCI-FI", new BigDecimal("12.00"));
		Sessao sessao = new Sessao(LocalTime.parse("10:00:00"), filme, sala);
		Ingresso ingresso = new Ingresso(sessao, TipoDeIngresso.INTEIRO, lugar);

		BigDecimal precoEsperado = new BigDecimal("34.50");
		Assert.assertEquals(precoEsperado, ingresso.getPreco());
	}

	@Test
	public void deveConcederDescontoParaEstudante() {
		Sala sala = new Sala("Eldorado - IMax", new BigDecimal("22.50"));
		Lugar lugar = new Lugar("A", 1);
		Filme filme = new Filme("Rogue One", Duration.ofMinutes(120), "SCI-FI", new BigDecimal("12.00"));
		Sessao sessao = new Sessao(LocalTime.parse("10:00:00"), filme, sala);
		Ingresso ingresso = new Ingresso(sessao, TipoDeIngresso.ESTUDANTE, lugar);

		BigDecimal precoEsperado = new BigDecimal("17.25");
		Assert.assertEquals(precoEsperado, ingresso.getPreco());
	}
}

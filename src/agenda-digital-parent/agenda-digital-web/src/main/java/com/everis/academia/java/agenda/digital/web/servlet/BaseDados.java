package com.everis.academia.java.agenda.digital.web.servlet;

import java.util.ArrayList;
import java.util.List;

import com.everis.academia.java.agenda.digital.entity.Cidade;

public class BaseDados {

	public static List<Cidade> cidades = new ArrayList<>();

	// metodo read
	public static List<Cidade> read() {
		return cidades;
	}

	// metodo delete
	public static void delete(Cidade cidade) {
		cidades.remove(cidade);

	}

	// metodo update
	public static void update(short id) {

	}
}

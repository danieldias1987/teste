package com.everis.academia.java.agenda.digital.web.jsf.cidade.maneged.bean;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.everis.academia.java.agenda.digital.entity.Cidade;

@FacesConverter(value = "CidadeConverter", forClass = Cidade.class)
public class CidadeConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		// TODO Auto-generated method stub

		Cidade cidade = null;

		if (value != null && !value.trim().isEmpty()) {

			cidade = new Cidade(Integer.valueOf(value.trim()));
		}

		return cidade;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		// TODO Auto-generated method stub

		if (value instanceof Cidade) {

			return String.valueOf(((Cidade) value).getCodigo());

		}
		return (String) value;
	}

}

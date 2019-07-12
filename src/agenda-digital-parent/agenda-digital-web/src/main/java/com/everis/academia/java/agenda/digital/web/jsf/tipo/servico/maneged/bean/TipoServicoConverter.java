package com.everis.academia.java.agenda.digital.web.jsf.tipo.servico.maneged.bean;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.everis.academia.java.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.entity.TipoServico;

@FacesConverter(value = "TipoServicoConverter", forClass = TipoServico.class)
public class TipoServicoConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		// TODO Auto-generated method stub
		
		TipoServico tipoServico = null;
		
		if(value !=null && !value.trim().isEmpty()) {
			
			tipoServico = new TipoServico(Short.valueOf(value.trim()));
		}
		return tipoServico;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		// TODO Auto-generated method stub
		
		if(value instanceof TipoServico) {
			return String.valueOf(((TipoServico) value).getCodigo());
		}
		return (String) value;
	}

}

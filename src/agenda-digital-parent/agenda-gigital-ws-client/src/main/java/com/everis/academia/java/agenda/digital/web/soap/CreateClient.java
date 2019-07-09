package com.everis.academia.java.agenda.digital.web.soap;

import java.net.MalformedURLException;
import java.net.URL;

import com.everis.academia.java.agenda.digital.web.soap.generated.BusinessException_Exception;
import com.everis.academia.java.agenda.digital.web.soap.generated.Cidade;
import com.everis.academia.java.agenda.digital.web.soap.generated.CidadeSOAP;
import com.everis.academia.java.agenda.digital.web.soap.generated.CidadeSOAPService;

public class CreateClient {

	public static void main(String[] args) throws MalformedURLException, BusinessException_Exception {

		URL url = new URL("http://localhost:8080/agenda-digital-web/soap/ClienteSOAP?wsdl");

		CidadeSOAPService service = new CidadeSOAPService(url);
		CidadeSOAP port = service.getCidadeSOAPPort();

		for (Cidade cidade : port.read()) {
			System.out.println(cidade.getNome());
		}

//		for (Cidade cidade : port.create(cidade)) {
//			System.out.println(cidade.setNome(cidade));
//		}
//
//		for (Cidade cidade : port.update(cidade)) {
//			System.out.println(cidade.getNome());
//		}
//		for (Cidade cidade : port.delete(cidade)) {
//			System.out.println(cidade.getCodigo());
//		}
	}
}

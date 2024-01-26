package com.treinamento.aws.treinamentoawsaulasqs.controller.model.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.treinamento.aws.treinamentoawsaulasqs.service.GerenciardorArquivoService;

@RestController
public class GerenciadorArquivoController {

	@Autowired
	private GerenciardorArquivoService service;
	
	@PostMapping("/gerenciarArquivo")
	public void gerenciarArquivo(@RequestBody ArquivoRequest arquivo) {
		 service.enviar(arquivo);
		
	}
	
}

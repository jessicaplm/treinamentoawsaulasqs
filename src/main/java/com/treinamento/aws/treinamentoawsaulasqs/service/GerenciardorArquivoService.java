package com.treinamento.aws.treinamentoawsaulasqs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.treinamento.aws.treinamentoawsaulasqs.controller.model.request.ArquivoRequest;

@Component
public class GerenciardorArquivoService {

	@Value("${app.sqs.topic}")
	private String topicName;
	
	@Autowired
	private QueueMessagingTemplate template;
	
	public void enviar(ArquivoRequest arquivo) {
		
		template.convertAndSend(topicName, arquivo);
		System.out.println("Mensagem enviada para o topico sqs-controle-arquivo-treinamento");
	}
	
}

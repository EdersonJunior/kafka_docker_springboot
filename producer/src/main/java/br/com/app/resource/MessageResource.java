package br.com.app.resource;

import br.com.app.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensagem")
public class MessageResource {

    @Autowired
    MessageService messageService;

    @PostMapping
    public ResponseEntity<String> enviarMensagem(@RequestBody String mensagem){
        messageService.sendMessage(mensagem);
        return ResponseEntity.ok().body("Mensagem enviada com sucesso: " + mensagem);
    }
}
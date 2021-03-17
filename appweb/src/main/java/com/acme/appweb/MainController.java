package com.acme.appweb;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {


    //Post envia e salva dados
    @PostMapping ("/salvar")
    public String salvar(@RequestBody String nome){
        return "Ola, " + nome;
    }
    // atualiza
    @PutMapping ("/atualizar")
    public String atualizar(){
        return "Atualizando ";
    }
    // apaga
    @DeleteMapping("/apagar/{id}")
    public String apagar(@PathVariable("id")String id){
        return "Arquivo " + id + " Excluido ";
    }

    //@Pathvariable - recebe da url
    // @RequestBody - recebe do corpo
    // fazendo a requisição na url e no corpo do texto
    @PutMapping ("/atualizar/{cod}")
    public String atualizarPessoa(@PathVariable("cod")String cod,@RequestBody String nome){
        return"Atualizando o codigo " + cod + " com o nome " + nome;
    }


}

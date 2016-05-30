package br.csi.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClienteControler {
	
	//vem do form na jsp pelo CLIENTES
	@RequestMapping("clientes")
	public String msgTeste(){
		System.out.println("CHAMOU O CLIENTE---CONTROLADOR--------------");
		return "cliente";
	}	
}

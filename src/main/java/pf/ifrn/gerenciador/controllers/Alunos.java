package pf.ifrn.gerenciador.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Alunos {
	@RequestMapping("/alunos/form")
	public String form() {
		return "form-aluno";
	}
	
	@PostMapping("/alunos")
	public String cadastrado() {
		return "aluno-cadastrado";
	}
}

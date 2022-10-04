package com.letscode.alunos;

import com.letscode.alunos.repository.AlunoRepository;
import com.letscode.alunos.service.AlunoService;
import com.letscode.alunos.service.AlunoServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlunosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlunosApplication.class, args);

	}

}

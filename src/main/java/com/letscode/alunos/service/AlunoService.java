package com.letscode.alunos.service;

import com.letscode.alunos.entity.Aluno;

import java.util.List;

public interface AlunoService {
    Aluno salvar(Aluno aluno);
    Aluno buscaPorId(Long id) throws Exception;
    List<Aluno> buscaTodos();
    Aluno alterarAluno(Long id, String nome) throws Exception;
    String delete(Long id) throws Exception;

    List<Aluno> buscaPorNome(String nome);

    List<Aluno> buscaPorIdade(Long idade) throws Exception;

    List<Aluno> filter(String nome, Long idade, String documento);
}

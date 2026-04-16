package com.senai.backend.artemis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.senai.backend.artemis.Models.Aluno;
import com.senai.backend.artemis.Models.Turma;
import com.senai.backend.artemis.Repositories.AlunoRepository;
import com.senai.backend.artemis.Repositories.TurmaRepository;

@Service
public class AlunoService {

  @Autowired
  private AlunoRepository alunoRepository;

  public Long contarAlunos() {
    return alunoRepository.count();
  }

  public Aluno consultarAluno(Integer id){
        return alunoRepository.findById(id).get();
    }

  public List<AlunoRepository> listarAlunos() {
    return alunoRepository.findAll();
  }

 
   public Boolean deletarAluno(Integer id){
        if(alunoRepository.existsById(id)){
            alunoRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public Usuario cadastrarAluno(Aluno aluno ){
        return alunoRepository.save(aluno);
    }
    public Aluno atualizarAluno(Integer id, Aluno aluno){
        Aluno alunoRecuperado = buscarAluno(id);
        if (alunoRecuperado !=null){
            alunoRecuperado.setId(id);
          if (aluno.getNome() != null){
                alunoRecuperado.setNome(aluno.getNome());
            }
            if(aluno.getEmail()!= null){
                        alunoRecuperado.setEmail
                            (aluno.getEmail());
                    }
                    return alunoRepository.save(alunoRecuperado);

        }
        return null;

    }

}

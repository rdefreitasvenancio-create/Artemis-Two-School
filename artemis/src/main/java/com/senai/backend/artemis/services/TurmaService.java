package com.senai.backend.artemis.services;

import com.senai.backend.artemis.Models.Turma;
import com.senai.backend.artemis.Repositories.AlunoRepository;
import com.senai.backend.artemis.Repositories.TurmaRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurmaService{
    @Autowired

    private TurmaRepository turmaRepository;
    public Long contarTurmas(){
        return turmaRepository.count();
    }
    public Turma buscarTurma(Integer id){
        return turmaRepository.findById(id).get();
    }
    public List<Turma>listarTurmas(){
        return turmaRepository.findAll();
    }
    public Boolean deletarTurma(Integer id){
        if(turmaRepository.existsById(id)){
            turmaRepository.deleteById(id);
            return true;
        }
        return false;
    }
        public Turma cadastrarTurma(Turma turma){
            return turmaRepository.save(turma);
        }
        public Turma atualizarTurma(Integer id, Turma turma){
            Turma turmaRecuperada = buscarTurma(id);
            if(turmaRecuperada !=null){
                turmaRecuperada.setId(id);
                if(turma.getNome() !=null){
                    turmaRecuperada.setNome(turma.getNome());
                }
                return turmaRepository.save(turmaRecuperada);
            }
            return null;
            
        }


}
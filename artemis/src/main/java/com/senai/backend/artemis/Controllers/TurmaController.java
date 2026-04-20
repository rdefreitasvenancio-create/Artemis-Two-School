package com.senai.backend.artemis.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.artemis.Models.Turma;
import com.senai.backend.artemis.services.TurmaService;
@RestController
@RequestMapping("/turma")
public class TurmaController {
    @Autowired
    private TurmaService turmaService;

    @GetMapping("/contar-turmas")
    public Long contarTurmas(){
        return turmaService.contarTurmas();
    }
    @GetMapping("/buscar-turmas")
    public Turma buscarTurma(@PathVariable Integer id){
        return turmaService.buscarTurma(id);
    }
    @GetMapping("/listar-turmas")
    public List<Turma> listarTurmas(){
        return turmaService.listarTurmas();
    }
    @DeleteMapping("/deletar-turmas/{id}")
    public String deletarTurma(@PathVariable Integer id){
        if(turmaService.deletarTurma(id)){
            return "Turma excluída com sucesso";
        }
        return "Falha ao excluir Turma";
    }
    @PostMapping("/salvar-turmas")
    public Turma cadastrarTurma(@RequestBody Turma turma){
        return turmaService.cadastrarTurma(turma);
    }
    @PutMapping("/atualizar-turmas/{id}")
    public String atualizarTurma(@PathVariable Integer id, @RequestBody Turma turma){
        if(turmaService.atualizarTurma(id, turma) !=null){
            return "Turma atualizada com sucesso";
        }
        return "Falha ao atualizar turma";
    }
}

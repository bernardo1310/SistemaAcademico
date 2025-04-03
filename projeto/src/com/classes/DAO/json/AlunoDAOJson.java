package com.classes.DAO.json;

import com.classes.DTO.Aluno;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.thoughtworks.xstream.io.binary.Token;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAOJson {
    private static final String FILE_PATH = "alunos.json";
    private List<Aluno> alunos;
    private Gson gson;

    public AlunoDAOJson() {
        gson = new Gson();
        alunos = carregarAlunos();
    }

    private List<Aluno> carregarAlunos() {
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Type listType = new Token<ArrayList<Aluno>>() {}.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            return new ArrayList<>(); // Retorna uma lista vazia se o arquivo não existir
        }
    }

    private void salvarAlunos() {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(alunos, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean inserir(Aluno aluno) {
        alunos.add(aluno);
        salvarAlunos();
        return true;
    }

    public List<Aluno> listarTodos() {
        return alunos;
    }
}

package com.classes.DAO;

import com.classes.DTO.Aluno;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAOXml {
    private static final String FILE_NAME = "alunos.xml";
    private List<Aluno> alunos;
    private XStream xstream;

    public AlunoDAOXml() {
        xstream = new XStream(new DomDriver());
        xstream.alias("aluno", Aluno.class);
        alunos = carregarAlunos();
    }

    public boolean inserir(Aluno aluno) {
        alunos.add(aluno);
        salvarAlunos();
        return true;
    }

    public List<Aluno> listarTodos() {
        return alunos;
    }

    private void salvarAlunos() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            xstream.toXML(alunos, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Aluno> carregarAlunos() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return new ArrayList<>();

        try (FileReader reader = new FileReader(file)) {
            return (List<Aluno>) xstream.fromXML(reader);
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}

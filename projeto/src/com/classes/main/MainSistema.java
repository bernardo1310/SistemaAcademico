package com.classes.main;

import java.util.Scanner;
import com.classes.DAO.AlunoDAO;
import com.classes.DAO.AlunoDAOJson;
import com.classes.DAO.AlunoDAOXml;
import com.classes.DTO.Aluno;

public class MainSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlunoDAO alunoDAO = null;
        
        System.out.println("Escolha o tipo de persistência:");
        System.out.println("1 - MySQL");
        System.out.println("2 - JSON");
        System.out.println("3 - XML");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha
        
        switch (escolha) {
            case 1:
                alunoDAO = new AlunoDAO();
                break;
            case 2:
                alunoDAO = new AlunoDAOJson();
                break;
            case 3:
                alunoDAO = new AlunoDAOXml();
                break;
            default:
                System.out.println("Opção inválida. Saindo...");
                System.exit(0);
        }
        
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nome = scanner.nextLine();
                    Aluno aluno = new Aluno();
                    aluno.setNome(nome);
                    alunoDAO.inserir(aluno);
                    System.out.println("Aluno cadastrado!");
                    break;
                case 2:
                    System.out.println("Lista de Alunos:");
                    for (Aluno a : alunoDAO.listarTodos()) {
                        System.out.println(a.getNome());
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
        
        scanner.close();
    }
}

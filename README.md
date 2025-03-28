![ModeloPlantUML_SistemaAcademico](https://github.com/user-attachments/assets/858dd869-d37d-43b5-b29a-7a0584fb9b64)
Codigo UML: 
@startuml

class Curso {
    +String nome
    -int codigo
}

class Aluno {
    +String nome
    -int matricula
    -boolean status
}

class Professor {
    +String nome
    -int codigo
}

class Fase {
    -int codigo
}

class Disciplina {
    +String nome
    -int codigo
    -String descricao
}

class Turma {
    -int codigo
    -int quantidade
}

class Aula {
    -int codigo
    -int quantidade
}

class Frequencia {
    -int codigo
    -boolean presente
}

class Avaliacao {
    -int codigo
    -double nota
}

Curso "1" *-- "*" Fase
Fase "1" *-- "*" Disciplina
Disciplina "1" --o "1..4" Professor
Disciplina "1" *-- "*" Turma
Turma "1" *-- "*" Aluno
Turma "1" *-- "*" Aula
Aula "1" *-- "*" Frequencia
Frequencia "1" *-- "1" Professor : "Registra"
Avaliacao "1" *-- "1" Professor : "Registra"
Avaliacao "1" *-- "1" Aluno
Aluno "*" -- "*" Disciplina : "Cursa"

@enduml


PlantUML

@startuml

Class curso{
    +String nome
    -int codigo
}

Class aluno{
    -String nome
    -int matricula
    -boolean status
}

Class professor{
    +String nome
    -int codigo
}

Class fase{
    -int codigo
}

Class disciplina{
    +String nome
    -int codigo
    -String professor
}

Class turma{
    -int codigo
}

Class aula{
    +String disciplina
    -int codigo
}

Class listTurma{
    #codigoTurma codigo
    #matriculaAluno matricula
}

Class listAula{
    #cogidoTurma codigo
    #disciplinaAula disciplina
}

curso "1" *-- "*" fase
turma "1" *-- "*" listTurma
listTurma "*" *-- "1" aluno
turma "*" *-- "1" listAula
listAula "*" *-- "1" aula
fase "*" *-- "1" disciplina




@enduml

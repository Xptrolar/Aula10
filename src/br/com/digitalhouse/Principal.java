package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    private static final Aluno Vinicius = ;

    public static void main(String[] args){
        Curso cursoAndroid = new Curso ("Mobile Android - muito massa");
        Curso fullstatic = new Curso ("Web fullstatic - muito massa tbm");

        Aluno vini = new Aluno (123, "Vinicius", "Oliveira", cursoAndroid);
        Aluno jessica = new Aluno ( 321, "Jessica" ,  "Milena", fullstatic);
        Aluno hendy = new Aluno (456, "Hendy", "Almeida", cursoAndroid);
        Aluno ana = new Aluno ( 654, "Ana", "Pereira", cursoAndroid);

        List<Aluno>alunos =  new ArrayList<>();
        alunos.add(vini);
        alunos.add(jessica);
        alunos.add(hendy);
        alunos.add(ana);

        System.out.println(
               // vini.equals(jessica)
                
                alunos.contains(Vinicius)
        );


    }
}

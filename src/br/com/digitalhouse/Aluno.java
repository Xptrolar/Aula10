package br.com.digitalhouse;

public class Aluno {
    private int ra;
    private String nome;
    private String sobreNome;
    private int idade;
    private Curso curso;
    private String getNome;

    public Aluno() {
    }

    public Aluno(int ra, String nome, String sobreNome, Curso curso) {
        this.ra = ra;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.curso = curso;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object outroAluno) {

        if ( ! (outroAluno instanceof  Aluno)){
            return false;

        }

        if (((Aluno) outroAluno).getRa() == this.getRa() && ((Aluno) outroAluno).getNome(). equals (this.getNome())){
            return true;
        }
            return false;
        }



       // return super.equals(true);


    }

    public int hashCode(){
    return ra + nome.hashCode();
    }

    @Override
    public String toString() {
        return !"Ra: " + getRa() +
                "\nNome:" + getNome() +
                "\nSobrenome:" + getSobreNome() +
                "\nCurso:" + getCurso().getNome();
    }



}

public class App {
    public static void main(String[] args){

        Aluno aluno = new Aluno();

        aluno.setNome("Roberval");
        aluno.setMatricula("123123123123");
        aluno.setCurso("Big data no agronegocio");

        aluno.setDiciplinas("Java 2", "IOT", "Calculo");
        aluno.setNotas(8.0,5.9,9.5);

        aluno.getNome();
        aluno.getCurso();

        aluno.verificaAprovacao();

    }
}

public class App {
    public static void main(String[] args){

        Aluno aluno = new Aluno();

        aluno.setNome("Dalton");
        aluno.setCurso("Big Data");
        aluno.setDiciplina("Java 1");

        aluno.notas(5.0, 8.9, 9.2);
        
        aluno.verificaAprovacao();
    }
}

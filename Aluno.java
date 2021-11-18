public class Aluno{

    private String nome;
    private String matricula;
    private String curso;
    private String diciplina;
    private double nota1;
    private double nota2;
    private double nota3;
    

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return this.curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setDiciplina(String diciplina){
        this.diciplina = diciplina;
    }

    public String getDiciplina(){
        return this.diciplina;
    }
    
    public void notas(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    
    public void verificaAprovacao(){

        double media = (this.nota1 + this.nota2 + this.nota3)/3.0;

        if(media < 7){
            System.out.println("Reprovado na diciplina de " + this.diciplina);
        }else{
            System.out.println("Aprovado na diciplina de " + this.diciplina);
        }
        

    }
     

}
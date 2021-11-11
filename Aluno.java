public class Aluno{

    private String nome;
    private String matricula;
    private String curso;
    private String diciplina1;
    private String diciplina2;
    private String diciplina3;
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

    public void setDiciplinas(String diciplina1, String diciplina2, String diciplina3) {
        this.diciplina1 = diciplina1;
        this.diciplina2 = diciplina2;
        this.diciplina3 = diciplina3;
    }
    public String getDiciplina1() {
        return diciplina1;
    }
    public void setDiciplina1(String diciplina1) {
        this.diciplina1 = diciplina1;
    }
    public String getDiciplina2() {
        return diciplina2;
    }
    public void setDiciplina2(String diciplina2) {
        this.diciplina2 = diciplina2;
    }
    public String getDiciplina3() {
        return diciplina3;
    }
    public void setDiciplina3(String diciplina3) {
        this.diciplina3 = diciplina3;
    }
    
    public void setNotas(double nota1, double nota2, double nota3) {
        
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


        if(this.nota1 >= 7){
            System.out.println("Aprovado na de " + this.diciplina1);
        }else{
            System.out.println("Reprovado na diciplina de " + this.diciplina1);
        }


        if(this.nota2 >= 7){
            System.out.println("Aprovado na diciplina de " + this.diciplina2);
        }else{
            System.out.println("Reprovado na diciplina de " + this.diciplina2);
        }



        if(this.nota3 >= 7){
            System.out.println("Aprovado na dicipina de " + this.diciplina3);
        }else{
            System.out.println("Reprovado na diciplina de " + this.diciplina3);
        }


    }
    
    

}
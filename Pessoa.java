public class Pessoa {
    private int id;
    private String nome;

    Pessoa(int id,String nome){
        this.nome = nome;
        this.id = id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int GetId(){
        return this.id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome.toString();
    }
}

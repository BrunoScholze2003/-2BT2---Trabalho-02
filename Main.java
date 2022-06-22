public class Main {
    
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa(1,"Bruno"); 
        Pessoa pessoa2 = new Pessoa(24,"Pedralhos");   
        PessoaDAO pessoaDAO = new PessoaDAO();

        pessoaDAO.addPessoa(pessoa);
        pessoaDAO.addPessoa(pessoa2);
        System.out.println(pessoaDAO.getAll());
        pessoaDAO.deletePessoa(pessoa2);
        System.out.println(pessoaDAO.getAll());

        

    }
}

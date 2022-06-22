import java.util.List;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class PessoaDAO {
    HashMap<Integer, Pessoa> pessoas = new HashMap<Integer,Pessoa>();

    public Pessoa getById(int id){
        return pessoas.get(id);
    }

    public List<Pessoa> getAll(){
        ArrayList<Pessoa>lista = new ArrayList<>();
        lista.addAll(pessoas.values());
        return lista;
    }

    public void addPessoa(Pessoa pessoa){
        pessoas.put(pessoa.GetId(), pessoa);
    }

    public void deletePessoa(Pessoa pessoa){
        pessoas.remove(pessoa.GetId());
    }
}

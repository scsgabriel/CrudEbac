package dao;

import domain.Cliente;

import java.util.Collection;
import java.util.Map;

public class ClienteMapDAO implements IClienteDAO {

    private Map<Long, Cliente> map;     

    @Override
    public Boolean cadastrar(Cliente cliente) {
        return null;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }

    @Override
    public Cliente consultar(Long cpf) {
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
}

package one.digitalinovation.gof.service;

import one.digitalinovation.gof.model.Cliente;
import org.springframework.stereotype.Service;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com isso,
 * se necessário, podemos ter míltiplas implementações dessa mesma interface
 *
 * @author Aranjhonn
 */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}

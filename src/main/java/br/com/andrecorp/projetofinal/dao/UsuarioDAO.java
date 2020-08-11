package br.com.andrecorp.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.andrecorp.projetofinal.model.Usuario;

/* apenas o fato de eu fazer este extends a interface já me "presenteia" com uma serie de metodos pré-fabricados, dentre eles: 
 *  
 *  save           - para gravar / Atualizar Objetos
 *  deleteById(id) - para excluir objetos
 *  findById(id)   - para encontrar um determinado objeto pelo seu ID
 *  findAll        - para retornar TODOS os objetos da tabela
 *  count          - para saber quantos registros tem na base
*/

public interface UsuarioDAO extends CrudRepository <Usuario, Integer>{
	public Usuario findByEmailAndSenha(String email, String senha);
	public Usuario findByEmail(String email);	

}

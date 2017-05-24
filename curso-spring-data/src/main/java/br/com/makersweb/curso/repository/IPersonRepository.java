/**
 * 
 */
package br.com.makersweb.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.makersweb.curso.entity.Person;

/**
 *
 * @author anderson.aristides
 *
 */
public interface IPersonRepository extends JpaRepository<Person, Long> {

}

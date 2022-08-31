/**
 * 
 */
package com.nagarro.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.library.model.Book;

/**
 * @author mohammedmaaz
 *
 */
@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}

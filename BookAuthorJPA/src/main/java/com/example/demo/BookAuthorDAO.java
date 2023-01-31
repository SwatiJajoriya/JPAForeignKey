package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookAuthorDAO {
	
@Autowired	
BookRepo repo;
@Autowired	
AuthorRepo arepo;
	public Book updateByName(Book b) {
		Book book=repo.findById(b.getId()).orElse(null);

		book.setBname(b.getBname());
	
	    return	repo.save(book);

}
	
	public Author updateAuthorName(Author a) {
		Author aa=arepo.findById(a.getId()).orElse(null);

		aa.setAname(a.getAname());
	
	    return	arepo.save(aa);

}
}
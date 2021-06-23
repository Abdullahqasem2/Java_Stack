package com.AXOS.Book.services;

import org.springframework.stereotype.Service;

import com.AXOS.Book.models.Book;
import com.AXOS.Book.repositories.BookRepository;


@Service
public class BookService {
	// adding the book repository as a dependency
	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	// returns all the books
	public Iterable<Book> allBooks() {
		return bookRepository.findAll();
	}

	// creates a book
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}

	// retrieves a book
	public Book findBook(Long id) {
		java.util.Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	public Book updateBook(Long id,String title, String desc, String lang, int pages) {
		if(findBook(id)!=null) {
			Book asd = findBook(id);
			asd.setTitle(title);
			asd.setLanguage(desc);
			asd.setDescription(lang);
			asd.setNumberOfPages(pages);
			return asd;
		}
		return null;
	}
	public Book deleteBook(Long id) {
		bookRepository.deleteById(id);
		return null;
	}
}
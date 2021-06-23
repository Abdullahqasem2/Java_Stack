package com.AXOS.Book.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.AXOS.Book.models.Book;
import com.AXOS.Book.services.BookService;

@Controller
public class BooksController {
	private final BookService bookService;

	public BooksController(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping("/books")
	public String index(Model model) {
		Iterable<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return "index.jsp";
	}

	@RequestMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "new.jsp";
	}

	@RequestMapping(value="/books", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "new.jsp";
        } else {
            bookService.createBook(book);
            return "redirect:/books";
        }
    }
	@RequestMapping("/delete/{id}")
	public String deleteBook(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
		return "redirect:/books";
	}
}

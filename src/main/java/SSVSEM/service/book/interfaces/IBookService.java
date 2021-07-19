package SSVSEM.service.book.interfaces;

import SSVSEM.model.Book;

import java.util.List;

/*
  @author   Mariia Naduieva
  @project   course-project
  @class  IBookService
  @version  1.0.0 
  @since 19.07.2021 - 18.26
*/
public interface IBookService {
    Book create(Book book);
    Book get(String id);
    Book update(Book book);
    Book delete(String id);
    List<Book> getAll();
}

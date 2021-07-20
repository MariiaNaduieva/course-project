package SSVSEM.service.book.impls;

import SSVSEM.model.Book;
import SSVSEM.repository.FakeBookRepository;
import SSVSEM.service.book.interfaces.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
  @author   Mariia Naduieva
  @project   course-project
  @class  BookServiceImpl
  @version  1.0.0 
  @since 19.07.2021 - 18.25
*/
@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    FakeBookRepository repository;

    @Override
    public Book create(Book book) {
        return repository.create(book);
    }

    @Override
    public Book get(String id) {
        return repository.get(id);
    }

    @Override
    public Book update(Book book) {
        return repository.update(book);
    }

    @Override
    public Book delete(String id) {
        return repository.delete(id);
    }

    @Override
    public List<Book> getAll() {
        return repository.getAll();
    }
}

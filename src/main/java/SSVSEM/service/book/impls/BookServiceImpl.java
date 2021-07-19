package SSVSEM.service.book.impls;

import SSVSEM.model.Book;
import SSVSEM.service.book.interfaces.IBookService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
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
    private LocalDateTime time = LocalDateTime.now();
    private List<Book> list = new ArrayList<>(
            Arrays.asList(
                    new Book("0", "title0", "author0", "genre0", 0, 0, "desc0", time, time),
                    new Book("1", "title1", "author1", "genre1", 1, 1, "desc1", time, time),
                    new Book("2", "title2", "author2", "genre2", 2, 2, "desc2", time, time),
                    new Book("3", "title3", "author3", "genre3", 3, 3, "desc3", time, time)
            )
    );


    @Override
    public Book create(Book book) {
        return null;
    }

    @Override
    public Book get(String id) {
        Book book = list.stream().filter(el -> el.getId().equals(id))
                .findAny().get();
        return book;
    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public Book delete(String id) {
        return null;
    }


    @Override
    public List<Book> getAll() {
        return list;
    }
}

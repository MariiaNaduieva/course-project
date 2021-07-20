package SSVSEM.controller.rest;

import SSVSEM.model.Book;
import SSVSEM.service.book.impls.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
  @author   Mariia Naduieva
  @project   course-project
  @class  BookRestController
  @version  1.0.0 
  @since 19.07.2021 - 18.22
*/

@RestController
@RequestMapping("/api/book")
public class BookRestController {
    @Autowired
    BookServiceImpl service;

    @RequestMapping("/all")
    public List<Book> getAll(){
        return service.getAll();
    }

    @RequestMapping("/{id}")
    public Book get(@PathVariable("id")String id){
        return service.get(id);
    }

    @RequestMapping("/delete/{id}")
    public Book delete(@PathVariable("id")String id){
        return service.delete(id);
    }

    @PostMapping("/create")
    public Book create(@RequestBody Book book){
        return service.create(book);
    }

    @PostMapping("/update")
    public Book update(@RequestBody Book book){
        return service.update(book);
    }

}

package com.wd.controller;

import com.wd.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    @GetMapping("/books")
    public ModelAndView books() {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book();
        book1.setId(1);
        book1.setAuthor("张三");
        book1.setName("Java核心卷一");
        Book book2 = new Book();
        book2.setId(2);
        book2.setAuthor("李四");
        book2.setName("深入理解Java虚拟机");
        books.add(book1);
        books.add(book2);
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books);
        mv.setViewName("books");
        return mv;
    }

}

package org.example.service.impl;

import org.example.controller.Code;
import org.example.dao.BookDao;
import org.example.domain.Book;
import org.example.exception.BusinessException;
import org.example.exception.SystemException;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    public Book getById(Integer id) {
//        // 模拟业务异常
//        if (id == 1) {
//            throw new BusinessException(Code.BUSINESS_ERR, "请根据规范输入！");
//        }

//        // 模拟系统异常
//        try {
//            int i = 1/0;
//        } catch (Exception e) {
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR, "服务器访问超时，请重试！", e);
//        }

          // 模拟其他异常
//        int i = 1/0;

        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
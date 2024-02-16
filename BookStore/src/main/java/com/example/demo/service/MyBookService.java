package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MyBookList;
import com.example.demo.repository.MyBookRepository;

@Service
public class MyBookService {
	
	@Autowired
	private MyBookRepository mrepo;
	
	public void saveMyBooks(MyBookList book) {
		mrepo.save(book);
	}
	
	public List<MyBookList> getAllMyBooks(){
		return mrepo.findAll();
	}
	
	public void deleteById(int id) {
		mrepo.deleteById(id);
	}
}

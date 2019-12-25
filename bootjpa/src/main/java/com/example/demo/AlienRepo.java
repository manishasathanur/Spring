package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import antlr.collections.List;;
public interface AlienRepo extends JpaRepository<Alien,Integer>{
	//@Query("from alien where tech=?1 order by aname")
	List findByTech(String tech);
}

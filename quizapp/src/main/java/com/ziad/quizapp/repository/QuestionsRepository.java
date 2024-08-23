package com.ziad.quizapp.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ziad.quizapp.moudle.Quiz;

@Repository
public interface QuestionsRepository extends JpaRepository<Quiz, Integer>{

	
	
	//@Query("select q from Quiz q where q.category = :keyword")
	List<Quiz> getByCategory(String category);

	
}

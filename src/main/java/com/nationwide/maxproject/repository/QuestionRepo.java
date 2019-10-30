package com.nationwide.maxproject.repository;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nationwide.maxproject.entity.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, String> {

	public ArrayList<Question> findAll();

	public Question findById(int id);

	public ArrayList<Question> findByUsername(String username);

}
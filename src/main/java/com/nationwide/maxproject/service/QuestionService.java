package com.nationwide.maxproject.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nationwide.maxproject.entity.Question;
import com.nationwide.maxproject.repository.QuestionRepo;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepo repo;

	public ArrayList<Question> showAllQuestions() {
		return repo.findAll();
	}

	public String deleteById(int id) {
		Question q = repo.findById(id);
		repo.delete(q);
		return "Question Deleted!";
	}

	public String saveQuestion(int id, String username, String question, String answer) {
		Question q = new Question(id, username, question, answer);
		repo.save(q);
		return "Question Saved!";
	}

	public String updateQuestion(int id, String username, String question, String answer) {
		Question q = repo.findById(id);
		q.setUsername(username);
		q.setQuestion(question);
		repo.save(q);
		return "Question Updated!";
	}

	public ArrayList<Question> showQuestionsByUsername(String username) {
		return repo.findByUsername(username);
	}
}
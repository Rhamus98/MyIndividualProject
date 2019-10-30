package com.nationwide.maxproject.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nationwide.maxproject.entity.Question;
import com.nationwide.maxproject.service.QuestionService;

@RestController
@CrossOrigin("*")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@GetMapping("/showAllQuestions")
	public ArrayList<Question> showAllQuestions() {
		return questionService.showAllQuestions();
	}

	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable int id) {
		return questionService.deleteById(id);
	}

	@PostMapping("/saveQuestion/{username}/{question}/{answer}")
	public String saveQuestion(@PathVariable int id, @PathVariable String username, @PathVariable String question, @PathVariable String answer) {
		return questionService.saveQuestion(id, username, question, answer);
	}

	@PutMapping("/updateQuestion/{id}/{username}/{question}/{answer}")
	public String updateQuestion(@PathVariable int id, @PathVariable String username, @PathVariable String question, @PathVariable String answer) {
		return questionService.updateQuestion(id, username, question, answer);
	}

	@GetMapping("/showQuestionByUsername/{username}")
	public ArrayList<Question> showQuestionByUsername(@PathVariable String username) {
		return questionService.showQuestionsByUsername(username);
	}

}
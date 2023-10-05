package com.example.quizapp.database;

import com.example.quizapp.model.Question;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class QuestionConfig {
    @Bean
    CommandLineRunner commandLineRunner(QuestionDao questionDao){
        return args -> {
            Question question1= new Question(
                    "What is the most easy programming language to learn for beginners?",
                    "Java","Python","C++","Go",
                    "Python","Easy","Programming"
            );
            Question question2= new Question(
                    "What is the Largest country in the world?",
                    "USA","Canada","Russia","United Arab Emirates",
                    "Russia","Easy", "Geography"
            );
            Question question3= new Question(
                    "What is the chemical symbol for gold?",
                    "Au","Ag","Fe","Cu",
                    "Au","Medium", "Science"
            );
            Question question4= new Question(
                    "In what year was the World Wide Web (WWW) created?",
                    "1985","1991","1995","2000",
                    "1991","Hard", "History"
            );

            questionDao.saveAll(List.of(question1,question2,question3,question4));
        };
    }
}

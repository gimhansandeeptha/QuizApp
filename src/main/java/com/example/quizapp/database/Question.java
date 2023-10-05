package com.example.quizapp.database;

import jakarta.persistence.*;
import lombok.Data;

@Data // No need to set getters and setters manually. code is shorter.
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id", nullable = false, updatable = false)
    private Integer id;
    @Column(name="question_title", nullable = false)
    private String questionTitle;
    @Column(name="option_1", nullable = false)
    private String option1;
    @Column(name="option_2", nullable = false)
    private String option2;
    @Column(name="option_3", nullable = false)
    private String option3;
    @Column(name="option_4",nullable = false)
    private String option4;
    @Column(name="answer",nullable = false)
    private String answer;
    @Column(name="difficultylevel", nullable=false)
    private String difficultyLevel;
    @Column(name="category",nullable = false)
    private String category;

    public Question() {
    }

    public Question(String questionTitle, String option1, String option2, String option3, String option4,
                    String answer, String difficultyLevel, String category) {
        this.questionTitle = questionTitle;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.difficultyLevel = difficultyLevel;
        this.category=category;
    }


}

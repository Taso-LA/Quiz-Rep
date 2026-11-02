/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myquiz;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz {
    private ArrayList<Question> questions;
    private int currentIndex;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        currentIndex = 0;
        score = 0;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    // For reshuffle
    public void shuffleQuestions() {
        Collections.shuffle(questions);
        currentIndex = 0; // start from beginning after shuffle
    }

    // For NEXT button
    public Question getNextQuestion() {
        if (currentIndex < questions.size() - 1) {
            currentIndex++;
        }
        return getCurrentQuestion();
    }

    // For PREVIOUS button
    public Question getPreviousQuestion() {
        if (currentIndex > 0) {
            currentIndex--;
        }
        return getCurrentQuestion();
    }

    public Question getCurrentQuestion() {
        if (questions.isEmpty()) return null;
        return questions.get(currentIndex);
    }

    public boolean hasNext() {
        return currentIndex < questions.size() - 1;
    }

    public boolean hasPrevious() {
        return currentIndex > 0;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public int getTotalQuestions() {
        return questions.size();
    }

    // For scoring
    public void checkAndAddScore(String userAnswer) {
        Question current = getCurrentQuestion();
        if (current != null && current.isCorrect(userAnswer)) {
            score++;
        }
    }

    public int getScore() {
        return score;
    }

    public void reset() {
        currentIndex = 0;
        score = 0;
    }
}
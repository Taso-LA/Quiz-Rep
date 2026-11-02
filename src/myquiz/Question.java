/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myquiz;

public class Question {
    private String questionText;
    private String questionType; // "MULTIPLE", "TRUE_FALSE", "ONE_WORD"
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctAnswer;

    // Constructor for ALL types
    public Question(String text, String type, String a, String b, String c, String d, String correct) {
        this.questionText = text;
        this.questionType = type;
        this.optionA = a;
        this.optionB = b;
        this.optionC = c;
        this.optionD = d;
        this.correctAnswer = correct;
    }

    // Getters
    public String getQuestionText() { return questionText; }
    public String getQuestionType() { return questionType; }
    public String getOptionA() { return optionA; }
    public String getOptionB() { return optionB; }
    public String getOptionC() { return optionC; }
    public String getOptionD() { return optionD; }
    public String getCorrectAnswer() { return correctAnswer; }

    // Helper to check answer
    public boolean isCorrect(String answer) {
        return correctAnswer.equalsIgnoreCase(answer.trim());
    }
}   
    


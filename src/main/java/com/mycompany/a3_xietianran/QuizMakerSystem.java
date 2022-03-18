/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.a3_xietianran;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author tianran xie
 */
public class QuizMakerSystem {
    private static LinkedList<Question> questions=new LinkedList<Question>();
    private static LinkedList<Quiz>quizzes = new LinkedList<Quiz>();
    
    public static void addMCQuestion(String topic,String difficultyLevel,String questionText,String[] answerChoices,boolean[] correctAnswers)
    {
        Question item = new MCQuestion(topic,difficultyLevel,questionText,answerChoices,correctAnswers);
        questions.add(item);
    }
    
    public static void addTFQuestion(String topic,String difficultyLevel,String questionText,boolean correctAnswer)
    {
     
        Question item = new TFQuestion(topic,difficultyLevel,questionText,correctAnswer);  
        questions.add(item);
    }
    public static void addNAQuestion(String topic,String difficultyLevel,String questionText,double correctAnswer)
    {
        Question item = new NAQuestion(topic,difficultyLevel,questionText,correctAnswer);
        questions.add(item);
    }
    
    public static void printAllQuestions()
    {
        for(int i = 0; i <  questions.size(); i++)
        {
            System.out.println(questions.get(i).toString());
        }
    }
    public static void importQuestionsFromFile(String filename) 
    {
        Scanner input = null;
        try {
            
            File file = new File(filename);
            input = new Scanner(file);
            
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] tokens = line.split(",");
                String[] str = tokens[4].split("@");
                String[] answer=tokens[5].split("#");
                boolean[]ans = new boolean[answer.length]; 
                for (int i = 0; i < answer.length; i++)
                {
                    ans[i]= Boolean.parseBoolean(answer[i]);
                }
                if(tokens[0].equals("M")) {
                    addMCQuestion(tokens[1],tokens[2],tokens[3],str,ans);                    
                } else {
                  if(tokens[0].equals("T")){
                    addTFQuestion(tokens[1],tokens[2],tokens[3],Boolean.parseBoolean(tokens[4]));
                }else{
                    addNAQuestion(tokens[1],tokens[2],tokens[3],Double.parseDouble(tokens[4]));
                    }}
                }           
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
    
    public static void addQuiz(Quiz quiz)
    {
        quizzes.add(quiz);
    }
    
    public static Quiz searchQuiz(String quizTitle)
    {
       for (int i = 0; i < quizzes.size(); i++) {
            Quiz quiz = quizzes.get(i);
            if (quiz.getTitle().equals(quizTitle)) {
                return quiz;
            }
        }
        return null; 
    }
    
    public static String[] getQuizTitles()
    {
        String[]arr=new String[quizzes.size()];
        for (int i = 0; i < quizzes.size(); i++)
        {
            arr[i]=quizzes.get(i).getTitle();
        }
        return arr;
    }
    
    public static void printQuizQuestionsAndSolutionsToFile(String quizTitle)
    {
         for (int i = 0; i < quizzes.size(); i++)
         {
             if (quizzes.get(i).getTitle().equals(quizTitle)){
             quizzes.get(i).printQuizToFile(quizTitle);
             quizzes.get(i).printQuizSolutionToFile(quizTitle);
             }
         }
    }
    
    public static LinkedList<Question> getQuestions()
    {
        return questions;
    }
     public static LinkedList<Question> searchByPartialText(String partialText) {
        LinkedList<Question> question = new LinkedList<Question>();

        for (int i = 0; i < questions.size(); i++) {
            Question item = questions.get(i);
            if (item.getCompleteQuestionText().contains(partialText)) {
                question.add(item);
            }
        }
        return question;
    }
    public static Question searchQuestion(String topic) {
        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            if (question.getTopic().equals(topic)) {
                return question;
            }
        }
        return null;
    }
    
}

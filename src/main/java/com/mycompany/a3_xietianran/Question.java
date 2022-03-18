/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.a3_xietianran;

/**
 *
 * @author tianran xie
 */
public abstract class Question {
    private String topic;
    private String difficultyLevel;
    private String questionText;
    
    public String getTopic(){return topic;}
    
    public Question(String topic,String difficultyLevel,String questionText)
    {
        this.topic=topic;
        this.questionText = questionText;
        this.difficultyLevel = difficultyLevel;
        
    }
    public String toString()
    {
        return topic + "." + difficultyLevel + "\n"+ questionText;
        
    }
    public String getCompleteQuestionText(){return questionText;}
    public String getQuestionText(){return topic +","+questionText;}
    
    public abstract String getAnswer();
    
}

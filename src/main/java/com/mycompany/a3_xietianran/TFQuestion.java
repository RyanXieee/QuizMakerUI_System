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
public class TFQuestion extends Question{
    private boolean correctAnswer;
    
    public TFQuestion(String topic,String difficultyLevel,String questionText,boolean correctAnswer)
    {
        super(topic,difficultyLevel,questionText);
        this.correctAnswer = correctAnswer;
    }
    public String toString()
    {
        return super.toString()+ "\n"+"A. True   B. False"+"\n"+"Answer: "+ correctAnswer +"\n";
    }
    public String getCompleteQuestionText()
    {
        return super.getCompleteQuestionText()+"\n"+"A. True     B. False";
    }
    public String getAnswer(){return " "+correctAnswer;}
    
}

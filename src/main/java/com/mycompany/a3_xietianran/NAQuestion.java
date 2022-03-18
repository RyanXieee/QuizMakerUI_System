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
public class NAQuestion extends Question{
    private double correctAnswer;
    
    public NAQuestion (String topic,String difficultyLevel,String questionText,double correctAnswer)
    {
        super(topic,difficultyLevel,questionText);
        this.correctAnswer=correctAnswer;
    }
    public String toString()
    {
        return super.toString()+ "\n"+"Answer: "+ correctAnswer+"\n";
    }
    public String getCompleteQuestionText()
    {
        return super.getCompleteQuestionText();
    }
    public String getAnswer(){return " "+correctAnswer;}
    
}

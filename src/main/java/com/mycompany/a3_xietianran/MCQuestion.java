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
public class MCQuestion extends Question{
    private String[] answerChoices = new String[4];
    private boolean[] correctAnswers = new boolean[4];
    
    public MCQuestion(String topic,String difficultyLevel,String questionText,String[] answerChoices,boolean[] correctAnswers)
    {
        super(topic,difficultyLevel,questionText);
        this.answerChoices = answerChoices;
        this.correctAnswers = correctAnswers;
        
    }
    public String toString()
    {   
               
        String result="";
        
            if (correctAnswers[0]== true)
            {
                result=result+"A"+" ";
            }
            if (correctAnswers[1]== true)
            {
                result=result+"B"+" ";
            }
            if (correctAnswers[2]== true)
            {
                result=result+"C"+" ";
            }
            if (correctAnswers[3]== true)
            {
                result=result+"D"+" ";
            }
        
        String aa="";
         for(int i = 0; i< answerChoices.length;i++)
        { 
           aa = aa+answerChoices[i]+"   ";
        }
        return super.toString()+"\n"+aa+"\n"+"Answer: "+result+"\n";
        
    }
    public String getCompleteQuestionText()
    {
        String aa="";
         for(int i = 0; i< answerChoices.length;i++)
        { 
           aa =aa+ answerChoices[i]+"    ";
        }
        return super.getCompleteQuestionText()+"\n"+aa;
        
    }
    public String getAnswer()
    {
        String result="";
        
            if (correctAnswers[0]== true)
            {
                result=result+"A"+" ";
            }
            if (correctAnswers[1]== true)
            {
                result=result+"B"+" ";
            }
            if (correctAnswers[2]== true)
            {
                result=result+"C"+" ";
            }
            if (correctAnswers[3]== true)
            {
                result=result+"D"+" ";
            }
        
        return " " + result;
    }    
}

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
public class QuizItem {
    private Question question;
    private int score;
    public int getScore(){return score;}
    public Question getQuestion(){return question;}
    public QuizItem(Question question,int score){this.question=question;this.score=score;}
    
    
}

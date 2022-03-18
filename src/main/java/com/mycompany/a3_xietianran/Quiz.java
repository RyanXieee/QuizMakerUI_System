/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.a3_xietianran;
import java.util.LinkedList;
import java.io.PrintWriter;



/**
 *
 * @author tianran xie
 */
public class Quiz {
   private String title;
   private LinkedList<QuizItem>items = new LinkedList<QuizItem>();
   
   public String getTitle(){return title;}
   public LinkedList<QuizItem> getQuizItems() { return items; }
   
   public Quiz (String title){this.title=title;}
   
   public void addQuestion(Question q,int score)
   {
       QuizItem item = new QuizItem(q,score);
       items.add(item);
   }
   public int computeTotalPoints()
   {
       int points=0;
       for(int i =0;i<items.size();i++){
           points=points+items.get(i).getScore();
       }
       return points;
   }
   
   public void printQuizToFile(String quizTitle)
   {
       PrintWriter output = null;
       try {	
	output = new PrintWriter(quizTitle+".txt"); 
	output.println("----------------------------------------------------------");
        int points = computeTotalPoints();
        ViewAllQuizzesGUI g = new ViewAllQuizzesGUI();
	output.println(quizTitle+ "("+points+" points )");
        output.println("----------------------------------------------------------"); 
        output.println();
        for(int i=0;i<items.size();i++)
        {
            int num=i+1;
            output.println(num+".("+items.get(i).getScore()+" points)");
            output.println(items.get(i).getQuestion().getCompleteQuestionText());
        }
	output.flush();	
     }
     catch(Exception e) {
               System.out.println(e.toString());
      } 
      finally { if (output != null)     
      output.close();     
       }
   }
   
   public void printQuizSolutionToFile(String quizTitle)
   {
       PrintWriter output = null;
       try {	
	output = new PrintWriter(quizTitle+"Soln.txt"); 
	output.println("----------------------------------------------------------");
        int points = computeTotalPoints();
	output.println(quizTitle+"("+points+" points )");
        output.println("----------------------------------------------------------"); 
        output.println();
        for(int i=0;i<items.size();i++)
        {
            int num=i+1;
            output.print(num+".("+items.get(i).getScore()+" points) ");
            output.println(items.get(i).getQuestion().getAnswer());
        }
	output.flush();	
     }
     catch(Exception e) {
               System.out.println(e.toString());
      } 
      finally { if (output != null)      
      output.close();    
    }

   }
    
}

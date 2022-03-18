# QuizMakerUI_System
## Requirement analysis
### In this project, I have developed the Quiz Maker application that will run as a standalone application on a desktop/laptop. At the beginning, I conduct the functional requirements analysis and design the class diagram.
### The Quiz maker system will allow the user to:
#### 1. create ONLY one question bank with as many questions as he wants. The questions can be of the following three types:
##### a. multiple-choice questions: each multiple-choice question will have a topic, difficulty level (easy, medium, hard), question text, 4 answer choices, and correct choice(s). For any question, one or more choices can be correct.
##### b. true-false type question: Each true-false question will have a topic, difficulty level (easy, medium, hard), question text, 2 answer choices (which are always “True” and “False”), and a correct answer (True or False).
##### c. Numerical-answer type question: each numerical-answer type question will have a topic, difficulty level (easy, medium, hard), question text, and a (numerical) correct answer.
#### 2. create one or more quizzes that will contain one or more questions selected from the question bank created above. The user will be allowed to assign scores for each of the selected questions. This implies, that any particular question in the question bank may belong to 0 or more quizzes and the score associated with that question may be different in different quizzes. For example, say the question bank has questions: Q1, Q2, Q3, and Q4. Say there are two quizzes: Quiz1 and Quiz2. Quiz1 may contain Q1, Q2, and Q4 with scores 1, 4, and 2 respectively. Quiz2 may contain Q2 and Q3 with scores 3 and 6 respectively.
#### 3. import questions from a text file
#### 4. view all the questions (with their solutions) in the question bank
#### 5. print a quiz to text file
#### 6. print solution to a quiz to a text file

package com.crio.xquiz;
import java.util.*;

public class Question{

    protected String questionText;
    protected String answer;
    protected List<String> choices;

            
        

        public Question(String questionText, List<String> choices, String answer) {
                if(questionText == null || questionText.isEmpty()){
                        System.out.println("Question text cannot be null or empty!");
                }
                else if(choices == null || choices.isEmpty()){
                        System.out.println("choices cannot be null or empty!");
                }
                else if(answer == null || answer.isEmpty()){
                        System.out.println("Answer cannot be null or empty!");
                }
                else if(!choices.contains(answer)){
                        System.out.println("Answer is not present among the choices!");
                }
                else{
                        this.questionText = questionText;
                        this.choices = choices;
                        this.answer = answer;
                }
        }


        //getter
        public String getAnswer(){
                return answer;
        }
        public String getQuestionText(){
                return questionText;
        }
        public List<String> getChoices(){
                return choices;
        }
        public boolean checkAnswer(String useranswer){
                return useranswer.equals(answer);
        }


public void display(){
    System.out.println(getQuestionText());
    for(int i = 0; i < choices.size(); i++){
        int choiceNumber = i + 1;
        System.out.println(choiceNumber + ":" + choices.get(i));
    }
}

}


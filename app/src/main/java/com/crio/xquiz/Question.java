package com.crio.xquiz;
import java.util.*;

public class Question{
    //TODO: Define the variable to store the question text
    //TODO: Define the variable to store the answer text
    //TODO: Define the variable to store the list of text choices
    protected String questionText;
    protected String answer;
    protected List<String> choices;

            
                
    // Note: The print statements should match exactly with the one specified above, since we have test cases designed on this
    // If the print statements do not match then the tests might fail, so be cautious

    //TODO: Create the getter method : public String getAnswer(), which returns the answer

    //TODO: Create the getter method : public String getQuestionText(), which returns the questionText

    //TODO: Create the getter method : public List<String> getChoices(), which returns the choices

    //TODO: Create the method checkAnswer() with signature: public boolean checkAnswer(String answer)
        // Validate: If answer provided in the input matches the existing answer for the given question, then return True
        
        // Else:  return False.

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


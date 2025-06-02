/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controllers;

import Models.ModelQuiz;
import java.util.List;

/**
 *
 * @author altashfir
 */
public interface QuizService {
    void insertQuiz(ModelQuiz quiz);
    List<ModelQuiz> getAllQuiz();
    List<ModelQuiz> getRandomQuiz();
    void updateQuiz(ModelQuiz quiz);
    void deleteQuiz(int idQuiz);
}

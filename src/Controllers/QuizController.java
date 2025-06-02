/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.ModelQuiz;
import Models.QuizDAO;
import java.util.List;

/**
 *
 * @author altashfir
 */
public class QuizController implements QuizService{
    private final QuizDAO dao = new QuizDAO();

    @Override
    public void insertQuiz(ModelQuiz quiz) {
        dao.insert(quiz);
    }

    @Override
    public List<ModelQuiz> getAllQuiz() {
        return dao.getAll();
    }

    @Override
    public List<ModelQuiz> getRandomQuiz() {
        return dao.getRandom();
    }

    @Override
    public void updateQuiz(ModelQuiz quiz) {
        dao.update(quiz);
    }

    @Override
    public void deleteQuiz(int idQuiz) {
        dao.delete(idQuiz);
    }
    
}

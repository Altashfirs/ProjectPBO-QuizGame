/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Utils.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author altashfir
 */
public class QuizDAO {
    private final Connection conn;
    
    public QuizDAO(){
        this.conn = DBConnection.getConnection();
    }
    
    public void insert(ModelQuiz quiz){
        String query = "INSERT INTO quiz (question, option_a, option_b, option_c, option_d, answer) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement statement = conn.prepareCall(query)){
            statement.setString(1, quiz.getQuestion());
            statement.setString(2, quiz.getOptionA());
            statement.setString(3, quiz.getOptionB());
            statement.setString(4, quiz.getOptionC());
            statement.setString(5, quiz.getOptionD());
            statement.setString(6, quiz.getAnswer());
            statement.executeUpdate();
        } catch (SQLException e){
            System.out.println("Insert Failed: " + e.getLocalizedMessage());
        }
    }
    
    public List<ModelQuiz> getAll(){
        List<ModelQuiz> list = new ArrayList<>();
        
        String query = "SELECT * FROM quiz";
        
        try (Statement statement = conn.createStatement(); ResultSet rs = statement.executeQuery(query)) {
            while (rs.next()){
                list.add(new ModelQuiz(
                    rs.getInt("id_quiz"),
                    rs.getString("question"),
                    rs.getString("option_a"),
                    rs.getString("option_b"),
                    rs.getString("option_c"),
                    rs.getString("option_d"),
                    rs.getString("answer")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Fetch Failed = " + e.getLocalizedMessage());
        }
        return list;
    }
    
    public List<ModelQuiz> getRandom(){
    List<ModelQuiz> list = new ArrayList<>();
    String query = "SELECT * FROM quiz ORDER BY RAND() LIMIT 10";

    try (PreparedStatement statement = conn.prepareStatement(query);ResultSet rs = statement.executeQuery();) {
        while (rs.next()) {
            list.add(new ModelQuiz(
                rs.getInt("id_quiz"),
                rs.getString("question"),
                rs.getString("option_a"),
                rs.getString("option_b"),
                rs.getString("option_c"),
                rs.getString("option_d"),
                rs.getString("answer")
            ));
        }
    } catch (SQLException e) {
        System.out.println("Fetch Random Failed: " + e.getLocalizedMessage());
    }

    return list;
    }
    
    public void update(ModelQuiz quiz){
        String query = "UPDATE quiz SET question=?,option_a=?,option_b=?,option_c=?,option_d=?,answer=? WHERE id_quiz=?";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, quiz.getQuestion());
            statement.setString(2, quiz.getOptionA());
            statement.setString(3, quiz.getOptionB());
            statement.setString(4, quiz.getOptionC());
            statement.setString(5, quiz.getOptionD());
            statement.setString(6, quiz.getAnswer());
            statement.setInt(7, quiz.getIdQuiz());
            
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Update Failed: " + e.getLocalizedMessage());
        }
    }

    public void delete(int idQuiz){
     String query = "DELETE FROM quiz WHERE id_quiz=?";
        try(PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, idQuiz);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Delete Failed: " + e.getLocalizedMessage());
        }   
    }
}

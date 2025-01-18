package com.royal.dao;
/*
   CREATE TABLE StudentRegistration 
   (
	    id INT AUTO_INCREMENT PRIMARY KEY,
	    first_name VARCHAR(50) NOT NULL,
	    last_name VARCHAR(50),
	    email_address VARCHAR(100) NOT NULL UNIQUE,
	    phone_number VARCHAR(15) NOT NULL,
	    date_of_birth DATE NOT NULL,
	    gender ENUM('Male', 'Female', 'Other') NOT NULL,
	    address TEXT,
	    course VARCHAR(50) NOT NULL,
	    batch_time ENUM('Morning', 'Afternoon', 'Evening') NOT NULL,
	    payment_mode ENUM('Credit Card', 'Debit Card', 'Net Banking') NOT NULL,
	    extracurricular_activities SET('Sports', 'Music', 'Debate', 'Volunteering')
	);
 */
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.royal.bean.Student;
import com.royal.util.DBConnection;

public class StudentRegistrationDao 
{
    // Insert a student record
    public void insertStudent(Student student) throws SQLException 
    {
        String sql = "INSERT INTO StudentRegistration (first_name, last_name, email_address, phone_number, date_of_birth, " +
                "gender, address, course, batch_time, payment_mode, extracurricular_activities) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try   
        {
        	Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, student.getFirstName());
            preparedStatement.setString(2, student.getLastName());
            preparedStatement.setString(3, student.getEmailAddress());
            preparedStatement.setString(4, student.getPhoneNumber());
            preparedStatement.setDate(5, Date.valueOf(student.getDateOfBirth()));
            preparedStatement.setString(6, student.getGender());
            preparedStatement.setString(7, student.getAddress());
            preparedStatement.setString(8, student.getCourse());
            preparedStatement.setString(9, student.getBatchTime());
            preparedStatement.setString(10, student.getPaymentMode());
            preparedStatement.setString(11, String.join(",", student.getExtracurricularActivities()));

            preparedStatement.executeUpdate();
        }catch(Exception e) 
        {
        	e.printStackTrace();
        }
    }

    // Update a student record
    public void updateStudent(Student student) throws SQLException {
        String sql = "UPDATE StudentRegistration SET first_name = ?, last_name = ?, email_address = ?, phone_number = ?, " +
                "date_of_birth = ?, gender = ?, address = ?, course = ?, batch_time = ?, payment_mode = ?, extracurricular_activities = ? " +
                "WHERE id = ?";
        try   
        {
        	Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, student.getFirstName());
            preparedStatement.setString(2, student.getLastName());
            preparedStatement.setString(3, student.getEmailAddress());
            preparedStatement.setString(4, student.getPhoneNumber());
            preparedStatement.setDate(5, Date.valueOf(student.getDateOfBirth()));
            preparedStatement.setString(6, student.getGender());
            preparedStatement.setString(7, student.getAddress());
            preparedStatement.setString(8, student.getCourse());
            preparedStatement.setString(9, student.getBatchTime());
            preparedStatement.setString(10, student.getPaymentMode());
            preparedStatement.setString(11, String.join(",", student.getExtracurricularActivities()));
            preparedStatement.setInt(12, student.getId());

            preparedStatement.executeUpdate();
        }catch(Exception e) 
        {
        	e.printStackTrace();
        }
    }

    // Delete a student record
    public void deleteStudent(int id) throws SQLException {
        String sql = "DELETE FROM StudentRegistration WHERE id = ?";
        try  
        {
        	Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }catch(Exception e) 
        {
        	e.printStackTrace();
        }
    }

    // Retrieve all student records
    public List<Student> getAllStudents() throws SQLException {
        List<Student> students = new ArrayList();
        String sql = "SELECT * FROM StudentRegistration";

        try    
        {
        	Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setFirstName(resultSet.getString("first_name"));
                student.setLastName(resultSet.getString("last_name"));
                student.setEmailAddress(resultSet.getString("email_address"));
                student.setPhoneNumber(resultSet.getString("phone_number"));
                student.setDateOfBirth(resultSet.getDate("date_of_birth").toLocalDate());
                student.setGender(resultSet.getString("gender"));
                student.setAddress(resultSet.getString("address"));
                student.setCourse(resultSet.getString("course"));
                student.setBatchTime(resultSet.getString("batch_time"));
                student.setPaymentMode(resultSet.getString("payment_mode"));
                String[] activities = resultSet.getString("extracurricular_activities").split(",");
                student.setExtracurricularActivities(Arrays.asList(activities));
                

                students.add(student);
            }
        }catch (Exception e) 
        {
        	e.printStackTrace();
		}

        return students;
    }
}


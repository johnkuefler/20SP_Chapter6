
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String major;

    public Student(String stuId) {
        this.studentId = stuId;
    }
    
    
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    
    /**
     * Enrolls a student in the given class
     * @param className - the name of the class 
     */
    public void enrollInClass(String className) {
        // implement this method
    }
    
    public void enrollInClass(int classCode) {
        // implement this method
    }
    
    public void dropFromClass(String className) {
        // implement this method
    }
}

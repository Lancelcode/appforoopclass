import java.io.*;

public class Student {

   private String studentID;
   private String surname;
   private String firstname;
   private String course;
   private String email;
   private int dob;
   private int mobileNumber;

   /* Print the Student details */
   public void printStudent() {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
      System.out.println("Salary:" + salary);
   }
   public String getStudentID() {
      return studentID;
   }
   public void setStudentID(String studentID) {
      this.studentID = studentID;
   }
   public String getSurname() {
      return surname;
   }
   public void setSurname(String surname) {
      this.surname = surname;
   }
   public String getFirstname() {
      return firstname;
   }
   public void setFirstname(String firstname) {
      this.firstname = firstname;
   }
   public String getCourse() {
      return course;
   }



   public void setCourse(String course) {
      this.course = course;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   public int getDob() {
      return dob;
   }
   public void setDob(int dob) {
      this.dob = dob;
   }
   public int getMobileNumber() {
      return mobileNumber;
   }
   public void setMobileNumber(int mobileNumber) {
      this.mobileNumber = mobileNumber;
   }
   public Student(String studentID, String surname, String firstname, String course, String email, int dob,
         int mobileNumber) {
      this.studentID = studentID;
      this.surname = surname;
      this.firstname = firstname;
      this.course = course;
      this.email = email;
      this.dob = dob;
      this.mobileNumber = mobileNumber;
   }
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((studentID == null) ? 0 : studentID.hashCode());
      result = prime * result + ((surname == null) ? 0 : surname.hashCode());
      result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
      result = prime * result + ((course == null) ? 0 : course.hashCode());
      result = prime * result + ((email == null) ? 0 : email.hashCode());
      result = prime * result + dob;
      result = prime * result + mobileNumber;
      return result;
   }
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Student other = (Student) obj;
      if (studentID == null) {
         if (other.studentID != null)
            return false;
      } else if (!studentID.equals(other.studentID))
         return false;
      if (surname == null) {
         if (other.surname != null)
            return false;
      } else if (!surname.equals(other.surname))
         return false;
      if (firstname == null) {
         if (other.firstname != null)
            return false;
      } else if (!firstname.equals(other.firstname))
         return false;
      if (course == null) {
         if (other.course != null)
            return false;
      } else if (!course.equals(other.course))
         return false;
      if (email == null) {
         if (other.email != null)
            return false;
      } else if (!email.equals(other.email))
         return false;
      if (dob != other.dob)
         return false;
      if (mobileNumber != other.mobileNumber)
         return false;
      return true;
   }
   
}
public static void main(String[] args) {

}
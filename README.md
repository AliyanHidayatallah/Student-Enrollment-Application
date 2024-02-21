# Student Enrollment and Tuition System

This Java application serves as a comprehensive student enrollment and tuition system for a university. It allows administrators to efficiently manage student information, including enrollment in specific courses, tuition balance tracking, and payment processing.


## Usage

1. Upon running the application, you will be prompted to enter the number of new students to enroll.

2. For each student, you will provide essential details, such as first name, last name, and grade level.

3. Enroll the student in courses by entering the respective course codes. Available courses include:
   - History 101
   - Mathematics 101
   - English 101
   - Chemistry 101
   - Computer Science 101

4. To finish enrolling courses for a student, type 'Q' or 'q' when prompted for a course.

5. After enrolling in courses, you can view the student's balance and proceed to pay the tuition.

6. The application generates a summary of each student's information, including name, ID, enrolled courses, and balance.

## Class Structure

The project comprises two classes:

- `StudentDatabaseApp`: The main class that handles user input, creates an array of `Student` objects, and manages the enrollment process.

- `Student`: Represents a student with attributes such as name, grade level, courses, and balance. The class includes methods for enrolling in courses, viewing the balance, paying tuition, and generating a unique student ID.

## Acknowledgments

- This project serves as a foundation for a student management system and can be extended for additional features and enhancements.

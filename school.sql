-- Create a table for students
CREATE TABLE students (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT NOT NULL
);

-- Create a table for teachers
CREATE TABLE teachers (
    teacher_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    subject VARCHAR(255) NOT NULL
);

-- Create a table for courses
CREATE TABLE courses (
    course_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT
);

-- Add a new student
INSERT INTO students (name, age) VALUES ('John Doe', 18);

-- Add a new student
INSERT INTO students (name, age) VALUES ('Alice Johnson', 19);

-- Add a new teacher
INSERT INTO teachers (name, subject) VALUES ('Jane Smith', 'Mathematics');

-- Add a new teacher
INSERT INTO teachers (name, subject) VALUES ('Michael Brown', 'History');

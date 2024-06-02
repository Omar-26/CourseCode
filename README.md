<p align="center">
  <img src="https://github.com/Omar-26/CourseCode/blob/main/Assets/courseCode.png?raw=true"  />
  <h3 align="center">CourseCode</h3>
  <p align="center">Online Courses Desktop App</p>
  <p align="center">
    <img src="https://img.shields.io/badge/platform-macOS%20%7C%20Windows-blue.svg" alt="Platforms">
  </p>
</p>

# Overview

The **Course Code** desktop application is designed to streamline course management, enhance student engagement, and provide efficient tools for instructors and administrators. Below are the key features:

### Dashboard

<p align="center"><img src="https://github.com/Omar-26/CourseCode/blob/main/Assets/dashboard.png?raw=true" /></p>

### My Learning

<p align="center"><img src="https://github.com/Omar-26/CourseCode/blob/main/Assets/mylearning.png?raw=true" /></p>

### Exclusive for Instructors

<p align="center"><img src="https://github.com/Omar-26/CourseCode/blob/main/Assets/addcourse.png?raw=true" /></p>

# Key Features

### User Authentication

- **Login System:** Secure login functionality for students, instructors, and administrators.
- **User Input Validation:** Ensures valid input during login.

### Course Management

- **Effortless Course Creation:** Instructors can easily create, update, and delete courses.
- **Course Details:** Display relevant information about each course.

### Enrollment

- **Seamless Enrollment:** Students can enroll in courses offered by instructors.
- **Course Catalog:** Browse available courses.

### Content Creation

- **Engaging Quizzes and Assignments:** Instructors can create interactive quizzes and assignments.
- **Course Materials:** Upload and organize course materials (lecture slides, handouts, etc.).

### Progress Tracking

- **Student Progress Dashboard:** Monitor student performance and track progress.
- **Performance Metrics:** View statistics on student participation, grades, and completion rates.

### Role-based Access Control

- **Personalized Experience:** Different access levels for students, instructors, and administrators.
- **Permissions:** Define who can perform specific actions (e.g., create courses, enroll students).

# System Architecture: MVC Design Pattern

The **Course Code** application follows the **Model-View-Controller (MVC)** design pattern, which provides a clear separation of concerns and promotes modularity. Here's how it fits into our system architecture:

1. **Model:**
   - Represents the data and business logic of the application.
   - Manages data storage, retrieval, and manipulation.
   - In our case, the model handles user authentication, course details, enrollment data, and progress tracking.

2. **View:**
   - Responsible for presenting data to the user.
   - Displays the user interface (UI) elements, such as forms, buttons, and course listings.
   - Interacts with the user and sends user input to the controller.
   - In our application, views include login screens, course listings, and progress dashboards.

3. **Controller:**
   - Acts as an intermediary between the model and the view.
   - Receives user input from the view and processes it.
   - Updates the model based on user actions (e.g., creating a course, enrolling a student).
   - Notifies the view to update when the model changes.
   - In our case, controllers handle user authentication, course creation, and enrollment.

By adhering to the MVC pattern, we achieve better code organization, maintainability, and scalability. Each layer has a specific role, making it easier to enhance or modify individual components without affecting the entire application.

# Demo Video

### **Wanna see courseCode in action ?**

Check out the demo video [here](https://youtu.be/OnFBNC_9f2w)

# Contributing

We welcome contributions! If you'd like to improve Course Code, please follow our contribution guidelines.

# License

This project is licensed under the MIT License.

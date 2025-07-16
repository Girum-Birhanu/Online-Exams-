# 📝 Online Exams App

This is an Android-based Online Examination Application developed using Java and Firebase.

## 📱 Features

- User Registration and Login using Firebase Authentication
- Role-based Access: Admins vs Students
- Admins can:
  - Create quizzes
  - View quiz results for each student
- Students can:
  - Take quizzes
  - View their quiz results
- Result visualization with correct/wrong answers highlighted

## 🔐 Admin Functionality (Access Control)
- Only admins can create quizzes
- Regular users cannot access quiz creation unless their role is changed in Firebase
- Future goal: Add payment feature to unlock admin access

## 🛠️ Tech Stack

- Android Studio (Java)
- Firebase Authentication
- Firebase Realtime Database

## 🧠 How it Works

1. User signs up
2. Role assigned in Firebase (default: user)
3. Admins can create and manage quizzes
4. Users can take and view quiz results

## 🔧 Setup Instructions

1. Clone the repo  
   ```bash
   git clone https://github.com/Girum-Birhanu/Online-Exams-App.git

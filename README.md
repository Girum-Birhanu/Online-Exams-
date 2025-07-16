# Online-Exams-
🎓 A Firebase-powered Android quiz app for students and instructors. Users can take quizzes and view results, while only admins can create and manage quizzes. Built with Java and XML in Android Studio.
# 🎓 Online Exams - Android Quiz App

This is an Android-based quiz application built using **Java** and **Firebase Realtime Database**, designed for students and instructors. It allows users to register, log in, take quizzes, and view their results. Admin users can create and manage quizzes.

---

## ✨ Features

### 👤 User
- Sign up / Log in using email and password
- Take quizzes created by admins
- View detailed results for each quiz
- Check the history of solved quizzes

### 🛠️ Admin
- Create quizzes with multiple-choice questions
- Define correct answers for automatic grading
- View grades of users who took the quizzes
- Reorder or update questions (drag-and-drop feature)

> ⚠️ Only users with **admin role** can create quizzes (future upgrade: payment-based access control)

---

## 📂 Project Structure

com.gdesign.onlineexams
│
├── MainActivity.java // Login screen
├── Signup.java // Registration screen
├── Home.java // Main dashboard after login
├── ExamEditor.java // UI for quiz creation (admin only)
├── ListQuizzes.java // Lists created/solved quizzes
├── Result.java // Displays user's answers vs correct ones
├── Question.java // Data model for questions
├── CustomAdapter.java // (if separate) Adapter for dynamic quiz editing
└── utils/ // Utility classes (optional)


---

## 🔐 Firebase Structure

Your Firebase Realtime Database will look like this:

Users
└── UID
├── First Name
├── Last Name
└── Role: "admin" or "user"

Quizzes
└── QuizID
├── Title
├── Total Questions
├── Questions
│ └── 0
│ ├── Question
│ ├── Option 1-4
│ └── Ans (correct option index)
└── Answers
└── UID
├── 1: selected answer
├── 2: ...
└── Points


---

## 🧠 Access Control Plan (Next Update)

To restrict quiz creation to only **admin users**, the following logic is applied:

1. When a user signs up, their Firebase record includes `"Role": "user"`.
2. Manually or via Cloud Functions, set specific users' role to `"admin"`.
3. On the `Home` screen, **check user role**:
    ```java
    if (role.equals("admin")) {
        // Show "Create Quiz" button
    }
    ```
4. In the future, integrate a **payment gateway** (e.g., Stripe or Google Pay) to upgrade role from "user" → "admin".

---

## 🛠 Dependencies

- [Firebase Auth](https://firebase.google.com/docs/auth)
- [Firebase Realtime Database](https://firebase.google.com/docs/database)
- AndroidX
- Java 8+
- Android Studio Electric Eel or above

---

## 🚀 Getting Started

1. Clone the repo:
    ```bash
    git clone https://github.com/your-username/Online-Exam-App.git
    ```

2. Open in Android Studio

3. Add your `google-services.json` in the `app/` folder

4. Sync Gradle

5. Run the app on emulator/device

---

## 📱 Screenshots

| Sign Up | Take Quiz | View Result |
|--------|-----------|--------------|
| ![signup](screenshots/signup.png) | ![quiz](screenshots/quiz.png) | ![result](screenshots/result.png) |

---

## 📌 To-Do / Future Improvements

- [x] Admin vs User role-based access
- [ ] Payment system to upgrade to admin
- [ ] Add image/video questions
- [ ] Leaderboard & analytics
- [ ] Timer for quizzes
- [ ] Firebase Firestore migration (optional)

---

## 🤝 Contributing

Pull requests are welcome. If you find a bug or have a feature request, feel free to open an issue.

---

## 📜 License

This project is licensed under the MIT License.

---

## 🧑‍💻 Author

Made with ❤️ by **Girum Birhanu**  
🇪🇹 Ethiopia  

# 🏡 ReRent

_ReRent_ is a peer-to-peer short-term item lending and borrowing platform built in **Java** with **PostgreSQL**. It allows users to lend and borrow everyday items like books, electronics, and sports equipment — categorized and searchable by availability and custom attributes. The app runs via a command-line interface and uses persistent storage for all data.

---

## 🚀 Features

- 👤 **User Accounts**  
  Secure sign-up and login system with hashed passwords.

- 📦 **Item Categories**  
  Support for diverse item types like Books, Electronics, and Sports Gear — each with custom fields.

- 🔍 **Search & Filter**  
  Search by category, brand, condition, and available time slots.

- 🔄 **Lending & Borrowing Flow**  
  Request, approve, and manage short-term exchanges between users.

- 💾 **Persistent Storage with PostgreSQL**  
  All data is stored reliably in a PostgreSQL database using JDBC.

- 🧠 **Modular OOP Design**  
  Organized into Models, Services, Database, and UI layers using Java best practices.

---

## 📂 Project Structure

The project follows a modular structure for clarity and scalability:

- **src/** → Main source code (models, services, database access, UI)
- **resources/** → Configuration files (e.g., DB properties)
- **test/** → Unit tests using JUnit
- **ReRentApp.java** → Main entry point of the application
- **README.md** → Documentation


---

## 🛠 Tech Stack

- Java 17  
- PostgreSQL  
- JDBC  
- JUnit 5  

---

## ⚙️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/bodkhe-kanaad/ReRent.git
cd ReRent

2. Set up the database
Ensure PostgreSQL is running

Create a database named rerent

Run your schema SQL to create tables (users, items, requests, etc.)

3. Add DB credentials
Edit resources/db.properties:

ini
Copy
Edit
db.url=jdbc:postgresql://localhost:5432/rerent
db.username=your_db_username
db.password=your_db_password
4. Compile and run
bash
Copy
Edit
javac -d out src/ReRentApp.java
java -cp out ReRentApp
🧪 Testing
You can run unit tests using your IDE or a build tool like Maven or Gradle.

🧭 Roadmap
 Web UI (React or Spring Boot)

 Availability calendar view

 In-app messaging/chat

 Rating and review system

 Admin dashboard

👤 Author
Kanaad Bodkhe
UBC Computer Science



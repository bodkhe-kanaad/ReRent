This document tracks how the ReRent Java project applies SOLID object-oriented design principles.

---

## 🔹 Single Responsibility Principle (SRP)

"Each class should have one reason to change — it should do only one thing."

### `User.java`
- Defines the structure of a `User` object.
- all user-related attributes.

### `UserServices.java`
- Handles logic: for login and signup for `User`.

### `DatabaseConnection.java`
- Only responsible for connecting the app to PostgreSQL.
- keeping connection logic in one place.

### `TestDB.java`
- Only responsible for checking the connection is working.


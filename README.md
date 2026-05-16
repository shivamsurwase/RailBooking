# RailBook - Train Booking System

RailBook is a full-stack train booking application comprising a **Spring Boot** backend and a **React (Vite)** frontend. It supports complex route finding (direct & layover trains), booking management, and admin dashboard functionalities.

---

## 🚀 Prerequisites

Ensure you have the following installed:
*   **Java 17+** (JDK)
*   **Node.js 16+** & **npm**
*   **PostgreSQL 14+**
*   **Maven** (optional, uses wrapper)

---

## 🛠️ Database Setup

The project uses PostgreSQL. You need to set up the database before running the backend.

### 1. Create Database
Open your terminal or pgAdmin and run:
```sql
CREATE DATABASE karbs_db;
```

### 2. Configuration
Open `backend/src/main/resources/application.properties` and verify your credentials.
By default, it uses:
*   Username: `Mysql`
*   Password: `password`

If your local PostgreSQL setup uses different credentials, you can either:
1.  Set the `DB_USERNAME` and `DB_PASSWORD` environment variables.
2.  Or manually update `backend/src/main/resources/application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bus_db  
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=SHIV@09
```

### 3. Populating Data (Two Options)

#### Option A: Automatic Seeding (Recommended for Dev)
The application includes a `DataSeeder.java` component.
*   **Action**: Just run the backend (see below).
*   **Result**: It will automatically create tables (via Hibernate) and populate initial data (Users, Stations, Trains, Schedules) if the database is empty.
*   **Test Credentials**:
    *   User: `user` / `password`
    *   Admin: `admin` / `admin`

#### Option B: Manual SQL Import (Production/Restore)
A full database dump is provided in the root directory: `full_db_dump.sql`.
To import it:
```bash
psql -U postgres -d karbs_db -f full_db_dump.sql
```

---

## 🖥️ Backend Setup (Spring Boot)

1.  Navigate to the backend directory:
    ```bash
    cd backend
    ```
2.  Run the application:
    ```bash
    ./mvnw spring-boot:run
    ```
    *   First run looks for database `karbs_db` and seeds data.
    *   Server starts at: `http://localhost:8080`

### API Documentation
*   **Flow & Logic Details**: See [API_FLOW.md](./API_FLOW.md) (in `brain` folder or root if moved).
*   **Postman Collection**: Import `railbook.postman_collection.json` (Root directory) into Postman.
*   **HTTP Tests**: Use `backend/api_tests.http` for quick testing in VS Code.

---

## 🎨 Frontend Setup (React + Vite)

1.  Navigate to the frontend directory:
    ```bash
    cd frontend
    ```
2.  Install dependencies:
    ```bash
    npm install
    ```
3.  Start the development server:
    ```bash
    npm run dev
    ```
    *   App runs at: `http://localhost:3000`

---

## 🧪 Quick Test Flow

1.  **Login**:
    *   Go to `http://localhost:3000/login`.
    *   Username: `user`, Password: `password`.
2.  **Search Trains**:
    *   From: `STB` (Station B), To: `STC` (Station C).
    *   Date: Select a future date (e.g., 2 days from now).
3.  **Book**:
    *   Select seats -> Proceed -> Confirm.
    *   Go to Dashboard to see the booking.

---

## 📂 Project Structure

```
├── backend/                 # Spring Boot Source Code
│   ├── src/main/java        # Controllers, Services, Entities
│   └── src/main/resources   # Configs (application.properties)
├── frontend/                # React Source Code
│   ├── src/pages            # UI Pages (Dashboard, Search, Admin)
│   └── src/components       # Reusable UI Components
├── full_db_dump.sql         # SQL Backup for manual DB restore
└── railbook.postman...json  # API Collection for testing
```

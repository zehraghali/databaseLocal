# Localized Database Implementation

## Project Overview

This project demonstrates how to implement localization in a MySQL database using various approaches. The application allows users to manage employee records in multiple languages: English, Farsi, and Japanese.

## Localization Approaches Used

1. **Field Localization**:
   - Each field in the employee table has separate columns for different languages (first_name, last_name, email) for English, Farsi, and Japanese.

2. **Row Localization**:
   - Alternative method where each employee's name and email can be stored in different rows based on the language code.

3. **Translation Table**:
   - Implemented a translation table to hold translations for localized fields. This allows easy expansion when adding new languages.

## Database Structure

The database consists of the following tables:

- **employee**:
    ```sql
    CREATE TABLE employee (
        id INT AUTO_INCREMENT PRIMARY KEY,
        first_name_en VARCHAR(50),
        last_name_en VARCHAR(50),
        email_en VARCHAR(100),
        first_name_fa VARCHAR(50),
        last_name_fa VARCHAR(50),
        email_fa VARCHAR(100),
        first_name_ja VARCHAR(50),
        last_name_ja VARCHAR(50),
        email_ja VARCHAR(100)
    );
    ```

## Technologies Used

- Java
- MySQL
- IntelliJ IDEA (or any preferred IDE)

## How to Run the Application

1. **Set Up the MySQL Database**:
   - Ensure you have MySQL installed and running.
   - Create the `employee` table using the provided SQL schema.

2. **Clone the Repository**:
   ```bash
   git clone <your-github-repo-url>
   cd <your-repo-directory>

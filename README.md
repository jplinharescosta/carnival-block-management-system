# Carnival Block Management System

The **Carnival Block Management System** is a Java-based application designed to manage carnival blocks, ensuring proper scheduling, avoiding time conflicts, and providing a better experience for event organizers and participants.

## Features

- **Block Registration**: Add and manage carnival blocks with details such as name, location, and schedule.
- **Participant Management**: Register revelers and associate them with their chosen carnival blocks.
- **Conflict Detection**: Ensure no overlapping schedules among registered carnival blocks.
- **Public Estimation**: Calculate the estimated number of attendees based on registrations.
- **Recommendations**: Provide suggestions for better event planning.

## Project Structure

The project is structured as follows:

- **src/**: Contains the application's source code.
  - **models/**: Defines the core entities of the system, such as `Block` and `Participant`.
  - **services/**: Implements the business logic, including conflict detection and public estimation.
  - **main/**: The entry point of the application.
- **README.md**: This file, providing an overview of the project.
- **LICENSE**: Licensing information for the project.

## Technologies Used

- **Java**: The primary programming language used for development.
- **OOP Principles**: Utilized for structured and maintainable code.

## How to Run the Project

1. **Clone the repository:**

   ```bash
   git clone https://github.com/jplinharescosta/carnival-block-management-system.git
   ```

2. **Navigate to the project directory:**

   ```bash
   cd carnival-block-management-system
   ```

3. **Compile the source code:**

   ```bash
   javac -d bin src/*.java
   ```

4. **Run the application:**

   ```bash
   java -cp bin Main
   ```

## Contributions

Contributions are welcome! Feel free to open issues or pull requests for improvements, bug fixes, or new features.

## License

This project is licensed under the [MIT License](LICENSE).


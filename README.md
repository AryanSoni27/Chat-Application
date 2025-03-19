# Chat Application

## Overview
This is a real-time chat application that allows users to communicate seamlessly. The application is built using Spring Boot to ensure fast and efficient messaging.

## Features
- **Real-time messaging**: Instant message exchange between users.
- **Group chat support**: Ability to create and join group conversations.
- **Private messaging**: One-on-one chat feature.
- **Media sharing**: Send and receive images, videos, and other files.
- **Online/offline status**: Users can see who is online.
- **Responsive UI**: Works on both desktop and mobile devices.

## Technologies Used
- **Backend**: Spring Boot
- **Database**: MongoDB / SQL (Specify the database used)
- **Real-time Communication**: WebSockets

## Installation
### Prerequisites
Ensure you have the following installed:
- Java 17 or later
- Maven
- MongoDB / SQL database (if applicable)

### Steps to Run Locally
1. Clone the repository:
   ```bash
   git clone https://github.com/AryanSoni27/Chat-Application.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Chat-Application
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Set up environment variables:
   - Create an `application.properties` or `application.yml` file in the `src/main/resources` directory.
   - Add required variables (e.g., database URL, server configurations).
5. Start the application:
   ```bash
   mvn spring-boot:run
   ```
6. The application will be accessible at:
   ```
   http://localhost:8080
   ```

## Usage
1. Start the application.
2. Send messages in real-time and enjoy the conversation.

## Contributing
Contributions are welcome! Follow these steps:
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-name
   ```
3. Make your changes and commit:
   ```bash
   git commit -m "Added new feature"
   ```
4. Push to your fork:
   ```bash
   git push origin feature-name
   ```
5. Create a Pull Request.

## License
This project is licensed under the MIT License.

## Contact
For any queries or support, contact:
- **GitHub**: [AryanSoni27](https://github.com/AryanSoni27)
- **Email**: aryansoni33635@gmail.com


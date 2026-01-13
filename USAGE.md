# Tacite Copilot Desktop Application

A Java/Swing desktop application for data import and management, targeting Windows and Linux platforms.

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## Building the Application

```bash
mvn clean package
```

This will compile the code and create an executable JAR file in the `target/` directory.

## Running the Application

```bash
java -jar target/tacite-copilot-1.0-SNAPSHOT.jar
```

## Features

The main window contains the following buttons:

1. **Import CLIO data** - (functionality to be implemented)
2. **Import HC data** - (functionality to be implemented)
3. **Import Tacite data** - (functionality to be implemented)
4. **Setup** - (functionality to be implemented)
5. **Quit** - Exits the application

### Current Implementation Status

- ✅ Main window with all required buttons
- ✅ Quit button functionality (exits the application)
- ⏳ Import CLIO data functionality (to be implemented)
- ⏳ Import HC data functionality (to be implemented)
- ⏳ Import Tacite data functionality (to be implemented)
- ⏳ Setup functionality (to be implemented)

## Application Structure

- `src/main/java/com/tacite/copilot/TaciteCopilotApp.java` - Main application class
  - Creates the main window (JFrame)
  - Uses GridLayout to organize buttons vertically
  - Each button has an action listener (with placeholder methods for future implementation)
  - Window size: 400x300 pixels
  - Centered on screen

## Development

The application uses:
- Java Swing for the GUI
- Maven for build management
- Java 17 as the target version

## Next Steps

Future development will include implementing the action handlers for:
- CLIO data import
- HC data import
- Tacite data import
- Setup/configuration functionality

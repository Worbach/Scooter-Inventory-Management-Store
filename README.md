# Web-Based Sprint Inventory Application

## Overview

This project is a web-based inventory management system developed as part of an academic assessment. It leverages the Spring Framework (Java backend) combined with a custom HTML front-end to manage and display inventory for a store that sells products assembled from various parts. The application is designed not only to fulfill business requirements such as inventory tracking and order processing but also to showcase practical software development skills in user interface design, validation, and code optimization.

## Key Features

- **Customized User Interface**  
  The HTML front-end has been tailored to include the shop’s name, product listings, and detailed part descriptions.  
  *Reference: UI changes in `index.html` and related CSS files (see section C of project tasks).*

- **About Page**  
  An “About” page has been added to provide background information on the chosen customer’s company, with full navigation integration between the main screen and the About page.  
  *Reference: Navigation and content updates in `about.html` and routing configuration (section D).*

- **Sample Inventory Integration**  
  The application includes a sample inventory for the store with five products and five parts. The logic ensures that the sample data is only added when no previous inventory exists.  
  *Reference: Inventory initialization logic in `InventoryManager.java` (section E).*

- **Buy Now Functionality**  
  A “Buy Now” button is integrated into the product listing, allowing users to decrement the inventory count for a product upon purchase. A success or error message is displayed based on the transaction outcome.  
  *Reference: Button implementation and event handling in `ProductListController.java` (section F).*

- **Inventory Limits and Validation**  
  Parts have been modified to include fields for maximum and minimum inventory levels. The application enforces these limits through both the data model and the user interface, with proper error messaging if validations fail.  
  *Reference: Part model updates and validation logic in `Part.java`, `InhousePartForm.html`, and associated controllers (sections G and H).*

- **Unit Testing & Code Cleanup**  
  At least two unit tests have been added to verify that the maximum and minimum inventory fields function correctly. Additionally, unused validator classes have been removed to keep the codebase clean and maintainable.  
  *Reference: Unit tests in `PartTest.java` and file cleanup in the project’s validator package (sections I and J).*

## Getting Started

### Prerequisites
- Java (JDK 11 or higher)
- Maven or Gradle (depending on your build configuration)
- IntelliJ IDEA (recommended IDE for Spring projects)

### Installation

1. **Clone the Repository**  
   ```bash
   git clone <repository-url>
   cd web-based-sprint-inventory

2. Import the Project
Open the project in IntelliJ IDEA and ensure all dependencies are resolved.

3. Build and Run
Enter in terminal:
mvn spring-boot:run

4. Access the Application
Open a web browser and navigate to http://localhost:8080 to view the application.

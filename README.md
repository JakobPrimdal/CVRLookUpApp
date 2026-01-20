CVR Lookup Application - Frontend

* A JavaFX desktop application for looking up publicly available information about Danish companies using their CVR number.

Features

* Search for Danish companies by CVR number
* Display company information, including name, address, industry, and registration details
* Clean and intuitive user interface
* Real-time data from the official Danish CVR registry

Architecture

The application is part of a frontend–backend architecture:

This architecture ensures separation of concerns and allows for high adaptability for potential future features and improvements.

* JavaFX Frontend
* Spring Boot Backend (CVRLookUpApp-Backend)
* Database Cache + External CVR API (virkdata.dk)


Prerequisites

* Java 11 or higher
* JavaFX SDK
* Maven (for dependency management)
* Running backend service (handles CVR API authentication)

Setup

Backend Configuration

* Ensure your backend service is running and properly configured with CVR API credentials.
* Link to Backend repo: https://github.com/JakobPrimdal/CVRLookUpApp-Backend

Running the Application

* Launch the backend service
* Start the frontend application
* The frontend will connect to the backend to retrieve company data

Usage

* Launch the application
* Enter a valid Danish CVR number in the search field
* Click "Search" or press Enter
* View the company information displayed

Example CVR Numbers

* For testing purposes, you can use these real Danish companies:

* 10150817 - Erhvervsstyrelsen
* 36213728 - Ørsted A/S
* 54562519 - LEGO A/S

Project Structure

* All dependencies are managed through Maven and specified in pom.xml.

Support

If you encounter any issues or have questions:

* Open an issue on GitHub
* Check existing issues for solutions
* Review the API documentation

# System-Design-BookMyShow

This repository contains a simplified version of Book My Show system, an online platform for booking entertainment tickets. 
This project aims to replicate core functionalities such as user authentication, seat selection, and payment processing.

## Design Book My Show

### Requirements :

Build an online movie ticket booking system that can support the following requirements:

- Support for multiple cities
- Each City will have multiple cinemas
- Each cinema can have multiple halls
- Each hall will play one movie at a time
- A cinema will play multiple movies
- Each hall can have multiple types of seats:
  - Gold
  - Diamond
  - Platinum
- Allow the user to search a movie by name
- Allow the user to filter movies by the following fields:
  - Location
  - Cinema
  - Language
  - Rating
  - Category
- Each movie can have multiple slots
- Users can book tickets and pay via multiple payment methods:
  - UPI
  - Credit Card
  - Net Banking
- A user can apply a coupon or a promo code at checkout
- A user can see the availibility of seats in a hall
- The price of a ticket will be decided by multiple parameters:
  - Seat Type
  - Day of the week
  - Time of the Day
  - Movie
  - Cinema Hall
- A user can also cancel or update booking
- A user cannot book or cancel after the cutoff time which is 1 hour before movie starts

### Class Diagram :

![BMS](https://github.com/user-attachments/assets/89bcec00-f6aa-4f0a-89fd-9fc7da5d130a)


### Technologies Used

- **Spring Boot**: For creating stand-alone, production-grade Spring-based applications.
- **Java**: As the main programming language.
- **Model-View-Controller (MVC)**: For separating the application's concerns.
- **MySQL**: For database management.
- **Java Persistence API (JPA)**: For ORM-based data access.

### Features

- **User Authentication**: Secure sign-in and sign-up processes.
- **Seat Booking**: Real-time seat selection and booking.
- **Payment Gateway**: Integrated system for processing payments.

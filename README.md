# ERS_Spring
Updating my Employee Reimbursement System project from a few years back!

Expense Reimbursement System (ERS) manages the process of reimbursing employees for expenses incurred while on company time. All employees in the company can login and submit requests for reimbursement and view their past tickets and pending requests. Finance managers can log in and view all reimbursement requests and past history for all employees in the company. Finance managers are authorized to approve and deny requests for expense reimbursement as well as submit their own requests. However, only a different finance manager may approve said request.


# Technologies
Spring Boot, Data, MVC, and Security (BCrypt encoding).

HTLM5, CSS, JavaScript, jQuery, AJAX.


# Getting Started
- Install Spring Tools 4 - for Spring Boot (aka Spring Tool Suite 4) from the eclipse Marketplace.
- Clone the repository and import the project.
- Setup MySQL environment.
  - Create a user with full object rights and CREATE/ALTER DDL rights at minimum.
  - Create the ERS DB in MySQL.
  - Set environment variables, there are 3 for the DB in application.properties.
- Generate your DB tables.
  - In the application properties file, change the ddl-auto from update to create.
  - Run the application as a Spring Boot App.
  - Revisit step 4a, and change the ddl-auto from create back to update.

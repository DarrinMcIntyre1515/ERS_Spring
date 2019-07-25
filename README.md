# ERS_Spring
Updating my Employee Reimbursement System project from a few years back!

Expense Reimbursement System (ERS) manages the process of reimbursing employees for expenses incurred while on company time. All employees in the company can login and submit requests for reimbursement and view their past tickets and pending requests. Finance managers can log in and view all reimbursement requests and past history for all employees in the company. Finance managers are authorized to approve and deny requests for expense reimbursement as well as submit their own requests. However, only a different finance manager may approve said request.


# Technologies
Spring Boot, Data, MVC, and Security.

HTLM5, CSS, JavaScript, jQuery, AJAX.

(Will be moving to Angular5+)


# Getting Started
1.) Install Spring Tools 4 - for Spring Boot (aka Spring Tool Suite 4) from the eclipse Marketplace. 
2.) Clone the repository and import the project.
3.) Setup MySQL environment.
  a.) Create a user with full object rights and CREATE/ALTER DDL rights at minimum.
  b.) Create the ERS DB in MySQL.
  c.) Set environment variables, there are 3 for the DB in application.properties.
4.) Generate your DB tables!
  a.) In the application properties file, change the ddl-auto from update to create.
  b.) Run the application as a Spring Boot App.
  c.) Revisit step 4a, and change the ddl-auto from create back to update.

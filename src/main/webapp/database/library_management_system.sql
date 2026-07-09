create database library_management_system;
use library_management_system;

create table user_signup
(
		user_id int auto_increment primary key,
        first_name nvarchar(50),user
        last_name nvarchar(50),
        email nvarchar(50),
        create_pass nvarchar(50),
        confirm_pass nvarchar(50)

);

create table return_book
(  
		user_id int auto_increment primary key,
        receiver_name nvarchar(50),
        book_name nvarchar(50),
        book_taken_date nvarchar(50),
        book_receive_date nvarchar(50),
        fine nvarchar(50),
        pay nvarchar(50)
 );
 create table issue_book
 ( 
		user_id int auto_increment primary key,
        receiver_name nvarchar(50),
        book_name nvarchar(50),
        book_taken_date nvarchar(50),
        book_receive_date nvarchar(50)
);

create table payment_page
(
		user_id int auto_increment primary key,
        cardholder_name nvarchar(50),
        card_number nvarchar(50),
        expiry_date nvarchar(50),
        cvv nvarchar(50)
);
 
 create table admin_add_book
 (
		user_id int auto_increment primary key,
        book_name nvarchar(50),
        author_name nvarchar(50),
        book_price nvarchar(50),
        no_of_pages nvarchar(50),
        add_book nvarchar(50)
 );
 
 create table Profile
 (
		user_id int auto_increment primary key,
        full_name nvarchar(50),
        email nvarchar(50),
        mob_no nvarchar(50),
        photo nvarchar(50)
);
 
 
		





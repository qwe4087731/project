CREATE DATABASE `book` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
CREATE USER 'remote_user'@'%' IDENTIFIED BY 'ouWFWdjy';
GRANT ALL PRIVILEGES ON book.* TO 'remote_user'@'%';
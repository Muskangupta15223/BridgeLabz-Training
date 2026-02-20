CREATE TABLE specialty (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) UNIQUE
);


CREATE TABLE audit_log (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(100),
    table_name VARCHAR(100),
    action_type VARCHAR(20),
    action_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

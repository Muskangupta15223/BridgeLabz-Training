CREATE TABLE specialties (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) UNIQUE
);

CREATE TABLE doctors (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    contact VARCHAR(15),
    consultation_fee DOUBLE,
    specialty_id INT,
    is_active BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (specialty_id) REFERENCES specialties(id)
);

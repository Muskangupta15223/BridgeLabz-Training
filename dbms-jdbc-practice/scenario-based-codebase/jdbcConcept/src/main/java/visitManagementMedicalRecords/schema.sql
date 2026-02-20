CREATE TABLE visits (
    id INT PRIMARY KEY AUTO_INCREMENT,
    appointment_id INT,
    diagnosis VARCHAR(255),
    notes TEXT,
    visit_date DATE,
    FOREIGN KEY (appointment_id) REFERENCES appointments(id)
);



CREATE TABLE prescriptions (
    id INT PRIMARY KEY AUTO_INCREMENT,
    visit_id INT,
    medicine_name VARCHAR(100),
    dosage VARCHAR(50),
    duration VARCHAR(50),
    FOREIGN KEY (visit_id) REFERENCES visits(id)
);

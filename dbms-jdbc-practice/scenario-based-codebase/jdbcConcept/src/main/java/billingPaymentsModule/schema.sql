CREATE TABLE bills (
    id INT PRIMARY KEY AUTO_INCREMENT,
    visit_id INT,
    total_amount DOUBLE,
    payment_status VARCHAR(20) DEFAULT 'UNPAID',
    payment_date DATE,
    payment_mode VARCHAR(50),
    FOREIGN KEY (visit_id) REFERENCES visits(id)
);

CREATE TABLE payment_transactions (
    id INT PRIMARY KEY AUTO_INCREMENT,
    bill_id INT,
    amount DOUBLE,
    transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    mode VARCHAR(50),
    FOREIGN KEY (bill_id) REFERENCES bills(id)
);

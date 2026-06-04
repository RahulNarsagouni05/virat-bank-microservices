CREATE TABLE IF NOT EXISTS loans (
     loan_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    mobile_number VARCHAR(15) NOT NULL,
    loan_number VARCHAR(100) NOT NULL UNIQUE,
    loan_type VARCHAR(100) NOT NULL,
    total_loan DECIMAL(15,2) NOT NULL,
    amount_paid DECIMAL(15,2) NOT NULL,
    outstanding_amount DECIMAL(15,2) NOT NULL,
    created_at DATETIME NOT NULL,
    created_by VARCHAR(20) NOT NULL,
    updated_at DATETIME DEFAULT NULL,
    updated_by VARCHAR(20) DEFAULT NULL,

    INDEX idx_loans_mobile_number (mobile_number)
    );
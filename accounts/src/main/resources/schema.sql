CREATE TABLE IF NOT EXISTS customer (
    customer_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    mobile_number VARCHAR(20) NOT NULL,
    created_at DATETIME NOT NULL,
    created_by VARCHAR(20) NOT NULL,
    updated_at DATETIME DEFAULT NULL,
    updated_by VARCHAR(20) DEFAULT NULL,

    UNIQUE KEY uk_customer_email (email),
    UNIQUE KEY uk_customer_mobile (mobile_number)
    );

CREATE TABLE IF NOT EXISTS accounts (
     account_number BIGINT AUTO_INCREMENT PRIMARY KEY,
     customer_id BIGINT NOT NULL,
   account_type VARCHAR(100) NOT NULL,
    branch_address VARCHAR(200) NOT NULL,
    created_at DATETIME NOT NULL,
    created_by VARCHAR(20) NOT NULL,
    updated_at DATETIME DEFAULT NULL,
    updated_by VARCHAR(20) DEFAULT NULL,
    communication_status BOOLEAN NOT NULL,

    CONSTRAINT fk_accounts_customer
    FOREIGN KEY (customer_id)
    REFERENCES customer(customer_id)
    ON DELETE CASCADE
    );
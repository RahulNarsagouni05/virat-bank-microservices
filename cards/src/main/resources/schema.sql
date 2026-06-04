CREATE TABLE IF NOT EXISTS cards (
     card_id BIGINT NOT NULL AUTO_INCREMENT,
    mobile_number VARCHAR(15) NOT NULL,
    card_number VARCHAR(20) NOT NULL UNIQUE,
    card_type VARCHAR(20) NOT NULL,
    total_limit DECIMAL(12,2) NOT NULL,
    amount_used DECIMAL(12,2) NOT NULL,
    available_amount DECIMAL(12,2) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_by VARCHAR(20) NOT NULL,
    updated_at TIMESTAMP NULL DEFAULT NULL,
    updated_by VARCHAR(20) DEFAULT NULL,
    PRIMARY KEY (card_id),
    INDEX idx_mobile_number (mobile_number)
    );
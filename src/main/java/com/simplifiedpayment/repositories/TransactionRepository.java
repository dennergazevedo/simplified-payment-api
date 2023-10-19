package com.simplifiedpayment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplifiedpayment.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}

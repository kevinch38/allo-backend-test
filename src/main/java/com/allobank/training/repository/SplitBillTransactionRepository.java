package com.allobank.training.repository;

import com.allobank.training.model.entity.SplitBillTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SplitBillTransactionRepository extends JpaRepository<SplitBillTransaction, String> {}

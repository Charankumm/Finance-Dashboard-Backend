package com.finance.dashboard.repository;

import com.finance.dashboard.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

    @Query("SELECT SUM(r.amount) FROM Record r WHERE r.type = 'INCOME'")
    Double getTotalIncome();

    @Query("SELECT SUM(r.amount) FROM Record r WHERE r.type = 'EXPENSE'")
    Double getTotalExpense();
}
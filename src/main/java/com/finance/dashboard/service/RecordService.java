package com.finance.dashboard.service;

import com.finance.dashboard.model.Record;
import com.finance.dashboard.repository.RecordRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    // ✅ CREATE RECORD
    public Record createRecord(Record record) {
        return recordRepository.save(record);
    }

    // ✅ GET ALL RECORDS
    public List<Record> getAllRecords() {
        return recordRepository.findAll();
    }

    // ✅ DELETE RECORD
    public void deleteRecord(Long id) {
        recordRepository.deleteById(id);
    }

    // ✅ SUMMARY (IMPORTANT)
    public Map<String, Double> getSummary() {

        Double income = recordRepository.getTotalIncome();
        Double expense = recordRepository.getTotalExpense();

        // Handle null (very important)
        if (income == null) income = 0.0;
        if (expense == null) expense = 0.0;

        Map<String, Double> summary = new HashMap<>();
        summary.put("totalIncome", income);
        summary.put("totalExpense", expense);
        summary.put("balance", income - expense);

        return summary;
    }
}
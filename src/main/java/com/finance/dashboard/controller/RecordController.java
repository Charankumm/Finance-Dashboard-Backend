package com.finance.dashboard.controller;

import com.finance.dashboard.model.Record;
import com.finance.dashboard.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/records")
public class RecordController {

    @Autowired
    private RecordService recordService;

    // ✅ Create Record
    @PostMapping
    public ResponseEntity<?> createRecord(@RequestBody Record record) {
        return ResponseEntity.status(201).body(recordService.createRecord(record));
    }

    // ✅ Get All Records
    @GetMapping("/summary")
    public Map<String, Double> getSummary(){
        return recordService.getSummary();
    }

    // ✅ Delete Record
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRecord(@PathVariable Long id) {
        recordService.deleteRecord(id);
        return ResponseEntity.ok("Deleted successfully");
    }
}
package com.cg.hbm.dto;
import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionsDTO {
	
	private int transactionId;
    private String customerName;
	private double amount;
	private LocalDate date;
	private LocalTime time;
	private String city;
	private String History;
}

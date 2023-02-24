package com.cg.hbm.dto;
import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data

public class TransactionsDTOResponseActivity {
	private int transactionId;
    private String customerName;
	private double amount;
	private LocalDate date;
	private LocalTime time;
	private String city;
	private String History;
	
	private String msg;

}
		
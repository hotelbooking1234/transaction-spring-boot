package com.cg.hbm.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@Table



public class Transactions {
	 @Id
	    @GeneratedValue(strategy =GenerationType.AUTO )
		private int transactionId;
		private double amount;
		private LocalDate date;
		private LocalTime time;
		private String city;
		private String history;
		public Transactions(double amount, LocalDate date, LocalTime time, String city, String history) {
			super();
			this.amount = amount;
			this.date = date;
			this.time = time;
			this.city = city;
			this.history = history;
		}
		
}

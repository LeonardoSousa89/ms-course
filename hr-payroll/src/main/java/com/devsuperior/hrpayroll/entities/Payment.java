package com.devsuperior.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable{
		private static final long serialVersionUID = 1;
	
		private String name;
		private double dailyIncome;
		private Integer days;
		
		public Payment(){}

		public Payment(String name, double dailyIncome, Integer days) {
			this.name = name;
			this.dailyIncome = dailyIncome;
			this.days = days;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getDays() {
			return days;
		}

		public void setDays(Integer days) {
			this.days = days;
		}

		public double getDailyIncome() {
			return dailyIncome;
		}

		public void setDailyIncome(double dailyIncome) {
			this.dailyIncome = dailyIncome;
		}

		public double getTotal() {
			return days * dailyIncome;
		}
		
}

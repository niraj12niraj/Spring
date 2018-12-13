package com.supersoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Cash_Collcetion")
public class CashCollcetion {
	
		@Id
		@GeneratedValue
		@Column(name="ID" )
		private Integer id;
			
		@Column(name = "DAILY_EXPANSES")
		private String dailyexpanses;
		
		@Column(name = "NAME")
		private String name;
		
		@Column(name = "DAILY_COLLECTION")
		private String dailycollection;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getDailyexpanses() {
			return dailyexpanses;
		}

		public void setDailyexpanses(String dailyexpanses) {
			this.dailyexpanses = dailyexpanses;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDailycollection() {
			return dailycollection;
		}

		public void setDailycollection(String dailycollection) {
			this.dailycollection = dailycollection;
		}
		

		
		
			
		
}

package com.ellie.practicequestion;

public enum DaysOfWeek {
MONDAY(4), TUESDAY(3), WEDNESDAY(2),THURSDAY(1), FRIDAY(1), SATURDAY(6), SUNDAY(5);
	
	private int daysUntilFriday;

	private DaysOfWeek(int daysUntilFriday) {
		this.daysUntilFriday = daysUntilFriday;
	}

	public int getDaysUntilFriday() {
		return daysUntilFriday;
	}

	public void setDaysUntilFriday(int daysUntilFriday) {
		this.daysUntilFriday = daysUntilFriday;
	}
	
}

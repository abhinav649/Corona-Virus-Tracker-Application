package com.project.coronavirustracker.models;

public class LocationStats {

	private String state;
	private String country;
	private int latestTotalCases;
	private int diffFromPreviousDay;
	
	public void setDiffFromPreviousDay(int diffFromPreviousDay) {
		this.diffFromPreviousDay = diffFromPreviousDay;
	}
	
	public int getDiffFromPreviousDay() {
		return this.diffFromPreviousDay;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setLatestTotalCases(int cases) {
		latestTotalCases = cases;
	}
	
	public int getLatestTotalCases() {
		return this.latestTotalCases;
	}
	
	@Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}

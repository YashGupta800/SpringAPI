package com.springrest.springrest;

public class PayLoad {
   
	private String loadingPoint,unloadingPoint,productType,truckType,comment;
	private int noOfTrucks;
	private double weight;
	public PayLoad(String loadingPoint, String unloadingPoint, String productType, String truckType,
			int noOfTrucks, double weight,String comment) {
		super();
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.comment = comment;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
	}
	public PayLoad() {
		super();
	}
	@Override
	public String toString() {
		return "PayLoad [loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint + ", productType="
				+ productType + ", truckType=" + truckType + ", comment=" + comment + ", noOfTrucks=" + noOfTrucks
				+ ", weight=" + weight + "]";
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}	
}

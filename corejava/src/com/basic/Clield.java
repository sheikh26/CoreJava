package com.basic;

public class Clield extends Parent {

	private String att = "Val Clield";

	public Clield() {
		// TODO Auto-generated constructor stub
	}

	public String getAtt() {
		return this.att;
	}

	public static void main(String[] args) {
		Clield clield = new Clield();

		System.out.println(clield.getAtt());
	}
}

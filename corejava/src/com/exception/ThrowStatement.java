package com.exception;

class ThrowStatement {

	public static void exp(int ptr) {
		if (ptr == 0) {
			throw new NullPointerException();
		} else {
			// throw new UserErr("user exception throw message");
		}

	}

	public static void main(String[] args) {
		int i = 0;
		ThrowStatement.exp(i);

	}
}

package com.cg.hbm.exception;

public class InvalidInputDataException extends Exception{
	 public InvalidInputDataException() {
			// TODO Auto-generated constructor stub
		}

		public InvalidInputDataException(String msg) {
			super(msg);
			System.out.println(msg);
			// TODO Auto-generated constructor stub
		}

}

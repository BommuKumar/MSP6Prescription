package com.naresh.Database.CustomException;

public class InvalidDetails extends RuntimeException {
	
	public InvalidDetails(String msg)
	{
		super(msg);
	}
	public InvalidDetails(String msg,Throwable  cause)
	{
		super(msg,cause);
	}

}

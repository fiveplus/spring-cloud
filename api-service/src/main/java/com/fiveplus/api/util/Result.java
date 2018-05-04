package com.fiveplus.api.util;

public class Result<T> {
	private int code;
	private T result;

	public Result(){}
	
	public Result(int code, T result) {
		this.code = code;
		this.result = result;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	
}

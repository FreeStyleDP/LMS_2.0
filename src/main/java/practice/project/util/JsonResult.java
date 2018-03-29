package practice.project.util;

import java.util.List;

import practice.project.entity.Inform;

public class JsonResult {
	
//	0:成功
//	其他：失败
	private static final int success = 0; 
	private static final int error = 1; 
	
	private int status;
	private Object data;
	private Object rows;
	private int total;
	private String message ;
	
//	成功时
	public JsonResult(Object data) {
		super();
		this.status = success;
		this.data = data;
	}
	
//	失败时
	public JsonResult(Throwable e) {
		super();
		this.status = error;
		this.data = null;
		this.message = e.getMessage();
	}

//	失败时
	public JsonResult(int status,Throwable e) {
		super();
		this.status = status;
		this.data = null;
		this.message = e.getMessage();
	}
	
	public JsonResult() {
		super();
	}

	public JsonResult(int status, Object data, String message) {
		super();
		this.status = status;
		this.data = data;
		this.message = message;
	}
	
//	用于分页
	public JsonResult(Object rows, int total) {
		this.status =success;
		this.rows= rows;
		this.total=total;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static int getSuccess() {
		return success;
	}

	public Object getRows() {
		return rows;
	}

	public void setRows(Object rows) {
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public static int getError() {
		return error;
	}

	@Override
	public String toString() {
		return "JsonResult [status=" + status + ", data=" + data + ", rows=" + rows + ", total=" + total + ", message="
				+ message + "]";
	}

	
	
	
	
	
	
	
	
}

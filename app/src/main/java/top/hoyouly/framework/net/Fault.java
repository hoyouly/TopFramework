package top.hoyouly.framework.net;

/**
 * Created by hoyouly on 18-3-27.
 * 异常处理类，将异常包装成一个Fault,抛给上层统一处理
 */

public class Fault extends RuntimeException {
	private int errorCode;

	public Fault(int errorCode,String message){
		super(message);
		this.errorCode=errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}
}

/**
 * 
 */
package cn.wsy.myretrofit.retrofit.models;

/**
 * @author wsy
 *
 */
public class BaseRsp {
	
	private String result;
	private String reason;
	
	public BaseRsp(){}
	
	/**
	 * @param result
	 * @param reason
	 */
	public BaseRsp(String result, String reason) {
		super();
		this.result = result;
		this.reason = reason;
	}
	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	

}

package cn.ennwifi.opentsdb.resp;

/**
 * @author zhangbo
 *
 */
public class Error {

  public Integer code;
  public String message;
  public String details;
  public String trace;

  /**
   * @return the code
   */
  public Integer getCode() {
    return code;
  }

  /**
   * @param code the code to set
   */
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * @param message the message to set
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * @return the details
   */
  public String getDetails() {
    return details;
  }

  /**
   * @param details the details to set
   */
  public void setDetails(String details) {
    this.details = details;
  }

  /**
   * @return the trace
   */
  public String getTrace() {
    return trace;
  }

  /**
   * @param trace the trace to set
   */
  public void setTrace(String trace) {
    this.trace = trace;
  }


}

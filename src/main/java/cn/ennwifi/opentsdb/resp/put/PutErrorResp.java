package cn.ennwifi.opentsdb.resp.put;

/**
 * @author zhangbo
 *
 */
public class PutErrorResp extends PutResp {

  public String message;

  public PutErrorResp(Integer statusCode) {
    super(statusCode);
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

}

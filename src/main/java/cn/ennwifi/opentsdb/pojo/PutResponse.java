package cn.ennwifi.opentsdb.pojo;

/**
 * @author zhangbo
 *
 */
public class PutResponse {

  private int statusCode;
  private PutErrorDetail errorDetail;

  public boolean isSuccess() {
    return statusCode == 204;
  }

  public PutResponse(int statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * @return the statusCode
   */
  public int getStatusCode() {
    return statusCode;
  }

  /**
   * @param statusCode the statusCode to set
   */
  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * @return the errorDetail
   */
  public PutErrorDetail getErrorDetail() {
    return errorDetail;
  }

  /**
   * @param errorDetail the errorDetail to set
   */
  public void setErrorDetail(PutErrorDetail errorDetail) {
    this.errorDetail = errorDetail;
  }

  @Override
  public String toString() {
    return "PutResponse [statusCode=" + statusCode + ", errorDetail=" + errorDetail + "]";
  }

}

package cn.ennwifi.opentsdb.resp.put;

/**
 * @author zhangbo
 *
 */
public class PutErrorResp2 extends PutResp {

  private PutErrorDetail errorDetail;

  public PutErrorResp2(int statusCode) {
    super(statusCode);
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

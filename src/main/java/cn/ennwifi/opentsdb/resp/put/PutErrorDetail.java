package cn.ennwifi.opentsdb.resp.put;

import java.util.List;

/**
 * @author zhangbo
 *
 */
public class PutErrorDetail {

  private List<ErrorDetailEntity> errors;

  private Integer success;
  private Integer failed;



  /**
   * @return the errors
   */
  public List<ErrorDetailEntity> getErrors() {
    return errors;
  }

  /**
   * @param errors the errors to set
   */
  public void setErrors(List<ErrorDetailEntity> errors) {
    this.errors = errors;
  }

  /**
   * @return the success
   */
  public Integer getSuccess() {
    return success;
  }

  /**
   * @param success the success to set
   */
  public void setSuccess(Integer success) {
    this.success = success;
  }

  /**
   * @return the failed
   */
  public Integer getFailed() {
    return failed;
  }

  /**
   * @param failed the failed to set
   */
  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  @Override
  public String toString() {
    return "ResponseDetail [errors=" + errors + ", success=" + success + ", failed=" + failed + "]";
  }

}

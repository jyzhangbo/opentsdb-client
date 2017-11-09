package cn.ennwifi.opentsdb.resp.put;

import cn.ennwifi.opentsdb.req.put.DataPoint;

/**
 * @author zhangbo
 *
 */
public class ErrorDetailEntity {

  private DataPoint datapoint;
  private String error;

  /**
   * @return the datapoint
   */
  public DataPoint getDatapoint() {
    return datapoint;
  }

  /**
   * @param datapoint the datapoint to set
   */
  public void setDatapoint(DataPoint datapoint) {
    this.datapoint = datapoint;
  }

  /**
   * @return the error
   */
  public String getError() {
    return error;
  }

  /**
   * @param error the error to set
   */
  public void setError(String error) {
    this.error = error;
  }

  @Override
  public String toString() {
    return "ErrorDetail [datapoint=" + datapoint + ", error=" + error + "]";
  }

}

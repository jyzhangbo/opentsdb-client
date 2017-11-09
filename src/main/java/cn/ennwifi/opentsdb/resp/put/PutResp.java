package cn.ennwifi.opentsdb.resp.put;

import cn.ennwifi.opentsdb.resp.Response;

/**
 * @author zhangbo
 *
 */
public abstract class PutResp implements Response {

  public Integer statusCode;

  public boolean isSuccess() {
    return statusCode == 204;
  }

  public PutResp(Integer statusCode) {
    this.statusCode = statusCode;
  }

}

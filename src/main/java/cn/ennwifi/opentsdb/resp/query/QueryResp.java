package cn.ennwifi.opentsdb.resp.query;

import cn.ennwifi.opentsdb.resp.Response;

/**
 * @author zhangbo
 *
 */
public abstract class QueryResp implements Response {

  public Integer statusCode;

  public boolean isSuccess() {
    return statusCode == 200;
  }

  public QueryResp(Integer statusCode) {
    this.statusCode = statusCode;
  }
}

package cn.ennwifi.opentsdb.resp.query;

/**
 * @author zhangbo
 *
 */
public class QueryErrorResp extends QueryResp {

  public QueryErrorResp(Integer statusCode) {
    super(statusCode);
  }

  public String message;

}

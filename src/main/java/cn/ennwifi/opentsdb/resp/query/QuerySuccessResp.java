package cn.ennwifi.opentsdb.resp.query;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangbo
 *
 */
public class QuerySuccessResp extends QueryResp {

  public QuerySuccessResp(Integer statusCode) {
    super(statusCode);
  }

  public List<QuerySuccessDetailResp> details = new ArrayList<>();

}

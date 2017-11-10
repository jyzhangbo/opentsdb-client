package cn.ennwifi.opentsdb.builder.query;

import org.nutz.json.Json;
import org.nutz.json.JsonFormat;

import cn.ennwifi.opentsdb.req.query.QueryDataReq;

/**
 * @author zhangbo
 *
 */
public class QueryBuild {

  private QueryBuild() {}

  public QueryDataReq dataReq;

  public static QueryBuild getInstance() {
    return new QueryBuild();
  }

  public QueryDataReq getDataReq() {
    return dataReq;
  }



  public QueryDataReq setDataReq(Integer start) {
    this.dataReq = new QueryDataReq(start);
    return dataReq;
  }

  public String build() {

    return Json.toJson(dataReq, JsonFormat.tidy());
  }

}

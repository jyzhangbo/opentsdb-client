package cn.ennwifi.opentsdb.builder.query;

import org.nutz.json.Json;
import org.nutz.json.JsonFormat;

import cn.ennwifi.opentsdb.req.query.QueryDataReq;

/**
 * 查询数据请求参数工具类.
 * 
 * @author zhangbo
 *
 */
public class QueryBuild {

  private QueryBuild() {}

  public QueryDataReq dataReq;

  /**
   * 获取实例对象.
   * 
   * @return
   */
  public static QueryBuild getInstance() {
    return new QueryBuild();
  }

  public QueryDataReq getDataReq() {
    return dataReq;
  }


  /**
   * 添加具体请求体.
   * 
   * @param start
   * @return
   */
  public QueryDataReq setDataReq(Integer start) {
    this.dataReq = new QueryDataReq(start);
    return dataReq;
  }

  /**
   * 将请求对象转换为json.
   * 
   * @return
   */
  public String build() {

    return Json.toJson(dataReq, JsonFormat.tidy());
  }

}

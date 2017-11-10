package cn.ennwifi.opentsdb.req.query;

/**
 * @author zhangbo
 *
 */
public class QueryDataFilter {

  /**
   * tagv的过滤规则.
   */
  public String type;

  public QueryDataFilter setType(String type) {
    this.type = type;
    return this;
  }

  /**
   * tag的key.
   */
  public String tagk;

  public QueryDataFilter setTagk(String tagk) {
    this.tagk = tagk;
    return this;
  }

  /**
   * tag的value.
   */
  public String filter;

  public QueryDataFilter setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * 是否将结果按tag分组.
   */
  public boolean groupBy = false;

  public QueryDataFilter setGroupBy(boolean groupBy) {
    this.groupBy = groupBy;
    return this;
  }
}

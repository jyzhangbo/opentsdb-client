package cn.ennwifi.opentsdb.req.query;

/**
 * 数据查询的filter.
 * 
 * @author zhangbo
 *
 */
public class QueryDataFilter {

  /**
   * The name of the filter to invoke.
   */
  public String type;

  public QueryDataFilter setType(String type) {
    this.type = type;
    return this;
  }

  /**
   * The tag key to invoke the filter on.
   */
  public String tagk;

  public QueryDataFilter setTagk(String tagk) {
    this.tagk = tagk;
    return this;
  }

  /**
   * The filter expression to evaluate and depends on the filter being used.
   */
  public String filter;

  public QueryDataFilter setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Whether or not to group the results by each value matched by the filter.
   */
  public boolean groupBy = false;

  public QueryDataFilter setGroupBy(boolean groupBy) {
    this.groupBy = groupBy;
    return this;
  }
}

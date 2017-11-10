package cn.ennwifi.opentsdb.req.query;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据查询的querie.
 * 
 * @author zhangbo
 *
 */
public class QueryDataQuerie {

  /**
   * The name of an aggregation function to use.
   */
  public String aggregator;

  public QueryDataQuerie setAggregator(String aggregator) {
    this.aggregator = aggregator;
    return this;
  }

  /**
   * The name of a metric stored in the system.
   */
  public String metric;

  public QueryDataQuerie setMetric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * An optional downsampling function to reduce the amount of data returned.
   */
  public String downsample;

  public QueryDataQuerie setDownsample(String downsample) {
    this.downsample = downsample;
    return this;
  }

  /**
   * Whether or not the data should be converted into deltas before returning.
   */
  public boolean rate = false;

  public QueryDataQuerie setRate(boolean rate) {
    this.rate = rate;
    return this;
  }

  public List<QueryDataFilter> filters = new ArrayList<>();

  /**
   * Filters the time series emitted in the results.
   * 
   * @param type
   * @param tagk
   * @param filter
   * @param groupBy
   * @return
   */
  public QueryDataQuerie addFilter(String type, String tagk, String filter, boolean groupBy) {
    QueryDataFilter queryDataFilter = new QueryDataFilter();
    queryDataFilter.setType(type).setTagk(tagk).setFilter(filter).setGroupBy(groupBy);
    filters.add(queryDataFilter);
    return this;
  }

  public QueryDataQuerie addFilters(List<QueryDataFilter> filters) {
    filters.addAll(filters);
    return this;
  }

}

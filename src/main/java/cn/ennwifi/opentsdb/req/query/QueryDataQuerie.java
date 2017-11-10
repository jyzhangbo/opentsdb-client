package cn.ennwifi.opentsdb.req.query;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangbo
 *
 */
public class QueryDataQuerie {

  public String aggregator;

  public QueryDataQuerie setAggregator(String aggregator) {
    this.aggregator = aggregator;
    return this;
  }

  public String metric;

  public QueryDataQuerie setMetric(String metric) {
    this.metric = metric;
    return this;
  }

  public String downsample;

  public QueryDataQuerie setDownsample(String downsample) {
    this.downsample = downsample;
    return this;
  }

  public boolean rate = false;

  public QueryDataQuerie setRate(boolean rate) {
    this.rate = rate;
    return this;
  }

  public List<QueryDataFilter> filters = new ArrayList<>();

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

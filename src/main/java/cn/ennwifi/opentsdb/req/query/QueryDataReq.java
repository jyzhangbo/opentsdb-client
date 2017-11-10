package cn.ennwifi.opentsdb.req.query;

import java.util.ArrayList;
import java.util.List;

/**
 * 查询数据的请求体.
 * 
 * @author zhangbo
 *
 */
public class QueryDataReq {

  /**
   * The start time for the query.
   */
  public Integer start;

  /**
   * An end time for the query.
   */
  public Integer end;

  public List<QueryDataQuerie> queries = new ArrayList<>();

  public QueryDataReq(Integer start, Integer end) {
    this.start = start;
    this.end = end;
  }

  /**
   * 默认结束时间为当前时间.
   * 
   * @param start
   */
  public QueryDataReq(Integer start) {
    this.start = start;
    this.end = (int) (System.currentTimeMillis() / 1000);
  }

  /**
   * 添加具体的querie.
   * 
   * @param querie
   * @return
   */
  public QueryDataReq addQuerie(QueryDataQuerie querie) {
    queries.add(querie);
    return this;
  }

  public QueryDataReq addQueries(List<QueryDataQuerie> queries) {
    queries.addAll(queries);
    return this;
  }

  /**
   * Whether or not to return annotations with a query.
   */
  public boolean noAnnotations = false;

  public QueryDataReq setNoAnnotations(boolean noAnnotations) {
    this.noAnnotations = noAnnotations;
    return this;
  }

  /**
   * Whether or not the query should retrieve global annotations for the requested timespan.
   */
  public boolean globalAnnotations = false;

  public QueryDataReq setGlobalAnnotations(boolean globalAnnotations) {
    this.globalAnnotations = globalAnnotations;
    return this;
  }

  /**
   * Whether or not to output data point timestamps in milliseconds or seconds.
   */
  public boolean msResolution = false;

  public QueryDataReq setMsResolution(boolean msResolution) {
    this.msResolution = msResolution;
    return this;
  }

  /**
   * Whether or not to output the TSUIDs associated with timeseries in the results.
   */
  public boolean showTSUIDs = false;

  public QueryDataReq setShowTSUIDs(boolean showTSUIDs) {
    this.showTSUIDs = showTSUIDs;
    return this;
  }

  /**
   * Whether or not to show a summary of timings surrounding the query in the results.
   */
  public boolean showSummary = false;

  public QueryDataReq setShowSummary(boolean showSummary) {
    this.showSummary = showSummary;
    return this;
  }

  /**
   * Whether or not to show detailed timings surrounding the query in the results.
   */
  public boolean showStats = false;

  public QueryDataReq setShowStats(boolean showStats) {
    this.showStats = showStats;
    return this;
  }

  /**
   * Whether or not to return the original sub query with the query results.
   */
  public boolean showQuery = false;

  public QueryDataReq setShowQuery(boolean showQuery) {
    this.showQuery = showQuery;
    return this;
  }

  /**
   * An optional timezone for calendar-based downsampling.
   */
  public String timezone = "Asia/Shanghai";

  public QueryDataReq setTimezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Whether or not use the calendar based on the given timezone for downsampling intervals.
   */
  public Boolean useCalendar = true;

  public QueryDataReq setUseCalendar(boolean useCalendar) {
    this.useCalendar = useCalendar;
    return this;
  }

  /**
   * Can be passed to the JSON with a POST to delete any data points that match the given query.
   */
  public Boolean delete = false;

  public QueryDataReq setDelete(boolean delete) {
    this.delete = delete;
    return this;
  }

}

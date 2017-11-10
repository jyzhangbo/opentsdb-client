package cn.ennwifi.opentsdb.req.query;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangbo
 *
 */
public class QueryDataReq {

  public Integer start;

  public Integer end;

  public List<QueryDataQuerie> queries = new ArrayList<>();

  public QueryDataReq(Integer start, Integer end) {
    this.start = start;
    this.end = end;
  }

  public QueryDataReq(Integer start) {
    this.start = start;
    this.end = (int) (System.currentTimeMillis() / 1000);
  }

  public QueryDataReq addQuerie(QueryDataQuerie querie) {
    queries.add(querie);
    return this;
  }

  public QueryDataReq addQueries(List<QueryDataQuerie> queries) {
    queries.addAll(queries);
    return this;
  }

  public boolean noAnnotations = false;

  public QueryDataReq setNoAnnotations(boolean noAnnotations) {
    this.noAnnotations = noAnnotations;
    return this;
  }

  public boolean globalAnnotations = false;

  public QueryDataReq setGlobalAnnotations(boolean globalAnnotations) {
    this.globalAnnotations = globalAnnotations;
    return this;
  }

  public boolean msResolution = false;

  public QueryDataReq setMsResolution(boolean msResolution) {
    this.msResolution = msResolution;
    return this;
  }

  public boolean showTSUIDs = false;

  public QueryDataReq setShowTSUIDs(boolean showTSUIDs) {
    this.showTSUIDs = showTSUIDs;
    return this;
  }

  public boolean showSummary = false;

  public QueryDataReq setShowSummary(boolean showSummary) {
    this.showSummary = showSummary;
    return this;
  }

  public boolean showStats = false;

  public QueryDataReq setShowStats(boolean showStats) {
    this.showStats = showStats;
    return this;
  }

  public boolean showQuery = false;

  public QueryDataReq setShowQuery(boolean showQuery) {
    this.showQuery = showQuery;
    return this;
  }

  public String timezone = "Asia/Shanghai";

  public QueryDataReq setTimezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  public Boolean useCalendar = true;

  public QueryDataReq setUseCalendar(boolean useCalendar) {
    this.useCalendar = useCalendar;
    return this;
  }

  public Boolean delete = false;

  public QueryDataReq setDelete(boolean delete) {
    this.delete = delete;
    return this;
  }

}

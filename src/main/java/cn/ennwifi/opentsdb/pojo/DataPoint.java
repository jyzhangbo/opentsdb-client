package cn.ennwifi.opentsdb.pojo;

import java.util.Map;

/**
 * @author zhangbo
 *
 */
public class DataPoint {

  public String metric;


  public String value;

  public Integer timestamp;

  public Map<String, String> tags;

  public DataPoint(String metric) {
    this.metric = metric;
  }

}

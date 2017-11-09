package cn.ennwifi.opentsdb.pojo;

import java.util.Map;

/**
 * @author zhangbo
 *
 */
public class DataPoint {

  public String metric;


  public Object value;

  public Integer timestamp;

  public Map<String, String> tags;

  public DataPoint() {}

  public DataPoint(String metric) {
    this.metric = metric;
  }

  public DataPoint addTags(Map<String, String> tags) {
    this.tags.putAll(tags);
    return this;
  }

  public DataPoint addTag(String key, String value) {
    this.tags.put(key, value);
    return this;
  }

  public DataPoint setMetric(String metric) {
    this.metric = metric;
    return this;
  }

  public DataPoint setValue(String value) {
    this.value = value;
    this.timestamp = (int) (System.currentTimeMillis() / 1000);
    return this;
  }

  public DataPoint setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public DataPoint setValue(String value, Integer timestamp) {
    this.value = value;
    this.timestamp = timestamp;
    return this;
  }

  public DataPoint setValue(Integer value, Integer timestamp) {
    this.value = value;
    this.timestamp = timestamp;
    return this;
  }

  public DataPoint setValue(Double value, Integer timestamp) {
    this.value = value;
    this.timestamp = timestamp;
    return this;
  }

}

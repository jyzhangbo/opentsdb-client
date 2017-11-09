package cn.ennwifi.opentsdb.req.put;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangbo
 *
 */
public class DataPoint {

  private String metric;


  private Object value;

  private Integer timestamp;

  private Map<String, String> tags = new HashMap<>();

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

  /**
   * @return the value
   */
  public Object getValue() {
    return value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(Object value) {
    this.value = value;
  }

  /**
   * @return the tags
   */
  public Map<String, String> getTags() {
    return tags;
  }

  /**
   * @param tags the tags to set
   */
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  /**
   * @return the metric
   */
  public String getMetric() {
    return metric;
  }

  /**
   * @return the timestamp
   */
  public Integer getTimestamp() {
    return timestamp;
  }


}

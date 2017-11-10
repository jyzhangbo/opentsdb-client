package cn.ennwifi.opentsdb.req.put;

import java.util.HashMap;
import java.util.Map;

/**
 * 采集点.
 * 
 * @author zhangbo
 *
 */
public class DataPoint {

  /**
   * 指标.
   */
  private String metric;

  /**
   * 具体数值.
   */
  private Object value;

  /**
   * 时间.
   */
  private Integer timestamp;

  /**
   * 采集点标签.
   */
  private Map<String, String> tags = new HashMap<>();

  public DataPoint() {}

  public DataPoint(String metric) {
    this.metric = metric;
  }

  /**
   * 添加标签项.
   * 
   * @param tags
   * @return
   */
  public DataPoint addTags(Map<String, String> tags) {
    this.tags.putAll(tags);
    return this;
  }

  /**
   * 添加一个标签.
   * 
   * @param key
   * @param value
   * @return
   */
  public DataPoint addTag(String key, String value) {
    this.tags.put(key, value);
    return this;
  }

  /**
   * 给指标赋值.
   * 
   * @param metric
   * @return
   */
  public DataPoint setMetric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * 添加value.
   * 
   * @param value
   * @return
   */
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

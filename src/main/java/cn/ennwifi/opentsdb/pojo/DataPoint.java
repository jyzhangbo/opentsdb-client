package cn.ennwifi.opentsdb.pojo;

import java.util.Map;

/**
 * @author zhangbo
 *
 */
public class DataPoint {

  /**
   * 上传数据的类型.
   */
  public String metric;


  public String value;

  public Integer timestamp;

  public Map<String, String> tags;



}

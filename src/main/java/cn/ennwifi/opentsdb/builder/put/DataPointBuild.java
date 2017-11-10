package cn.ennwifi.opentsdb.builder.put;

import java.util.ArrayList;
import java.util.List;

import org.nutz.json.Json;
import org.nutz.json.JsonFormat;

import cn.ennwifi.opentsdb.req.put.DataPoint;

/**
 * 上传数据请求参数工具类.
 * 
 * @author zhangbo
 *
 */
public class DataPointBuild {

  private List<DataPoint> dataPoints = new ArrayList<>();

  private DataPointBuild() {}

  /**
   * 获取实例对象.
   * 
   * @return
   */
  public static DataPointBuild getInstance() {
    return new DataPointBuild();
  }

  /**
   * 添加一个采集点.
   * 
   * @param metric
   * @return
   */
  public DataPoint addDataPoint(String metric) {
    DataPoint dataPoint = new DataPoint(metric);
    dataPoints.add(dataPoint);
    return dataPoint;
  }

  /**
   * 将请求参数转换为json.
   * 
   * @return
   */
  public String build() {
    if (dataPoints.size() == 1) {
      return Json.toJson(dataPoints.get(0), JsonFormat.tidy());
    } else {
      return Json.toJson(dataPoints, JsonFormat.tidy());
    }
  }

}

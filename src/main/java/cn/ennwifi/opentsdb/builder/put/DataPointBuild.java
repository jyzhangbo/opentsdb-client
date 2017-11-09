package cn.ennwifi.opentsdb.builder.put;

import java.util.ArrayList;
import java.util.List;

import org.nutz.json.Json;
import org.nutz.json.JsonFormat;

import cn.ennwifi.opentsdb.req.put.DataPoint;

/**
 * @author zhangbo
 *
 */
public class DataPointBuild {

  private List<DataPoint> dataPoints = new ArrayList<>();

  private DataPointBuild() {}

  public static DataPointBuild getInstance() {
    return new DataPointBuild();
  }

  public DataPoint addDataPoint(String metric) {
    DataPoint dataPoint = new DataPoint(metric);
    dataPoints.add(dataPoint);
    return dataPoint;
  }

  public String build() {
    if (dataPoints.size() == 1) {
      return Json.toJson(dataPoints.get(0), JsonFormat.tidy());
    } else {
      return Json.toJson(dataPoints, JsonFormat.tidy());
    }
  }

}

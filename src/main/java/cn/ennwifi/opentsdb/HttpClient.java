package cn.ennwifi.opentsdb;

import cn.ennwifi.opentsdb.builder.DataPointBuild;
import cn.ennwifi.opentsdb.pojo.PutParameter;
import cn.ennwifi.opentsdb.pojo.PutResponse;

/**
 * @author zhangbo
 *
 */
public interface HttpClient {

  public final static String PUT = "/api/put";

  public PutResponse put(DataPointBuild dataPointBuild);

  public PutResponse put(DataPointBuild dataPointBuild, PutParameter parameter);

}

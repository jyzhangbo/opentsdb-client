package cn.ennwifi.opentsdb;

import cn.ennwifi.opentsdb.builder.put.DataPointBuild;
import cn.ennwifi.opentsdb.req.put.PutParameter;
import cn.ennwifi.opentsdb.resp.put.PutResp;

/**
 * @author zhangbo
 *
 */
public interface HttpClient {

  public final static String PUT = "/api/put";

  public PutResp put(DataPointBuild dataPointBuild);

  public PutResp put(DataPointBuild dataPointBuild, PutParameter parameter);

}

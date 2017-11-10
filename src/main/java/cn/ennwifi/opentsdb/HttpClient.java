package cn.ennwifi.opentsdb;

import cn.ennwifi.opentsdb.builder.put.DataPointBuild;
import cn.ennwifi.opentsdb.builder.query.QueryBuild;
import cn.ennwifi.opentsdb.req.put.PutParameter;
import cn.ennwifi.opentsdb.resp.put.PutResp;
import cn.ennwifi.opentsdb.resp.query.QueryResp;

/**
 * @author zhangbo
 *
 */
public interface HttpClient {

  public final static String PUT = "/api/put";

  public final static String QUERY = "/api/query";

  public PutResp put(DataPointBuild dataPointBuild);

  public PutResp put(DataPointBuild dataPointBuild, PutParameter parameter);

  public QueryResp get(QueryBuild queryBuild);

}

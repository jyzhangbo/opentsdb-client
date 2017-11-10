package cn.ennwifi.opentsdb;

import org.nutz.json.Json;

import cn.ennwifi.opentsdb.builder.query.QueryBuild;
import cn.ennwifi.opentsdb.req.query.AggregatorParameter;
import cn.ennwifi.opentsdb.req.query.FilterTypeParameter;
import cn.ennwifi.opentsdb.req.query.QueryDataQuerie;
import cn.ennwifi.opentsdb.resp.query.QueryResp;

/**
 * @author zhangbo
 *
 */
public class QueryTest {

  public static void main(String[] args) {
    QueryBuild build = QueryBuild.getInstance();

    QueryDataQuerie querie = new QueryDataQuerie();
    querie.setMetric("meter.client").setAggregator(AggregatorParameter.sum.toString())
        .addFilter(FilterTypeParameter.literal_or.toString(), "host", "zhangbo", true);

    build.setDataReq(1510156800).addQuerie(querie);

    HttpClientImpl clientImpl = new HttpClientImpl("http://10.39.0.200:4242");
    QueryResp queryResp = clientImpl.get(build);
    System.out.println(Json.toJson(queryResp));
  }

}

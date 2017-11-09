package cn.ennwifi.opentsdb;

import org.nutz.json.Json;
import org.nutz.json.JsonFormat;

import cn.ennwifi.opentsdb.builder.put.DataPointBuild;
import cn.ennwifi.opentsdb.resp.put.PutResp;

/**
 * @author zhangbo
 *
 */
public class HttpTest {

  public static void main(String[] args) {
    DataPointBuild build = DataPointBuild.getInstance();
    build.addDataPoint("meter.client").setValue("876", (int) (System.currentTimeMillis() / 1000)).addTag("host",
        "zhangbo");

    HttpClientImpl clientImpl = new HttpClientImpl("http://10.39.0.200:4242");
    PutResp put = clientImpl.put(build);
    System.err.println(Json.toJson(put, JsonFormat.tidy()));

  }

}

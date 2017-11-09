package cn.ennwifi.opentsdb;

import java.util.HashMap;
import java.util.Map;

import org.nutz.json.Json;

import cn.ennwifi.opentsdb.pojo.PutErrorDetail;

/**
 * @author zhangbo
 *
 */
public class HttpTest {

  public static void main(String[] args) {
    Map<String, Object> map = new HashMap<>();
    map.put("failed", 1);
    map.put("success", 0);
    String content = Json.toJson(map);
    PutErrorDetail detail = Json.fromJson(PutErrorDetail.class, content);
    System.out.println(detail);
  }

}

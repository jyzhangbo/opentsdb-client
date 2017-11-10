package cn.ennwifi.opentsdb.resp.query;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangbo
 *
 */
public class QuerySuccessDetailResp {

  public String metric;

  public Map<String, Object> tags = new HashMap<>();

  public List<String> aggregatedTags = new ArrayList<>();

  public List<String> tsuids = new ArrayList<>();

  public Map<String, Object> dps = new HashMap<>();

}

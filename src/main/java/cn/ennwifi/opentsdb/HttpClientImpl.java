package cn.ennwifi.opentsdb;

import java.util.logging.Logger;

import org.nutz.http.Http;
import org.nutz.http.Response;
import org.nutz.json.Json;

import cn.ennwifi.opentsdb.builder.DataPointBuild;
import cn.ennwifi.opentsdb.pojo.PutParameter;
import cn.ennwifi.opentsdb.pojo.PutResponse;
import cn.ennwifi.opentsdb.pojo.PutErrorDetail;

/**
 * @author zhangbo
 *
 */
public class HttpClientImpl implements HttpClient {

  private static final Logger LOGGER = Logger.getLogger("HttpClientImpl");

  private String URL;

  public HttpClientImpl(String url) {
    this.URL = url;
  }

  @Override
  public PutResponse put(DataPointBuild dataPointBuild) {
    return put(dataPointBuild, PutParameter.NOTHING);
  }

  @Override
  public PutResponse put(DataPointBuild dataPointBuild, PutParameter parameter) {

    LOGGER.info("the data is " + dataPointBuild.build());

    Response resp = Http.post3(getUrl(parameter), dataPointBuild.build(), null, 60000);

    return getResponse(resp);
  }


  private PutResponse getResponse(Response resp) {
    int status = resp.getStatus();
    String content = resp.getContent();

    PutResponse response = new PutResponse(status);

    if (response.isSuccess()) {
      LOGGER.info("the response status is success");
    } else {
      LOGGER.info("the response is" + content);
      PutErrorDetail detail = Json.fromJson(PutErrorDetail.class, content);
      response.setErrorDetail(detail);
    }

    return response;
  }

  private String getUrl(PutParameter parameter) {

    String url = URL + PUT;

    switch (parameter) {
      case SUMMARY:
        url = url + "?summary";
        break;
      case DETAILS:
        url = url + "?details";
        break;
      case SYNC:
        url = url + "?sync";
        break;
      default:
        break;

    }
    LOGGER.info("the url is " + url);
    return url;
  }


}

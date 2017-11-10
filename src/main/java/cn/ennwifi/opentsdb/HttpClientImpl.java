package cn.ennwifi.opentsdb;

import java.util.List;
import java.util.logging.Logger;

import org.nutz.http.Http;
import org.nutz.http.Response;
import org.nutz.json.Json;

import cn.ennwifi.opentsdb.builder.put.DataPointBuild;
import cn.ennwifi.opentsdb.builder.query.QueryBuild;
import cn.ennwifi.opentsdb.req.put.PutParameter;
import cn.ennwifi.opentsdb.resp.ErrorResult;
import cn.ennwifi.opentsdb.resp.put.PutErrorDetail;
import cn.ennwifi.opentsdb.resp.put.PutErrorResp;
import cn.ennwifi.opentsdb.resp.put.PutErrorResp2;
import cn.ennwifi.opentsdb.resp.put.PutResp;
import cn.ennwifi.opentsdb.resp.put.PutSuccesResp;
import cn.ennwifi.opentsdb.resp.query.QueryErrorResp;
import cn.ennwifi.opentsdb.resp.query.QueryResp;
import cn.ennwifi.opentsdb.resp.query.QuerySuccessDetailResp;
import cn.ennwifi.opentsdb.resp.query.QuerySuccessResp;

/**
 * @author zhangbo
 *
 */
public class HttpClientImpl implements HttpClient {

  private static final Logger LOGGER = Logger.getLogger("HttpClientImpl");

  private String URL;

  private PutParameter parameter;

  private String ENDPOINT;

  public HttpClientImpl(String url) {
    this.URL = url;
  }

  @Override
  public PutResp put(DataPointBuild dataPointBuild) {
    return put(dataPointBuild, PutParameter.NOTHING);
  }

  @Override
  public PutResp put(DataPointBuild dataPointBuild, PutParameter parameter) {
    this.parameter = parameter;
    LOGGER.info("the request is " + dataPointBuild.build());
    this.ENDPOINT = PUT;
    Response resp = Http.post3(getUrl(), dataPointBuild.build(), null, 60000);

    return putResponse(resp);
  }


  private PutResp putResponse(Response resp) {
    int status = resp.getStatus();
    String content = resp.getContent();
    if (status == 204) {
      LOGGER.info("the response status is success");
      return new PutSuccesResp(status);
    } else {
      LOGGER.info("the response is" + content);
      switch (parameter) {
        case NOTHING:
          PutErrorResp errorResp = new PutErrorResp(status);
          ErrorResult result = Json.fromJson(ErrorResult.class, content);
          errorResp.message = result.error.message;
          return errorResp;
        default:
          PutErrorResp2 detailErrorResp = new PutErrorResp2(status);
          PutErrorDetail detail = Json.fromJson(PutErrorDetail.class, content);
          detailErrorResp.setErrorDetail(detail);
          return detailErrorResp;
      }
    }
  }

  private String getUrl() {

    String url = URL + ENDPOINT;

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

  @Override
  public QueryResp get(QueryBuild queryBuild) {
    this.ENDPOINT = QUERY;
    this.parameter = PutParameter.NOTHING;
    LOGGER.info("the request is " + queryBuild.build());
    Response resp = Http.post3(getUrl(), queryBuild.build(), null, 60000);

    return getResponse(resp);
  }

  private QueryResp getResponse(Response resp) {
    int status = resp.getStatus();
    String content = resp.getContent();

    LOGGER.info("the response is" + content);

    if (status != 200) {
      QueryErrorResp errorResp = new QueryErrorResp(status);
      ErrorResult result = Json.fromJson(ErrorResult.class, content);
      errorResp.message = result.error.message;
      return errorResp;
    } else {
      QuerySuccessResp successResp = new QuerySuccessResp(status);

      List<QuerySuccessDetailResp> details = Json.fromJson(List.class, content);
      successResp.details = details;
      return successResp;
    }

  }


}

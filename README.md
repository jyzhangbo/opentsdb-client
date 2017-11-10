## This is a java client to visit OpenTSDB

In the interior, I used the Nutz to send post request.Because it is very easy,and I do not find any problem in production environment.

If you are interested in it,you can fork it. 
If you find a error,you can tell me by email,or push your change,I will merge your code if you are right.

The pom.xml

	<dependency>
	  <groupId>cn.ennwifi</groupId>
	  <artifactId>opentsdb-client</artifactId>
	  <version>0.0.2</version>
	</dependency>
	

### VERSION 0.0.1
This version only support the endpoint /api/put.You can use it with maven.

Example:

	DataPointBuild build = DataPointBuild.getInstance();
    build.addDataPoint("meter.client").setValue("876", (int) (System.currentTimeMillis() / 1000)).addTag("host",
        "zhangbo");
    HttpClientImpl clientImpl = new HttpClientImpl("http://10.39.0.200:4242");
    PutResp put = clientImpl.put(build);
    
### VERSION 0.0.2
add the endpoint /api/query
Example:

	QueryBuild build = QueryBuild.getInstance();
    QueryDataQuerie querie = new QueryDataQuerie();
    querie.setMetric("meter.client").setAggregator(AggregatorParameter.sum.toString())
        .addFilter(FilterTypeParameter.literal_or.toString(), "host", "zhangbo", true);

    build.setDataReq(1510156800).addQuerie(querie);

    HttpClientImpl clientImpl = new HttpClientImpl("http://10.39.0.200:4242");
    QueryResp queryResp = clientImpl.get(build);
    System.out.println(Json.toJson(queryResp));	
	
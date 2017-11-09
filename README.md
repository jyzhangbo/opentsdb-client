## This is a java client to visit OpenTSDB

In the interior, I used the Nutz to send post request.Because it is very easy,and I do not find any problem in production environment.

If you are interested in it,you can fork it. 
If you find a error,you can tell me by email,or push your change,I will merge your code if you are right.

### VERSION 0.0.1
This version only support the endpoint /api/put.You can use it with maven.

Example:

	DataPointBuild build = DataPointBuild.getInstance();
    build.addDataPoint("meter.client").setValue("876", (int) (System.currentTimeMillis() / 1000)).addTag("host",
        "zhangbo");
    HttpClientImpl clientImpl = new HttpClientImpl("http://10.39.0.200:4242");
    PutResp put = clientImpl.put(build);
    
The pom.xml

	<dependency>
	  <groupId>cn.ennwifi</groupId>
	  <artifactId>opentsdb-client</artifactId>
	  <version>0.0.1</version>
	</dependency>
	
	
	
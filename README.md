FirstSpirit-AJAX-HTTP-Proxy forked from Smiley's HTTP Proxy Servlet
===========================

This is an HTTP Proxy (aka gateway) in the form of a Java servlet bundled within a FirstSpirit(TM) Module.  An HTTP proxy is useful for AJAX applications to communicate with web accessible services on hosts other than where the web application is hosted.

Its heavily based on Smiley's HTTP Proxy Servlet https://github.com/mitre/HTTP-Proxy-Servlet . Many thanks to it's contributors!
More details about the proxy can be found in the originally project https://github.com/mitre/HTTP-Proxy-Servlet .


Build & Installation
------------

Simply build the FirstSpirit(TM) Module (.fsm) using "mvn install" at the command line.


Configuration
-------------

Here's an example excerpt of a web.xml file to communicate to a Solr server:

    <servlet>
        <servlet-name>solr</servlet-name>
        <servlet-class>org.mitre.dsmiley.httpproxy.ProxyServlet</servlet-class>
        <init-param>
          <param-name>targetUri</param-name>
          <param-value>http://solrserver:8983/solr</param-value>
        </init-param>
        <init-param>
          <param-name>log</param-name>
          <param-value>true</param-value>
        </init-param>
    </servlet>
    <servlet-mapping>
      <servlet-name>solr</servlet-name>
      <url-pattern>/solr/*</url-pattern>
    </servlet-mapping>

Here's an example with a parameterized proxy URL matching query parameters
_subHost, _port, and _path such as 
"http://mywebapp/cluster/subpath?_subHost=namenode&_port=8080&_path=monitor". Note the different
proxy servlet class. The leading underscore is not mandatory but it's good to differentiate
them from the normal query parameters in case of a conflict.:

    <servlet>
      <servlet-name>clusterProxy</servlet-name>
      <servlet-class>org.mitre.dsmiley.httpproxy.URITemplateProxyServlet</servlet-class>
      <init-param>
        <param-name>targetUri</param-name>
        <param-value>http://{_subHost}.behindfirewall.mycompany.com:{_port}/{_path}</param-value>
      </init-param>
      <init-param>
        <param-name>log</param-name>
        <param-value>true</param-value>
      </init-param>
    </servlet>
    
    <servlet-mapping>
      <servlet-name>clusterProxy</servlet-name>
      <url-pattern>/mywebapp/cluster/*</url-pattern>
    </servlet-mapping>



package com.hr.ws.server;

import java.util.List;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws22.EndpointImpl;
import org.apache.cxf.message.Message;

import com.hr.ws.interceptor.CheckUserInterceptor;
import com.hr.ws.ws.HelloWSImpl;

/**
 * 
 * @Name  : ServerTest4
 * @Author : LH
 * @Date : 2018年5月19日 下午8:23:43
 * @Version : V1.0
 * 
 * @Description :
 */
public class ServerTest4 {
        
	            public static void main(String[] args) {
					      
	            	   String address ="http://192.168.0.100:8888/180515WebService3_ws_cxf/datatypews";
				       Endpoint endpoint  =  Endpoint.publish(address, new HelloWSImpl());
				       System.out.println(endpoint);
				       
				       EndpointImpl endpointImpl = (EndpointImpl) endpoint;
				       
				       	//服务端的日志入拦截器
				        List<Interceptor<? extends Message>> inInterceptors = endpointImpl.getInInterceptors();	
				        inInterceptors.add(new CheckUserInterceptor());
				        
				       System.out.println("发布web service成功4");
	            }
}

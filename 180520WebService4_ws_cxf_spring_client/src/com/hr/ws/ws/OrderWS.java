package com.hr.ws.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2018-05-24T14:39:46.853+08:00
 * Generated source version: 2.5.9
 * 
 */
@WebService(targetNamespace = "http://ws.ws.hr.com/", name = "OrderWS")
@XmlSeeAlso({ObjectFactory.class})
public interface OrderWS {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getOrderById", targetNamespace = "http://ws.ws.hr.com/", className = "com.hr.ws.ws.GetOrderById")
    @WebMethod
    @ResponseWrapper(localName = "getOrderByIdResponse", targetNamespace = "http://ws.ws.hr.com/", className = "com.hr.ws.ws.GetOrderByIdResponse")
    public com.hr.ws.ws.Order getOrderById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );
}

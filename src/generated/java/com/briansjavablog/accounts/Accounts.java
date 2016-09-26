package com.briansjavablog.accounts;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2016-09-26T16:50:26.801+01:00
 * Generated source version: 2.7.8
 * 
 */
@WebService(targetNamespace = "http://www.briansjavablog.com/Accounts/", name = "Accounts")
@XmlSeeAlso({com.blog.samples.webservices.accountservice.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Accounts {

    @WebMethod(operationName = "GetAccountDetails", action = "http://www.briansjavablog.com/Accounts/GetAccountDetails")
    @WebResult(name = "AccountDetailsResponse", targetNamespace = "http://com/blog/samples/webservices/accountservice", partName = "parameters")
    public com.blog.samples.webservices.accountservice.AccountDetailsResponse getAccountDetails(
        @WebParam(partName = "parameters", name = "AccountDetailsRequest", targetNamespace = "http://com/blog/samples/webservices/accountservice")
        com.blog.samples.webservices.accountservice.AccountDetailsRequest parameters
    );
}

package com.tarek.gwt.client;


import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface Sequare extends RemoteService {

	String equation(double a,double b,double c)throws IllegalArgumentException;
}

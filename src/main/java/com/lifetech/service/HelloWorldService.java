package com.lifetech.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by kumarp9 on 07/02/15.
 */

@WebService
public interface HelloWorldService {

    @WebResult(name = "PiyushMessageToWorld")
    String getMessage(@WebParam(name = "CurrentName")String name);
}

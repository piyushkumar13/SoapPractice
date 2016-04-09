package com.lifetech.service;

import com.lifetech.service.HelloWorldService;

import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by kumarp9 on 07/02/15.
 */

@WebService(endpointInterface = "com.lifetech.service.HelloWorldService", serviceName = "helloService",portName = "helloPort")
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String getMessage(String name) {
        return "this is soap example"+name;
    }
}

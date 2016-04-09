package com.lifetech.client;

import com.lifetech.service.HelloWorldService;

/**
 * Created by kumarp9 on 08/02/15.
 */
public class HelloClientImpl {
    HelloWorldService helloClient;

    public void setHelloClient(HelloWorldService helloClient) {
        this.helloClient = helloClient;
    }

    public void getTheMessage(){
        String message = helloClient.getMessage("Piyush");
        System.out.println(message);
    }


}

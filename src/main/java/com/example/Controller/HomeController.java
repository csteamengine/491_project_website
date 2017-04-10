package com.example.Controller;

import com.example.Entity.EchoRequest;
import com.example.Service.EchoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class HomeController {

    @Autowired
    private EchoService echoService;

    @RequestMapping("/echo")
    public String loopback(@RequestParam String data){
        boolean isValidJson;
        //Try to parse the "json", return false if we cant (meaning the json is invalid).
        try{
            final ObjectMapper mapper = new ObjectMapper();
            mapper.readTree(data);
            isValidJson = true;

        } catch (IOException e) {
            isValidJson = false;
        }
        //Return if the string is valid, and the text
        EchoRequest request = new EchoRequest(isValidJson, data);

        //Set our loopback utils last request
        echoService.addRequest(request);
        return request.toString();
    }

    @RequestMapping("/echo/view")
    public String loopbackView(){
        return echoService.printRequests();
    }

//    @RequestMapping("/")
//    public String hello(){
//        return "ayy";
//    }
}

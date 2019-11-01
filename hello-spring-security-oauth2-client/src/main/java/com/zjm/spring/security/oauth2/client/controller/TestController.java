package com.zjm.spring.security.oauth2.client.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class TestController {


    @GetMapping(value = "/auth")
    public void auth(HttpServletResponse response){
        try {
            response.sendRedirect("http://localhost:8080/oauth/authorize?client_id=client&response_type=code");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/code")
    public void getCode(@RequestParam("code") String code){
        MultiValueMap<String,String> map = new LinkedMultiValueMap<>();
        map.add(URLEncoder.encode("code"),URLEncoder.encode(code));
        map.add(URLEncoder.encode("grant_type"),URLEncoder.encode("authorization_code"));
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String,String>> httpEntity = new HttpEntity(map,headers);

        System.out.println("dsdD");
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://client:secret@localhost:8080/oauth/token", httpEntity, String.class);
        System.out.println(responseEntity.getBody());
    }
}

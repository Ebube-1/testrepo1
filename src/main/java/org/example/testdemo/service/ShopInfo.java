package org.example.testdemo.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.servlet.http.PushBuilder;

@WebService
public class ShopInfo {

    @WebMethod
    public String getShopInfo (String property){
        String response = "invalid property";
        if("shopname".equals(property)){
            return "Spring Shop Name";
        } else if ("since".equals(property)) {
            return "1998";
        }
        return response;
    }
}

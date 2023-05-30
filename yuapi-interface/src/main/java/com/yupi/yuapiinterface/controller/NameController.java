package com.yupi.yuapiinterface.controller;

import com.yupi.yuapiclientsdk.model.User;
import com.yupi.yuapiclientsdk.utils.SignUtil;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/name")
//@CrossOrigin(origins = {"http://47.113.188.36"}, allowCredentials = "true")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name){
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name){
        return "POST 你的名字是" + name;
    }
    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request){
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//        // todo 实际情况应该去数据库查是否分配给用户
//        if(!accessKey.equals("yupi")){
//            throw new RuntimeException("无权限");
//        }
//        if(Long.parseLong(nonce) > 100000){
//            throw new RuntimeException("无权限");
//        }
//        //todo: 时间和当前时间不饿能超过5分钟
////        if(timestamp){
////
////        }
//        //todo 实际情况是根据请求头中的accesskey从数据库去取出的secretKey
//        String serverSign = SignUtil.genSign(body, "abcdefgh");
//        if(!sign.equals(serverSign)){
//            throw new RuntimeException("无权限");
//        }
        String result =  "POST 用户的名字是" + user.getUsername();
        //调用成功后，次数 + 1
        return result;
    }
}

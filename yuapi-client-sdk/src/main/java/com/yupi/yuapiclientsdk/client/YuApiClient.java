package com.yupi.yuapiclientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.yupi.yuapiclientsdk.model.User;

import java.util.HashMap;
import java.util.Map;

import static com.yupi.yuapiclientsdk.utils.SignUtil.genSign;


/**
 * 调用第三方接口的客户端
 * @author jackyrwj
 */
public class YuApiClient {
    public static final String GETEWAY_HOST = "http://47.113.188.36:8090";
//    public static final String GETEWAY_HOST = "http://localhost:8090";
    private String accessKey;
    private String secretKey;

    public YuApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getNameByGet(String name) {
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result = HttpUtil.get(GETEWAY_HOST + "/api/name/", paramMap);
        System.out.println(result);
        return result;
    }


    public String getNameByPost( String name) {
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result = HttpUtil.post(GETEWAY_HOST + "/api/name/", paramMap);
        System.out.println(result);
        return result;
    }
    private Map<String, String> getHeaderMap(String body){
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("accessKey",accessKey);
        hashMap.put("nonce", RandomUtil.randomNumbers(4));
        hashMap.put("body",body);
        hashMap.put("timestamp",String.valueOf(System.currentTimeMillis() / 1000));
        hashMap.put("sign", genSign(body,secretKey));
//        hashMap.put("secretKey",secretKey);
        return hashMap;
    }


    public String getUsernameByPost( User user) {
        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpResponse = HttpRequest.post(GETEWAY_HOST +  "/api/name/user")
                .addHeaders(getHeaderMap(json))
                .body(json)
                .execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        System.out.println(result);
        return result;
    }
}

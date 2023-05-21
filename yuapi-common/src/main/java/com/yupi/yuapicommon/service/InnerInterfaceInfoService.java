package com.yupi.yuapicommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yuapicommon.model.entity.InterfaceInfo;

/**
* @author raowenjie
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-05-15 10:49:08
*/
public interface InnerInterfaceInfoService  {
    /**
     * 获取接口信息
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}

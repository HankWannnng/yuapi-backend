package com.yupi.yuapicommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yuapicommon.model.entity.UserInterfaceInfo;

/**
* @author raowenjie
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-05-18 09:39:06
*/
public interface InnerUserInterfaceInfoService   {

    boolean invokeCount(long interfaceInfoId, long userId);
}

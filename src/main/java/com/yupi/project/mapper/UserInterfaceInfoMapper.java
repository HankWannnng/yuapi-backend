package com.yupi.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yupi.yuapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author raowenjie
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2023-05-18 09:39:06
* @Entity com.yupi.project.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);

    /**
     * 购买次数
     * @param userId
     * @param interfaceId
     * @param count
     * @return
     */
    int buyInterface(Long userId, Long interfaceId, int count);

    /**
     * 默认分配10次调用
     * @param count
     * @return
     */
    boolean interfaceCount(int count, long userId, int interfaceId);
}





package com.aiqiku.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aiqiku.yuapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * 用户接口信息 Mapper
 *
 * @author  aiqiku
 *  @create 2024.4.5
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}





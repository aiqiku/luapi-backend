package com.aiqiku.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aiqiku.yuapicommon.model.entity.InterfaceInfo;

/**
 * 接口信息服务
 *
 * @author  aiqiku
 *  @create 2024.4.5
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}

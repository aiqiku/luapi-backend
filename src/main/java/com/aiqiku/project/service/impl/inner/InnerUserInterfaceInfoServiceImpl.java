package com.aiqiku.project.service.impl.inner;

import com.aiqiku.project.service.UserInterfaceInfoService;
import com.aiqiku.yuapicommon.service.InnerUserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * 内部用户接口信息服务实现类
 *
 * @author  aiqiku
 *  @create 2024.4.5
 */
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }

    @Override
    public Integer checkCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.checkCount(interfaceInfoId,userId);
    }
}

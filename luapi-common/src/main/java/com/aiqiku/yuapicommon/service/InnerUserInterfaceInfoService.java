package com.aiqiku.yuapicommon.service;

/**
 * 内部用户接口信息服务
 *
 * @author  aiqiku
 *  @create 2024.4.5
 */
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
    Integer checkCount(long interfaceInfoId, long userId);
}

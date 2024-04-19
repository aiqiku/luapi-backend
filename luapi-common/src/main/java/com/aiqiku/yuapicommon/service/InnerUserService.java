package com.aiqiku.yuapicommon.service;

import com.aiqiku.yuapicommon.model.entity.User;


/**
 * 内部用户服务
 *
 * @author  aiqiku
 *  @create 2024.4.5
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}

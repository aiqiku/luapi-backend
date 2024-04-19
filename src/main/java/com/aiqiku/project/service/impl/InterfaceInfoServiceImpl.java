package com.aiqiku.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aiqiku.project.common.ErrorCode;
import com.aiqiku.project.exception.BusinessException;
import com.aiqiku.project.mapper.InterfaceInfoMapper;
import com.aiqiku.project.service.InterfaceInfoService;
import com.aiqiku.yuapicommon.model.entity.InterfaceInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 接口信息服务实现类
 *
 * @author  aiqiku
 *  @create 2024.4.5
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }
    
}





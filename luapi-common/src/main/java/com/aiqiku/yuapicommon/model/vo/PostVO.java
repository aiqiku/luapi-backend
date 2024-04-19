package com.aiqiku.yuapicommon.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.aiqiku.yuapicommon.model.entity.Post;

/**
 * 帖子视图
 *
 * @author  aiqiku
 *  @create 2024.4.5
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PostVO extends Post {

    /**
     * 是否已点赞
     */
    private Boolean hasThumb;

    private static final long serialVersionUID = 1L;
}
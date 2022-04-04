package com.zfx.community.utils;


import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.UUID;

/**
 * @author zfx
 * @date 2022/4/5 02:57
 */
public class CommunityUtil {

    /**
     * 生成随机字符串
     *
     * @return 字母 不要横线 数字
     */
    public static String generateUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * MD5加密
     */
    public static String md5(String key) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }

}

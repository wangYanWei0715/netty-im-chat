package com.netty.imchat.common.util;

/**
 * @author Kevin
 * @Title: EnumUtils
 * @ProjectName studyjava
 * @Description: TODO 操作枚举的工具类
 * @date 2018/9/29 19:16
 */
public final class EnumUtils {
    /**
     * byte
     */
    public static class ByteEnumUtils{
        public static Byte getEnumCode(Enum enum_) {
            return (byte)(0xff & enum_.ordinal());
        }
    }

    /**
     * int
     */
    public static class IntegerEnumUtils{
        public static Integer getEnumCode(Enum enum_) {
            return 0xff & enum_.ordinal();
        }
    }
}

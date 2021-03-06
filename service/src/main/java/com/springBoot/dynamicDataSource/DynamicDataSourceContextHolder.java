package com.springBoot.dynamicDataSource;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author: 1063:马冬冬
 * @date: 2017/08/06.
 */
public class DynamicDataSourceContextHolder {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    public static List<String> dataSourceIds = new ArrayList<String>();

    public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    public static String getDataSourceType() {
        return contextHolder.get();
    }

    public static void clearDataSourceType() {
        contextHolder.remove();
    }

    /**
     * 判断指定DataSrouce当前是否存在
     *
     * @param dataSourceId
     * @return
     * @author SHANHY
     * @create  2016年1月24日
     */
    public static boolean containsDataSource(String dataSourceId){
        return dataSourceIds.contains(dataSourceId);
    }
}

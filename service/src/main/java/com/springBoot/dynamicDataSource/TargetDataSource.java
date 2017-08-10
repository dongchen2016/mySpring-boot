package com.springBoot.dynamicDataSource;

import java.lang.annotation.*;

/**
 * 在方法上使用，用于指定使用哪个数据源
 *
 * @author: 1063:马冬冬
 * @date: 2017/08/06.
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
    String name();
}

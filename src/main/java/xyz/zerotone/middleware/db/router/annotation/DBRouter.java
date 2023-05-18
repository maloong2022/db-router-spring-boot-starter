package xyz.zerotone.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * @description: 路由注解
 * @author：Maloong，微信：andyliliking
 * @date: 2023/5/18
 * @Copyright： 博客：http://maloong.com - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouter {

    /** 分库分表字段 */
    String key() default "";

}

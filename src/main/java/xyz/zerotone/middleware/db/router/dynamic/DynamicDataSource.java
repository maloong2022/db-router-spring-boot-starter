package xyz.zerotone.middleware.db.router.dynamic;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import xyz.zerotone.middleware.db.router.DBContextHolder;

/**
 * @description: 动态数据源获取，每当切换数据源，都要从这个里面进行获取
 * @author：Maloong，微信：andyliliking
 * @date: 2023/5/18
 * @Copyright： 博客：http://maloong.com - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return "db" + DBContextHolder.getDBKey();
    }

}


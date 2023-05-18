package xyz.zerotone.middleware.db.router.strategy;

/**
 * @description: 路由策略
 * @author：Maloong，微信：andyliliking
 * @date: 2023/5/18
 * @Copyright： 博客：http://maloong.com - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface IDBRouterStrategy {
    /**
     * 路由计算
     *
     * @param dbKeyAttr 路由字段
     */
    void doRouter(String dbKeyAttr);

    /**
     * 手动设置分库路由
     *
     * @param dbIdx 路由库，需要在配置范围内
     */
    void setDBKey(int dbIdx);

    /**
     * 手动设置分表路由
     *
     * @param tbIdx 路由表，需要在配置范围内
     */
    void setTBKey(int tbIdx);

    /**
     * 获取分库数
     *
     * @return 数量
     */
    int dbCount();

    /**
     * 获取分表数
     *
     * @return 数量
     */
    int tbCount();

    /**
     * 清除路由
     */
    void clear();
}

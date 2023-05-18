package xyz.zerotone.middleware.db.router;

/**
 * @description: 数据源基础配置
 * @author：Maloong，微信：andyliliking
 * @date: 2023/5/18
 * @Copyright： 博客：http://maloong.com - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class DBRouterBase {
    private String tbIdx;

    public String getTbIdx() {
        return DBContextHolder.getTBKey();
    }

}

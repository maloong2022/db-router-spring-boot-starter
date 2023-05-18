package xyz.zerotone.middleware.test;

import xyz.zerotone.middleware.db.router.annotation.DBRouter;

/**
 * @description:
 * @author：Maloong，微信：andyliliking
 * @date: 2023/5/18
 * @Copyright： 博客：http://maloong.com - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface IUserDao {
    @DBRouter(key = "userId")
    void insertUser(String req);

}

package cn.jk.study.spring.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by jiakang on 2018/9/19.
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jt;
    public void insert() {
        String sql = "insert into `tbl_test`(id, name) values (?,?)";
        String id = "4";
        String name = "project-insert";
        jt.update(sql, id, name);
    }
}

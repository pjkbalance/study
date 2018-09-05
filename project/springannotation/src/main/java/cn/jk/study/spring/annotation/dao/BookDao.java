package cn.jk.study.spring.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by jiakang on 2018/9/5.
 */
@Repository
public class BookDao {
    private String label;

    public BookDao() {
        label = "INIT";
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BookDao{");
        sb.append("label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

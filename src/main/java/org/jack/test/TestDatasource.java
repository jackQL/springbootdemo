package org.jack.test;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/12/14.
 */

public class TestDatasource {
    @Resource
    private DataSource dataSource;

    public void testDataSource(){
        try {
            System.out.println(this.dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

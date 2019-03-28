package com.zhangq.mayday.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSourceFactory;
@Configuration
@MapperScan("com.zhangq.mayday.mapper.generator")
public class MyBatisConfig {

    @Autowired
    private Environment env;

    /**
     * @Title: getDataSource
     * @Description: 创建数据源
     * @param @return
     * @return DataSource
     * @throws
     */
    @Bean
    public DataSource getDataSource(){
        Properties props = new Properties();
      /*  props.put("driverClass", env.getProperty("jdbc.driverClassName"));
        props.put("url", env.getProperty("jdbc.url"));
        props.put("username", env.getProperty("jdbc.username"));
        props.put("password", env.getProperty("jdbc.password"));*/
        props.put("driverClass", "com.mysql.jdbc.Driver");
        props.put("url", "jdbc:mysql://47.95.202.91/myday?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true");
        props.put("username", "test");
        props.put("password", "123456");
        try {
            return DruidDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @Title: sqlSessionFactory
     * @Description:  根据数据源创建SqlSessionFactory
     * @param @param ds
     * @param @return
     * @param @throws Exception
     * @return SqlSessionFactory
     * @throws
     */
    @Autowired
    DataSource dataSource;
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception{
        SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
        sfb.setDataSource(dataSource);
        //下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
        sfb.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));
        sfb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapperLocations")));
        return sfb.getObject();
    }
}


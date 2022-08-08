package org.example.conf;

import org.hibernate.MultiTenancyStrategy;
import org.hibernate.cfg.Environment;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class Config {
//    @Autowired
//    private JpaProperties jpaProperties;
//
//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter() {
//        return new HibernateJpaVendorAdapter();
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(
//        DataSource dataSource,
//        MultiTenantConnectionProvider multiTenantConnectionProviderImpl,
//        CurrentTenantIdentifierResolver currentTenantIdentifierResolverImpl,
//        JpaVendorAdapter jpaVendorAdapter
//    ){
//        Map<String, Object> properties = new HashMap<>(jpaProperties.getProperties());
//        properties.put(Environment.MULTI_TENANT, MultiTenancyStrategy.SCHEMA);
//        properties.put(Environment.MULTI_TENANT_CONNECTION_PROVIDER, multiTenantConnectionProviderImpl);
//        properties.put(Environment.MULTI_TENANT_IDENTIFIER_RESOLVER, currentTenantIdentifierResolverImpl);
//        properties.put(Environment.SHOW_SQL, true);
//        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
//        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//        em.setDataSource(dataSource);
//        em.setPackagesToScan("org.example");
//        em.setJpaVendorAdapter(jpaVendorAdapter);
//        em.setJpaPropertyMap(properties);
//        return em;
//    }
}

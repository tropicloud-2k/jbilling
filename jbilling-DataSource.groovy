import org.codehaus.groovy.grails.orm.hibernate.cfg.GrailsAnnotationConfiguration

dataSource {

    dialect = "org.hibernate.dialect.PostgreSQLDialect"
    driverClassName = "org.postgresql.Driver"
    username = "ntipa"
    password = "ntipa"
    url = "jdbc:postgresql://postgresdb:5432/ntipa-jbilling"

    pooled = true
    configClass = GrailsAnnotationConfiguration.class
    dbCreate = "none"

}

hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}

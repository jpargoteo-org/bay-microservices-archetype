#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ${package}.model.business.ICollectionLocationService;
import ${package}.model.business.impl.CollectionLocationService;
import ${package}.ws.assembly.CollectionLocationAssembly;


@Configuration
public class ApplicationAutoConfiguration {

    @Bean
    public ICollectionLocationService collectionLocationService() {
        return new CollectionLocationService();
    }

    @Bean
    public CollectionLocationAssembly collectionLocationAssembly() {
        return new CollectionLocationAssembly();
    }

}

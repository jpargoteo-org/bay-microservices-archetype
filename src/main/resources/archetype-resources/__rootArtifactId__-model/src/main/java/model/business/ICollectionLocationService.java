#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model.business;

import java.util.List;

import ${package}.model.domain.CollectionLocation;

public interface ICollectionLocationService {

    List<CollectionLocation> getAll();

    CollectionLocation get(String name);

    CollectionLocation insert(CollectionLocation collection);

}
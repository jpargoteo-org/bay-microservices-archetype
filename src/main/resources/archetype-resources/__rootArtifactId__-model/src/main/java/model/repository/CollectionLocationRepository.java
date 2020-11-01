#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ${package}.model.domain.CollectionLocation;

public interface CollectionLocationRepository extends MongoRepository<CollectionLocation, String>{

}
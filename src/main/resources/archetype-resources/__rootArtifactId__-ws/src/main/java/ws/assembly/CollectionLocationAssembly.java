#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ws.assembly;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;

import ${package}.model.domain.CollectionLocation;
import ${package}.ws.services.CollectionsController;

public class CollectionLocationAssembly implements ResourceAssembler<CollectionLocation, Resource<CollectionLocation>> {

    @Override
    public Resource<CollectionLocation> toResource(CollectionLocation entity) {

        return new Resource<CollectionLocation>(entity,
                linkTo(methodOn(CollectionsController.class).one(entity.getName())).withSelfRel(),
                linkTo(methodOn(CollectionsController.class).all()).withRel("collections"));

    }

}

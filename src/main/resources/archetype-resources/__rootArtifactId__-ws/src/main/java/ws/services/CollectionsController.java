#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ws.services;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ${package}.model.business.ICollectionLocationService;
import ${package}.model.domain.CollectionLocation;
import ${package}.ws.assembly.CollectionLocationAssembly;

@RestController
@RequestMapping("collections")
public class CollectionsController {

    @Autowired
    private ICollectionLocationService collectionLocationService;

    @Autowired
    private CollectionLocationAssembly collectionLocationAssembly;

    @GetMapping(path = "/")
    public Resources<Resource<CollectionLocation>> all() {

        List<Resource<CollectionLocation>> collections = collectionLocationService.getAll().stream()
                .map(collection -> collectionLocationAssembly.toResource(collection)).collect(Collectors.toList());

        return new Resources<>(collections, linkTo(methodOn(CollectionsController.class).all()).withSelfRel());

    }

    @GetMapping(path = "/{name}")
    public Resource<CollectionLocation> one(@PathVariable String name) {
        return collectionLocationAssembly.toResource(collectionLocationService.get(name));

    }

    @PostMapping(path = "/")
    public CollectionLocation insertar(@RequestBody CollectionLocation collection) {
        return collectionLocationService.insert(collection);
    }

}

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("CollectionLocation")
public class CollectionLocation implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String name;
    private String finalEndpoint;
    private String adapterEndpoint;
    private String username;
    private String password;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFinalEndpoint() {
        return finalEndpoint;
    }
    public void setFinalEndpoint(String finalEndpoint) {
        this.finalEndpoint = finalEndpoint;
    }
    public String getAdapterEndpoint() {
        return adapterEndpoint;
    }
    public void setAdapterEndpoint(String adapterEndpoint) {
        this.adapterEndpoint = adapterEndpoint;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}

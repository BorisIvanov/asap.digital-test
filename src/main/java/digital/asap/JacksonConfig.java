package digital.asap;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import java.util.Date;

@Provider
public class JacksonConfig implements ContextResolver<ObjectMapper> {

    private ObjectMapper objectMapper;

    public JacksonConfig() {
        objectMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule("MyModule", new Version(1, 0, 0, null));
        module.addSerializer(Date.class, new DateSerializer());
        module.addDeserializer(Date.class, new DateDeserializer());
        objectMapper.registerModule(module);
    }

    public ObjectMapper getContext(Class<?> objectType) {
        return objectMapper;
    }

}

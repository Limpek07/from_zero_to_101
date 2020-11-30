package stepdefinition;

import com.zeroone.pagetype.PageType;
import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;
import io.cucumber.cucumberexpressions.Transformer;

import java.util.Locale;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        addPageTypeConverter(typeRegistry);
    }

    private void addPageTypeConverter(TypeRegistry typeRegistry) {
        typeRegistry.defineParameterType(new ParameterType<>(
                "pageType",
                ".*",
                PageType.class,
                (Transformer<PageType>) PageType::valueOf));
    }
}

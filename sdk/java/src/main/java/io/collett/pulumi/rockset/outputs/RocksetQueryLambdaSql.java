// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset.outputs;

import com.pulumi.core.annotations.CustomType;
import io.collett.pulumi.rockset.outputs.RocksetQueryLambdaSqlDefaultParameter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RocksetQueryLambdaSql {
    private @Nullable List<RocksetQueryLambdaSqlDefaultParameter> defaultParameters;
    private String query;

    private RocksetQueryLambdaSql() {}
    public List<RocksetQueryLambdaSqlDefaultParameter> defaultParameters() {
        return this.defaultParameters == null ? List.of() : this.defaultParameters;
    }
    public String query() {
        return this.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RocksetQueryLambdaSql defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<RocksetQueryLambdaSqlDefaultParameter> defaultParameters;
        private String query;
        public Builder() {}
        public Builder(RocksetQueryLambdaSql defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultParameters = defaults.defaultParameters;
    	      this.query = defaults.query;
        }

        @CustomType.Setter
        public Builder defaultParameters(@Nullable List<RocksetQueryLambdaSqlDefaultParameter> defaultParameters) {
            this.defaultParameters = defaultParameters;
            return this;
        }
        public Builder defaultParameters(RocksetQueryLambdaSqlDefaultParameter... defaultParameters) {
            return defaultParameters(List.of(defaultParameters));
        }
        @CustomType.Setter
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public RocksetQueryLambdaSql build() {
            final var o = new RocksetQueryLambdaSql();
            o.defaultParameters = defaultParameters;
            o.query = query;
            return o;
        }
    }
}

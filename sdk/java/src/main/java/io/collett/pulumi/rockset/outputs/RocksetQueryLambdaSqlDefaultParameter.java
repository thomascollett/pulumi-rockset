// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RocksetQueryLambdaSqlDefaultParameter {
    /**
     * @return Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
     * 
     */
    private String name;
    private String type;
    private String value;

    private RocksetQueryLambdaSqlDefaultParameter() {}
    /**
     * @return Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
     * 
     */
    public String name() {
        return this.name;
    }
    public String type() {
        return this.type;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RocksetQueryLambdaSqlDefaultParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String type;
        private String value;
        public Builder() {}
        public Builder(RocksetQueryLambdaSqlDefaultParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public RocksetQueryLambdaSqlDefaultParameter build() {
            final var o = new RocksetQueryLambdaSqlDefaultParameter();
            o.name = name;
            o.type = type;
            o.value = value;
            return o;
        }
    }
}

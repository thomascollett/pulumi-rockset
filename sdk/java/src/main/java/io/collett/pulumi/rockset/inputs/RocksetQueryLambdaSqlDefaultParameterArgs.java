// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RocksetQueryLambdaSqlDefaultParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final RocksetQueryLambdaSqlDefaultParameterArgs Empty = new RocksetQueryLambdaSqlDefaultParameterArgs();

    /**
     * Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private RocksetQueryLambdaSqlDefaultParameterArgs() {}

    private RocksetQueryLambdaSqlDefaultParameterArgs(RocksetQueryLambdaSqlDefaultParameterArgs $) {
        this.name = $.name;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocksetQueryLambdaSqlDefaultParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocksetQueryLambdaSqlDefaultParameterArgs $;

        public Builder() {
            $ = new RocksetQueryLambdaSqlDefaultParameterArgs();
        }

        public Builder(RocksetQueryLambdaSqlDefaultParameterArgs defaults) {
            $ = new RocksetQueryLambdaSqlDefaultParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public RocksetQueryLambdaSqlDefaultParameterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}

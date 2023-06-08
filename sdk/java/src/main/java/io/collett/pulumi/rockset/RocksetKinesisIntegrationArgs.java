// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocksetKinesisIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RocksetKinesisIntegrationArgs Empty = new RocksetKinesisIntegrationArgs();

    /**
     * The AWS Role Arn to use for this integration.
     * 
     */
    @Import(name="awsRoleArn", required=true)
    private Output<String> awsRoleArn;

    /**
     * @return The AWS Role Arn to use for this integration.
     * 
     */
    public Output<String> awsRoleArn() {
        return this.awsRoleArn;
    }

    /**
     * Text describing the integration.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Text describing the integration.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Unique identifier for the integration. Can contain alphanumeric or dash characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique identifier for the integration. Can contain alphanumeric or dash characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private RocksetKinesisIntegrationArgs() {}

    private RocksetKinesisIntegrationArgs(RocksetKinesisIntegrationArgs $) {
        this.awsRoleArn = $.awsRoleArn;
        this.description = $.description;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocksetKinesisIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocksetKinesisIntegrationArgs $;

        public Builder() {
            $ = new RocksetKinesisIntegrationArgs();
        }

        public Builder(RocksetKinesisIntegrationArgs defaults) {
            $ = new RocksetKinesisIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsRoleArn The AWS Role Arn to use for this integration.
         * 
         * @return builder
         * 
         */
        public Builder awsRoleArn(Output<String> awsRoleArn) {
            $.awsRoleArn = awsRoleArn;
            return this;
        }

        /**
         * @param awsRoleArn The AWS Role Arn to use for this integration.
         * 
         * @return builder
         * 
         */
        public Builder awsRoleArn(String awsRoleArn) {
            return awsRoleArn(Output.of(awsRoleArn));
        }

        /**
         * @param description Text describing the integration.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Text describing the integration.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Unique identifier for the integration. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique identifier for the integration. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public RocksetKinesisIntegrationArgs build() {
            $.awsRoleArn = Objects.requireNonNull($.awsRoleArn, "expected parameter 'awsRoleArn' to be non-null");
            return $;
        }
    }

}

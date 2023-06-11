// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.collett.pulumi.rockset.RocksetDynamodbIntegrationArgs;
import io.collett.pulumi.rockset.Utilities;
import io.collett.pulumi.rockset.inputs.RocksetDynamodbIntegrationState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Rockset DynamoDB Integration.
 * 
 */
@ResourceType(type="rockset:index/rocksetDynamodbIntegration:RocksetDynamodbIntegration")
public class RocksetDynamodbIntegration extends com.pulumi.resources.CustomResource {
    /**
     * The AWS Role Arn to use for this integration.
     * 
     */
    @Export(name="awsRoleArn", refs={String.class}, tree="[0]")
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
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Text describing the integration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Unique identifier for the integration. Can contain alphanumeric or dash characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Unique identifier for the integration. Can contain alphanumeric or dash characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * AWS S3 bucket name used for exporting the DynamoDB tables.
     * 
     */
    @Export(name="s3ExportBucketName", refs={String.class}, tree="[0]")
    private Output<String> s3ExportBucketName;

    /**
     * @return AWS S3 bucket name used for exporting the DynamoDB tables.
     * 
     */
    public Output<String> s3ExportBucketName() {
        return this.s3ExportBucketName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RocksetDynamodbIntegration(String name) {
        this(name, RocksetDynamodbIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RocksetDynamodbIntegration(String name, RocksetDynamodbIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RocksetDynamodbIntegration(String name, RocksetDynamodbIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetDynamodbIntegration:RocksetDynamodbIntegration", name, args == null ? RocksetDynamodbIntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RocksetDynamodbIntegration(String name, Output<String> id, @Nullable RocksetDynamodbIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetDynamodbIntegration:RocksetDynamodbIntegration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RocksetDynamodbIntegration get(String name, Output<String> id, @Nullable RocksetDynamodbIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RocksetDynamodbIntegration(name, id, state, options);
    }
}
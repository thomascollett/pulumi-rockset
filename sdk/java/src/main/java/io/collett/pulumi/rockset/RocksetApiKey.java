// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.collett.pulumi.rockset.RocksetApiKeyArgs;
import io.collett.pulumi.rockset.Utilities;
import io.collett.pulumi.rockset.inputs.RocksetApiKeyState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manage a Rockset Api Key.
 * 
 * Can be used together with roles to scope the actions the api key can take.
 * 
 */
@ResourceType(type="rockset:index/rocksetApiKey:RocksetApiKey")
public class RocksetApiKey extends com.pulumi.resources.CustomResource {
    /**
     * The resulting Rockset api key.
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return The resulting Rockset api key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * Name of the api key.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the api key.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The role the api key will use. If not specified, &#34;All User Assigned Roles&#34; will be used.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output</* @Nullable */ String> role;

    /**
     * @return The role the api key will use. If not specified, &#34;All User Assigned Roles&#34; will be used.
     * 
     */
    public Output<Optional<String>> role() {
        return Codegen.optional(this.role);
    }
    /**
     * The user the key is created for.
     * 
     */
    @Export(name="user", type=String.class, parameters={})
    private Output<String> user;

    /**
     * @return The user the key is created for.
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RocksetApiKey(String name) {
        this(name, RocksetApiKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RocksetApiKey(String name, @Nullable RocksetApiKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RocksetApiKey(String name, @Nullable RocksetApiKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetApiKey:RocksetApiKey", name, args == null ? RocksetApiKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RocksetApiKey(String name, Output<String> id, @Nullable RocksetApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetApiKey:RocksetApiKey", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "key"
            ))
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
    public static RocksetApiKey get(String name, Output<String> id, @Nullable RocksetApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RocksetApiKey(name, id, state, options);
    }
}

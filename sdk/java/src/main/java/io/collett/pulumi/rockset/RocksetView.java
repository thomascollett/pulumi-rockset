// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.collett.pulumi.rockset.RocksetViewArgs;
import io.collett.pulumi.rockset.Utilities;
import io.collett.pulumi.rockset.inputs.RocksetViewState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Rockset view.
 * 
 */
@ResourceType(type="rockset:index/rocksetView:RocksetView")
public class RocksetView extends com.pulumi.resources.CustomResource {
    /**
     * The user who created the view.
     * 
     */
    @Export(name="createdBy", refs={String.class}, tree="[0]")
    private Output<String> createdBy;

    /**
     * @return The user who created the view.
     * 
     */
    public Output<String> createdBy() {
        return this.createdBy;
    }
    /**
     * Text describing the collection.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Text describing the collection.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Unique name for the view in the workspace. Can contain alphanumeric or dash characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Unique name for the view in the workspace. Can contain alphanumeric or dash characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * SQL query used for thw view.
     * 
     */
    @Export(name="query", refs={String.class}, tree="[0]")
    private Output<String> query;

    /**
     * @return SQL query used for thw view.
     * 
     */
    public Output<String> query() {
        return this.query;
    }
    /**
     * Workspace name.
     * 
     */
    @Export(name="workspace", refs={String.class}, tree="[0]")
    private Output<String> workspace;

    /**
     * @return Workspace name.
     * 
     */
    public Output<String> workspace() {
        return this.workspace;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RocksetView(String name) {
        this(name, RocksetViewArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RocksetView(String name, RocksetViewArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RocksetView(String name, RocksetViewArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetView:RocksetView", name, args == null ? RocksetViewArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RocksetView(String name, Output<String> id, @Nullable RocksetViewState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetView:RocksetView", name, state, makeResourceOptions(options, id));
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
    public static RocksetView get(String name, Output<String> id, @Nullable RocksetViewState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RocksetView(name, id, state, options);
    }
}
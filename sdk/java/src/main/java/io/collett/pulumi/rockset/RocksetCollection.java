// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.collett.pulumi.rockset.RocksetCollectionArgs;
import io.collett.pulumi.rockset.Utilities;
import io.collett.pulumi.rockset.inputs.RocksetCollectionState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a basic collection with no sources. Usually used for the write api.
 * 
 */
@ResourceType(type="rockset:index/rocksetCollection:RocksetCollection")
public class RocksetCollection extends com.pulumi.resources.CustomResource {
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
     * **Deprecated** use ingest_transformation instead
     * 
     * @deprecated
     * Use ingest_transformation instead
     * 
     */
    @Deprecated /* Use ingest_transformation instead */
    @Export(name="fieldMappingQuery", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> fieldMappingQuery;

    /**
     * @return **Deprecated** use ingest_transformation instead
     * 
     */
    public Output<Optional<String>> fieldMappingQuery() {
        return Codegen.optional(this.fieldMappingQuery);
    }
    /**
     * Ingest transformation SQL query. Turns the collection into insert_only mode.
     * 
     */
    @Export(name="ingestTransformation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ingestTransformation;

    /**
     * @return Ingest transformation SQL query. Turns the collection into insert_only mode.
     * 
     */
    public Output<Optional<String>> ingestTransformation() {
        return Codegen.optional(this.ingestTransformation);
    }
    /**
     * Unique identifier for the collection. Can contain alphanumeric or dash characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Unique identifier for the collection. Can contain alphanumeric or dash characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Number of seconds after which data is purged. Based on event time.
     * 
     */
    @Export(name="retentionSecs", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> retentionSecs;

    /**
     * @return Number of seconds after which data is purged. Based on event time.
     * 
     */
    public Output<Optional<Integer>> retentionSecs() {
        return Codegen.optional(this.retentionSecs);
    }
    /**
     * Wait until the collection is ready.
     * 
     */
    @Export(name="waitForCollection", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> waitForCollection;

    /**
     * @return Wait until the collection is ready.
     * 
     */
    public Output<Optional<Boolean>> waitForCollection() {
        return Codegen.optional(this.waitForCollection);
    }
    /**
     * Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn&#39;t wait.
     * 
     */
    @Export(name="waitForDocuments", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> waitForDocuments;

    /**
     * @return Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn&#39;t wait.
     * 
     */
    public Output<Optional<Integer>> waitForDocuments() {
        return Codegen.optional(this.waitForDocuments);
    }
    /**
     * The name of the workspace.
     * 
     */
    @Export(name="workspace", refs={String.class}, tree="[0]")
    private Output<String> workspace;

    /**
     * @return The name of the workspace.
     * 
     */
    public Output<String> workspace() {
        return this.workspace;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RocksetCollection(String name) {
        this(name, RocksetCollectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RocksetCollection(String name, RocksetCollectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RocksetCollection(String name, RocksetCollectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetCollection:RocksetCollection", name, args == null ? RocksetCollectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RocksetCollection(String name, Output<String> id, @Nullable RocksetCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetCollection:RocksetCollection", name, state, makeResourceOptions(options, id));
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
    public static RocksetCollection get(String name, Output<String> id, @Nullable RocksetCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RocksetCollection(name, id, state, options);
    }
}

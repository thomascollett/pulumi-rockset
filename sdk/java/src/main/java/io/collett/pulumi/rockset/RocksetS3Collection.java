// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.collett.pulumi.rockset.RocksetS3CollectionArgs;
import io.collett.pulumi.rockset.Utilities;
import io.collett.pulumi.rockset.inputs.RocksetS3CollectionState;
import io.collett.pulumi.rockset.outputs.RocksetS3CollectionSource;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a collection with on or more S3 sources attached. Uses an S3 integration to access the S3 bucket. If no integration is provided, only data in public buckets are accessible.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rockset.RocksetWorkspace;
 * import com.pulumi.rockset.RocksetWorkspaceArgs;
 * import com.pulumi.rockset.RocksetS3Integration;
 * import com.pulumi.rockset.RocksetS3IntegrationArgs;
 * import com.pulumi.rockset.RocksetS3Collection;
 * import com.pulumi.rockset.RocksetS3CollectionArgs;
 * import com.pulumi.rockset.inputs.RocksetS3CollectionSourceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var sample = new RocksetWorkspace(&#34;sample&#34;, RocksetWorkspaceArgs.builder()        
 *             .description(&#34;sample datasets&#34;)
 *             .build());
 * 
 *         var public_ = new RocksetS3Integration(&#34;public&#34;, RocksetS3IntegrationArgs.builder()        
 *             .description(&#34;Integration to access Rockset&#39;s public datasets&#34;)
 *             .awsRoleArn(&#34;arn:aws:iam::469279130686:role/rockset-public-datasets&#34;)
 *             .build());
 * 
 *         var cities = new RocksetS3Collection(&#34;cities&#34;, RocksetS3CollectionArgs.builder()        
 *             .workspace(sample.name())
 *             .sources(RocksetS3CollectionSourceArgs.builder()
 *                 .bucket(&#34;rockset-public-datasets&#34;)
 *                 .integrationName(public_.name())
 *                 .pattern(&#34;cities/*.json&#34;)
 *                 .format(&#34;json&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="rockset:index/rocksetS3Collection:RocksetS3Collection")
public class RocksetS3Collection extends com.pulumi.resources.CustomResource {
    /**
     * Text describing the collection.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
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
    @Export(name="fieldMappingQuery", type=String.class, parameters={})
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
    @Export(name="ingestTransformation", type=String.class, parameters={})
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
    @Export(name="name", type=String.class, parameters={})
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
    @Export(name="retentionSecs", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retentionSecs;

    /**
     * @return Number of seconds after which data is purged. Based on event time.
     * 
     */
    public Output<Optional<Integer>> retentionSecs() {
        return Codegen.optional(this.retentionSecs);
    }
    /**
     * Defines a source for this collection.
     * 
     */
    @Export(name="sources", type=List.class, parameters={RocksetS3CollectionSource.class})
    private Output</* @Nullable */ List<RocksetS3CollectionSource>> sources;

    /**
     * @return Defines a source for this collection.
     * 
     */
    public Output<Optional<List<RocksetS3CollectionSource>>> sources() {
        return Codegen.optional(this.sources);
    }
    /**
     * Wait until the collection is ready.
     * 
     */
    @Export(name="waitForCollection", type=Boolean.class, parameters={})
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
    @Export(name="waitForDocuments", type=Integer.class, parameters={})
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
    @Export(name="workspace", type=String.class, parameters={})
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
    public RocksetS3Collection(String name) {
        this(name, RocksetS3CollectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RocksetS3Collection(String name, RocksetS3CollectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RocksetS3Collection(String name, RocksetS3CollectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetS3Collection:RocksetS3Collection", name, args == null ? RocksetS3CollectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RocksetS3Collection(String name, Output<String> id, @Nullable RocksetS3CollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetS3Collection:RocksetS3Collection", name, state, makeResourceOptions(options, id));
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
    public static RocksetS3Collection get(String name, Output<String> id, @Nullable RocksetS3CollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RocksetS3Collection(name, id, state, options);
    }
}

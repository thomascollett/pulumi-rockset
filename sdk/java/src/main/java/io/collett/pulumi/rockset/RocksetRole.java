// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.collett.pulumi.rockset.RocksetRoleArgs;
import io.collett.pulumi.rockset.Utilities;
import io.collett.pulumi.rockset.inputs.RocksetRoleState;
import io.collett.pulumi.rockset.outputs.RocksetRolePrivilege;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Rockset [Role](https://rockset.com/docs/iam/).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rockset.RocksetRole;
 * import com.pulumi.rockset.RocksetRoleArgs;
 * import com.pulumi.rockset.inputs.RocksetRolePrivilegeArgs;
 * import com.pulumi.rockset.RocksetApiKey;
 * import com.pulumi.rockset.RocksetApiKeyArgs;
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
 *         var query_onlyRocksetRole = new RocksetRole(&#34;query-onlyRocksetRole&#34;, RocksetRoleArgs.builder()        
 *             .description(&#34;This role can only query collections in the prod workspace in the usw2a1 cluster&#34;)
 *             .privileges(            
 *                 RocksetRolePrivilegeArgs.builder()
 *                     .action(&#34;QUERY_DATA_WS&#34;)
 *                     .resourceName(&#34;prod&#34;)
 *                     .cluster(&#34;usw2a1&#34;)
 *                     .build(),
 *                 RocksetRolePrivilegeArgs.builder()
 *                     .action(&#34;EXECUTE_QUERY_LAMBDA_WS&#34;)
 *                     .resourceName(&#34;prod&#34;)
 *                     .cluster(&#34;usw2a1&#34;)
 *                     .build())
 *             .build());
 * 
 *         var query_onlyRocksetApiKey = new RocksetApiKey(&#34;query-onlyRocksetApiKey&#34;, RocksetApiKeyArgs.builder()        
 *             .role(query_onlyRocksetRole.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="rockset:index/rocksetRole:RocksetRole")
public class RocksetRole extends com.pulumi.resources.CustomResource {
    /**
     * When the role was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return When the role was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Who created the role.
     * 
     */
    @Export(name="createdBy", type=String.class, parameters={})
    private Output<String> createdBy;

    /**
     * @return Who created the role.
     * 
     */
    public Output<String> createdBy() {
        return this.createdBy;
    }
    /**
     * Role description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Role description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Role name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Role name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The email of the user who currently owns the role.
     * 
     */
    @Export(name="ownerEmail", type=String.class, parameters={})
    private Output<String> ownerEmail;

    /**
     * @return The email of the user who currently owns the role.
     * 
     */
    public Output<String> ownerEmail() {
        return this.ownerEmail;
    }
    /**
     * Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
     * 
     */
    @Export(name="privileges", type=List.class, parameters={RocksetRolePrivilege.class})
    private Output</* @Nullable */ List<RocksetRolePrivilege>> privileges;

    /**
     * @return Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
     * 
     */
    public Output<Optional<List<RocksetRolePrivilege>>> privileges() {
        return Codegen.optional(this.privileges);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RocksetRole(String name) {
        this(name, RocksetRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RocksetRole(String name, @Nullable RocksetRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RocksetRole(String name, @Nullable RocksetRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetRole:RocksetRole", name, args == null ? RocksetRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RocksetRole(String name, Output<String> id, @Nullable RocksetRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetRole:RocksetRole", name, state, makeResourceOptions(options, id));
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
    public static RocksetRole get(String name, Output<String> id, @Nullable RocksetRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RocksetRole(name, id, state, options);
    }
}

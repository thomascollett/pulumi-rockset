// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.collett.pulumi.rockset.RocksetUserArgs;
import io.collett.pulumi.rockset.Utilities;
import io.collett.pulumi.rockset.inputs.RocksetUserState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Rockset User.
 * 
 * First and last name can only be managed for users who have accepted the invite,
 * i.e. when the state is ACCEPTED.
 * 
 */
@ResourceType(type="rockset:index/rocksetUser:RocksetUser")
public class RocksetUser extends com.pulumi.resources.CustomResource {
    /**
     * The ISO-8601 time of when the user was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The ISO-8601 time of when the user was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Email address of the user. Also used to identify the user.
     * 
     */
    @Export(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return Email address of the user. Also used to identify the user.
     * 
     */
    public Output<String> email() {
        return this.email;
    }
    /**
     * User&#39;s first name. This can only be set once the state is ACTIVE, i.e after the user has accepted the invite.
     * 
     */
    @Export(name="firstName", type=String.class, parameters={})
    private Output</* @Nullable */ String> firstName;

    /**
     * @return User&#39;s first name. This can only be set once the state is ACTIVE, i.e after the user has accepted the invite.
     * 
     */
    public Output<Optional<String>> firstName() {
        return Codegen.optional(this.firstName);
    }
    /**
     * User&#39;s last name. This can only be set once the state is ACTIVE, i.e after the user has accepted the invite.
     * 
     */
    @Export(name="lastName", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastName;

    /**
     * @return User&#39;s last name. This can only be set once the state is ACTIVE, i.e after the user has accepted the invite.
     * 
     */
    public Output<Optional<String>> lastName() {
        return Codegen.optional(this.lastName);
    }
    /**
     * List of roles for the user. E.g. &#39;admin&#39;, &#39;member&#39;, &#39;read-only&#39;.
     * 
     */
    @Export(name="roles", type=List.class, parameters={String.class})
    private Output<List<String>> roles;

    /**
     * @return List of roles for the user. E.g. &#39;admin&#39;, &#39;member&#39;, &#39;read-only&#39;.
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
    }
    /**
     * State of the user, either NEW or ACTIVE.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the user, either NEW or ACTIVE.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RocksetUser(String name) {
        this(name, RocksetUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RocksetUser(String name, RocksetUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RocksetUser(String name, RocksetUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetUser:RocksetUser", name, args == null ? RocksetUserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RocksetUser(String name, Output<String> id, @Nullable RocksetUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rockset:index/rocksetUser:RocksetUser", name, state, makeResourceOptions(options, id));
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
    public static RocksetUser get(String name, Output<String> id, @Nullable RocksetUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RocksetUser(name, id, state, options);
    }
}

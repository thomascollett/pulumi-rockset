// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocksetApiKeyState extends com.pulumi.resources.ResourceArgs {

    public static final RocksetApiKeyState Empty = new RocksetApiKeyState();

    /**
     * The resulting Rockset api key.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The resulting Rockset api key.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Name of the api key.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the api key.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The role the api key will use. If not specified, &#34;All User Assigned Roles&#34; will be used.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role the api key will use. If not specified, &#34;All User Assigned Roles&#34; will be used.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * The user the key is created for.
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return The user the key is created for.
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    private RocksetApiKeyState() {}

    private RocksetApiKeyState(RocksetApiKeyState $) {
        this.key = $.key;
        this.name = $.name;
        this.role = $.role;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocksetApiKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocksetApiKeyState $;

        public Builder() {
            $ = new RocksetApiKeyState();
        }

        public Builder(RocksetApiKeyState defaults) {
            $ = new RocksetApiKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The resulting Rockset api key.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The resulting Rockset api key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name Name of the api key.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the api key.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param role The role the api key will use. If not specified, &#34;All User Assigned Roles&#34; will be used.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role the api key will use. If not specified, &#34;All User Assigned Roles&#34; will be used.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param user The user the key is created for.
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user The user the key is created for.
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public RocksetApiKeyState build() {
            return $;
        }
    }

}
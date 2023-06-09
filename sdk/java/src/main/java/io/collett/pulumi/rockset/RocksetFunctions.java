// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.resources.InvokeArgs;
import io.collett.pulumi.rockset.Utilities;
import io.collett.pulumi.rockset.outputs.GetAccountResult;
import java.util.concurrent.CompletableFuture;

public final class RocksetFunctions {
    /**
     * Gets information about the Rockset deployment for the specified api server.
     * 
     */
    public static Output<GetAccountResult> getAccount() {
        return getAccount(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Gets information about the Rockset deployment for the specified api server.
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain() {
        return getAccountPlain(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Gets information about the Rockset deployment for the specified api server.
     * 
     */
    public static Output<GetAccountResult> getAccount(InvokeArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about the Rockset deployment for the specified api server.
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain(InvokeArgs args) {
        return getAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about the Rockset deployment for the specified api server.
     * 
     */
    public static Output<GetAccountResult> getAccount(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("rockset:index/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about the Rockset deployment for the specified api server.
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("rockset:index/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
}

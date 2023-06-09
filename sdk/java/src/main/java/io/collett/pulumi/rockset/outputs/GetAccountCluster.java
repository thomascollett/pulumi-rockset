// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccountCluster {
    private String apiServer;
    private String awsRegion;
    private String type;

    private GetAccountCluster() {}
    public String apiServer() {
        return this.apiServer;
    }
    public String awsRegion() {
        return this.awsRegion;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiServer;
        private String awsRegion;
        private String type;
        public Builder() {}
        public Builder(GetAccountCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiServer = defaults.apiServer;
    	      this.awsRegion = defaults.awsRegion;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder apiServer(String apiServer) {
            this.apiServer = Objects.requireNonNull(apiServer);
            return this;
        }
        @CustomType.Setter
        public Builder awsRegion(String awsRegion) {
            this.awsRegion = Objects.requireNonNull(awsRegion);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAccountCluster build() {
            final var o = new GetAccountCluster();
            o.apiServer = apiServer;
            o.awsRegion = awsRegion;
            o.type = type;
            return o;
        }
    }
}

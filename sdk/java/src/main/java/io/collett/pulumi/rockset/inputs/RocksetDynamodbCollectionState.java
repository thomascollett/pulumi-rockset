// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.collett.pulumi.rockset.inputs.RocksetDynamodbCollectionSourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocksetDynamodbCollectionState extends com.pulumi.resources.ResourceArgs {

    public static final RocksetDynamodbCollectionState Empty = new RocksetDynamodbCollectionState();

    /**
     * Text describing the collection.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Text describing the collection.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * **Deprecated** use ingest_transformation instead
     * 
     * @deprecated
     * Use ingest_transformation instead
     * 
     */
    @Deprecated /* Use ingest_transformation instead */
    @Import(name="fieldMappingQuery")
    private @Nullable Output<String> fieldMappingQuery;

    /**
     * @return **Deprecated** use ingest_transformation instead
     * 
     * @deprecated
     * Use ingest_transformation instead
     * 
     */
    @Deprecated /* Use ingest_transformation instead */
    public Optional<Output<String>> fieldMappingQuery() {
        return Optional.ofNullable(this.fieldMappingQuery);
    }

    /**
     * Ingest transformation SQL query. Turns the collection into insert_only mode.
     * 
     */
    @Import(name="ingestTransformation")
    private @Nullable Output<String> ingestTransformation;

    /**
     * @return Ingest transformation SQL query. Turns the collection into insert_only mode.
     * 
     */
    public Optional<Output<String>> ingestTransformation() {
        return Optional.ofNullable(this.ingestTransformation);
    }

    /**
     * Unique identifier for the collection. Can contain alphanumeric or dash characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique identifier for the collection. Can contain alphanumeric or dash characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Number of seconds after which data is purged. Based on event time.
     * 
     */
    @Import(name="retentionSecs")
    private @Nullable Output<Integer> retentionSecs;

    /**
     * @return Number of seconds after which data is purged. Based on event time.
     * 
     */
    public Optional<Output<Integer>> retentionSecs() {
        return Optional.ofNullable(this.retentionSecs);
    }

    /**
     * Defines a source for this collection.
     * 
     */
    @Import(name="sources")
    private @Nullable Output<List<RocksetDynamodbCollectionSourceArgs>> sources;

    /**
     * @return Defines a source for this collection.
     * 
     */
    public Optional<Output<List<RocksetDynamodbCollectionSourceArgs>>> sources() {
        return Optional.ofNullable(this.sources);
    }

    /**
     * Wait until the collection is ready.
     * 
     */
    @Import(name="waitForCollection")
    private @Nullable Output<Boolean> waitForCollection;

    /**
     * @return Wait until the collection is ready.
     * 
     */
    public Optional<Output<Boolean>> waitForCollection() {
        return Optional.ofNullable(this.waitForCollection);
    }

    /**
     * Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn&#39;t wait.
     * 
     */
    @Import(name="waitForDocuments")
    private @Nullable Output<Integer> waitForDocuments;

    /**
     * @return Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn&#39;t wait.
     * 
     */
    public Optional<Output<Integer>> waitForDocuments() {
        return Optional.ofNullable(this.waitForDocuments);
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspace")
    private @Nullable Output<String> workspace;

    /**
     * @return The name of the workspace.
     * 
     */
    public Optional<Output<String>> workspace() {
        return Optional.ofNullable(this.workspace);
    }

    private RocksetDynamodbCollectionState() {}

    private RocksetDynamodbCollectionState(RocksetDynamodbCollectionState $) {
        this.description = $.description;
        this.fieldMappingQuery = $.fieldMappingQuery;
        this.ingestTransformation = $.ingestTransformation;
        this.name = $.name;
        this.retentionSecs = $.retentionSecs;
        this.sources = $.sources;
        this.waitForCollection = $.waitForCollection;
        this.waitForDocuments = $.waitForDocuments;
        this.workspace = $.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocksetDynamodbCollectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocksetDynamodbCollectionState $;

        public Builder() {
            $ = new RocksetDynamodbCollectionState();
        }

        public Builder(RocksetDynamodbCollectionState defaults) {
            $ = new RocksetDynamodbCollectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Text describing the collection.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Text describing the collection.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fieldMappingQuery **Deprecated** use ingest_transformation instead
         * 
         * @return builder
         * 
         * @deprecated
         * Use ingest_transformation instead
         * 
         */
        @Deprecated /* Use ingest_transformation instead */
        public Builder fieldMappingQuery(@Nullable Output<String> fieldMappingQuery) {
            $.fieldMappingQuery = fieldMappingQuery;
            return this;
        }

        /**
         * @param fieldMappingQuery **Deprecated** use ingest_transformation instead
         * 
         * @return builder
         * 
         * @deprecated
         * Use ingest_transformation instead
         * 
         */
        @Deprecated /* Use ingest_transformation instead */
        public Builder fieldMappingQuery(String fieldMappingQuery) {
            return fieldMappingQuery(Output.of(fieldMappingQuery));
        }

        /**
         * @param ingestTransformation Ingest transformation SQL query. Turns the collection into insert_only mode.
         * 
         * @return builder
         * 
         */
        public Builder ingestTransformation(@Nullable Output<String> ingestTransformation) {
            $.ingestTransformation = ingestTransformation;
            return this;
        }

        /**
         * @param ingestTransformation Ingest transformation SQL query. Turns the collection into insert_only mode.
         * 
         * @return builder
         * 
         */
        public Builder ingestTransformation(String ingestTransformation) {
            return ingestTransformation(Output.of(ingestTransformation));
        }

        /**
         * @param name Unique identifier for the collection. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique identifier for the collection. Can contain alphanumeric or dash characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param retentionSecs Number of seconds after which data is purged. Based on event time.
         * 
         * @return builder
         * 
         */
        public Builder retentionSecs(@Nullable Output<Integer> retentionSecs) {
            $.retentionSecs = retentionSecs;
            return this;
        }

        /**
         * @param retentionSecs Number of seconds after which data is purged. Based on event time.
         * 
         * @return builder
         * 
         */
        public Builder retentionSecs(Integer retentionSecs) {
            return retentionSecs(Output.of(retentionSecs));
        }

        /**
         * @param sources Defines a source for this collection.
         * 
         * @return builder
         * 
         */
        public Builder sources(@Nullable Output<List<RocksetDynamodbCollectionSourceArgs>> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources Defines a source for this collection.
         * 
         * @return builder
         * 
         */
        public Builder sources(List<RocksetDynamodbCollectionSourceArgs> sources) {
            return sources(Output.of(sources));
        }

        /**
         * @param sources Defines a source for this collection.
         * 
         * @return builder
         * 
         */
        public Builder sources(RocksetDynamodbCollectionSourceArgs... sources) {
            return sources(List.of(sources));
        }

        /**
         * @param waitForCollection Wait until the collection is ready.
         * 
         * @return builder
         * 
         */
        public Builder waitForCollection(@Nullable Output<Boolean> waitForCollection) {
            $.waitForCollection = waitForCollection;
            return this;
        }

        /**
         * @param waitForCollection Wait until the collection is ready.
         * 
         * @return builder
         * 
         */
        public Builder waitForCollection(Boolean waitForCollection) {
            return waitForCollection(Output.of(waitForCollection));
        }

        /**
         * @param waitForDocuments Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn&#39;t wait.
         * 
         * @return builder
         * 
         */
        public Builder waitForDocuments(@Nullable Output<Integer> waitForDocuments) {
            $.waitForDocuments = waitForDocuments;
            return this;
        }

        /**
         * @param waitForDocuments Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn&#39;t wait.
         * 
         * @return builder
         * 
         */
        public Builder waitForDocuments(Integer waitForDocuments) {
            return waitForDocuments(Output.of(waitForDocuments));
        }

        /**
         * @param workspace The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspace(@Nullable Output<String> workspace) {
            $.workspace = workspace;
            return this;
        }

        /**
         * @param workspace The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspace(String workspace) {
            return workspace(Output.of(workspace));
        }

        public RocksetDynamodbCollectionState build() {
            return $;
        }
    }

}

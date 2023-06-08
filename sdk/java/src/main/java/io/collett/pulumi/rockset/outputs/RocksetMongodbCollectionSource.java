// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RocksetMongodbCollectionSource {
    /**
     * @return MongoDB collection name of the target collection.
     * 
     */
    private String collectionName;
    /**
     * @return MongoDB database name containing the target collection.
     * 
     */
    private String databaseName;
    /**
     * @return The name of the Rockset MongoDB integration.
     * 
     */
    private String integrationName;
    /**
     * @return MongoDB scan end time.
     * 
     */
    private @Nullable String scanEndTime;
    /**
     * @return Number of records inserted using scan.
     * 
     */
    private @Nullable Integer scanRecordsProcessed;
    /**
     * @return MongoDB scan start time.
     * 
     */
    private @Nullable String scanStartTime;
    /**
     * @return Number of records in MongoDB table at time of scan.
     * 
     */
    private @Nullable Integer scanTotalRecords;
    /**
     * @return State of current ingest for this table.
     * 
     */
    private @Nullable String state;
    /**
     * @return ISO-8601 date when delete from source was last processed.
     * 
     */
    private @Nullable String streamLastDeleteProcessedAt;
    /**
     * @return ISO-8601 date when new insert from source was last processed.
     * 
     */
    private @Nullable String streamLastInsertProcessedAt;
    /**
     * @return ISO-8601 date when update from source was last processed.
     * 
     */
    private @Nullable String streamLastUpdateProcessedAt;
    /**
     * @return Number of new records deleted using stream.
     * 
     */
    private @Nullable Integer streamRecordsDeleted;
    /**
     * @return Number of new records inserted using stream.
     * 
     */
    private @Nullable Integer streamRecordsInserted;
    /**
     * @return Number of new records updated using stream.
     * 
     */
    private @Nullable Integer streamRecordsUpdated;

    private RocksetMongodbCollectionSource() {}
    /**
     * @return MongoDB collection name of the target collection.
     * 
     */
    public String collectionName() {
        return this.collectionName;
    }
    /**
     * @return MongoDB database name containing the target collection.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * @return The name of the Rockset MongoDB integration.
     * 
     */
    public String integrationName() {
        return this.integrationName;
    }
    /**
     * @return MongoDB scan end time.
     * 
     */
    public Optional<String> scanEndTime() {
        return Optional.ofNullable(this.scanEndTime);
    }
    /**
     * @return Number of records inserted using scan.
     * 
     */
    public Optional<Integer> scanRecordsProcessed() {
        return Optional.ofNullable(this.scanRecordsProcessed);
    }
    /**
     * @return MongoDB scan start time.
     * 
     */
    public Optional<String> scanStartTime() {
        return Optional.ofNullable(this.scanStartTime);
    }
    /**
     * @return Number of records in MongoDB table at time of scan.
     * 
     */
    public Optional<Integer> scanTotalRecords() {
        return Optional.ofNullable(this.scanTotalRecords);
    }
    /**
     * @return State of current ingest for this table.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return ISO-8601 date when delete from source was last processed.
     * 
     */
    public Optional<String> streamLastDeleteProcessedAt() {
        return Optional.ofNullable(this.streamLastDeleteProcessedAt);
    }
    /**
     * @return ISO-8601 date when new insert from source was last processed.
     * 
     */
    public Optional<String> streamLastInsertProcessedAt() {
        return Optional.ofNullable(this.streamLastInsertProcessedAt);
    }
    /**
     * @return ISO-8601 date when update from source was last processed.
     * 
     */
    public Optional<String> streamLastUpdateProcessedAt() {
        return Optional.ofNullable(this.streamLastUpdateProcessedAt);
    }
    /**
     * @return Number of new records deleted using stream.
     * 
     */
    public Optional<Integer> streamRecordsDeleted() {
        return Optional.ofNullable(this.streamRecordsDeleted);
    }
    /**
     * @return Number of new records inserted using stream.
     * 
     */
    public Optional<Integer> streamRecordsInserted() {
        return Optional.ofNullable(this.streamRecordsInserted);
    }
    /**
     * @return Number of new records updated using stream.
     * 
     */
    public Optional<Integer> streamRecordsUpdated() {
        return Optional.ofNullable(this.streamRecordsUpdated);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RocksetMongodbCollectionSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String collectionName;
        private String databaseName;
        private String integrationName;
        private @Nullable String scanEndTime;
        private @Nullable Integer scanRecordsProcessed;
        private @Nullable String scanStartTime;
        private @Nullable Integer scanTotalRecords;
        private @Nullable String state;
        private @Nullable String streamLastDeleteProcessedAt;
        private @Nullable String streamLastInsertProcessedAt;
        private @Nullable String streamLastUpdateProcessedAt;
        private @Nullable Integer streamRecordsDeleted;
        private @Nullable Integer streamRecordsInserted;
        private @Nullable Integer streamRecordsUpdated;
        public Builder() {}
        public Builder(RocksetMongodbCollectionSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionName = defaults.collectionName;
    	      this.databaseName = defaults.databaseName;
    	      this.integrationName = defaults.integrationName;
    	      this.scanEndTime = defaults.scanEndTime;
    	      this.scanRecordsProcessed = defaults.scanRecordsProcessed;
    	      this.scanStartTime = defaults.scanStartTime;
    	      this.scanTotalRecords = defaults.scanTotalRecords;
    	      this.state = defaults.state;
    	      this.streamLastDeleteProcessedAt = defaults.streamLastDeleteProcessedAt;
    	      this.streamLastInsertProcessedAt = defaults.streamLastInsertProcessedAt;
    	      this.streamLastUpdateProcessedAt = defaults.streamLastUpdateProcessedAt;
    	      this.streamRecordsDeleted = defaults.streamRecordsDeleted;
    	      this.streamRecordsInserted = defaults.streamRecordsInserted;
    	      this.streamRecordsUpdated = defaults.streamRecordsUpdated;
        }

        @CustomType.Setter
        public Builder collectionName(String collectionName) {
            this.collectionName = Objects.requireNonNull(collectionName);
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        @CustomType.Setter
        public Builder integrationName(String integrationName) {
            this.integrationName = Objects.requireNonNull(integrationName);
            return this;
        }
        @CustomType.Setter
        public Builder scanEndTime(@Nullable String scanEndTime) {
            this.scanEndTime = scanEndTime;
            return this;
        }
        @CustomType.Setter
        public Builder scanRecordsProcessed(@Nullable Integer scanRecordsProcessed) {
            this.scanRecordsProcessed = scanRecordsProcessed;
            return this;
        }
        @CustomType.Setter
        public Builder scanStartTime(@Nullable String scanStartTime) {
            this.scanStartTime = scanStartTime;
            return this;
        }
        @CustomType.Setter
        public Builder scanTotalRecords(@Nullable Integer scanTotalRecords) {
            this.scanTotalRecords = scanTotalRecords;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder streamLastDeleteProcessedAt(@Nullable String streamLastDeleteProcessedAt) {
            this.streamLastDeleteProcessedAt = streamLastDeleteProcessedAt;
            return this;
        }
        @CustomType.Setter
        public Builder streamLastInsertProcessedAt(@Nullable String streamLastInsertProcessedAt) {
            this.streamLastInsertProcessedAt = streamLastInsertProcessedAt;
            return this;
        }
        @CustomType.Setter
        public Builder streamLastUpdateProcessedAt(@Nullable String streamLastUpdateProcessedAt) {
            this.streamLastUpdateProcessedAt = streamLastUpdateProcessedAt;
            return this;
        }
        @CustomType.Setter
        public Builder streamRecordsDeleted(@Nullable Integer streamRecordsDeleted) {
            this.streamRecordsDeleted = streamRecordsDeleted;
            return this;
        }
        @CustomType.Setter
        public Builder streamRecordsInserted(@Nullable Integer streamRecordsInserted) {
            this.streamRecordsInserted = streamRecordsInserted;
            return this;
        }
        @CustomType.Setter
        public Builder streamRecordsUpdated(@Nullable Integer streamRecordsUpdated) {
            this.streamRecordsUpdated = streamRecordsUpdated;
            return this;
        }
        public RocksetMongodbCollectionSource build() {
            final var o = new RocksetMongodbCollectionSource();
            o.collectionName = collectionName;
            o.databaseName = databaseName;
            o.integrationName = integrationName;
            o.scanEndTime = scanEndTime;
            o.scanRecordsProcessed = scanRecordsProcessed;
            o.scanStartTime = scanStartTime;
            o.scanTotalRecords = scanTotalRecords;
            o.state = state;
            o.streamLastDeleteProcessedAt = streamLastDeleteProcessedAt;
            o.streamLastInsertProcessedAt = streamLastInsertProcessedAt;
            o.streamLastUpdateProcessedAt = streamLastUpdateProcessedAt;
            o.streamRecordsDeleted = streamRecordsDeleted;
            o.streamRecordsInserted = streamRecordsInserted;
            o.streamRecordsUpdated = streamRecordsUpdated;
            return o;
        }
    }
}

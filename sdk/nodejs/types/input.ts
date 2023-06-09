// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface RocksetDynamodbCollectionSource {
    /**
     * AWS region name of DynamoDB table, by default us-west-2 is used.
     */
    awsRegion?: pulumi.Input<string>;
    /**
     * The name of the Rockset DynamoDB integration.
     */
    integrationName: pulumi.Input<string>;
    /**
     * Max RCU usage for scan.
     */
    rcu?: pulumi.Input<number>;
    /**
     * DynamoDB scan end time.
     */
    scanEndTime?: pulumi.Input<string>;
    /**
     * Number of records inserted using scan.
     */
    scanRecordsProcessed?: pulumi.Input<number>;
    /**
     * DynamoDB scan start time.
     */
    scanStartTime?: pulumi.Input<string>;
    /**
     * Number of records in DynamoDB table at time of scan.
     */
    scanTotalRecords?: pulumi.Input<number>;
    /**
     * State of current ingest for this table.
     */
    state?: pulumi.Input<string>;
    /**
     * ISO-8601 date when source was last processed.
     */
    streamLastProcessedAt?: pulumi.Input<string>;
    /**
     * Name of DynamoDB table containing data.
     */
    tableName: pulumi.Input<string>;
    /**
     * Whether the initial table scan should use the DynamoDB scan API. If false, export will be performed using an S3 bucket.
     */
    useScanApi?: pulumi.Input<boolean>;
}

export interface RocksetGcsCollectionSource {
    /**
     * GCS bucket containing the target data.
     */
    bucket: pulumi.Input<string>;
    csv?: pulumi.Input<inputs.RocksetGcsCollectionSourceCsv>;
    /**
     * Format of the data. One of: json, csv, xml. xml and csv blocks can only be set for their respective formats.
     */
    format: pulumi.Input<string>;
    /**
     * The name of the Rockset GCS integration.
     */
    integrationName: pulumi.Input<string>;
    /**
     * Simple path prefix to GCS key.
     */
    prefix?: pulumi.Input<string>;
    xml?: pulumi.Input<inputs.RocksetGcsCollectionSourceXml>;
}

export interface RocksetGcsCollectionSourceCsv {
    columnNames?: pulumi.Input<pulumi.Input<string>[]>;
    columnTypes?: pulumi.Input<pulumi.Input<string>[]>;
    encoding?: pulumi.Input<string>;
    escapeChar?: pulumi.Input<string>;
    firstLineAsColumnNames?: pulumi.Input<boolean>;
    quoteChar?: pulumi.Input<string>;
    separator?: pulumi.Input<string>;
}

export interface RocksetGcsCollectionSourceXml {
    attributePrefix?: pulumi.Input<string>;
    docTag?: pulumi.Input<string>;
    encoding?: pulumi.Input<string>;
    rootTag?: pulumi.Input<string>;
    valueTag?: pulumi.Input<string>;
}

export interface RocksetKafkaCollectionSource {
    /**
     * The Kafka consumer group Id being used.
     */
    consumerGroupId?: pulumi.Input<string>;
    /**
     * The name of the Rockset Kafka integration.
     */
    integrationName: pulumi.Input<string>;
    /**
     * The offset reset policy. Possible values: LATEST, EARLIEST. Only valid with v3 collections.
     */
    offsetResetPolicy?: pulumi.Input<string>;
    statuses?: pulumi.Input<pulumi.Input<inputs.RocksetKafkaCollectionSourceStatus>[]>;
    /**
     * Name of Kafka topic to be tailed.
     */
    topicName: pulumi.Input<string>;
    /**
     * Whether to use v3 integration. Required if the kafka integration uses v3.
     */
    useV3?: pulumi.Input<boolean>;
}

export interface RocksetKafkaCollectionSourceStatus {
    documentsProcessed?: pulumi.Input<number>;
    lastConsumedTime?: pulumi.Input<string>;
    partitions?: pulumi.Input<pulumi.Input<inputs.RocksetKafkaCollectionSourceStatusPartition>[]>;
    state?: pulumi.Input<string>;
}

export interface RocksetKafkaCollectionSourceStatusPartition {
    offsetLag?: pulumi.Input<number>;
    partitionNumber?: pulumi.Input<number>;
    partitionOffset?: pulumi.Input<number>;
}

export interface RocksetKinesisCollectionSource {
    /**
     * AWS region name for the Kinesis stream, by default us-west-2 is used
     */
    awsRegion?: pulumi.Input<string>;
    /**
     * Set of fields that correspond to a DMS primary key. Can only be set if format is mysql or postgres.
     */
    dmsPrimaryKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Format of the data. One of: json, mysql, postgres. dms*primary*keys list can only be set for mysql or postgres.
     */
    format: pulumi.Input<string>;
    /**
     * The name of the Rockset Kinesis integration.
     */
    integrationName: pulumi.Input<string>;
    /**
     * Name of Kinesis stream.
     */
    streamName: pulumi.Input<string>;
}

export interface RocksetMongodbCollectionSource {
    /**
     * MongoDB collection name of the target collection.
     */
    collectionName: pulumi.Input<string>;
    /**
     * MongoDB database name containing the target collection.
     */
    databaseName: pulumi.Input<string>;
    /**
     * The name of the Rockset MongoDB integration.
     */
    integrationName: pulumi.Input<string>;
    /**
     * MongoDB scan end time.
     */
    scanEndTime?: pulumi.Input<string>;
    /**
     * Number of records inserted using scan.
     */
    scanRecordsProcessed?: pulumi.Input<number>;
    /**
     * MongoDB scan start time.
     */
    scanStartTime?: pulumi.Input<string>;
    /**
     * Number of records in MongoDB table at time of scan.
     */
    scanTotalRecords?: pulumi.Input<number>;
    /**
     * State of current ingest for this table.
     */
    state?: pulumi.Input<string>;
    /**
     * ISO-8601 date when delete from source was last processed.
     */
    streamLastDeleteProcessedAt?: pulumi.Input<string>;
    /**
     * ISO-8601 date when new insert from source was last processed.
     */
    streamLastInsertProcessedAt?: pulumi.Input<string>;
    /**
     * ISO-8601 date when update from source was last processed.
     */
    streamLastUpdateProcessedAt?: pulumi.Input<string>;
    /**
     * Number of new records deleted using stream.
     */
    streamRecordsDeleted?: pulumi.Input<number>;
    /**
     * Number of new records inserted using stream.
     */
    streamRecordsInserted?: pulumi.Input<number>;
    /**
     * Number of new records updated using stream.
     */
    streamRecordsUpdated?: pulumi.Input<number>;
}

export interface RocksetQueryLambdaSql {
    defaultParameters?: pulumi.Input<pulumi.Input<inputs.RocksetQueryLambdaSqlDefaultParameter>[]>;
    query: pulumi.Input<string>;
}

export interface RocksetQueryLambdaSqlDefaultParameter {
    /**
     * Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
     */
    name: pulumi.Input<string>;
    type: pulumi.Input<string>;
    value: pulumi.Input<string>;
}

export interface RocksetRolePrivilege {
    /**
     * The action allowed by this privilege.
     */
    action: pulumi.Input<string>;
    /**
     * Rockset cluster ID for which this action is allowed. Only valid for Workspace actions. Use '*ALL*' for actions which apply to all clusters.
     */
    cluster?: pulumi.Input<string>;
    /**
     * The resource on which this action is allowed. Defaults to 'All' if not specified.
     */
    resourceName?: pulumi.Input<string>;
}

export interface RocksetS3CollectionSource {
    /**
     * S3 bucket containing the target data.
     */
    bucket: pulumi.Input<string>;
    csv?: pulumi.Input<inputs.RocksetS3CollectionSourceCsv>;
    /**
     * Format of the data. One of: json, csv, xml. xml and csv blocks can only be set for their respective formats.
     */
    format: pulumi.Input<string>;
    /**
     * The name of the Rockset S3 integration. If no S3 integration is provided only data in public S3 buckets are accessible.
     */
    integrationName: pulumi.Input<string>;
    /**
     * Regex path pattern to S3 keys.
     */
    pattern?: pulumi.Input<string>;
    /**
     * Simple path prefix to S3 keys.
     *
     * @deprecated use pattern instead
     */
    prefix?: pulumi.Input<string>;
    xml?: pulumi.Input<inputs.RocksetS3CollectionSourceXml>;
}

export interface RocksetS3CollectionSourceCsv {
    columnNames?: pulumi.Input<pulumi.Input<string>[]>;
    columnTypes?: pulumi.Input<pulumi.Input<string>[]>;
    encoding?: pulumi.Input<string>;
    escapeChar?: pulumi.Input<string>;
    firstLineAsColumnNames?: pulumi.Input<boolean>;
    quoteChar?: pulumi.Input<string>;
    separator?: pulumi.Input<string>;
}

export interface RocksetS3CollectionSourceXml {
    attributePrefix?: pulumi.Input<string>;
    docTag?: pulumi.Input<string>;
    encoding?: pulumi.Input<string>;
    rootTag?: pulumi.Input<string>;
    valueTag?: pulumi.Input<string>;
}

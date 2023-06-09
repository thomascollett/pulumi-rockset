// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface GetAccountCluster {
    apiServer: string;
    awsRegion: string;
    type: string;
}

export interface RocksetDynamodbCollectionSource {
    /**
     * AWS region name of DynamoDB table, by default us-west-2 is used.
     */
    awsRegion?: string;
    /**
     * The name of the Rockset DynamoDB integration.
     */
    integrationName: string;
    /**
     * Max RCU usage for scan.
     */
    rcu?: number;
    /**
     * DynamoDB scan end time.
     */
    scanEndTime: string;
    /**
     * Number of records inserted using scan.
     */
    scanRecordsProcessed: number;
    /**
     * DynamoDB scan start time.
     */
    scanStartTime: string;
    /**
     * Number of records in DynamoDB table at time of scan.
     */
    scanTotalRecords: number;
    /**
     * State of current ingest for this table.
     */
    state: string;
    /**
     * ISO-8601 date when source was last processed.
     */
    streamLastProcessedAt: string;
    /**
     * Name of DynamoDB table containing data.
     */
    tableName: string;
    /**
     * Whether the initial table scan should use the DynamoDB scan API. If false, export will be performed using an S3 bucket.
     */
    useScanApi?: boolean;
}

export interface RocksetGcsCollectionSource {
    /**
     * GCS bucket containing the target data.
     */
    bucket: string;
    csv?: outputs.RocksetGcsCollectionSourceCsv;
    /**
     * Format of the data. One of: json, csv, xml. xml and csv blocks can only be set for their respective formats.
     */
    format: string;
    /**
     * The name of the Rockset GCS integration.
     */
    integrationName: string;
    /**
     * Simple path prefix to GCS key.
     */
    prefix?: string;
    xml?: outputs.RocksetGcsCollectionSourceXml;
}

export interface RocksetGcsCollectionSourceCsv {
    columnNames?: string[];
    columnTypes?: string[];
    encoding?: string;
    escapeChar?: string;
    firstLineAsColumnNames?: boolean;
    quoteChar?: string;
    separator?: string;
}

export interface RocksetGcsCollectionSourceXml {
    attributePrefix?: string;
    docTag?: string;
    encoding?: string;
    rootTag?: string;
    valueTag?: string;
}

export interface RocksetKafkaCollectionSource {
    /**
     * The Kafka consumer group Id being used.
     */
    consumerGroupId: string;
    /**
     * The name of the Rockset Kafka integration.
     */
    integrationName: string;
    /**
     * The offset reset policy. Possible values: LATEST, EARLIEST. Only valid with v3 collections.
     */
    offsetResetPolicy?: string;
    statuses: outputs.RocksetKafkaCollectionSourceStatus[];
    /**
     * Name of Kafka topic to be tailed.
     */
    topicName: string;
    /**
     * Whether to use v3 integration. Required if the kafka integration uses v3.
     */
    useV3?: boolean;
}

export interface RocksetKafkaCollectionSourceStatus {
    documentsProcessed: number;
    lastConsumedTime: string;
    partitions: outputs.RocksetKafkaCollectionSourceStatusPartition[];
    state: string;
}

export interface RocksetKafkaCollectionSourceStatusPartition {
    offsetLag: number;
    partitionNumber: number;
    partitionOffset: number;
}

export interface RocksetKinesisCollectionSource {
    /**
     * AWS region name for the Kinesis stream, by default us-west-2 is used
     */
    awsRegion?: string;
    /**
     * Set of fields that correspond to a DMS primary key. Can only be set if format is mysql or postgres.
     */
    dmsPrimaryKeys?: string[];
    /**
     * Format of the data. One of: json, mysql, postgres. dms*primary*keys list can only be set for mysql or postgres.
     */
    format: string;
    /**
     * The name of the Rockset Kinesis integration.
     */
    integrationName: string;
    /**
     * Name of Kinesis stream.
     */
    streamName: string;
}

export interface RocksetMongodbCollectionSource {
    /**
     * MongoDB collection name of the target collection.
     */
    collectionName: string;
    /**
     * MongoDB database name containing the target collection.
     */
    databaseName: string;
    /**
     * The name of the Rockset MongoDB integration.
     */
    integrationName: string;
    /**
     * MongoDB scan end time.
     */
    scanEndTime: string;
    /**
     * Number of records inserted using scan.
     */
    scanRecordsProcessed: number;
    /**
     * MongoDB scan start time.
     */
    scanStartTime: string;
    /**
     * Number of records in MongoDB table at time of scan.
     */
    scanTotalRecords: number;
    /**
     * State of current ingest for this table.
     */
    state: string;
    /**
     * ISO-8601 date when delete from source was last processed.
     */
    streamLastDeleteProcessedAt: string;
    /**
     * ISO-8601 date when new insert from source was last processed.
     */
    streamLastInsertProcessedAt: string;
    /**
     * ISO-8601 date when update from source was last processed.
     */
    streamLastUpdateProcessedAt: string;
    /**
     * Number of new records deleted using stream.
     */
    streamRecordsDeleted: number;
    /**
     * Number of new records inserted using stream.
     */
    streamRecordsInserted: number;
    /**
     * Number of new records updated using stream.
     */
    streamRecordsUpdated: number;
}

export interface RocksetQueryLambdaSql {
    defaultParameters?: outputs.RocksetQueryLambdaSqlDefaultParameter[];
    query: string;
}

export interface RocksetQueryLambdaSqlDefaultParameter {
    /**
     * Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
     */
    name: string;
    type: string;
    value: string;
}

export interface RocksetRolePrivilege {
    /**
     * The action allowed by this privilege.
     */
    action: string;
    /**
     * Rockset cluster ID for which this action is allowed. Only valid for Workspace actions. Use '*ALL*' for actions which apply to all clusters.
     */
    cluster?: string;
    /**
     * The resource on which this action is allowed. Defaults to 'All' if not specified.
     */
    resourceName?: string;
}

export interface RocksetS3CollectionSource {
    /**
     * S3 bucket containing the target data.
     */
    bucket: string;
    csv?: outputs.RocksetS3CollectionSourceCsv;
    /**
     * Format of the data. One of: json, csv, xml. xml and csv blocks can only be set for their respective formats.
     */
    format: string;
    /**
     * The name of the Rockset S3 integration. If no S3 integration is provided only data in public S3 buckets are accessible.
     */
    integrationName: string;
    /**
     * Regex path pattern to S3 keys.
     */
    pattern?: string;
    /**
     * Simple path prefix to S3 keys.
     *
     * @deprecated use pattern instead
     */
    prefix?: string;
    xml?: outputs.RocksetS3CollectionSourceXml;
}

export interface RocksetS3CollectionSourceCsv {
    columnNames?: string[];
    columnTypes?: string[];
    encoding?: string;
    escapeChar?: string;
    firstLineAsColumnNames?: boolean;
    quoteChar?: string;
    separator?: string;
}

export interface RocksetS3CollectionSourceXml {
    attributePrefix?: string;
    docTag?: string;
    encoding?: string;
    rootTag?: string;
    valueTag?: string;
}


// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.collett.pulumi.rockset.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocksetS3CollectionSourceCsvArgs extends com.pulumi.resources.ResourceArgs {

    public static final RocksetS3CollectionSourceCsvArgs Empty = new RocksetS3CollectionSourceCsvArgs();

    @Import(name="columnNames")
    private @Nullable Output<List<String>> columnNames;

    public Optional<Output<List<String>>> columnNames() {
        return Optional.ofNullable(this.columnNames);
    }

    @Import(name="columnTypes")
    private @Nullable Output<List<String>> columnTypes;

    public Optional<Output<List<String>>> columnTypes() {
        return Optional.ofNullable(this.columnTypes);
    }

    @Import(name="encoding")
    private @Nullable Output<String> encoding;

    public Optional<Output<String>> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    @Import(name="escapeChar")
    private @Nullable Output<String> escapeChar;

    public Optional<Output<String>> escapeChar() {
        return Optional.ofNullable(this.escapeChar);
    }

    @Import(name="firstLineAsColumnNames")
    private @Nullable Output<Boolean> firstLineAsColumnNames;

    public Optional<Output<Boolean>> firstLineAsColumnNames() {
        return Optional.ofNullable(this.firstLineAsColumnNames);
    }

    @Import(name="quoteChar")
    private @Nullable Output<String> quoteChar;

    public Optional<Output<String>> quoteChar() {
        return Optional.ofNullable(this.quoteChar);
    }

    @Import(name="separator")
    private @Nullable Output<String> separator;

    public Optional<Output<String>> separator() {
        return Optional.ofNullable(this.separator);
    }

    private RocksetS3CollectionSourceCsvArgs() {}

    private RocksetS3CollectionSourceCsvArgs(RocksetS3CollectionSourceCsvArgs $) {
        this.columnNames = $.columnNames;
        this.columnTypes = $.columnTypes;
        this.encoding = $.encoding;
        this.escapeChar = $.escapeChar;
        this.firstLineAsColumnNames = $.firstLineAsColumnNames;
        this.quoteChar = $.quoteChar;
        this.separator = $.separator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocksetS3CollectionSourceCsvArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocksetS3CollectionSourceCsvArgs $;

        public Builder() {
            $ = new RocksetS3CollectionSourceCsvArgs();
        }

        public Builder(RocksetS3CollectionSourceCsvArgs defaults) {
            $ = new RocksetS3CollectionSourceCsvArgs(Objects.requireNonNull(defaults));
        }

        public Builder columnNames(@Nullable Output<List<String>> columnNames) {
            $.columnNames = columnNames;
            return this;
        }

        public Builder columnNames(List<String> columnNames) {
            return columnNames(Output.of(columnNames));
        }

        public Builder columnNames(String... columnNames) {
            return columnNames(List.of(columnNames));
        }

        public Builder columnTypes(@Nullable Output<List<String>> columnTypes) {
            $.columnTypes = columnTypes;
            return this;
        }

        public Builder columnTypes(List<String> columnTypes) {
            return columnTypes(Output.of(columnTypes));
        }

        public Builder columnTypes(String... columnTypes) {
            return columnTypes(List.of(columnTypes));
        }

        public Builder encoding(@Nullable Output<String> encoding) {
            $.encoding = encoding;
            return this;
        }

        public Builder encoding(String encoding) {
            return encoding(Output.of(encoding));
        }

        public Builder escapeChar(@Nullable Output<String> escapeChar) {
            $.escapeChar = escapeChar;
            return this;
        }

        public Builder escapeChar(String escapeChar) {
            return escapeChar(Output.of(escapeChar));
        }

        public Builder firstLineAsColumnNames(@Nullable Output<Boolean> firstLineAsColumnNames) {
            $.firstLineAsColumnNames = firstLineAsColumnNames;
            return this;
        }

        public Builder firstLineAsColumnNames(Boolean firstLineAsColumnNames) {
            return firstLineAsColumnNames(Output.of(firstLineAsColumnNames));
        }

        public Builder quoteChar(@Nullable Output<String> quoteChar) {
            $.quoteChar = quoteChar;
            return this;
        }

        public Builder quoteChar(String quoteChar) {
            return quoteChar(Output.of(quoteChar));
        }

        public Builder separator(@Nullable Output<String> separator) {
            $.separator = separator;
            return this;
        }

        public Builder separator(String separator) {
            return separator(Output.of(separator));
        }

        public RocksetS3CollectionSourceCsvArgs build() {
            return $;
        }
    }

}
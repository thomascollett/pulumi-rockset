// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rockset

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a collection with an Kinesis source attached.
type RocksetKinesisCollection struct {
	pulumi.CustomResourceState

	// Text describing the collection.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// **Deprecated** use ingestTransformation instead
	//
	// Deprecated: Use ingest_transformation instead
	FieldMappingQuery pulumi.StringPtrOutput `pulumi:"fieldMappingQuery"`
	// Ingest transformation SQL query. Turns the collection into insertOnly mode.
	IngestTransformation pulumi.StringPtrOutput `pulumi:"ingestTransformation"`
	// Unique identifier for the collection. Can contain alphanumeric or dash characters.
	Name pulumi.StringOutput `pulumi:"name"`
	// Number of seconds after which data is purged. Based on event time.
	RetentionSecs pulumi.IntPtrOutput `pulumi:"retentionSecs"`
	// Defines a source for this collection.
	Sources RocksetKinesisCollectionSourceArrayOutput `pulumi:"sources"`
	// Wait until the collection is ready.
	WaitForCollection pulumi.BoolPtrOutput `pulumi:"waitForCollection"`
	// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
	WaitForDocuments pulumi.IntPtrOutput `pulumi:"waitForDocuments"`
	// The name of the workspace.
	Workspace pulumi.StringOutput `pulumi:"workspace"`
}

// NewRocksetKinesisCollection registers a new resource with the given unique name, arguments, and options.
func NewRocksetKinesisCollection(ctx *pulumi.Context,
	name string, args *RocksetKinesisCollectionArgs, opts ...pulumi.ResourceOption) (*RocksetKinesisCollection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Workspace == nil {
		return nil, errors.New("invalid value for required argument 'Workspace'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource RocksetKinesisCollection
	err := ctx.RegisterResource("rockset:index/rocksetKinesisCollection:RocksetKinesisCollection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRocksetKinesisCollection gets an existing RocksetKinesisCollection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRocksetKinesisCollection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RocksetKinesisCollectionState, opts ...pulumi.ResourceOption) (*RocksetKinesisCollection, error) {
	var resource RocksetKinesisCollection
	err := ctx.ReadResource("rockset:index/rocksetKinesisCollection:RocksetKinesisCollection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RocksetKinesisCollection resources.
type rocksetKinesisCollectionState struct {
	// Text describing the collection.
	Description *string `pulumi:"description"`
	// **Deprecated** use ingestTransformation instead
	//
	// Deprecated: Use ingest_transformation instead
	FieldMappingQuery *string `pulumi:"fieldMappingQuery"`
	// Ingest transformation SQL query. Turns the collection into insertOnly mode.
	IngestTransformation *string `pulumi:"ingestTransformation"`
	// Unique identifier for the collection. Can contain alphanumeric or dash characters.
	Name *string `pulumi:"name"`
	// Number of seconds after which data is purged. Based on event time.
	RetentionSecs *int `pulumi:"retentionSecs"`
	// Defines a source for this collection.
	Sources []RocksetKinesisCollectionSource `pulumi:"sources"`
	// Wait until the collection is ready.
	WaitForCollection *bool `pulumi:"waitForCollection"`
	// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
	WaitForDocuments *int `pulumi:"waitForDocuments"`
	// The name of the workspace.
	Workspace *string `pulumi:"workspace"`
}

type RocksetKinesisCollectionState struct {
	// Text describing the collection.
	Description pulumi.StringPtrInput
	// **Deprecated** use ingestTransformation instead
	//
	// Deprecated: Use ingest_transformation instead
	FieldMappingQuery pulumi.StringPtrInput
	// Ingest transformation SQL query. Turns the collection into insertOnly mode.
	IngestTransformation pulumi.StringPtrInput
	// Unique identifier for the collection. Can contain alphanumeric or dash characters.
	Name pulumi.StringPtrInput
	// Number of seconds after which data is purged. Based on event time.
	RetentionSecs pulumi.IntPtrInput
	// Defines a source for this collection.
	Sources RocksetKinesisCollectionSourceArrayInput
	// Wait until the collection is ready.
	WaitForCollection pulumi.BoolPtrInput
	// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
	WaitForDocuments pulumi.IntPtrInput
	// The name of the workspace.
	Workspace pulumi.StringPtrInput
}

func (RocksetKinesisCollectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*rocksetKinesisCollectionState)(nil)).Elem()
}

type rocksetKinesisCollectionArgs struct {
	// Text describing the collection.
	Description *string `pulumi:"description"`
	// **Deprecated** use ingestTransformation instead
	//
	// Deprecated: Use ingest_transformation instead
	FieldMappingQuery *string `pulumi:"fieldMappingQuery"`
	// Ingest transformation SQL query. Turns the collection into insertOnly mode.
	IngestTransformation *string `pulumi:"ingestTransformation"`
	// Unique identifier for the collection. Can contain alphanumeric or dash characters.
	Name *string `pulumi:"name"`
	// Number of seconds after which data is purged. Based on event time.
	RetentionSecs *int `pulumi:"retentionSecs"`
	// Defines a source for this collection.
	Sources []RocksetKinesisCollectionSource `pulumi:"sources"`
	// Wait until the collection is ready.
	WaitForCollection *bool `pulumi:"waitForCollection"`
	// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
	WaitForDocuments *int `pulumi:"waitForDocuments"`
	// The name of the workspace.
	Workspace string `pulumi:"workspace"`
}

// The set of arguments for constructing a RocksetKinesisCollection resource.
type RocksetKinesisCollectionArgs struct {
	// Text describing the collection.
	Description pulumi.StringPtrInput
	// **Deprecated** use ingestTransformation instead
	//
	// Deprecated: Use ingest_transformation instead
	FieldMappingQuery pulumi.StringPtrInput
	// Ingest transformation SQL query. Turns the collection into insertOnly mode.
	IngestTransformation pulumi.StringPtrInput
	// Unique identifier for the collection. Can contain alphanumeric or dash characters.
	Name pulumi.StringPtrInput
	// Number of seconds after which data is purged. Based on event time.
	RetentionSecs pulumi.IntPtrInput
	// Defines a source for this collection.
	Sources RocksetKinesisCollectionSourceArrayInput
	// Wait until the collection is ready.
	WaitForCollection pulumi.BoolPtrInput
	// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
	WaitForDocuments pulumi.IntPtrInput
	// The name of the workspace.
	Workspace pulumi.StringInput
}

func (RocksetKinesisCollectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rocksetKinesisCollectionArgs)(nil)).Elem()
}

type RocksetKinesisCollectionInput interface {
	pulumi.Input

	ToRocksetKinesisCollectionOutput() RocksetKinesisCollectionOutput
	ToRocksetKinesisCollectionOutputWithContext(ctx context.Context) RocksetKinesisCollectionOutput
}

func (*RocksetKinesisCollection) ElementType() reflect.Type {
	return reflect.TypeOf((**RocksetKinesisCollection)(nil)).Elem()
}

func (i *RocksetKinesisCollection) ToRocksetKinesisCollectionOutput() RocksetKinesisCollectionOutput {
	return i.ToRocksetKinesisCollectionOutputWithContext(context.Background())
}

func (i *RocksetKinesisCollection) ToRocksetKinesisCollectionOutputWithContext(ctx context.Context) RocksetKinesisCollectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetKinesisCollectionOutput)
}

// RocksetKinesisCollectionArrayInput is an input type that accepts RocksetKinesisCollectionArray and RocksetKinesisCollectionArrayOutput values.
// You can construct a concrete instance of `RocksetKinesisCollectionArrayInput` via:
//
//	RocksetKinesisCollectionArray{ RocksetKinesisCollectionArgs{...} }
type RocksetKinesisCollectionArrayInput interface {
	pulumi.Input

	ToRocksetKinesisCollectionArrayOutput() RocksetKinesisCollectionArrayOutput
	ToRocksetKinesisCollectionArrayOutputWithContext(context.Context) RocksetKinesisCollectionArrayOutput
}

type RocksetKinesisCollectionArray []RocksetKinesisCollectionInput

func (RocksetKinesisCollectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RocksetKinesisCollection)(nil)).Elem()
}

func (i RocksetKinesisCollectionArray) ToRocksetKinesisCollectionArrayOutput() RocksetKinesisCollectionArrayOutput {
	return i.ToRocksetKinesisCollectionArrayOutputWithContext(context.Background())
}

func (i RocksetKinesisCollectionArray) ToRocksetKinesisCollectionArrayOutputWithContext(ctx context.Context) RocksetKinesisCollectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetKinesisCollectionArrayOutput)
}

// RocksetKinesisCollectionMapInput is an input type that accepts RocksetKinesisCollectionMap and RocksetKinesisCollectionMapOutput values.
// You can construct a concrete instance of `RocksetKinesisCollectionMapInput` via:
//
//	RocksetKinesisCollectionMap{ "key": RocksetKinesisCollectionArgs{...} }
type RocksetKinesisCollectionMapInput interface {
	pulumi.Input

	ToRocksetKinesisCollectionMapOutput() RocksetKinesisCollectionMapOutput
	ToRocksetKinesisCollectionMapOutputWithContext(context.Context) RocksetKinesisCollectionMapOutput
}

type RocksetKinesisCollectionMap map[string]RocksetKinesisCollectionInput

func (RocksetKinesisCollectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RocksetKinesisCollection)(nil)).Elem()
}

func (i RocksetKinesisCollectionMap) ToRocksetKinesisCollectionMapOutput() RocksetKinesisCollectionMapOutput {
	return i.ToRocksetKinesisCollectionMapOutputWithContext(context.Background())
}

func (i RocksetKinesisCollectionMap) ToRocksetKinesisCollectionMapOutputWithContext(ctx context.Context) RocksetKinesisCollectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetKinesisCollectionMapOutput)
}

type RocksetKinesisCollectionOutput struct{ *pulumi.OutputState }

func (RocksetKinesisCollectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RocksetKinesisCollection)(nil)).Elem()
}

func (o RocksetKinesisCollectionOutput) ToRocksetKinesisCollectionOutput() RocksetKinesisCollectionOutput {
	return o
}

func (o RocksetKinesisCollectionOutput) ToRocksetKinesisCollectionOutputWithContext(ctx context.Context) RocksetKinesisCollectionOutput {
	return o
}

// Text describing the collection.
func (o RocksetKinesisCollectionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RocksetKinesisCollection) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// **Deprecated** use ingestTransformation instead
//
// Deprecated: Use ingest_transformation instead
func (o RocksetKinesisCollectionOutput) FieldMappingQuery() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RocksetKinesisCollection) pulumi.StringPtrOutput { return v.FieldMappingQuery }).(pulumi.StringPtrOutput)
}

// Ingest transformation SQL query. Turns the collection into insertOnly mode.
func (o RocksetKinesisCollectionOutput) IngestTransformation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RocksetKinesisCollection) pulumi.StringPtrOutput { return v.IngestTransformation }).(pulumi.StringPtrOutput)
}

// Unique identifier for the collection. Can contain alphanumeric or dash characters.
func (o RocksetKinesisCollectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RocksetKinesisCollection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Number of seconds after which data is purged. Based on event time.
func (o RocksetKinesisCollectionOutput) RetentionSecs() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RocksetKinesisCollection) pulumi.IntPtrOutput { return v.RetentionSecs }).(pulumi.IntPtrOutput)
}

// Defines a source for this collection.
func (o RocksetKinesisCollectionOutput) Sources() RocksetKinesisCollectionSourceArrayOutput {
	return o.ApplyT(func(v *RocksetKinesisCollection) RocksetKinesisCollectionSourceArrayOutput { return v.Sources }).(RocksetKinesisCollectionSourceArrayOutput)
}

// Wait until the collection is ready.
func (o RocksetKinesisCollectionOutput) WaitForCollection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RocksetKinesisCollection) pulumi.BoolPtrOutput { return v.WaitForCollection }).(pulumi.BoolPtrOutput)
}

// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
func (o RocksetKinesisCollectionOutput) WaitForDocuments() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RocksetKinesisCollection) pulumi.IntPtrOutput { return v.WaitForDocuments }).(pulumi.IntPtrOutput)
}

// The name of the workspace.
func (o RocksetKinesisCollectionOutput) Workspace() pulumi.StringOutput {
	return o.ApplyT(func(v *RocksetKinesisCollection) pulumi.StringOutput { return v.Workspace }).(pulumi.StringOutput)
}

type RocksetKinesisCollectionArrayOutput struct{ *pulumi.OutputState }

func (RocksetKinesisCollectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RocksetKinesisCollection)(nil)).Elem()
}

func (o RocksetKinesisCollectionArrayOutput) ToRocksetKinesisCollectionArrayOutput() RocksetKinesisCollectionArrayOutput {
	return o
}

func (o RocksetKinesisCollectionArrayOutput) ToRocksetKinesisCollectionArrayOutputWithContext(ctx context.Context) RocksetKinesisCollectionArrayOutput {
	return o
}

func (o RocksetKinesisCollectionArrayOutput) Index(i pulumi.IntInput) RocksetKinesisCollectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RocksetKinesisCollection {
		return vs[0].([]*RocksetKinesisCollection)[vs[1].(int)]
	}).(RocksetKinesisCollectionOutput)
}

type RocksetKinesisCollectionMapOutput struct{ *pulumi.OutputState }

func (RocksetKinesisCollectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RocksetKinesisCollection)(nil)).Elem()
}

func (o RocksetKinesisCollectionMapOutput) ToRocksetKinesisCollectionMapOutput() RocksetKinesisCollectionMapOutput {
	return o
}

func (o RocksetKinesisCollectionMapOutput) ToRocksetKinesisCollectionMapOutputWithContext(ctx context.Context) RocksetKinesisCollectionMapOutput {
	return o
}

func (o RocksetKinesisCollectionMapOutput) MapIndex(k pulumi.StringInput) RocksetKinesisCollectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RocksetKinesisCollection {
		return vs[0].(map[string]*RocksetKinesisCollection)[vs[1].(string)]
	}).(RocksetKinesisCollectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetKinesisCollectionInput)(nil)).Elem(), &RocksetKinesisCollection{})
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetKinesisCollectionArrayInput)(nil)).Elem(), RocksetKinesisCollectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetKinesisCollectionMapInput)(nil)).Elem(), RocksetKinesisCollectionMap{})
	pulumi.RegisterOutputType(RocksetKinesisCollectionOutput{})
	pulumi.RegisterOutputType(RocksetKinesisCollectionArrayOutput{})
	pulumi.RegisterOutputType(RocksetKinesisCollectionMapOutput{})
}

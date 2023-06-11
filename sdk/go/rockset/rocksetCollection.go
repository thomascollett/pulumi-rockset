// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rockset

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a basic collection with no sources. Usually used for the write api.
type RocksetCollection struct {
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
	// Wait until the collection is ready.
	WaitForCollection pulumi.BoolPtrOutput `pulumi:"waitForCollection"`
	// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
	WaitForDocuments pulumi.IntPtrOutput `pulumi:"waitForDocuments"`
	// The name of the workspace.
	Workspace pulumi.StringOutput `pulumi:"workspace"`
}

// NewRocksetCollection registers a new resource with the given unique name, arguments, and options.
func NewRocksetCollection(ctx *pulumi.Context,
	name string, args *RocksetCollectionArgs, opts ...pulumi.ResourceOption) (*RocksetCollection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Workspace == nil {
		return nil, errors.New("invalid value for required argument 'Workspace'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource RocksetCollection
	err := ctx.RegisterResource("rockset:index/rocksetCollection:RocksetCollection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRocksetCollection gets an existing RocksetCollection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRocksetCollection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RocksetCollectionState, opts ...pulumi.ResourceOption) (*RocksetCollection, error) {
	var resource RocksetCollection
	err := ctx.ReadResource("rockset:index/rocksetCollection:RocksetCollection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RocksetCollection resources.
type rocksetCollectionState struct {
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
	// Wait until the collection is ready.
	WaitForCollection *bool `pulumi:"waitForCollection"`
	// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
	WaitForDocuments *int `pulumi:"waitForDocuments"`
	// The name of the workspace.
	Workspace *string `pulumi:"workspace"`
}

type RocksetCollectionState struct {
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
	// Wait until the collection is ready.
	WaitForCollection pulumi.BoolPtrInput
	// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
	WaitForDocuments pulumi.IntPtrInput
	// The name of the workspace.
	Workspace pulumi.StringPtrInput
}

func (RocksetCollectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*rocksetCollectionState)(nil)).Elem()
}

type rocksetCollectionArgs struct {
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
	// Wait until the collection is ready.
	WaitForCollection *bool `pulumi:"waitForCollection"`
	// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
	WaitForDocuments *int `pulumi:"waitForDocuments"`
	// The name of the workspace.
	Workspace string `pulumi:"workspace"`
}

// The set of arguments for constructing a RocksetCollection resource.
type RocksetCollectionArgs struct {
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
	// Wait until the collection is ready.
	WaitForCollection pulumi.BoolPtrInput
	// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
	WaitForDocuments pulumi.IntPtrInput
	// The name of the workspace.
	Workspace pulumi.StringInput
}

func (RocksetCollectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rocksetCollectionArgs)(nil)).Elem()
}

type RocksetCollectionInput interface {
	pulumi.Input

	ToRocksetCollectionOutput() RocksetCollectionOutput
	ToRocksetCollectionOutputWithContext(ctx context.Context) RocksetCollectionOutput
}

func (*RocksetCollection) ElementType() reflect.Type {
	return reflect.TypeOf((**RocksetCollection)(nil)).Elem()
}

func (i *RocksetCollection) ToRocksetCollectionOutput() RocksetCollectionOutput {
	return i.ToRocksetCollectionOutputWithContext(context.Background())
}

func (i *RocksetCollection) ToRocksetCollectionOutputWithContext(ctx context.Context) RocksetCollectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetCollectionOutput)
}

// RocksetCollectionArrayInput is an input type that accepts RocksetCollectionArray and RocksetCollectionArrayOutput values.
// You can construct a concrete instance of `RocksetCollectionArrayInput` via:
//
//	RocksetCollectionArray{ RocksetCollectionArgs{...} }
type RocksetCollectionArrayInput interface {
	pulumi.Input

	ToRocksetCollectionArrayOutput() RocksetCollectionArrayOutput
	ToRocksetCollectionArrayOutputWithContext(context.Context) RocksetCollectionArrayOutput
}

type RocksetCollectionArray []RocksetCollectionInput

func (RocksetCollectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RocksetCollection)(nil)).Elem()
}

func (i RocksetCollectionArray) ToRocksetCollectionArrayOutput() RocksetCollectionArrayOutput {
	return i.ToRocksetCollectionArrayOutputWithContext(context.Background())
}

func (i RocksetCollectionArray) ToRocksetCollectionArrayOutputWithContext(ctx context.Context) RocksetCollectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetCollectionArrayOutput)
}

// RocksetCollectionMapInput is an input type that accepts RocksetCollectionMap and RocksetCollectionMapOutput values.
// You can construct a concrete instance of `RocksetCollectionMapInput` via:
//
//	RocksetCollectionMap{ "key": RocksetCollectionArgs{...} }
type RocksetCollectionMapInput interface {
	pulumi.Input

	ToRocksetCollectionMapOutput() RocksetCollectionMapOutput
	ToRocksetCollectionMapOutputWithContext(context.Context) RocksetCollectionMapOutput
}

type RocksetCollectionMap map[string]RocksetCollectionInput

func (RocksetCollectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RocksetCollection)(nil)).Elem()
}

func (i RocksetCollectionMap) ToRocksetCollectionMapOutput() RocksetCollectionMapOutput {
	return i.ToRocksetCollectionMapOutputWithContext(context.Background())
}

func (i RocksetCollectionMap) ToRocksetCollectionMapOutputWithContext(ctx context.Context) RocksetCollectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetCollectionMapOutput)
}

type RocksetCollectionOutput struct{ *pulumi.OutputState }

func (RocksetCollectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RocksetCollection)(nil)).Elem()
}

func (o RocksetCollectionOutput) ToRocksetCollectionOutput() RocksetCollectionOutput {
	return o
}

func (o RocksetCollectionOutput) ToRocksetCollectionOutputWithContext(ctx context.Context) RocksetCollectionOutput {
	return o
}

// Text describing the collection.
func (o RocksetCollectionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RocksetCollection) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// **Deprecated** use ingestTransformation instead
//
// Deprecated: Use ingest_transformation instead
func (o RocksetCollectionOutput) FieldMappingQuery() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RocksetCollection) pulumi.StringPtrOutput { return v.FieldMappingQuery }).(pulumi.StringPtrOutput)
}

// Ingest transformation SQL query. Turns the collection into insertOnly mode.
func (o RocksetCollectionOutput) IngestTransformation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RocksetCollection) pulumi.StringPtrOutput { return v.IngestTransformation }).(pulumi.StringPtrOutput)
}

// Unique identifier for the collection. Can contain alphanumeric or dash characters.
func (o RocksetCollectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RocksetCollection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Number of seconds after which data is purged. Based on event time.
func (o RocksetCollectionOutput) RetentionSecs() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RocksetCollection) pulumi.IntPtrOutput { return v.RetentionSecs }).(pulumi.IntPtrOutput)
}

// Wait until the collection is ready.
func (o RocksetCollectionOutput) WaitForCollection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RocksetCollection) pulumi.BoolPtrOutput { return v.WaitForCollection }).(pulumi.BoolPtrOutput)
}

// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
func (o RocksetCollectionOutput) WaitForDocuments() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RocksetCollection) pulumi.IntPtrOutput { return v.WaitForDocuments }).(pulumi.IntPtrOutput)
}

// The name of the workspace.
func (o RocksetCollectionOutput) Workspace() pulumi.StringOutput {
	return o.ApplyT(func(v *RocksetCollection) pulumi.StringOutput { return v.Workspace }).(pulumi.StringOutput)
}

type RocksetCollectionArrayOutput struct{ *pulumi.OutputState }

func (RocksetCollectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RocksetCollection)(nil)).Elem()
}

func (o RocksetCollectionArrayOutput) ToRocksetCollectionArrayOutput() RocksetCollectionArrayOutput {
	return o
}

func (o RocksetCollectionArrayOutput) ToRocksetCollectionArrayOutputWithContext(ctx context.Context) RocksetCollectionArrayOutput {
	return o
}

func (o RocksetCollectionArrayOutput) Index(i pulumi.IntInput) RocksetCollectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RocksetCollection {
		return vs[0].([]*RocksetCollection)[vs[1].(int)]
	}).(RocksetCollectionOutput)
}

type RocksetCollectionMapOutput struct{ *pulumi.OutputState }

func (RocksetCollectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RocksetCollection)(nil)).Elem()
}

func (o RocksetCollectionMapOutput) ToRocksetCollectionMapOutput() RocksetCollectionMapOutput {
	return o
}

func (o RocksetCollectionMapOutput) ToRocksetCollectionMapOutputWithContext(ctx context.Context) RocksetCollectionMapOutput {
	return o
}

func (o RocksetCollectionMapOutput) MapIndex(k pulumi.StringInput) RocksetCollectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RocksetCollection {
		return vs[0].(map[string]*RocksetCollection)[vs[1].(string)]
	}).(RocksetCollectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetCollectionInput)(nil)).Elem(), &RocksetCollection{})
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetCollectionArrayInput)(nil)).Elem(), RocksetCollectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetCollectionMapInput)(nil)).Elem(), RocksetCollectionMap{})
	pulumi.RegisterOutputType(RocksetCollectionOutput{})
	pulumi.RegisterOutputType(RocksetCollectionArrayOutput{})
	pulumi.RegisterOutputType(RocksetCollectionMapOutput{})
}
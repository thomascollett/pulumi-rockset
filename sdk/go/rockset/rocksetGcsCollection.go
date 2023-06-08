// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rockset

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a collection with an GCS source attached.
type RocksetGcsCollection struct {
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
	Sources RocksetGcsCollectionSourceArrayOutput `pulumi:"sources"`
	// Wait until the collection is ready.
	WaitForCollection pulumi.BoolPtrOutput `pulumi:"waitForCollection"`
	// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
	WaitForDocuments pulumi.IntPtrOutput `pulumi:"waitForDocuments"`
	// The name of the workspace.
	Workspace pulumi.StringOutput `pulumi:"workspace"`
}

// NewRocksetGcsCollection registers a new resource with the given unique name, arguments, and options.
func NewRocksetGcsCollection(ctx *pulumi.Context,
	name string, args *RocksetGcsCollectionArgs, opts ...pulumi.ResourceOption) (*RocksetGcsCollection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Workspace == nil {
		return nil, errors.New("invalid value for required argument 'Workspace'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource RocksetGcsCollection
	err := ctx.RegisterResource("rockset:index/rocksetGcsCollection:RocksetGcsCollection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRocksetGcsCollection gets an existing RocksetGcsCollection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRocksetGcsCollection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RocksetGcsCollectionState, opts ...pulumi.ResourceOption) (*RocksetGcsCollection, error) {
	var resource RocksetGcsCollection
	err := ctx.ReadResource("rockset:index/rocksetGcsCollection:RocksetGcsCollection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RocksetGcsCollection resources.
type rocksetGcsCollectionState struct {
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
	Sources []RocksetGcsCollectionSource `pulumi:"sources"`
	// Wait until the collection is ready.
	WaitForCollection *bool `pulumi:"waitForCollection"`
	// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
	WaitForDocuments *int `pulumi:"waitForDocuments"`
	// The name of the workspace.
	Workspace *string `pulumi:"workspace"`
}

type RocksetGcsCollectionState struct {
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
	Sources RocksetGcsCollectionSourceArrayInput
	// Wait until the collection is ready.
	WaitForCollection pulumi.BoolPtrInput
	// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
	WaitForDocuments pulumi.IntPtrInput
	// The name of the workspace.
	Workspace pulumi.StringPtrInput
}

func (RocksetGcsCollectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*rocksetGcsCollectionState)(nil)).Elem()
}

type rocksetGcsCollectionArgs struct {
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
	Sources []RocksetGcsCollectionSource `pulumi:"sources"`
	// Wait until the collection is ready.
	WaitForCollection *bool `pulumi:"waitForCollection"`
	// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
	WaitForDocuments *int `pulumi:"waitForDocuments"`
	// The name of the workspace.
	Workspace string `pulumi:"workspace"`
}

// The set of arguments for constructing a RocksetGcsCollection resource.
type RocksetGcsCollectionArgs struct {
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
	Sources RocksetGcsCollectionSourceArrayInput
	// Wait until the collection is ready.
	WaitForCollection pulumi.BoolPtrInput
	// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
	WaitForDocuments pulumi.IntPtrInput
	// The name of the workspace.
	Workspace pulumi.StringInput
}

func (RocksetGcsCollectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rocksetGcsCollectionArgs)(nil)).Elem()
}

type RocksetGcsCollectionInput interface {
	pulumi.Input

	ToRocksetGcsCollectionOutput() RocksetGcsCollectionOutput
	ToRocksetGcsCollectionOutputWithContext(ctx context.Context) RocksetGcsCollectionOutput
}

func (*RocksetGcsCollection) ElementType() reflect.Type {
	return reflect.TypeOf((**RocksetGcsCollection)(nil)).Elem()
}

func (i *RocksetGcsCollection) ToRocksetGcsCollectionOutput() RocksetGcsCollectionOutput {
	return i.ToRocksetGcsCollectionOutputWithContext(context.Background())
}

func (i *RocksetGcsCollection) ToRocksetGcsCollectionOutputWithContext(ctx context.Context) RocksetGcsCollectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetGcsCollectionOutput)
}

// RocksetGcsCollectionArrayInput is an input type that accepts RocksetGcsCollectionArray and RocksetGcsCollectionArrayOutput values.
// You can construct a concrete instance of `RocksetGcsCollectionArrayInput` via:
//
//	RocksetGcsCollectionArray{ RocksetGcsCollectionArgs{...} }
type RocksetGcsCollectionArrayInput interface {
	pulumi.Input

	ToRocksetGcsCollectionArrayOutput() RocksetGcsCollectionArrayOutput
	ToRocksetGcsCollectionArrayOutputWithContext(context.Context) RocksetGcsCollectionArrayOutput
}

type RocksetGcsCollectionArray []RocksetGcsCollectionInput

func (RocksetGcsCollectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RocksetGcsCollection)(nil)).Elem()
}

func (i RocksetGcsCollectionArray) ToRocksetGcsCollectionArrayOutput() RocksetGcsCollectionArrayOutput {
	return i.ToRocksetGcsCollectionArrayOutputWithContext(context.Background())
}

func (i RocksetGcsCollectionArray) ToRocksetGcsCollectionArrayOutputWithContext(ctx context.Context) RocksetGcsCollectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetGcsCollectionArrayOutput)
}

// RocksetGcsCollectionMapInput is an input type that accepts RocksetGcsCollectionMap and RocksetGcsCollectionMapOutput values.
// You can construct a concrete instance of `RocksetGcsCollectionMapInput` via:
//
//	RocksetGcsCollectionMap{ "key": RocksetGcsCollectionArgs{...} }
type RocksetGcsCollectionMapInput interface {
	pulumi.Input

	ToRocksetGcsCollectionMapOutput() RocksetGcsCollectionMapOutput
	ToRocksetGcsCollectionMapOutputWithContext(context.Context) RocksetGcsCollectionMapOutput
}

type RocksetGcsCollectionMap map[string]RocksetGcsCollectionInput

func (RocksetGcsCollectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RocksetGcsCollection)(nil)).Elem()
}

func (i RocksetGcsCollectionMap) ToRocksetGcsCollectionMapOutput() RocksetGcsCollectionMapOutput {
	return i.ToRocksetGcsCollectionMapOutputWithContext(context.Background())
}

func (i RocksetGcsCollectionMap) ToRocksetGcsCollectionMapOutputWithContext(ctx context.Context) RocksetGcsCollectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetGcsCollectionMapOutput)
}

type RocksetGcsCollectionOutput struct{ *pulumi.OutputState }

func (RocksetGcsCollectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RocksetGcsCollection)(nil)).Elem()
}

func (o RocksetGcsCollectionOutput) ToRocksetGcsCollectionOutput() RocksetGcsCollectionOutput {
	return o
}

func (o RocksetGcsCollectionOutput) ToRocksetGcsCollectionOutputWithContext(ctx context.Context) RocksetGcsCollectionOutput {
	return o
}

// Text describing the collection.
func (o RocksetGcsCollectionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RocksetGcsCollection) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// **Deprecated** use ingestTransformation instead
//
// Deprecated: Use ingest_transformation instead
func (o RocksetGcsCollectionOutput) FieldMappingQuery() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RocksetGcsCollection) pulumi.StringPtrOutput { return v.FieldMappingQuery }).(pulumi.StringPtrOutput)
}

// Ingest transformation SQL query. Turns the collection into insertOnly mode.
func (o RocksetGcsCollectionOutput) IngestTransformation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RocksetGcsCollection) pulumi.StringPtrOutput { return v.IngestTransformation }).(pulumi.StringPtrOutput)
}

// Unique identifier for the collection. Can contain alphanumeric or dash characters.
func (o RocksetGcsCollectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RocksetGcsCollection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Number of seconds after which data is purged. Based on event time.
func (o RocksetGcsCollectionOutput) RetentionSecs() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RocksetGcsCollection) pulumi.IntPtrOutput { return v.RetentionSecs }).(pulumi.IntPtrOutput)
}

// Defines a source for this collection.
func (o RocksetGcsCollectionOutput) Sources() RocksetGcsCollectionSourceArrayOutput {
	return o.ApplyT(func(v *RocksetGcsCollection) RocksetGcsCollectionSourceArrayOutput { return v.Sources }).(RocksetGcsCollectionSourceArrayOutput)
}

// Wait until the collection is ready.
func (o RocksetGcsCollectionOutput) WaitForCollection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RocksetGcsCollection) pulumi.BoolPtrOutput { return v.WaitForCollection }).(pulumi.BoolPtrOutput)
}

// Wait until the collection has documents. The default is to wait for 0 documents, which means it doesn't wait.
func (o RocksetGcsCollectionOutput) WaitForDocuments() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RocksetGcsCollection) pulumi.IntPtrOutput { return v.WaitForDocuments }).(pulumi.IntPtrOutput)
}

// The name of the workspace.
func (o RocksetGcsCollectionOutput) Workspace() pulumi.StringOutput {
	return o.ApplyT(func(v *RocksetGcsCollection) pulumi.StringOutput { return v.Workspace }).(pulumi.StringOutput)
}

type RocksetGcsCollectionArrayOutput struct{ *pulumi.OutputState }

func (RocksetGcsCollectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RocksetGcsCollection)(nil)).Elem()
}

func (o RocksetGcsCollectionArrayOutput) ToRocksetGcsCollectionArrayOutput() RocksetGcsCollectionArrayOutput {
	return o
}

func (o RocksetGcsCollectionArrayOutput) ToRocksetGcsCollectionArrayOutputWithContext(ctx context.Context) RocksetGcsCollectionArrayOutput {
	return o
}

func (o RocksetGcsCollectionArrayOutput) Index(i pulumi.IntInput) RocksetGcsCollectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RocksetGcsCollection {
		return vs[0].([]*RocksetGcsCollection)[vs[1].(int)]
	}).(RocksetGcsCollectionOutput)
}

type RocksetGcsCollectionMapOutput struct{ *pulumi.OutputState }

func (RocksetGcsCollectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RocksetGcsCollection)(nil)).Elem()
}

func (o RocksetGcsCollectionMapOutput) ToRocksetGcsCollectionMapOutput() RocksetGcsCollectionMapOutput {
	return o
}

func (o RocksetGcsCollectionMapOutput) ToRocksetGcsCollectionMapOutputWithContext(ctx context.Context) RocksetGcsCollectionMapOutput {
	return o
}

func (o RocksetGcsCollectionMapOutput) MapIndex(k pulumi.StringInput) RocksetGcsCollectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RocksetGcsCollection {
		return vs[0].(map[string]*RocksetGcsCollection)[vs[1].(string)]
	}).(RocksetGcsCollectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetGcsCollectionInput)(nil)).Elem(), &RocksetGcsCollection{})
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetGcsCollectionArrayInput)(nil)).Elem(), RocksetGcsCollectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetGcsCollectionMapInput)(nil)).Elem(), RocksetGcsCollectionMap{})
	pulumi.RegisterOutputType(RocksetGcsCollectionOutput{})
	pulumi.RegisterOutputType(RocksetGcsCollectionArrayOutput{})
	pulumi.RegisterOutputType(RocksetGcsCollectionMapOutput{})
}

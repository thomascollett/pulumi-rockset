// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rockset

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Rockset workspace.
type RocksetWorkspace struct {
	pulumi.CustomResourceState

	// The user who created the workspace.
	CreatedBy pulumi.StringOutput `pulumi:"createdBy"`
	// Text describing the collection.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Unique identifier for workspace. Can contain alphanumeric or dash characters.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewRocksetWorkspace registers a new resource with the given unique name, arguments, and options.
func NewRocksetWorkspace(ctx *pulumi.Context,
	name string, args *RocksetWorkspaceArgs, opts ...pulumi.ResourceOption) (*RocksetWorkspace, error) {
	if args == nil {
		args = &RocksetWorkspaceArgs{}
	}

	opts = pkgResourceDefaultOpts(opts)
	var resource RocksetWorkspace
	err := ctx.RegisterResource("rockset:index/rocksetWorkspace:RocksetWorkspace", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRocksetWorkspace gets an existing RocksetWorkspace resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRocksetWorkspace(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RocksetWorkspaceState, opts ...pulumi.ResourceOption) (*RocksetWorkspace, error) {
	var resource RocksetWorkspace
	err := ctx.ReadResource("rockset:index/rocksetWorkspace:RocksetWorkspace", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RocksetWorkspace resources.
type rocksetWorkspaceState struct {
	// The user who created the workspace.
	CreatedBy *string `pulumi:"createdBy"`
	// Text describing the collection.
	Description *string `pulumi:"description"`
	// Unique identifier for workspace. Can contain alphanumeric or dash characters.
	Name *string `pulumi:"name"`
}

type RocksetWorkspaceState struct {
	// The user who created the workspace.
	CreatedBy pulumi.StringPtrInput
	// Text describing the collection.
	Description pulumi.StringPtrInput
	// Unique identifier for workspace. Can contain alphanumeric or dash characters.
	Name pulumi.StringPtrInput
}

func (RocksetWorkspaceState) ElementType() reflect.Type {
	return reflect.TypeOf((*rocksetWorkspaceState)(nil)).Elem()
}

type rocksetWorkspaceArgs struct {
	// Text describing the collection.
	Description *string `pulumi:"description"`
	// Unique identifier for workspace. Can contain alphanumeric or dash characters.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a RocksetWorkspace resource.
type RocksetWorkspaceArgs struct {
	// Text describing the collection.
	Description pulumi.StringPtrInput
	// Unique identifier for workspace. Can contain alphanumeric or dash characters.
	Name pulumi.StringPtrInput
}

func (RocksetWorkspaceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rocksetWorkspaceArgs)(nil)).Elem()
}

type RocksetWorkspaceInput interface {
	pulumi.Input

	ToRocksetWorkspaceOutput() RocksetWorkspaceOutput
	ToRocksetWorkspaceOutputWithContext(ctx context.Context) RocksetWorkspaceOutput
}

func (*RocksetWorkspace) ElementType() reflect.Type {
	return reflect.TypeOf((**RocksetWorkspace)(nil)).Elem()
}

func (i *RocksetWorkspace) ToRocksetWorkspaceOutput() RocksetWorkspaceOutput {
	return i.ToRocksetWorkspaceOutputWithContext(context.Background())
}

func (i *RocksetWorkspace) ToRocksetWorkspaceOutputWithContext(ctx context.Context) RocksetWorkspaceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetWorkspaceOutput)
}

// RocksetWorkspaceArrayInput is an input type that accepts RocksetWorkspaceArray and RocksetWorkspaceArrayOutput values.
// You can construct a concrete instance of `RocksetWorkspaceArrayInput` via:
//
//	RocksetWorkspaceArray{ RocksetWorkspaceArgs{...} }
type RocksetWorkspaceArrayInput interface {
	pulumi.Input

	ToRocksetWorkspaceArrayOutput() RocksetWorkspaceArrayOutput
	ToRocksetWorkspaceArrayOutputWithContext(context.Context) RocksetWorkspaceArrayOutput
}

type RocksetWorkspaceArray []RocksetWorkspaceInput

func (RocksetWorkspaceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RocksetWorkspace)(nil)).Elem()
}

func (i RocksetWorkspaceArray) ToRocksetWorkspaceArrayOutput() RocksetWorkspaceArrayOutput {
	return i.ToRocksetWorkspaceArrayOutputWithContext(context.Background())
}

func (i RocksetWorkspaceArray) ToRocksetWorkspaceArrayOutputWithContext(ctx context.Context) RocksetWorkspaceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetWorkspaceArrayOutput)
}

// RocksetWorkspaceMapInput is an input type that accepts RocksetWorkspaceMap and RocksetWorkspaceMapOutput values.
// You can construct a concrete instance of `RocksetWorkspaceMapInput` via:
//
//	RocksetWorkspaceMap{ "key": RocksetWorkspaceArgs{...} }
type RocksetWorkspaceMapInput interface {
	pulumi.Input

	ToRocksetWorkspaceMapOutput() RocksetWorkspaceMapOutput
	ToRocksetWorkspaceMapOutputWithContext(context.Context) RocksetWorkspaceMapOutput
}

type RocksetWorkspaceMap map[string]RocksetWorkspaceInput

func (RocksetWorkspaceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RocksetWorkspace)(nil)).Elem()
}

func (i RocksetWorkspaceMap) ToRocksetWorkspaceMapOutput() RocksetWorkspaceMapOutput {
	return i.ToRocksetWorkspaceMapOutputWithContext(context.Background())
}

func (i RocksetWorkspaceMap) ToRocksetWorkspaceMapOutputWithContext(ctx context.Context) RocksetWorkspaceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetWorkspaceMapOutput)
}

type RocksetWorkspaceOutput struct{ *pulumi.OutputState }

func (RocksetWorkspaceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RocksetWorkspace)(nil)).Elem()
}

func (o RocksetWorkspaceOutput) ToRocksetWorkspaceOutput() RocksetWorkspaceOutput {
	return o
}

func (o RocksetWorkspaceOutput) ToRocksetWorkspaceOutputWithContext(ctx context.Context) RocksetWorkspaceOutput {
	return o
}

// The user who created the workspace.
func (o RocksetWorkspaceOutput) CreatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v *RocksetWorkspace) pulumi.StringOutput { return v.CreatedBy }).(pulumi.StringOutput)
}

// Text describing the collection.
func (o RocksetWorkspaceOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RocksetWorkspace) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier for workspace. Can contain alphanumeric or dash characters.
func (o RocksetWorkspaceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RocksetWorkspace) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type RocksetWorkspaceArrayOutput struct{ *pulumi.OutputState }

func (RocksetWorkspaceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RocksetWorkspace)(nil)).Elem()
}

func (o RocksetWorkspaceArrayOutput) ToRocksetWorkspaceArrayOutput() RocksetWorkspaceArrayOutput {
	return o
}

func (o RocksetWorkspaceArrayOutput) ToRocksetWorkspaceArrayOutputWithContext(ctx context.Context) RocksetWorkspaceArrayOutput {
	return o
}

func (o RocksetWorkspaceArrayOutput) Index(i pulumi.IntInput) RocksetWorkspaceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RocksetWorkspace {
		return vs[0].([]*RocksetWorkspace)[vs[1].(int)]
	}).(RocksetWorkspaceOutput)
}

type RocksetWorkspaceMapOutput struct{ *pulumi.OutputState }

func (RocksetWorkspaceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RocksetWorkspace)(nil)).Elem()
}

func (o RocksetWorkspaceMapOutput) ToRocksetWorkspaceMapOutput() RocksetWorkspaceMapOutput {
	return o
}

func (o RocksetWorkspaceMapOutput) ToRocksetWorkspaceMapOutputWithContext(ctx context.Context) RocksetWorkspaceMapOutput {
	return o
}

func (o RocksetWorkspaceMapOutput) MapIndex(k pulumi.StringInput) RocksetWorkspaceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RocksetWorkspace {
		return vs[0].(map[string]*RocksetWorkspace)[vs[1].(string)]
	}).(RocksetWorkspaceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetWorkspaceInput)(nil)).Elem(), &RocksetWorkspace{})
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetWorkspaceArrayInput)(nil)).Elem(), RocksetWorkspaceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetWorkspaceMapInput)(nil)).Elem(), RocksetWorkspaceMap{})
	pulumi.RegisterOutputType(RocksetWorkspaceOutput{})
	pulumi.RegisterOutputType(RocksetWorkspaceArrayOutput{})
	pulumi.RegisterOutputType(RocksetWorkspaceMapOutput{})
}

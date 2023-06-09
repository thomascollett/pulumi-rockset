// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rockset

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Rockset GCS Integration.
type RocksetGcsIntegration struct {
	pulumi.CustomResourceState

	// Text describing the integration.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Unique identifier for the integration. Can contain alphanumeric or dash characters.
	Name pulumi.StringOutput `pulumi:"name"`
	// The GCP service account key JSON.
	ServiceAccountKey pulumi.StringOutput `pulumi:"serviceAccountKey"`
}

// NewRocksetGcsIntegration registers a new resource with the given unique name, arguments, and options.
func NewRocksetGcsIntegration(ctx *pulumi.Context,
	name string, args *RocksetGcsIntegrationArgs, opts ...pulumi.ResourceOption) (*RocksetGcsIntegration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ServiceAccountKey == nil {
		return nil, errors.New("invalid value for required argument 'ServiceAccountKey'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource RocksetGcsIntegration
	err := ctx.RegisterResource("rockset:index/rocksetGcsIntegration:RocksetGcsIntegration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRocksetGcsIntegration gets an existing RocksetGcsIntegration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRocksetGcsIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RocksetGcsIntegrationState, opts ...pulumi.ResourceOption) (*RocksetGcsIntegration, error) {
	var resource RocksetGcsIntegration
	err := ctx.ReadResource("rockset:index/rocksetGcsIntegration:RocksetGcsIntegration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RocksetGcsIntegration resources.
type rocksetGcsIntegrationState struct {
	// Text describing the integration.
	Description *string `pulumi:"description"`
	// Unique identifier for the integration. Can contain alphanumeric or dash characters.
	Name *string `pulumi:"name"`
	// The GCP service account key JSON.
	ServiceAccountKey *string `pulumi:"serviceAccountKey"`
}

type RocksetGcsIntegrationState struct {
	// Text describing the integration.
	Description pulumi.StringPtrInput
	// Unique identifier for the integration. Can contain alphanumeric or dash characters.
	Name pulumi.StringPtrInput
	// The GCP service account key JSON.
	ServiceAccountKey pulumi.StringPtrInput
}

func (RocksetGcsIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*rocksetGcsIntegrationState)(nil)).Elem()
}

type rocksetGcsIntegrationArgs struct {
	// Text describing the integration.
	Description *string `pulumi:"description"`
	// Unique identifier for the integration. Can contain alphanumeric or dash characters.
	Name *string `pulumi:"name"`
	// The GCP service account key JSON.
	ServiceAccountKey string `pulumi:"serviceAccountKey"`
}

// The set of arguments for constructing a RocksetGcsIntegration resource.
type RocksetGcsIntegrationArgs struct {
	// Text describing the integration.
	Description pulumi.StringPtrInput
	// Unique identifier for the integration. Can contain alphanumeric or dash characters.
	Name pulumi.StringPtrInput
	// The GCP service account key JSON.
	ServiceAccountKey pulumi.StringInput
}

func (RocksetGcsIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rocksetGcsIntegrationArgs)(nil)).Elem()
}

type RocksetGcsIntegrationInput interface {
	pulumi.Input

	ToRocksetGcsIntegrationOutput() RocksetGcsIntegrationOutput
	ToRocksetGcsIntegrationOutputWithContext(ctx context.Context) RocksetGcsIntegrationOutput
}

func (*RocksetGcsIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((**RocksetGcsIntegration)(nil)).Elem()
}

func (i *RocksetGcsIntegration) ToRocksetGcsIntegrationOutput() RocksetGcsIntegrationOutput {
	return i.ToRocksetGcsIntegrationOutputWithContext(context.Background())
}

func (i *RocksetGcsIntegration) ToRocksetGcsIntegrationOutputWithContext(ctx context.Context) RocksetGcsIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetGcsIntegrationOutput)
}

// RocksetGcsIntegrationArrayInput is an input type that accepts RocksetGcsIntegrationArray and RocksetGcsIntegrationArrayOutput values.
// You can construct a concrete instance of `RocksetGcsIntegrationArrayInput` via:
//
//	RocksetGcsIntegrationArray{ RocksetGcsIntegrationArgs{...} }
type RocksetGcsIntegrationArrayInput interface {
	pulumi.Input

	ToRocksetGcsIntegrationArrayOutput() RocksetGcsIntegrationArrayOutput
	ToRocksetGcsIntegrationArrayOutputWithContext(context.Context) RocksetGcsIntegrationArrayOutput
}

type RocksetGcsIntegrationArray []RocksetGcsIntegrationInput

func (RocksetGcsIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RocksetGcsIntegration)(nil)).Elem()
}

func (i RocksetGcsIntegrationArray) ToRocksetGcsIntegrationArrayOutput() RocksetGcsIntegrationArrayOutput {
	return i.ToRocksetGcsIntegrationArrayOutputWithContext(context.Background())
}

func (i RocksetGcsIntegrationArray) ToRocksetGcsIntegrationArrayOutputWithContext(ctx context.Context) RocksetGcsIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetGcsIntegrationArrayOutput)
}

// RocksetGcsIntegrationMapInput is an input type that accepts RocksetGcsIntegrationMap and RocksetGcsIntegrationMapOutput values.
// You can construct a concrete instance of `RocksetGcsIntegrationMapInput` via:
//
//	RocksetGcsIntegrationMap{ "key": RocksetGcsIntegrationArgs{...} }
type RocksetGcsIntegrationMapInput interface {
	pulumi.Input

	ToRocksetGcsIntegrationMapOutput() RocksetGcsIntegrationMapOutput
	ToRocksetGcsIntegrationMapOutputWithContext(context.Context) RocksetGcsIntegrationMapOutput
}

type RocksetGcsIntegrationMap map[string]RocksetGcsIntegrationInput

func (RocksetGcsIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RocksetGcsIntegration)(nil)).Elem()
}

func (i RocksetGcsIntegrationMap) ToRocksetGcsIntegrationMapOutput() RocksetGcsIntegrationMapOutput {
	return i.ToRocksetGcsIntegrationMapOutputWithContext(context.Background())
}

func (i RocksetGcsIntegrationMap) ToRocksetGcsIntegrationMapOutputWithContext(ctx context.Context) RocksetGcsIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetGcsIntegrationMapOutput)
}

type RocksetGcsIntegrationOutput struct{ *pulumi.OutputState }

func (RocksetGcsIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RocksetGcsIntegration)(nil)).Elem()
}

func (o RocksetGcsIntegrationOutput) ToRocksetGcsIntegrationOutput() RocksetGcsIntegrationOutput {
	return o
}

func (o RocksetGcsIntegrationOutput) ToRocksetGcsIntegrationOutputWithContext(ctx context.Context) RocksetGcsIntegrationOutput {
	return o
}

// Text describing the integration.
func (o RocksetGcsIntegrationOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RocksetGcsIntegration) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier for the integration. Can contain alphanumeric or dash characters.
func (o RocksetGcsIntegrationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RocksetGcsIntegration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The GCP service account key JSON.
func (o RocksetGcsIntegrationOutput) ServiceAccountKey() pulumi.StringOutput {
	return o.ApplyT(func(v *RocksetGcsIntegration) pulumi.StringOutput { return v.ServiceAccountKey }).(pulumi.StringOutput)
}

type RocksetGcsIntegrationArrayOutput struct{ *pulumi.OutputState }

func (RocksetGcsIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RocksetGcsIntegration)(nil)).Elem()
}

func (o RocksetGcsIntegrationArrayOutput) ToRocksetGcsIntegrationArrayOutput() RocksetGcsIntegrationArrayOutput {
	return o
}

func (o RocksetGcsIntegrationArrayOutput) ToRocksetGcsIntegrationArrayOutputWithContext(ctx context.Context) RocksetGcsIntegrationArrayOutput {
	return o
}

func (o RocksetGcsIntegrationArrayOutput) Index(i pulumi.IntInput) RocksetGcsIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RocksetGcsIntegration {
		return vs[0].([]*RocksetGcsIntegration)[vs[1].(int)]
	}).(RocksetGcsIntegrationOutput)
}

type RocksetGcsIntegrationMapOutput struct{ *pulumi.OutputState }

func (RocksetGcsIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RocksetGcsIntegration)(nil)).Elem()
}

func (o RocksetGcsIntegrationMapOutput) ToRocksetGcsIntegrationMapOutput() RocksetGcsIntegrationMapOutput {
	return o
}

func (o RocksetGcsIntegrationMapOutput) ToRocksetGcsIntegrationMapOutputWithContext(ctx context.Context) RocksetGcsIntegrationMapOutput {
	return o
}

func (o RocksetGcsIntegrationMapOutput) MapIndex(k pulumi.StringInput) RocksetGcsIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RocksetGcsIntegration {
		return vs[0].(map[string]*RocksetGcsIntegration)[vs[1].(string)]
	}).(RocksetGcsIntegrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetGcsIntegrationInput)(nil)).Elem(), &RocksetGcsIntegration{})
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetGcsIntegrationArrayInput)(nil)).Elem(), RocksetGcsIntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetGcsIntegrationMapInput)(nil)).Elem(), RocksetGcsIntegrationMap{})
	pulumi.RegisterOutputType(RocksetGcsIntegrationOutput{})
	pulumi.RegisterOutputType(RocksetGcsIntegrationArrayOutput{})
	pulumi.RegisterOutputType(RocksetGcsIntegrationMapOutput{})
}

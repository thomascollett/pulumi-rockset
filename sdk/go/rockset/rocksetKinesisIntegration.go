// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rockset

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Rockset Kinesis Integration.
type RocksetKinesisIntegration struct {
	pulumi.CustomResourceState

	// The AWS Role Arn to use for this integration.
	AwsRoleArn pulumi.StringOutput `pulumi:"awsRoleArn"`
	// Text describing the integration.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Unique identifier for the integration. Can contain alphanumeric or dash characters.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewRocksetKinesisIntegration registers a new resource with the given unique name, arguments, and options.
func NewRocksetKinesisIntegration(ctx *pulumi.Context,
	name string, args *RocksetKinesisIntegrationArgs, opts ...pulumi.ResourceOption) (*RocksetKinesisIntegration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AwsRoleArn == nil {
		return nil, errors.New("invalid value for required argument 'AwsRoleArn'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource RocksetKinesisIntegration
	err := ctx.RegisterResource("rockset:index/rocksetKinesisIntegration:RocksetKinesisIntegration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRocksetKinesisIntegration gets an existing RocksetKinesisIntegration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRocksetKinesisIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RocksetKinesisIntegrationState, opts ...pulumi.ResourceOption) (*RocksetKinesisIntegration, error) {
	var resource RocksetKinesisIntegration
	err := ctx.ReadResource("rockset:index/rocksetKinesisIntegration:RocksetKinesisIntegration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RocksetKinesisIntegration resources.
type rocksetKinesisIntegrationState struct {
	// The AWS Role Arn to use for this integration.
	AwsRoleArn *string `pulumi:"awsRoleArn"`
	// Text describing the integration.
	Description *string `pulumi:"description"`
	// Unique identifier for the integration. Can contain alphanumeric or dash characters.
	Name *string `pulumi:"name"`
}

type RocksetKinesisIntegrationState struct {
	// The AWS Role Arn to use for this integration.
	AwsRoleArn pulumi.StringPtrInput
	// Text describing the integration.
	Description pulumi.StringPtrInput
	// Unique identifier for the integration. Can contain alphanumeric or dash characters.
	Name pulumi.StringPtrInput
}

func (RocksetKinesisIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*rocksetKinesisIntegrationState)(nil)).Elem()
}

type rocksetKinesisIntegrationArgs struct {
	// The AWS Role Arn to use for this integration.
	AwsRoleArn string `pulumi:"awsRoleArn"`
	// Text describing the integration.
	Description *string `pulumi:"description"`
	// Unique identifier for the integration. Can contain alphanumeric or dash characters.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a RocksetKinesisIntegration resource.
type RocksetKinesisIntegrationArgs struct {
	// The AWS Role Arn to use for this integration.
	AwsRoleArn pulumi.StringInput
	// Text describing the integration.
	Description pulumi.StringPtrInput
	// Unique identifier for the integration. Can contain alphanumeric or dash characters.
	Name pulumi.StringPtrInput
}

func (RocksetKinesisIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rocksetKinesisIntegrationArgs)(nil)).Elem()
}

type RocksetKinesisIntegrationInput interface {
	pulumi.Input

	ToRocksetKinesisIntegrationOutput() RocksetKinesisIntegrationOutput
	ToRocksetKinesisIntegrationOutputWithContext(ctx context.Context) RocksetKinesisIntegrationOutput
}

func (*RocksetKinesisIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((**RocksetKinesisIntegration)(nil)).Elem()
}

func (i *RocksetKinesisIntegration) ToRocksetKinesisIntegrationOutput() RocksetKinesisIntegrationOutput {
	return i.ToRocksetKinesisIntegrationOutputWithContext(context.Background())
}

func (i *RocksetKinesisIntegration) ToRocksetKinesisIntegrationOutputWithContext(ctx context.Context) RocksetKinesisIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetKinesisIntegrationOutput)
}

// RocksetKinesisIntegrationArrayInput is an input type that accepts RocksetKinesisIntegrationArray and RocksetKinesisIntegrationArrayOutput values.
// You can construct a concrete instance of `RocksetKinesisIntegrationArrayInput` via:
//
//	RocksetKinesisIntegrationArray{ RocksetKinesisIntegrationArgs{...} }
type RocksetKinesisIntegrationArrayInput interface {
	pulumi.Input

	ToRocksetKinesisIntegrationArrayOutput() RocksetKinesisIntegrationArrayOutput
	ToRocksetKinesisIntegrationArrayOutputWithContext(context.Context) RocksetKinesisIntegrationArrayOutput
}

type RocksetKinesisIntegrationArray []RocksetKinesisIntegrationInput

func (RocksetKinesisIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RocksetKinesisIntegration)(nil)).Elem()
}

func (i RocksetKinesisIntegrationArray) ToRocksetKinesisIntegrationArrayOutput() RocksetKinesisIntegrationArrayOutput {
	return i.ToRocksetKinesisIntegrationArrayOutputWithContext(context.Background())
}

func (i RocksetKinesisIntegrationArray) ToRocksetKinesisIntegrationArrayOutputWithContext(ctx context.Context) RocksetKinesisIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetKinesisIntegrationArrayOutput)
}

// RocksetKinesisIntegrationMapInput is an input type that accepts RocksetKinesisIntegrationMap and RocksetKinesisIntegrationMapOutput values.
// You can construct a concrete instance of `RocksetKinesisIntegrationMapInput` via:
//
//	RocksetKinesisIntegrationMap{ "key": RocksetKinesisIntegrationArgs{...} }
type RocksetKinesisIntegrationMapInput interface {
	pulumi.Input

	ToRocksetKinesisIntegrationMapOutput() RocksetKinesisIntegrationMapOutput
	ToRocksetKinesisIntegrationMapOutputWithContext(context.Context) RocksetKinesisIntegrationMapOutput
}

type RocksetKinesisIntegrationMap map[string]RocksetKinesisIntegrationInput

func (RocksetKinesisIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RocksetKinesisIntegration)(nil)).Elem()
}

func (i RocksetKinesisIntegrationMap) ToRocksetKinesisIntegrationMapOutput() RocksetKinesisIntegrationMapOutput {
	return i.ToRocksetKinesisIntegrationMapOutputWithContext(context.Background())
}

func (i RocksetKinesisIntegrationMap) ToRocksetKinesisIntegrationMapOutputWithContext(ctx context.Context) RocksetKinesisIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetKinesisIntegrationMapOutput)
}

type RocksetKinesisIntegrationOutput struct{ *pulumi.OutputState }

func (RocksetKinesisIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RocksetKinesisIntegration)(nil)).Elem()
}

func (o RocksetKinesisIntegrationOutput) ToRocksetKinesisIntegrationOutput() RocksetKinesisIntegrationOutput {
	return o
}

func (o RocksetKinesisIntegrationOutput) ToRocksetKinesisIntegrationOutputWithContext(ctx context.Context) RocksetKinesisIntegrationOutput {
	return o
}

// The AWS Role Arn to use for this integration.
func (o RocksetKinesisIntegrationOutput) AwsRoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v *RocksetKinesisIntegration) pulumi.StringOutput { return v.AwsRoleArn }).(pulumi.StringOutput)
}

// Text describing the integration.
func (o RocksetKinesisIntegrationOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RocksetKinesisIntegration) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier for the integration. Can contain alphanumeric or dash characters.
func (o RocksetKinesisIntegrationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RocksetKinesisIntegration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type RocksetKinesisIntegrationArrayOutput struct{ *pulumi.OutputState }

func (RocksetKinesisIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RocksetKinesisIntegration)(nil)).Elem()
}

func (o RocksetKinesisIntegrationArrayOutput) ToRocksetKinesisIntegrationArrayOutput() RocksetKinesisIntegrationArrayOutput {
	return o
}

func (o RocksetKinesisIntegrationArrayOutput) ToRocksetKinesisIntegrationArrayOutputWithContext(ctx context.Context) RocksetKinesisIntegrationArrayOutput {
	return o
}

func (o RocksetKinesisIntegrationArrayOutput) Index(i pulumi.IntInput) RocksetKinesisIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RocksetKinesisIntegration {
		return vs[0].([]*RocksetKinesisIntegration)[vs[1].(int)]
	}).(RocksetKinesisIntegrationOutput)
}

type RocksetKinesisIntegrationMapOutput struct{ *pulumi.OutputState }

func (RocksetKinesisIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RocksetKinesisIntegration)(nil)).Elem()
}

func (o RocksetKinesisIntegrationMapOutput) ToRocksetKinesisIntegrationMapOutput() RocksetKinesisIntegrationMapOutput {
	return o
}

func (o RocksetKinesisIntegrationMapOutput) ToRocksetKinesisIntegrationMapOutputWithContext(ctx context.Context) RocksetKinesisIntegrationMapOutput {
	return o
}

func (o RocksetKinesisIntegrationMapOutput) MapIndex(k pulumi.StringInput) RocksetKinesisIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RocksetKinesisIntegration {
		return vs[0].(map[string]*RocksetKinesisIntegration)[vs[1].(string)]
	}).(RocksetKinesisIntegrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetKinesisIntegrationInput)(nil)).Elem(), &RocksetKinesisIntegration{})
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetKinesisIntegrationArrayInput)(nil)).Elem(), RocksetKinesisIntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetKinesisIntegrationMapInput)(nil)).Elem(), RocksetKinesisIntegrationMap{})
	pulumi.RegisterOutputType(RocksetKinesisIntegrationOutput{})
	pulumi.RegisterOutputType(RocksetKinesisIntegrationArrayOutput{})
	pulumi.RegisterOutputType(RocksetKinesisIntegrationMapOutput{})
}

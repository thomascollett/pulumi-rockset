// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rockset

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Rockset [Role](https://rockset.com/docs/iam/).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/thomascollett/pulumi-rockset/sdk/go/rockset"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rockset.NewRocksetRole(ctx, "query-onlyRocksetRole", &rockset.RocksetRoleArgs{
//				Description: pulumi.String("This role can only query collections in the prod workspace in the usw2a1 cluster"),
//				Privileges: rockset.RocksetRolePrivilegeArray{
//					&rockset.RocksetRolePrivilegeArgs{
//						Action:       pulumi.String("QUERY_DATA_WS"),
//						ResourceName: pulumi.String("prod"),
//						Cluster:      pulumi.String("usw2a1"),
//					},
//					&rockset.RocksetRolePrivilegeArgs{
//						Action:       pulumi.String("EXECUTE_QUERY_LAMBDA_WS"),
//						ResourceName: pulumi.String("prod"),
//						Cluster:      pulumi.String("usw2a1"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = rockset.NewRocksetApiKey(ctx, "query-onlyRocksetApiKey", &rockset.RocksetApiKeyArgs{
//				Role: query_onlyRocksetRole.Name,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type RocksetRole struct {
	pulumi.CustomResourceState

	// When the role was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Who created the role.
	CreatedBy pulumi.StringOutput `pulumi:"createdBy"`
	// Role description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Role name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The email of the user who currently owns the role.
	OwnerEmail pulumi.StringOutput `pulumi:"ownerEmail"`
	// Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
	Privileges RocksetRolePrivilegeArrayOutput `pulumi:"privileges"`
}

// NewRocksetRole registers a new resource with the given unique name, arguments, and options.
func NewRocksetRole(ctx *pulumi.Context,
	name string, args *RocksetRoleArgs, opts ...pulumi.ResourceOption) (*RocksetRole, error) {
	if args == nil {
		args = &RocksetRoleArgs{}
	}

	opts = pkgResourceDefaultOpts(opts)
	var resource RocksetRole
	err := ctx.RegisterResource("rockset:index/rocksetRole:RocksetRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRocksetRole gets an existing RocksetRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRocksetRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RocksetRoleState, opts ...pulumi.ResourceOption) (*RocksetRole, error) {
	var resource RocksetRole
	err := ctx.ReadResource("rockset:index/rocksetRole:RocksetRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RocksetRole resources.
type rocksetRoleState struct {
	// When the role was created.
	CreatedAt *string `pulumi:"createdAt"`
	// Who created the role.
	CreatedBy *string `pulumi:"createdBy"`
	// Role description.
	Description *string `pulumi:"description"`
	// Role name.
	Name *string `pulumi:"name"`
	// The email of the user who currently owns the role.
	OwnerEmail *string `pulumi:"ownerEmail"`
	// Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
	Privileges []RocksetRolePrivilege `pulumi:"privileges"`
}

type RocksetRoleState struct {
	// When the role was created.
	CreatedAt pulumi.StringPtrInput
	// Who created the role.
	CreatedBy pulumi.StringPtrInput
	// Role description.
	Description pulumi.StringPtrInput
	// Role name.
	Name pulumi.StringPtrInput
	// The email of the user who currently owns the role.
	OwnerEmail pulumi.StringPtrInput
	// Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
	Privileges RocksetRolePrivilegeArrayInput
}

func (RocksetRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*rocksetRoleState)(nil)).Elem()
}

type rocksetRoleArgs struct {
	// Role description.
	Description *string `pulumi:"description"`
	// Role name.
	Name *string `pulumi:"name"`
	// Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
	Privileges []RocksetRolePrivilege `pulumi:"privileges"`
}

// The set of arguments for constructing a RocksetRole resource.
type RocksetRoleArgs struct {
	// Role description.
	Description pulumi.StringPtrInput
	// Role name.
	Name pulumi.StringPtrInput
	// Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
	Privileges RocksetRolePrivilegeArrayInput
}

func (RocksetRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rocksetRoleArgs)(nil)).Elem()
}

type RocksetRoleInput interface {
	pulumi.Input

	ToRocksetRoleOutput() RocksetRoleOutput
	ToRocksetRoleOutputWithContext(ctx context.Context) RocksetRoleOutput
}

func (*RocksetRole) ElementType() reflect.Type {
	return reflect.TypeOf((**RocksetRole)(nil)).Elem()
}

func (i *RocksetRole) ToRocksetRoleOutput() RocksetRoleOutput {
	return i.ToRocksetRoleOutputWithContext(context.Background())
}

func (i *RocksetRole) ToRocksetRoleOutputWithContext(ctx context.Context) RocksetRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetRoleOutput)
}

// RocksetRoleArrayInput is an input type that accepts RocksetRoleArray and RocksetRoleArrayOutput values.
// You can construct a concrete instance of `RocksetRoleArrayInput` via:
//
//	RocksetRoleArray{ RocksetRoleArgs{...} }
type RocksetRoleArrayInput interface {
	pulumi.Input

	ToRocksetRoleArrayOutput() RocksetRoleArrayOutput
	ToRocksetRoleArrayOutputWithContext(context.Context) RocksetRoleArrayOutput
}

type RocksetRoleArray []RocksetRoleInput

func (RocksetRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RocksetRole)(nil)).Elem()
}

func (i RocksetRoleArray) ToRocksetRoleArrayOutput() RocksetRoleArrayOutput {
	return i.ToRocksetRoleArrayOutputWithContext(context.Background())
}

func (i RocksetRoleArray) ToRocksetRoleArrayOutputWithContext(ctx context.Context) RocksetRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetRoleArrayOutput)
}

// RocksetRoleMapInput is an input type that accepts RocksetRoleMap and RocksetRoleMapOutput values.
// You can construct a concrete instance of `RocksetRoleMapInput` via:
//
//	RocksetRoleMap{ "key": RocksetRoleArgs{...} }
type RocksetRoleMapInput interface {
	pulumi.Input

	ToRocksetRoleMapOutput() RocksetRoleMapOutput
	ToRocksetRoleMapOutputWithContext(context.Context) RocksetRoleMapOutput
}

type RocksetRoleMap map[string]RocksetRoleInput

func (RocksetRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RocksetRole)(nil)).Elem()
}

func (i RocksetRoleMap) ToRocksetRoleMapOutput() RocksetRoleMapOutput {
	return i.ToRocksetRoleMapOutputWithContext(context.Background())
}

func (i RocksetRoleMap) ToRocksetRoleMapOutputWithContext(ctx context.Context) RocksetRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RocksetRoleMapOutput)
}

type RocksetRoleOutput struct{ *pulumi.OutputState }

func (RocksetRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RocksetRole)(nil)).Elem()
}

func (o RocksetRoleOutput) ToRocksetRoleOutput() RocksetRoleOutput {
	return o
}

func (o RocksetRoleOutput) ToRocksetRoleOutputWithContext(ctx context.Context) RocksetRoleOutput {
	return o
}

// When the role was created.
func (o RocksetRoleOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *RocksetRole) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Who created the role.
func (o RocksetRoleOutput) CreatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v *RocksetRole) pulumi.StringOutput { return v.CreatedBy }).(pulumi.StringOutput)
}

// Role description.
func (o RocksetRoleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RocksetRole) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Role name.
func (o RocksetRoleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RocksetRole) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The email of the user who currently owns the role.
func (o RocksetRoleOutput) OwnerEmail() pulumi.StringOutput {
	return o.ApplyT(func(v *RocksetRole) pulumi.StringOutput { return v.OwnerEmail }).(pulumi.StringOutput)
}

// Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
func (o RocksetRoleOutput) Privileges() RocksetRolePrivilegeArrayOutput {
	return o.ApplyT(func(v *RocksetRole) RocksetRolePrivilegeArrayOutput { return v.Privileges }).(RocksetRolePrivilegeArrayOutput)
}

type RocksetRoleArrayOutput struct{ *pulumi.OutputState }

func (RocksetRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RocksetRole)(nil)).Elem()
}

func (o RocksetRoleArrayOutput) ToRocksetRoleArrayOutput() RocksetRoleArrayOutput {
	return o
}

func (o RocksetRoleArrayOutput) ToRocksetRoleArrayOutputWithContext(ctx context.Context) RocksetRoleArrayOutput {
	return o
}

func (o RocksetRoleArrayOutput) Index(i pulumi.IntInput) RocksetRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RocksetRole {
		return vs[0].([]*RocksetRole)[vs[1].(int)]
	}).(RocksetRoleOutput)
}

type RocksetRoleMapOutput struct{ *pulumi.OutputState }

func (RocksetRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RocksetRole)(nil)).Elem()
}

func (o RocksetRoleMapOutput) ToRocksetRoleMapOutput() RocksetRoleMapOutput {
	return o
}

func (o RocksetRoleMapOutput) ToRocksetRoleMapOutputWithContext(ctx context.Context) RocksetRoleMapOutput {
	return o
}

func (o RocksetRoleMapOutput) MapIndex(k pulumi.StringInput) RocksetRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RocksetRole {
		return vs[0].(map[string]*RocksetRole)[vs[1].(string)]
	}).(RocksetRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetRoleInput)(nil)).Elem(), &RocksetRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetRoleArrayInput)(nil)).Elem(), RocksetRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RocksetRoleMapInput)(nil)).Elem(), RocksetRoleMap{})
	pulumi.RegisterOutputType(RocksetRoleOutput{})
	pulumi.RegisterOutputType(RocksetRoleArrayOutput{})
	pulumi.RegisterOutputType(RocksetRoleMapOutput{})
}

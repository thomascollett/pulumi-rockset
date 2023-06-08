# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['RocksetRoleArgs', 'RocksetRole']

@pulumi.input_type
class RocksetRoleArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input['RocksetRolePrivilegeArgs']]]] = None):
        """
        The set of arguments for constructing a RocksetRole resource.
        :param pulumi.Input[str] description: Role description.
        :param pulumi.Input[str] name: Role name.
        :param pulumi.Input[Sequence[pulumi.Input['RocksetRolePrivilegeArgs']]] privileges: Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if privileges is not None:
            pulumi.set(__self__, "privileges", privileges)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Role description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Role name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def privileges(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RocksetRolePrivilegeArgs']]]]:
        """
        Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
        """
        return pulumi.get(self, "privileges")

    @privileges.setter
    def privileges(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RocksetRolePrivilegeArgs']]]]):
        pulumi.set(self, "privileges", value)


@pulumi.input_type
class _RocksetRoleState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[str]] = None,
                 created_by: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner_email: Optional[pulumi.Input[str]] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input['RocksetRolePrivilegeArgs']]]] = None):
        """
        Input properties used for looking up and filtering RocksetRole resources.
        :param pulumi.Input[str] created_at: When the role was created.
        :param pulumi.Input[str] created_by: Who created the role.
        :param pulumi.Input[str] description: Role description.
        :param pulumi.Input[str] name: Role name.
        :param pulumi.Input[str] owner_email: The email of the user who currently owns the role.
        :param pulumi.Input[Sequence[pulumi.Input['RocksetRolePrivilegeArgs']]] privileges: Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
        """
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if created_by is not None:
            pulumi.set(__self__, "created_by", created_by)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner_email is not None:
            pulumi.set(__self__, "owner_email", owner_email)
        if privileges is not None:
            pulumi.set(__self__, "privileges", privileges)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        When the role was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> Optional[pulumi.Input[str]]:
        """
        Who created the role.
        """
        return pulumi.get(self, "created_by")

    @created_by.setter
    def created_by(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_by", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Role description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Role name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ownerEmail")
    def owner_email(self) -> Optional[pulumi.Input[str]]:
        """
        The email of the user who currently owns the role.
        """
        return pulumi.get(self, "owner_email")

    @owner_email.setter
    def owner_email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_email", value)

    @property
    @pulumi.getter
    def privileges(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RocksetRolePrivilegeArgs']]]]:
        """
        Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
        """
        return pulumi.get(self, "privileges")

    @privileges.setter
    def privileges(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RocksetRolePrivilegeArgs']]]]):
        pulumi.set(self, "privileges", value)


class RocksetRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RocksetRolePrivilegeArgs']]]]] = None,
                 __props__=None):
        """
        Manages a Rockset [Role](https://rockset.com/docs/iam/).

        ## Example Usage

        ```python
        import pulumi
        import collett_pulumi_rockset as rockset

        query_only_rockset_role = rockset.RocksetRole("query-onlyRocksetRole",
            description="This role can only query collections in the prod workspace in the usw2a1 cluster",
            privileges=[
                rockset.RocksetRolePrivilegeArgs(
                    action="QUERY_DATA_WS",
                    resource_name="prod",
                    cluster="usw2a1",
                ),
                rockset.RocksetRolePrivilegeArgs(
                    action="EXECUTE_QUERY_LAMBDA_WS",
                    resource_name="prod",
                    cluster="usw2a1",
                ),
            ])
        query_only_rockset_api_key = rockset.RocksetApiKey("query-onlyRocksetApiKey", role=query_only_rockset_role.name)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Role description.
        :param pulumi.Input[str] name: Role name.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RocksetRolePrivilegeArgs']]]] privileges: Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[RocksetRoleArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Rockset [Role](https://rockset.com/docs/iam/).

        ## Example Usage

        ```python
        import pulumi
        import collett_pulumi_rockset as rockset

        query_only_rockset_role = rockset.RocksetRole("query-onlyRocksetRole",
            description="This role can only query collections in the prod workspace in the usw2a1 cluster",
            privileges=[
                rockset.RocksetRolePrivilegeArgs(
                    action="QUERY_DATA_WS",
                    resource_name="prod",
                    cluster="usw2a1",
                ),
                rockset.RocksetRolePrivilegeArgs(
                    action="EXECUTE_QUERY_LAMBDA_WS",
                    resource_name="prod",
                    cluster="usw2a1",
                ),
            ])
        query_only_rockset_api_key = rockset.RocksetApiKey("query-onlyRocksetApiKey", role=query_only_rockset_role.name)
        ```

        :param str resource_name: The name of the resource.
        :param RocksetRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RocksetRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RocksetRolePrivilegeArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RocksetRoleArgs.__new__(RocksetRoleArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["privileges"] = privileges
            __props__.__dict__["created_at"] = None
            __props__.__dict__["created_by"] = None
            __props__.__dict__["owner_email"] = None
        super(RocksetRole, __self__).__init__(
            'rockset:index/rocksetRole:RocksetRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            created_by: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            owner_email: Optional[pulumi.Input[str]] = None,
            privileges: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RocksetRolePrivilegeArgs']]]]] = None) -> 'RocksetRole':
        """
        Get an existing RocksetRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_at: When the role was created.
        :param pulumi.Input[str] created_by: Who created the role.
        :param pulumi.Input[str] description: Role description.
        :param pulumi.Input[str] name: Role name.
        :param pulumi.Input[str] owner_email: The email of the user who currently owns the role.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RocksetRolePrivilegeArgs']]]] privileges: Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RocksetRoleState.__new__(_RocksetRoleState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["created_by"] = created_by
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["owner_email"] = owner_email
        __props__.__dict__["privileges"] = privileges
        return RocksetRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        When the role was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> pulumi.Output[str]:
        """
        Who created the role.
        """
        return pulumi.get(self, "created_by")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Role description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Role name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ownerEmail")
    def owner_email(self) -> pulumi.Output[str]:
        """
        The email of the user who currently owns the role.
        """
        return pulumi.get(self, "owner_email")

    @property
    @pulumi.getter
    def privileges(self) -> pulumi.Output[Optional[Sequence['outputs.RocksetRolePrivilege']]]:
        """
        Privileges associated with the role. For a full list see [API documentation](https://rockset.com/docs/iam/#supported-privileges)
        """
        return pulumi.get(self, "privileges")


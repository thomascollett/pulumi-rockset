# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['RocksetQueryLambdaTagArgs', 'RocksetQueryLambdaTag']

@pulumi.input_type
class RocksetQueryLambdaTagArgs:
    def __init__(__self__, *,
                 query_lambda: pulumi.Input[str],
                 version: pulumi.Input[str],
                 workspace: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a RocksetQueryLambdaTag resource.
        :param pulumi.Input[str] query_lambda: Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
        :param pulumi.Input[str] version: Version of the query lambda this tag should point to.
        :param pulumi.Input[str] workspace: The name of the workspace the query lambda is in.
        :param pulumi.Input[str] name: Unique identifier for the tag. Can contain alphanumeric or dash characters.
        """
        pulumi.set(__self__, "query_lambda", query_lambda)
        pulumi.set(__self__, "version", version)
        pulumi.set(__self__, "workspace", workspace)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="queryLambda")
    def query_lambda(self) -> pulumi.Input[str]:
        """
        Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
        """
        return pulumi.get(self, "query_lambda")

    @query_lambda.setter
    def query_lambda(self, value: pulumi.Input[str]):
        pulumi.set(self, "query_lambda", value)

    @property
    @pulumi.getter
    def version(self) -> pulumi.Input[str]:
        """
        Version of the query lambda this tag should point to.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: pulumi.Input[str]):
        pulumi.set(self, "version", value)

    @property
    @pulumi.getter
    def workspace(self) -> pulumi.Input[str]:
        """
        The name of the workspace the query lambda is in.
        """
        return pulumi.get(self, "workspace")

    @workspace.setter
    def workspace(self, value: pulumi.Input[str]):
        pulumi.set(self, "workspace", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier for the tag. Can contain alphanumeric or dash characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _RocksetQueryLambdaTagState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 query_lambda: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 workspace: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RocksetQueryLambdaTag resources.
        :param pulumi.Input[str] name: Unique identifier for the tag. Can contain alphanumeric or dash characters.
        :param pulumi.Input[str] query_lambda: Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
        :param pulumi.Input[str] version: Version of the query lambda this tag should point to.
        :param pulumi.Input[str] workspace: The name of the workspace the query lambda is in.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if query_lambda is not None:
            pulumi.set(__self__, "query_lambda", query_lambda)
        if version is not None:
            pulumi.set(__self__, "version", version)
        if workspace is not None:
            pulumi.set(__self__, "workspace", workspace)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier for the tag. Can contain alphanumeric or dash characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="queryLambda")
    def query_lambda(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
        """
        return pulumi.get(self, "query_lambda")

    @query_lambda.setter
    def query_lambda(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "query_lambda", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[str]]:
        """
        Version of the query lambda this tag should point to.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version", value)

    @property
    @pulumi.getter
    def workspace(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the workspace the query lambda is in.
        """
        return pulumi.get(self, "workspace")

    @workspace.setter
    def workspace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "workspace", value)


class RocksetQueryLambdaTag(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 query_lambda: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 workspace: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Rockset Query Lambda Tag.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Unique identifier for the tag. Can contain alphanumeric or dash characters.
        :param pulumi.Input[str] query_lambda: Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
        :param pulumi.Input[str] version: Version of the query lambda this tag should point to.
        :param pulumi.Input[str] workspace: The name of the workspace the query lambda is in.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RocksetQueryLambdaTagArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Rockset Query Lambda Tag.

        :param str resource_name: The name of the resource.
        :param RocksetQueryLambdaTagArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RocksetQueryLambdaTagArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 query_lambda: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 workspace: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RocksetQueryLambdaTagArgs.__new__(RocksetQueryLambdaTagArgs)

            __props__.__dict__["name"] = name
            if query_lambda is None and not opts.urn:
                raise TypeError("Missing required property 'query_lambda'")
            __props__.__dict__["query_lambda"] = query_lambda
            if version is None and not opts.urn:
                raise TypeError("Missing required property 'version'")
            __props__.__dict__["version"] = version
            if workspace is None and not opts.urn:
                raise TypeError("Missing required property 'workspace'")
            __props__.__dict__["workspace"] = workspace
        super(RocksetQueryLambdaTag, __self__).__init__(
            'rockset:index/rocksetQueryLambdaTag:RocksetQueryLambdaTag',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            query_lambda: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[str]] = None,
            workspace: Optional[pulumi.Input[str]] = None) -> 'RocksetQueryLambdaTag':
        """
        Get an existing RocksetQueryLambdaTag resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Unique identifier for the tag. Can contain alphanumeric or dash characters.
        :param pulumi.Input[str] query_lambda: Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
        :param pulumi.Input[str] version: Version of the query lambda this tag should point to.
        :param pulumi.Input[str] workspace: The name of the workspace the query lambda is in.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RocksetQueryLambdaTagState.__new__(_RocksetQueryLambdaTagState)

        __props__.__dict__["name"] = name
        __props__.__dict__["query_lambda"] = query_lambda
        __props__.__dict__["version"] = version
        __props__.__dict__["workspace"] = workspace
        return RocksetQueryLambdaTag(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Unique identifier for the tag. Can contain alphanumeric or dash characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="queryLambda")
    def query_lambda(self) -> pulumi.Output[str]:
        """
        Unique identifier for the query lambda. Can contain alphanumeric or dash characters.
        """
        return pulumi.get(self, "query_lambda")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[str]:
        """
        Version of the query lambda this tag should point to.
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter
    def workspace(self) -> pulumi.Output[str]:
        """
        The name of the workspace the query lambda is in.
        """
        return pulumi.get(self, "workspace")


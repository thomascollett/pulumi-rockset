// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package rockset

import (
	"fmt"
	"path/filepath"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/rockset/terraform-provider-rockset/rockset"
	"github.com/thomascollett/pulumi-rockset/provider/pkg/version"
)

// all of the token components used below.
const (
	// This variable controls the default name of the package in the package
	// registries for nodejs and python:
	mainPkg = "rockset"
	// modules:
	mainMod = "index" // the rockset module
)

var namespaceMap = map[string]string{
	mainPkg: "Rockset",
}

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(rockset.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:    p,
		Name: "rockset",
		// DisplayName is a way to be able to change the casing of the provider
		// name when being displayed on the Pulumi registry
		DisplayName: "Rockset",
		// The default publisher for all packages is Pulumi.
		// Change this to your personal name (or a company name) that you
		// would like to be shown in the Pulumi Registry if this package is published
		// there.
		Publisher: "Thomas Collett",
		// LogoURL is optional but useful to help identify your package in the Pulumi Registry
		// if this package is published there.
		//
		// You may host a logo on a domain you control or add an SVG logo for your package
		// in your repository and use the raw content URL for that file as your logo URL.
		LogoURL: "https://www.datocms-assets.com/2885/1646941580-rslogo-rockset-light_bg.svg",
		// PluginDownloadURL is an optional URL used to download the Provider
		// for use in Pulumi programs
		// e.g https://github.com/org/pulumi-provider-name/releases/
		PluginDownloadURL: "github://api.github.com/thomascollett",
		Description:       "A Pulumi package for creating and managing Rockset resources.",
		// category/cloud tag helps with categorizing the package in the Pulumi Registry.
		// For all available categories, see `Keywords` in
		// https://www.pulumi.com/docs/guides/pulumi-packages/schema/#package.
		Keywords:   []string{"pulumi", "rockset", "category/database"},
		License:    "Apache-2.0",
		Homepage:   "https://www.pulumi.com",
		Repository: "https://github.com/thomascollett/pulumi-rockset",
		// The GitHub Org for the provider - defaults to `terraform-providers`. Note that this
		// should match the TF provider module's require directive, not any replace directives.
		GitHubOrg: "rockset",
		Version:   version.Version,
		Config:    map[string]*tfbridge.SchemaInfo{
			// Add any required configuration here, or remove the example below if
			// no additional points are required.
			// "region": {
			// 	Type: tfbridge.MakeType("region", "Region"),
			// 	Default: &tfbridge.DefaultInfo{
			// 		EnvVars: []string{"AWS_REGION", "AWS_DEFAULT_REGION"},
			// 	},
			// },
		},
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			// Map each resource in the Terraform provider to a Pulumi type. Two examples
			// are below - the single line form is the common case. The multi-line form is
			// needed only if you wish to override types or other default options.
			//
			// "aws_iam_role": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "IamRole")}
			//
			// "aws_acm_certificate": {
			// 	Tok: tfbridge.MakeResource(mainPkg, mainMod, "Certificate"),
			// 	Fields: map[string]*tfbridge.SchemaInfo{
			// 		"tags": {Type: tfbridge.MakeType(mainPkg, "Tags")},
			// 	},
			// },
			"rockset_alias":                {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetAlias")},
			"rockset_api_key":              {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetApiKey")},
			"rockset_collection":           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetCollection")},
			"rockset_dynamodb_collection":  {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetDynamodbCollection")},
			"rockset_dynamodb_integration": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetDynamodbIntegration")},
			"rockset_gcs_collection":       {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetGcsCollection")},
			"rockset_gcs_integration":      {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetGcsIntegration")},
			"rockset_kafka_collection":     {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetKafkaCollection")},
			"rockset_kafka_integration":    {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetKafkaIntegration")},
			"rockset_kinesis_collection":   {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetKinesisCollection")},
			"rockset_kinesis_integration":  {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetKinesisIntegration")},
			"rockset_mongodb_collection":   {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetMongodbCollection")},
			"rockset_mongodb_integration":  {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetMongodbIntegration")},
			"rockset_query_lambda":         {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetQueryLambda")},
			"rockset_query_lambda_tag":     {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetQueryLambdaTag")},
			"rockset_role":                 {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetRole")},
			"rockset_s3_collection":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetS3Collection")},
			"rockset_s3_integration":       {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetS3Integration")},
			"rockset_user":                 {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetUser")},
			"rockset_view":                 {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetView")},
			"rockset_workspace":            {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RocksetWorkspace")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			// Map each resource in the Terraform provider to a Pulumi function. An example
			// is below.
			// "aws_ami": {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getAmi")},
			"rockset_account": {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getAccount")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			PackageName: "@collett/pulumi-rockset",
			// See the documentation for tfbridge.OverlayInfo for how to lay out this
			// section, or refer to the AWS provider. Delete this section if there are
			// no overlay files.
			//Overlay: &tfbridge.OverlayInfo{},
		},
		Python: &tfbridge.PythonInfo{
			PackageName: "collett_pulumi_rockset",
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/thomascollett/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RootNamespace: "Collett",
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
		Java: &tfbridge.JavaInfo{
			BasePackage: "io.collett",
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}

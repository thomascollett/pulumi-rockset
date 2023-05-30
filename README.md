# Rockset Resource Provider

The Rockset Resource Provider lets you manage [Rockset](https://rockset.com) resources.

This provider is being maintained as a third-party contribution with a plan to eventually migrate this provider to Pulumiverse and hand over ownership to Rockset.

## Installing

This package is available for several languages/platforms:

### Node.js (JavaScript/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

```bash
npm install @collett/pulumi-rockset
```

or `yarn`:

```bash
yarn add @collett/pulumi-rockset
```

### Python

To use from Python, install using `pip`:

```bash
pip install collett_pulumi_rockset
```

### Go

To use from Go, use `go get` to grab the latest version of the library:

```bash
go get github.com/thomascollett/pulumi-rockset/sdk/go/...
```

### .NET

To use from .NET, install using `dotnet add package`:

```bash
dotnet add package Collett.PulumiRockset
```

## Configuration

The following configuration points are available for the `Rockset` provider:

- `rockset:api_key` (environment: `ROCKSET_APIKEY`) - the API key for `Rockset`
- `rockset:api_server` (environment: `ROCKSET_APISERVER`) - the API endpoint for the region in which to deploy resources
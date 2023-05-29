# Rockset Resource Provider

The Rockset Resource Provider lets you manage [Rockset](https://rockset.com) resources.

## Installing

This package is available for several languages/platforms:

### Node.js (JavaScript/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

```bash
npm install @thomascollett/pulumi-rockset
```

or `yarn`:

```bash
yarn add @thomascollett/pulumi-rockset
```

### Python

To use from Python, install using `pip`:

```bash
pip install pulumi_rockset
```

### Go

To use from Go, use `go get` to grab the latest version of the library:

```bash
go get github.com/thomascollett/pulumi-rockset/sdk/go/...
```

### .NET

To use from .NET, install using `dotnet add package`:

```bash
dotnet add package ThomasCollett.PulumiRockset
```

## Configuration

The following configuration points are available for the `Rockset` provider:

- `rockset:apiKey` (environment: `ROCKSET_API_KEY`) - the API key for `Rockset`
- `rockset:endpoint` (environment: `ROCKSET_ENDPOINT`) - the API endpoint for the region in which to deploy resources
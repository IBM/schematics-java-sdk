[![Build Status](https://travis-ci.com/IBM/schematics-java-sdk.svg?branch=main)](https://travis-ci.com/IBM/schematics-java-sdk)
[![semantic-release](https://img.shields.io/badge/%20%20%F0%9F%93%A6%F0%9F%9A%80-semantic--release-e10079.svg)](https://github.com/semantic-release/semantic-release)

# IBM Cloud Schematics Java SDK Version 1.1.0
Java client library to interact with various [IBM Cloud Schematics](https://cloud.ibm.com/apidocs?category=schematics).

Disclaimer: this SDK is being released initially as a **pre-release** version.
Changes might occur which impact applications that use this SDK.

## Table of Contents

<!--
  The TOC below is generated using the `markdown-toc` node package.

      https://github.com/jonschlinkert/markdown-toc

  You should regenerate the TOC after making changes to this file.

      npx markdown-toc --maxdepth 4 -i README.md
  -->

<!-- toc -->

- [IBM Cloud Schematics Java SDK Version 1.1.0](#ibm-cloud-schematics-java-sdk-version-110)
  - [Table of Contents](#table-of-contents)
  - [Overview](#overview)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
        - [Maven](#maven)
        - [Gradle](#gradle)
  - [Authentication](#authentication)
    - [Authenticate with environment variables](#authenticate-with-environment-variables)
    - [Authenticate with external configuration](#authenticate-with-external-configuration)
    - [Authenticate programmatically](#authenticate-programmatically)
  - [Getting Started](#getting-started)
  - [Error handling](#error-handling)
  - [Using the SDK](#using-the-sdk)
  - [Questions](#questions)
  - [Issues](#issues)
  - [Open source @ IBM](#open-source--ibm)
  - [Contributing](#contributing)
  - [License](#license)

<!-- tocstop -->

## Overview

The IBM Cloud Schematics Java SDK allows developers to programmatically interact with the following IBM Cloud services:

Service Name | Artifact Coordinates
--- | ---
[Schematics](https://cloud.ibm.com/apidocs/schematics) | com.ibm.cloud:schematics:1.1.0 -->

## Prerequisites

[ibm-cloud-onboarding]: https://cloud.ibm.com/registration

* An [IBM Cloud][ibm-cloud-onboarding] account.
* An IAM API key to allow the SDK to access your account. Create one [here](https://cloud.ibm.com/iam/apikeys).
* Java 8 or above.

## Installation
The current version of this SDK is: 1.1.0

Each service's artifact coordinates are listed in the table above.

The project artifacts are published on the public [Maven Central](https://repo1.maven.org/maven2/) artifact repository. 
This is the default public repository used by maven when searching for dependencies. 
To use this repository within a gradle build, 
please see [this link](https://docs.gradle.org/current/userguide/declaring_repositories.html).

To use a particular service, define a dependency that contains the
artifact coordinates (group id, artifact id and version) for the service, like this:

##### Maven

```xml
<dependency>
    <groupId>com.ibm.cloud</groupId>
    <artifactId>schematics-service</artifactId>
    <version>1.1.0</version>
</dependency>
```

##### Gradle
```gradle
'com.ibm.cloud:schematics-service:1.1.0'
```

## Authentication

The library requires Identity and Access Management (IAM) to authenticate requests. There are several ways to set the properties for authentication

1. [As environment variables](#authenticate-with-environment-variables)
2. [The programmatic approach](#authenticate-programmatically)
3. [With an external credentials file](#authenticate-with-external-configuration)

### Authenticate with environment variables

For Schematics IAM authentication set the following environmental variables by replacing <apikey> with your proper service credentials. 

```
SCHEMATICS_URL = https://schematics.cloud.ibm.com
SCHEMATICS_APIKEY = <apikey>
```

### Authenticate with external configuration

To use an external configuration file, see the related documentation in the [Java SDK Core document about authentication](https://github.com/IBM/ibm-cloud-sdk-common/blob/master/README.md).

### Authenticate programmatically

To learn more about how to use programmatic authentication, see the related documentation in the [Java SDK Core document about authentication](https://github.com/IBM/ibm-cloud-sdk-common/blob/master/README.md).

## Getting Started

A quick example to get you up and running with Schematics Java SDK service

```

import com.ibm.cloud.schematics.v1.Schematics;
import com.ibm.cloud.schematics.v1.model.GetSchematicsVersionOptions;
import com.ibm.cloud.schematics.v1.model.VersionResponse;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;

Schematics service = null;
IamAuthenticator authenticator = new IamAuthenticator("<apiKey>");


service = new Schematics(Schematics.DEFAULT_SERVICE_NAME, authenticator);
service.setServiceUrl("https://schematics.cloud.ibm.com");

GetSchematicsVersionOptions getSchematicsVersionOptions = new GetSchematicsVersionOptions();

// Invoke operation
Response<VersionResponse> response = service.getSchematicsVersion(getSchematicsVersionOptions).execute();

VersionResponse versionResponseResult = response.getResult();

System.out.println(versionResponseResult);


```

## Error handling

For sample code on handling errors, please see [Schematics API docs](https://cloud.ibm.com/apidocs/schematics#error-handling).

## Using the SDK
For general SDK usage information, please see [this link](https://github.com/IBM/ibm-cloud-sdk-common/blob/master/README.md)

## Questions

If you are having difficulties using this SDK or have a question about the IBM Cloud services,
please ask a question at
[Stack Overflow](http://stackoverflow.com/questions/ask?tags=ibm-cloud).

## Issues
If you encounter an issue with the project, you are welcome to submit a
[bug report](https://github.com/IBM/schematics-java-sdk/issues).
Before that, please search for similar issues. It's possible that someone has already reported the problem.

## Open source @ IBM
Find more open source projects on the [IBM Github Page](http://ibm.github.io/)

## Contributing
See [CONTRIBUTING](CONTRIBUTING.md).

## License

The IBM Cloud Schematics Java SDK is released under the Apache 2.0 license.
The license's full text can be found in [LICENSE](LICENSE).

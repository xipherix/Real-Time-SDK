# Enterprise Transport API (ETA) CSharp over .NET Core Edition

This is the **Enterprise Transport API (ETA)**, the high performance, low latency, foundation of the Refinitiv Real-Time SDK. This product allows applications to achieve the highest throughput, lowest latency, low memory utilization, and low CPU utilization when publishing or consuming content. All OMM content and domain models are available in Enterprise Transport API.  

ETA CSharp contains open source components. The transport, decoder, encoder and value add Reactor layer are open source. 

ETA provides the necessary libraries and information to allow for OMM/RWF encoding and decoding along with all of the necessary Refinitiv transport implementations to connect to Refinitiv Real-Time Distribution System, Refinitiv Real-Time, and Refinitiv Data Feed Direct products.

Copyright (C) 2022 Refinitiv. All rights reserved.

# ETA CSharp Documentation

Documentation is forthcoming

# ETA Features and Functionality

- 64-bit, CSharp 10 over .NET Core 6.0 based API

- Thread safe and thread aware

- Can consume and provide:

   - Any and all OMM primitives supported on Refinitiv Real-Time Distribution System, Refinitiv Real-Time, and Refinitiv Data Feed Direct 

   - All Domain Models, including those defined by Refinitiv as well as other user-defined models.

- Consists of:

   - A transport-level API allowing for connectivity using TCP: socket, encrypted socket

   - OMM Encoder and Decoders, allowing full use of all OMM constructs and messages.

- RMTES Support: Several classes and methods can be used to process RMTES content and convert to several Unicode formats for interpretation.

- Open Source performance tools: Allow users to measure the performance through their system. Customers can modify the tools to suit their specific needs. These are found in the Applications portion of this package.

- Open Source value added helpers:

   - Reactor is a connection management and event processing component that can significantly reduce the amount of code an application must write to leverage OMM in their own applications and to connect to other OMM based devices. The Reactor can be used to create or enhance Consumer, Interactive Provider, and Non-Interactive Provider start-up processing, including user log in, source directory establishment, and dictionary download. The Reactor also allows for dispatching of events to user implemented callback functions. In addition, it handles flushing of user written content and manages network pings on the user's behalf. Value Added domain representations are coupled with the Reactor, allowing domain specific callbacks to be presented with their respective domain representation for easier, more logical access to content. Reactor also provides opportunity in-box support of RTT monitoring for consumer applications.

   - The Administration Domain Model Representations are RDM specific amount of code an application needs to interact with OMM devices (i.e., Refinitiv Real-Time Distribution System), but also ensures that encoding/decoding for these domain models follow OMM specified formatting rules. Applications can use this Value Added Component directly to help with encoding, decoding and representation of these domain models. When using the ETA Reactor, this component is embedded to manage and present callbacks with a domain specific representation of content.

#### General Capabilities

Transport API provides the following general capabilities independent of the type of application:

- ETA can internally fragment and reassemble large messages.
- ETA applications can pack multiple, small messages into the same network buffer.
- ETA can internally perform data compression and decompression.
- ETA applications can choose their locking model based on need. Locking can be enabled globally, within a connection, or disabled entirely, allowing clients to develop single-threaded, multi-threaded thread safe, or thread-aware solutions.
- ETA applications have full control over the number of message buffers and can dynamically increase or decrease this quantity during runtime.
- ETA does not have configuration file, log file, or message file dependencies: everything is programmatic.
- ETA allows users to write messages at different priority levels, allowing higher priority messages to be sent before lower priority messages.
- ETA applications can create and manage both standard and private data streams.
- ETA Reactor applications can create and manage standard and private data streams.

# OMM Application Type Abilities

#### Consumer Applications

Users can use Transport API to write consumer-based applications capable of the following:

- Make Streaming and Snapshot based subscription requests.
- Perform Batch, Views, and Symbol List requests to capable provider applications, including ADS.
- Pause and Resume active data streams open to the ADS.
- Send Post Messages to capable provider applications, including ADS (used for making Consumer-based Publishing and Contributions).
- Send and receive Generic Messages.

#### Provider Applications: Interactive

Users can use Transport API to write interactive providers capable of the following:

- Receive requests and respond to Streaming and Snapshot based Requests.
- Receive and respond to requests for Batch, Views, and Symbol Lists.
- Receive requests for Pause and Resume on active Data Streams.
- Receive and acknowledge Post Messages (used when receiving Consumer-based Publishing and Contributions).
- Send and receive Generic Messages.
- Accept multiple connections, or allow multiple consumers to connect to a provider.

#### Provider Applications: Non-Interactive
Users can use Transport API to write non-interactive applications that start up and begin publishing data to ADH.

- Applications connect to one or many ADH devices using TCP sockets with some configuration changes.

#### Reactor Based Consumer and Provider Applications

- Reactor applications can take advantage of an event-driven distribution model
- Reactor will manage ping heartbeats and ensure that user written content is flushed out as effectively as possible.
- Reactor allows for consumer based applications to measure and monitor Round Trip Latency during message exchanging.

# Notes:
- This package contains APIs that are subject to proprietary and open source licenses. Please make sure to read the README.md files within each package for clarification.
/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.logs;

import java.net.*;
import java.util.*;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.regions.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.json.*;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.services.logs.model.transform.*;

/**
 * Client for accessing AWSLogs.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * Amazon CloudWatch Logs API Reference <p>
 * This is the <i>Amazon CloudWatch Logs API Reference</i> . Amazon
 * CloudWatch Logs enables you to monitor, store, and access your system,
 * application, and custom log files. This guide provides detailed
 * information about Amazon CloudWatch Logs actions, data types,
 * parameters, and errors. For detailed information about Amazon
 * CloudWatch Logs features and their associated API calls, go to the
 * <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide"> Amazon CloudWatch Developer Guide </a>
 * .
 * </p>
 * <p>
 * Use the following links to get started using the <i>Amazon CloudWatch
 * Logs API Reference</i> :
 * </p>
 * 
 * <ul>
 * <li>
 * <a href="http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_Operations.html"> Actions </a>
 * : An alphabetical list of all Amazon CloudWatch Logs actions.</li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_Types.html"> Data Types </a>
 * : An alphabetical list of all Amazon CloudWatch Logs data types.</li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/CommonParameters.html"> Common Parameters </a>
 * : Parameters that all Query actions can use.</li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/CommonErrors.html"> Common Errors </a>
 * : Client and server errors that all actions can return.</li>
 * <li>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/index.html?rande.html"> Regions and Endpoints </a>
 * : Itemized regions and endpoints for all AWS products.</li>
 * 
 * </ul>
 * <p>
 * In addition to using the Amazon CloudWatch Logs API, you can also use
 * the following SDKs and third-party libraries to access Amazon
 * CloudWatch Logs programmatically.
 * </p>
 * 
 * <ul>
 * <li>
 * <a href="http://aws.amazon.com/documentation/sdkforjava/"> AWS SDK for Java Documentation </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/documentation/sdkfornet/"> AWS SDK for .NET Documentation </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/documentation/sdkforphp/"> AWS SDK for PHP Documentation </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/documentation/sdkforruby/"> AWS SDK for Ruby Documentation </a>
 * </li>
 * 
 * </ul>
 * <p>
 * Developers in the AWS developer community also provide their own
 * libraries, which you can find at the following AWS developer centers:
 * </p>
 * 
 * <ul>
 * <li>
 * <a href="http://aws.amazon.com/java/"> AWS Java Developer Center </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/php/"> AWS PHP Developer Center </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/python/"> AWS Python Developer Center </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/ruby/"> AWS Ruby Developer Center </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/net/"> AWS Windows and .NET Developer Center </a>
 * </li>
 * 
 * </ul>
 */
public class AWSLogsClient extends AmazonWebServiceClient implements AWSLogs {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSLogs.class);

    /**
     * List of exception unmarshallers for all AWSLogs exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSLogs.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSLogsClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSLogs.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSLogs
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSLogsClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSLogs using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSLogsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSLogs using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSLogs
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSLogsClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(adjustClientConfiguration(clientConfiguration));
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSLogs using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSLogsClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSLogs using the specified AWS account credentials
     * provider and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSLogs
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSLogsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSLogs using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSLogs
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AWSLogsClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OperationAbortedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSequenceTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DataAlreadyAcceptedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("logs.us-east-1.amazonaws.com");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/logs/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/logs/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;
        
        return config;
    }

    /**
     * <p>
     * Sets the retention of the specified log group. A retention policy
     * allows you to configure the number of days you want to retain log
     * events in the specified log group.
     * </p>
     *
     * @param putRetentionPolicyRequest Container for the necessary
     *           parameters to execute the PutRetentionPolicy service method on
     *           AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putRetentionPolicy(PutRetentionPolicyRequest putRetentionPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(putRetentionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRetentionPolicyRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRetentionPolicyRequestMarshaller().marshall(super.beforeMarshalling(putRetentionPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Deletes the destination with the specified name and eventually
     * disables all the subscription filters that publish to it. This will
     * not delete the physical resource encapsulated by the destination.
     * </p>
     *
     * @param deleteDestinationRequest Container for the necessary parameters
     *           to execute the DeleteDestination service method on AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteDestination(DeleteDestinationRequest deleteDestinationRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDestinationRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDestinationRequestMarshaller().marshall(super.beforeMarshalling(deleteDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Returns all the subscription filters associated with the specified
     * log group. The list returned in the response is ASCII-sorted by filter
     * name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 subscription filters. If
     * there are more subscription filters to list, the response would
     * contain a <code>nextToken</code> value in the response body. You can
     * also limit the number of subscription filters returned in the response
     * by specifying the <code>limit</code> parameter in the request.
     * </p>
     *
     * @param describeSubscriptionFiltersRequest Container for the necessary
     *           parameters to execute the DescribeSubscriptionFilters service method
     *           on AWSLogs.
     * 
     * @return The response from the DescribeSubscriptionFilters service
     *         method, as returned by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSubscriptionFiltersResult describeSubscriptionFilters(DescribeSubscriptionFiltersRequest describeSubscriptionFiltersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSubscriptionFiltersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSubscriptionFiltersRequest> request = null;
        Response<DescribeSubscriptionFiltersResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSubscriptionFiltersRequestMarshaller().marshall(super.beforeMarshalling(describeSubscriptionFiltersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeSubscriptionFiltersResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeSubscriptionFiltersResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSubscriptionFiltersResult> responseHandler =
                new JsonResponseHandler<DescribeSubscriptionFiltersResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a subscription filter associated with the specified log
     * group.
     * </p>
     *
     * @param deleteSubscriptionFilterRequest Container for the necessary
     *           parameters to execute the DeleteSubscriptionFilter service method on
     *           AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteSubscriptionFilter(DeleteSubscriptionFilterRequest deleteSubscriptionFilterRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSubscriptionFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSubscriptionFilterRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSubscriptionFilterRequestMarshaller().marshall(super.beforeMarshalling(deleteSubscriptionFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Returns all the metrics filters associated with the specified log
     * group. The list returned in the response is ASCII-sorted by filter
     * name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 metric filters. If there
     * are more metric filters to list, the response would contain a
     * <code>nextToken</code> value in the response body. You can also limit
     * the number of metric filters returned in the response by specifying
     * the <code>limit</code> parameter in the request.
     * </p>
     *
     * @param describeMetricFiltersRequest Container for the necessary
     *           parameters to execute the DescribeMetricFilters service method on
     *           AWSLogs.
     * 
     * @return The response from the DescribeMetricFilters service method, as
     *         returned by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeMetricFiltersResult describeMetricFilters(DescribeMetricFiltersRequest describeMetricFiltersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeMetricFiltersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMetricFiltersRequest> request = null;
        Response<DescribeMetricFiltersResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMetricFiltersRequestMarshaller().marshall(super.beforeMarshalling(describeMetricFiltersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeMetricFiltersResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeMetricFiltersResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMetricFiltersResult> responseHandler =
                new JsonResponseHandler<DescribeMetricFiltersResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns all the log streams that are associated with the specified
     * log group. The list returned in the response is ASCII-sorted by log
     * stream name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log streams. If there are
     * more log streams to list, the response would contain a
     * <code>nextToken</code> value in the response body. You can also limit
     * the number of log streams returned in the response by specifying the
     * <code>limit</code> parameter in the request. This operation has a
     * limit of five transactions per second, after which transactions are
     * throttled.
     * </p>
     *
     * @param describeLogStreamsRequest Container for the necessary
     *           parameters to execute the DescribeLogStreams service method on
     *           AWSLogs.
     * 
     * @return The response from the DescribeLogStreams service method, as
     *         returned by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLogStreamsResult describeLogStreams(DescribeLogStreamsRequest describeLogStreamsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLogStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLogStreamsRequest> request = null;
        Response<DescribeLogStreamsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLogStreamsRequestMarshaller().marshall(super.beforeMarshalling(describeLogStreamsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeLogStreamsResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeLogStreamsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeLogStreamsResult> responseHandler =
                new JsonResponseHandler<DescribeLogStreamsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the log group with the specified name and permanently deletes
     * all the archived log events associated with it.
     * </p>
     *
     * @param deleteLogGroupRequest Container for the necessary parameters to
     *           execute the DeleteLogGroup service method on AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteLogGroup(DeleteLogGroupRequest deleteLogGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteLogGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLogGroupRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLogGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteLogGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Creates a new log group with the specified name. The name of the log
     * group must be unique within a region for an AWS account. You can
     * create up to 500 log groups per account.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log group:
     * <ul>
     * <li>Log group names can be between 1 and 512 characters long.</li>
     * <li>Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-'
     * (hyphen), '/' (forward slash), and '.' (period).</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param createLogGroupRequest Container for the necessary parameters to
     *           execute the CreateLogGroup service method on AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createLogGroup(CreateLogGroupRequest createLogGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createLogGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLogGroupRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLogGroupRequestMarshaller().marshall(super.beforeMarshalling(createLogGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Creates or updates a subscription filter and associates it with the
     * specified log group. Subscription filters allow you to subscribe to a
     * real-time stream of log events ingested through
     * <code>PutLogEvents</code> requests and have them delivered to a
     * specific destination. Currently, the supported destinations are:
     * <ul>
     * <li> A Amazon Kinesis stream belonging to the same account as the
     * subscription filter, for same-account delivery. </li>
     * <li> A logical destination (used via an ARN of
     * <code>Destination</code> ) belonging to a different account, for
     * cross-account delivery. </li>
     * 
     * </ul>
     * 
     * </p>
     * <p>
     * Currently there can only be one subscription filter associated with a
     * log group.
     * </p>
     *
     * @param putSubscriptionFilterRequest Container for the necessary
     *           parameters to execute the PutSubscriptionFilter service method on
     *           AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putSubscriptionFilter(PutSubscriptionFilterRequest putSubscriptionFilterRequest) {
        ExecutionContext executionContext = createExecutionContext(putSubscriptionFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSubscriptionFilterRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSubscriptionFilterRequestMarshaller().marshall(super.beforeMarshalling(putSubscriptionFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Tests the filter pattern of a metric filter against a sample of log
     * event messages. You can use this operation to validate the correctness
     * of a metric filter pattern.
     * </p>
     *
     * @param testMetricFilterRequest Container for the necessary parameters
     *           to execute the TestMetricFilter service method on AWSLogs.
     * 
     * @return The response from the TestMetricFilter service method, as
     *         returned by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public TestMetricFilterResult testMetricFilter(TestMetricFilterRequest testMetricFilterRequest) {
        ExecutionContext executionContext = createExecutionContext(testMetricFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestMetricFilterRequest> request = null;
        Response<TestMetricFilterResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestMetricFilterRequestMarshaller().marshall(super.beforeMarshalling(testMetricFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<TestMetricFilterResult, JsonUnmarshallerContext> unmarshaller =
                new TestMetricFilterResultJsonUnmarshaller();
            JsonResponseHandler<TestMetricFilterResult> responseHandler =
                new JsonResponseHandler<TestMetricFilterResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates or updates a metric filter and associates it with the
     * specified log group. Metric filters allow you to configure rules to
     * extract metric data from log events ingested through
     * <code>PutLogEvents</code> requests.
     * </p>
     * <p>
     * The maximum number of metric filters that can be associated with a
     * log group is 100.
     * </p>
     *
     * @param putMetricFilterRequest Container for the necessary parameters
     *           to execute the PutMetricFilter service method on AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putMetricFilter(PutMetricFilterRequest putMetricFilterRequest) {
        ExecutionContext executionContext = createExecutionContext(putMetricFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMetricFilterRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMetricFilterRequestMarshaller().marshall(super.beforeMarshalling(putMetricFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Deletes a metric filter associated with the specified log group.
     * </p>
     *
     * @param deleteMetricFilterRequest Container for the necessary
     *           parameters to execute the DeleteMetricFilter service method on
     *           AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteMetricFilter(DeleteMetricFilterRequest deleteMetricFilterRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteMetricFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMetricFilterRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMetricFilterRequestMarshaller().marshall(super.beforeMarshalling(deleteMetricFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Retrieves log events, optionally filtered by a filter pattern from
     * the specified log group. You can provide an optional time range to
     * filter the results on the event <code>timestamp</code> . You can limit
     * the streams searched to an explicit list of
     * <code>logStreamNames</code> .
     * </p>
     * <p>
     * By default, this operation returns as much matching log events as can
     * fit in a response size of 1MB, up to 10,000 log events, or all the
     * events found within a time-bounded scan window. If the response
     * includes a <code>nextToken</code> , then there is more data to search,
     * and the search can be resumed with a new request providing the
     * nextToken. The response will contain a list of
     * <code>searchedLogStreams</code> that contains information about which
     * streams were searched in the request and whether they have been
     * searched completely or require further pagination. The
     * <code>limit</code> parameter in the request. can be used to specify
     * the maximum number of events to return in a page.
     * </p>
     *
     * @param filterLogEventsRequest Container for the necessary parameters
     *           to execute the FilterLogEvents service method on AWSLogs.
     * 
     * @return The response from the FilterLogEvents service method, as
     *         returned by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public FilterLogEventsResult filterLogEvents(FilterLogEventsRequest filterLogEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(filterLogEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<FilterLogEventsRequest> request = null;
        Response<FilterLogEventsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new FilterLogEventsRequestMarshaller().marshall(super.beforeMarshalling(filterLogEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<FilterLogEventsResult, JsonUnmarshallerContext> unmarshaller =
                new FilterLogEventsResultJsonUnmarshaller();
            JsonResponseHandler<FilterLogEventsResult> responseHandler =
                new JsonResponseHandler<FilterLogEventsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Uploads a batch of log events to the specified log stream.
     * </p>
     * <p>
     * Every PutLogEvents request must include the
     * <code>sequenceToken</code> obtained from the response of the previous
     * request. An upload in a newly created log stream does not require a
     * <code>sequenceToken</code> .
     * </p>
     * <p>
     * The batch of events must satisfy the following constraints:
     * <ul>
     * <li>The maximum batch size is 1,048,576 bytes, and this size is
     * calculated as the sum of all event messages in UTF-8, plus 26 bytes
     * for each log event.</li>
     * <li>None of the log events in the batch can be more than 2 hours in
     * the future.</li>
     * <li>None of the log events in the batch can be older than 14 days or
     * the retention period of the log group.</li>
     * <li>The log events in the batch must be in chronological ordered by
     * their <code>timestamp</code> .</li>
     * <li>The maximum number of log events in a batch is 10,000.</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param putLogEventsRequest Container for the necessary parameters to
     *           execute the PutLogEvents service method on AWSLogs.
     * 
     * @return The response from the PutLogEvents service method, as returned
     *         by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws InvalidSequenceTokenException
     * @throws DataAlreadyAcceptedException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutLogEventsResult putLogEvents(PutLogEventsRequest putLogEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(putLogEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLogEventsRequest> request = null;
        Response<PutLogEventsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLogEventsRequestMarshaller().marshall(super.beforeMarshalling(putLogEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<PutLogEventsResult, JsonUnmarshallerContext> unmarshaller =
                new PutLogEventsResultJsonUnmarshaller();
            JsonResponseHandler<PutLogEventsResult> responseHandler =
                new JsonResponseHandler<PutLogEventsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the retention policy of the specified log group. Log events
     * would not expire if they belong to log groups without a retention
     * policy.
     * </p>
     *
     * @param deleteRetentionPolicyRequest Container for the necessary
     *           parameters to execute the DeleteRetentionPolicy service method on
     *           AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteRetentionPolicy(DeleteRetentionPolicyRequest deleteRetentionPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRetentionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRetentionPolicyRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRetentionPolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteRetentionPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Retrieves log events from the specified log stream. You can provide
     * an optional time range to filter the results on the event
     * <code>timestamp</code> .
     * </p>
     * <p>
     * By default, this operation returns as much log events as can fit in a
     * response size of 1MB, up to 10,000 log events. The response will
     * always include a <code>nextForwardToken</code> and a
     * <code>nextBackwardToken</code> in the response body. You can use any
     * of these tokens in subsequent <code>GetLogEvents</code> requests to
     * paginate through events in either forward or backward direction. You
     * can also limit the number of log events returned in the response by
     * specifying the <code>limit</code> parameter in the request.
     * </p>
     *
     * @param getLogEventsRequest Container for the necessary parameters to
     *           execute the GetLogEvents service method on AWSLogs.
     * 
     * @return The response from the GetLogEvents service method, as returned
     *         by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetLogEventsResult getLogEvents(GetLogEventsRequest getLogEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(getLogEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLogEventsRequest> request = null;
        Response<GetLogEventsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLogEventsRequestMarshaller().marshall(super.beforeMarshalling(getLogEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetLogEventsResult, JsonUnmarshallerContext> unmarshaller =
                new GetLogEventsResultJsonUnmarshaller();
            JsonResponseHandler<GetLogEventsResult> responseHandler =
                new JsonResponseHandler<GetLogEventsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new log stream in the specified log group. The name of the
     * log stream must be unique within the log group. There is no limit on
     * the number of log streams that can exist in a log group.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log stream:
     * <ul>
     * <li>Log stream names can be between 1 and 512 characters long.</li>
     * <li>The ':' colon character is not allowed.</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param createLogStreamRequest Container for the necessary parameters
     *           to execute the CreateLogStream service method on AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createLogStream(CreateLogStreamRequest createLogStreamRequest) {
        ExecutionContext executionContext = createExecutionContext(createLogStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLogStreamRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLogStreamRequestMarshaller().marshall(super.beforeMarshalling(createLogStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Creates or updates a <code>Destination</code> . A destination
     * encapsulates a physical resource (such as a Kinesis stream) and allows
     * you to subscribe to a real-time stream of log events of a different
     * account, ingested through <code>PutLogEvents</code> requests.
     * Currently, the only supported physical resource is a Amazon Kinesis
     * stream belonging to the same account as the destination.
     * </p>
     * <p>
     * A destination controls what is written to its Amazon Kinesis stream
     * through an access policy. By default, PutDestination does not set any
     * access policy with the destination, which means a cross-account user
     * will not be able to call <code>PutSubscriptionFilter</code> against
     * this destination. To enable that, the destination owner must call
     * <code>PutDestinationPolicy</code> after PutDestination.
     * </p>
     *
     * @param putDestinationRequest Container for the necessary parameters to
     *           execute the PutDestination service method on AWSLogs.
     * 
     * @return The response from the PutDestination service method, as
     *         returned by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutDestinationResult putDestination(PutDestinationRequest putDestinationRequest) {
        ExecutionContext executionContext = createExecutionContext(putDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDestinationRequest> request = null;
        Response<PutDestinationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDestinationRequestMarshaller().marshall(super.beforeMarshalling(putDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<PutDestinationResult, JsonUnmarshallerContext> unmarshaller =
                new PutDestinationResultJsonUnmarshaller();
            JsonResponseHandler<PutDestinationResult> responseHandler =
                new JsonResponseHandler<PutDestinationResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates or updates an access policy associated with an existing
     * <code>Destination</code> . An access policy is an
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies_overview.html"> IAM policy document </a>
     * that is used to authorize claims to register a subscription filter
     * against a given destination.
     * </p>
     *
     * @param putDestinationPolicyRequest Container for the necessary
     *           parameters to execute the PutDestinationPolicy service method on
     *           AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putDestinationPolicy(PutDestinationPolicyRequest putDestinationPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(putDestinationPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDestinationPolicyRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDestinationPolicyRequestMarshaller().marshall(super.beforeMarshalling(putDestinationPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Deletes a log stream and permanently deletes all the archived log
     * events associated with it.
     * </p>
     *
     * @param deleteLogStreamRequest Container for the necessary parameters
     *           to execute the DeleteLogStream service method on AWSLogs.
     * 
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     * @throws OperationAbortedException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteLogStream(DeleteLogStreamRequest deleteLogStreamRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteLogStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLogStreamRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLogStreamRequestMarshaller().marshall(super.beforeMarshalling(deleteLogStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Returns all the log groups that are associated with the AWS account
     * making the request. The list returned in the response is ASCII-sorted
     * by log group name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log groups. If there are
     * more log groups to list, the response would contain a
     * <code>nextToken</code> value in the response body. You can also limit
     * the number of log groups returned in the response by specifying the
     * <code>limit</code> parameter in the request.
     * </p>
     *
     * @param describeLogGroupsRequest Container for the necessary parameters
     *           to execute the DescribeLogGroups service method on AWSLogs.
     * 
     * @return The response from the DescribeLogGroups service method, as
     *         returned by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLogGroupsResult describeLogGroups(DescribeLogGroupsRequest describeLogGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLogGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLogGroupsRequest> request = null;
        Response<DescribeLogGroupsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLogGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeLogGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeLogGroupsResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeLogGroupsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeLogGroupsResult> responseHandler =
                new JsonResponseHandler<DescribeLogGroupsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns all the destinations that are associated with the AWS account
     * making the request. The list returned in the response is ASCII-sorted
     * by destination name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 destinations. If there
     * are more destinations to list, the response would contain a
     * <code>nextToken</code> value in the response body. You can also limit
     * the number of destinations returned in the response by specifying the
     * <code>limit</code> parameter in the request.
     * </p>
     *
     * @param describeDestinationsRequest Container for the necessary
     *           parameters to execute the DescribeDestinations service method on
     *           AWSLogs.
     * 
     * @return The response from the DescribeDestinations service method, as
     *         returned by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDestinationsResult describeDestinations(DescribeDestinationsRequest describeDestinationsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDestinationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDestinationsRequest> request = null;
        Response<DescribeDestinationsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDestinationsRequestMarshaller().marshall(super.beforeMarshalling(describeDestinationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeDestinationsResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeDestinationsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDestinationsResult> responseHandler =
                new JsonResponseHandler<DescribeDestinationsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns all the log groups that are associated with the AWS account
     * making the request. The list returned in the response is ASCII-sorted
     * by log group name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log groups. If there are
     * more log groups to list, the response would contain a
     * <code>nextToken</code> value in the response body. You can also limit
     * the number of log groups returned in the response by specifying the
     * <code>limit</code> parameter in the request.
     * </p>
     * 
     * @return The response from the DescribeLogGroups service method, as
     *         returned by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLogGroupsResult describeLogGroups() throws AmazonServiceException, AmazonClientException {
        return describeLogGroups(new DescribeLogGroupsRequest());
    }
    
    /**
     * <p>
     * Returns all the destinations that are associated with the AWS account
     * making the request. The list returned in the response is ASCII-sorted
     * by destination name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 destinations. If there
     * are more destinations to list, the response would contain a
     * <code>nextToken</code> value in the response body. You can also limit
     * the number of destinations returned in the response by specifying the
     * <code>limit</code> parameter in the request.
     * </p>
     * 
     * @return The response from the DescribeDestinations service method, as
     *         returned by AWSLogs.
     * 
     * @throws ServiceUnavailableException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLogs indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDestinationsResult describeDestinations() throws AmazonServiceException, AmazonClientException {
        return describeDestinations(new DescribeDestinationsRequest());
    }

    @Override
    public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);
    }

    @Override
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        super.setEndpoint(endpoint, serviceName, regionId);
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
        
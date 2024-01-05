package com.mba.acheteurservice.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: acheteur.proto")
public final class AcheteurServiceGrpc {

  private AcheteurServiceGrpc() {}

  public static final String SERVICE_NAME = "AcheteurService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurRequest,
      com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurResponse> getGetAllAcheteurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllAcheteur",
      requestType = com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurRequest.class,
      responseType = com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurRequest,
      com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurResponse> getGetAllAcheteurMethod() {
    io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurRequest, com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurResponse> getGetAllAcheteurMethod;
    if ((getGetAllAcheteurMethod = AcheteurServiceGrpc.getGetAllAcheteurMethod) == null) {
      synchronized (AcheteurServiceGrpc.class) {
        if ((getGetAllAcheteurMethod = AcheteurServiceGrpc.getGetAllAcheteurMethod) == null) {
          AcheteurServiceGrpc.getGetAllAcheteurMethod = getGetAllAcheteurMethod = 
              io.grpc.MethodDescriptor.<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurRequest, com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AcheteurService", "getAllAcheteur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AcheteurServiceMethodDescriptorSupplier("getAllAcheteur"))
                  .build();
          }
        }
     }
     return getGetAllAcheteurMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurRequest,
      com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurResponse> getGetOneAcheteurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOneAcheteur",
      requestType = com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurRequest.class,
      responseType = com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurRequest,
      com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurResponse> getGetOneAcheteurMethod() {
    io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurRequest, com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurResponse> getGetOneAcheteurMethod;
    if ((getGetOneAcheteurMethod = AcheteurServiceGrpc.getGetOneAcheteurMethod) == null) {
      synchronized (AcheteurServiceGrpc.class) {
        if ((getGetOneAcheteurMethod = AcheteurServiceGrpc.getGetOneAcheteurMethod) == null) {
          AcheteurServiceGrpc.getGetOneAcheteurMethod = getGetOneAcheteurMethod = 
              io.grpc.MethodDescriptor.<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurRequest, com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AcheteurService", "getOneAcheteur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AcheteurServiceMethodDescriptorSupplier("getOneAcheteur"))
                  .build();
          }
        }
     }
     return getGetOneAcheteurMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurRequest,
      com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponse> getSaveAcheteurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveAcheteur",
      requestType = com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurRequest.class,
      responseType = com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurRequest,
      com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponse> getSaveAcheteurMethod() {
    io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurRequest, com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponse> getSaveAcheteurMethod;
    if ((getSaveAcheteurMethod = AcheteurServiceGrpc.getSaveAcheteurMethod) == null) {
      synchronized (AcheteurServiceGrpc.class) {
        if ((getSaveAcheteurMethod = AcheteurServiceGrpc.getSaveAcheteurMethod) == null) {
          AcheteurServiceGrpc.getSaveAcheteurMethod = getSaveAcheteurMethod = 
              io.grpc.MethodDescriptor.<com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurRequest, com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AcheteurService", "saveAcheteur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AcheteurServiceMethodDescriptorSupplier("saveAcheteur"))
                  .build();
          }
        }
     }
     return getSaveAcheteurMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurRequest,
      com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurResponse> getUpdateAcheteurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateAcheteur",
      requestType = com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurRequest.class,
      responseType = com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurRequest,
      com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurResponse> getUpdateAcheteurMethod() {
    io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurRequest, com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurResponse> getUpdateAcheteurMethod;
    if ((getUpdateAcheteurMethod = AcheteurServiceGrpc.getUpdateAcheteurMethod) == null) {
      synchronized (AcheteurServiceGrpc.class) {
        if ((getUpdateAcheteurMethod = AcheteurServiceGrpc.getUpdateAcheteurMethod) == null) {
          AcheteurServiceGrpc.getUpdateAcheteurMethod = getUpdateAcheteurMethod = 
              io.grpc.MethodDescriptor.<com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurRequest, com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AcheteurService", "updateAcheteur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AcheteurServiceMethodDescriptorSupplier("updateAcheteur"))
                  .build();
          }
        }
     }
     return getUpdateAcheteurMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurRequest,
      com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurResponse> getDeleteAcheteurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteAcheteur",
      requestType = com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurRequest.class,
      responseType = com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurRequest,
      com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurResponse> getDeleteAcheteurMethod() {
    io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurRequest, com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurResponse> getDeleteAcheteurMethod;
    if ((getDeleteAcheteurMethod = AcheteurServiceGrpc.getDeleteAcheteurMethod) == null) {
      synchronized (AcheteurServiceGrpc.class) {
        if ((getDeleteAcheteurMethod = AcheteurServiceGrpc.getDeleteAcheteurMethod) == null) {
          AcheteurServiceGrpc.getDeleteAcheteurMethod = getDeleteAcheteurMethod = 
              io.grpc.MethodDescriptor.<com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurRequest, com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AcheteurService", "deleteAcheteur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AcheteurServiceMethodDescriptorSupplier("deleteAcheteur"))
                  .build();
          }
        }
     }
     return getDeleteAcheteurMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurStreamRequest,
      com.mba.acheteurservice.stubs.AcheteurOuterClass.Acheteur> getGetAllAcheteurStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllAcheteurStream",
      requestType = com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurStreamRequest.class,
      responseType = com.mba.acheteurservice.stubs.AcheteurOuterClass.Acheteur.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurStreamRequest,
      com.mba.acheteurservice.stubs.AcheteurOuterClass.Acheteur> getGetAllAcheteurStreamMethod() {
    io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurStreamRequest, com.mba.acheteurservice.stubs.AcheteurOuterClass.Acheteur> getGetAllAcheteurStreamMethod;
    if ((getGetAllAcheteurStreamMethod = AcheteurServiceGrpc.getGetAllAcheteurStreamMethod) == null) {
      synchronized (AcheteurServiceGrpc.class) {
        if ((getGetAllAcheteurStreamMethod = AcheteurServiceGrpc.getGetAllAcheteurStreamMethod) == null) {
          AcheteurServiceGrpc.getGetAllAcheteurStreamMethod = getGetAllAcheteurStreamMethod = 
              io.grpc.MethodDescriptor.<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurStreamRequest, com.mba.acheteurservice.stubs.AcheteurOuterClass.Acheteur>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "AcheteurService", "getAllAcheteurStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mba.acheteurservice.stubs.AcheteurOuterClass.Acheteur.getDefaultInstance()))
                  .setSchemaDescriptor(new AcheteurServiceMethodDescriptorSupplier("getAllAcheteurStream"))
                  .build();
          }
        }
     }
     return getGetAllAcheteurStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest,
      com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponseStream> getClientStreamAcheteurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clientStreamAcheteur",
      requestType = com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest.class,
      responseType = com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponseStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest,
      com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponseStream> getClientStreamAcheteurMethod() {
    io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest, com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponseStream> getClientStreamAcheteurMethod;
    if ((getClientStreamAcheteurMethod = AcheteurServiceGrpc.getClientStreamAcheteurMethod) == null) {
      synchronized (AcheteurServiceGrpc.class) {
        if ((getClientStreamAcheteurMethod = AcheteurServiceGrpc.getClientStreamAcheteurMethod) == null) {
          AcheteurServiceGrpc.getClientStreamAcheteurMethod = getClientStreamAcheteurMethod = 
              io.grpc.MethodDescriptor.<com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest, com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponseStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "AcheteurService", "clientStreamAcheteur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponseStream.getDefaultInstance()))
                  .setSchemaDescriptor(new AcheteurServiceMethodDescriptorSupplier("clientStreamAcheteur"))
                  .build();
          }
        }
     }
     return getClientStreamAcheteurMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest,
      com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurResponse> getBidirectionalStreamAcheteurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bidirectionalStreamAcheteur",
      requestType = com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest.class,
      responseType = com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest,
      com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurResponse> getBidirectionalStreamAcheteurMethod() {
    io.grpc.MethodDescriptor<com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest, com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurResponse> getBidirectionalStreamAcheteurMethod;
    if ((getBidirectionalStreamAcheteurMethod = AcheteurServiceGrpc.getBidirectionalStreamAcheteurMethod) == null) {
      synchronized (AcheteurServiceGrpc.class) {
        if ((getBidirectionalStreamAcheteurMethod = AcheteurServiceGrpc.getBidirectionalStreamAcheteurMethod) == null) {
          AcheteurServiceGrpc.getBidirectionalStreamAcheteurMethod = getBidirectionalStreamAcheteurMethod = 
              io.grpc.MethodDescriptor.<com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest, com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "AcheteurService", "bidirectionalStreamAcheteur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AcheteurServiceMethodDescriptorSupplier("bidirectionalStreamAcheteur"))
                  .build();
          }
        }
     }
     return getBidirectionalStreamAcheteurMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AcheteurServiceStub newStub(io.grpc.Channel channel) {
    return new AcheteurServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AcheteurServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AcheteurServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AcheteurServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AcheteurServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AcheteurServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary model
     * </pre>
     */
    public void getAllAcheteur(com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurRequest request,
        io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllAcheteurMethod(), responseObserver);
    }

    /**
     */
    public void getOneAcheteur(com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurRequest request,
        io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOneAcheteurMethod(), responseObserver);
    }

    /**
     */
    public void saveAcheteur(com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurRequest request,
        io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveAcheteurMethod(), responseObserver);
    }

    /**
     */
    public void updateAcheteur(com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurRequest request,
        io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAcheteurMethod(), responseObserver);
    }

    /**
     */
    public void deleteAcheteur(com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurRequest request,
        io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAcheteurMethod(), responseObserver);
    }

    /**
     * <pre>
     *server Streaming
     * </pre>
     */
    public void getAllAcheteurStream(com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurStreamRequest request,
        io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.Acheteur> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllAcheteurStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client Streaming : Le client envoie un flux de requêtes pour sauvegarder plusieurs acheteurs
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest> clientStreamAcheteur(
        io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponseStream> responseObserver) {
      return asyncUnimplementedStreamingCall(getClientStreamAcheteurMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectionnel Streaming : Flux bidirectionnel pour sauvegarder les acheteurs un par un
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest> bidirectionalStreamAcheteur(
        io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBidirectionalStreamAcheteurMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllAcheteurMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurRequest,
                com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurResponse>(
                  this, METHODID_GET_ALL_ACHETEUR)))
          .addMethod(
            getGetOneAcheteurMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurRequest,
                com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurResponse>(
                  this, METHODID_GET_ONE_ACHETEUR)))
          .addMethod(
            getSaveAcheteurMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurRequest,
                com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponse>(
                  this, METHODID_SAVE_ACHETEUR)))
          .addMethod(
            getUpdateAcheteurMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurRequest,
                com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurResponse>(
                  this, METHODID_UPDATE_ACHETEUR)))
          .addMethod(
            getDeleteAcheteurMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurRequest,
                com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurResponse>(
                  this, METHODID_DELETE_ACHETEUR)))
          .addMethod(
            getGetAllAcheteurStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurStreamRequest,
                com.mba.acheteurservice.stubs.AcheteurOuterClass.Acheteur>(
                  this, METHODID_GET_ALL_ACHETEUR_STREAM)))
          .addMethod(
            getClientStreamAcheteurMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest,
                com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponseStream>(
                  this, METHODID_CLIENT_STREAM_ACHETEUR)))
          .addMethod(
            getBidirectionalStreamAcheteurMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest,
                com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurResponse>(
                  this, METHODID_BIDIRECTIONAL_STREAM_ACHETEUR)))
          .build();
    }
  }

  /**
   */
  public static final class AcheteurServiceStub extends io.grpc.stub.AbstractStub<AcheteurServiceStub> {
    private AcheteurServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AcheteurServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcheteurServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AcheteurServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary model
     * </pre>
     */
    public void getAllAcheteur(com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurRequest request,
        io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllAcheteurMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOneAcheteur(com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurRequest request,
        io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOneAcheteurMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveAcheteur(com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurRequest request,
        io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveAcheteurMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAcheteur(com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurRequest request,
        io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAcheteurMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAcheteur(com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurRequest request,
        io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAcheteurMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server Streaming
     * </pre>
     */
    public void getAllAcheteurStream(com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurStreamRequest request,
        io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.Acheteur> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllAcheteurStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client Streaming : Le client envoie un flux de requêtes pour sauvegarder plusieurs acheteurs
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest> clientStreamAcheteur(
        io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponseStream> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getClientStreamAcheteurMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bidirectionnel Streaming : Flux bidirectionnel pour sauvegarder les acheteurs un par un
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurRequest> bidirectionalStreamAcheteur(
        io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBidirectionalStreamAcheteurMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class AcheteurServiceBlockingStub extends io.grpc.stub.AbstractStub<AcheteurServiceBlockingStub> {
    private AcheteurServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AcheteurServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcheteurServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AcheteurServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary model
     * </pre>
     */
    public com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurResponse getAllAcheteur(com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllAcheteurMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurResponse getOneAcheteur(com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOneAcheteurMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponse saveAcheteur(com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveAcheteurMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurResponse updateAcheteur(com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAcheteurMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurResponse deleteAcheteur(com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAcheteurMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server Streaming
     * </pre>
     */
    public java.util.Iterator<com.mba.acheteurservice.stubs.AcheteurOuterClass.Acheteur> getAllAcheteurStream(
        com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurStreamRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllAcheteurStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AcheteurServiceFutureStub extends io.grpc.stub.AbstractStub<AcheteurServiceFutureStub> {
    private AcheteurServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AcheteurServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcheteurServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AcheteurServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurResponse> getAllAcheteur(
        com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllAcheteurMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurResponse> getOneAcheteur(
        com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOneAcheteurMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponse> saveAcheteur(
        com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveAcheteurMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurResponse> updateAcheteur(
        com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAcheteurMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurResponse> deleteAcheteur(
        com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAcheteurMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_ACHETEUR = 0;
  private static final int METHODID_GET_ONE_ACHETEUR = 1;
  private static final int METHODID_SAVE_ACHETEUR = 2;
  private static final int METHODID_UPDATE_ACHETEUR = 3;
  private static final int METHODID_DELETE_ACHETEUR = 4;
  private static final int METHODID_GET_ALL_ACHETEUR_STREAM = 5;
  private static final int METHODID_CLIENT_STREAM_ACHETEUR = 6;
  private static final int METHODID_BIDIRECTIONAL_STREAM_ACHETEUR = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AcheteurServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AcheteurServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_ACHETEUR:
          serviceImpl.getAllAcheteur((com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurRequest) request,
              (io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurResponse>) responseObserver);
          break;
        case METHODID_GET_ONE_ACHETEUR:
          serviceImpl.getOneAcheteur((com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurRequest) request,
              (io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.GetOneAcheteurResponse>) responseObserver);
          break;
        case METHODID_SAVE_ACHETEUR:
          serviceImpl.saveAcheteur((com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurRequest) request,
              (io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ACHETEUR:
          serviceImpl.updateAcheteur((com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurRequest) request,
              (io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.UpdateAcheteurResponse>) responseObserver);
          break;
        case METHODID_DELETE_ACHETEUR:
          serviceImpl.deleteAcheteur((com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurRequest) request,
              (io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.DeleteAcheteurResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_ACHETEUR_STREAM:
          serviceImpl.getAllAcheteurStream((com.mba.acheteurservice.stubs.AcheteurOuterClass.GetAllAcheteurStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.Acheteur>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLIENT_STREAM_ACHETEUR:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientStreamAcheteur(
              (io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.SaveAcheteurResponseStream>) responseObserver);
        case METHODID_BIDIRECTIONAL_STREAM_ACHETEUR:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidirectionalStreamAcheteur(
              (io.grpc.stub.StreamObserver<com.mba.acheteurservice.stubs.AcheteurOuterClass.AcheteurResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AcheteurServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AcheteurServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mba.acheteurservice.stubs.AcheteurOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AcheteurService");
    }
  }

  private static final class AcheteurServiceFileDescriptorSupplier
      extends AcheteurServiceBaseDescriptorSupplier {
    AcheteurServiceFileDescriptorSupplier() {}
  }

  private static final class AcheteurServiceMethodDescriptorSupplier
      extends AcheteurServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AcheteurServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AcheteurServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AcheteurServiceFileDescriptorSupplier())
              .addMethod(getGetAllAcheteurMethod())
              .addMethod(getGetOneAcheteurMethod())
              .addMethod(getSaveAcheteurMethod())
              .addMethod(getUpdateAcheteurMethod())
              .addMethod(getDeleteAcheteurMethod())
              .addMethod(getGetAllAcheteurStreamMethod())
              .addMethod(getClientStreamAcheteurMethod())
              .addMethod(getBidirectionalStreamAcheteurMethod())
              .build();
        }
      }
    }
    return result;
  }
}

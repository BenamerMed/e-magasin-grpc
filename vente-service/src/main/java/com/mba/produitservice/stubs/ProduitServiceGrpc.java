package com.mba.produitservice.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * unary model
 * </pre>
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.15.0)",
        comments = "Source: produit.proto")
public final class ProduitServiceGrpc {

    public static final String SERVICE_NAME = "ProduitService";
    private static final int METHODID_GET_ALL_PRODUIT = 0;
    private static final int METHODID_GET_ONE_PRODUIT = 1;
    private static final int METHODID_SAVE_PRODUIT = 2;
    private static final int METHODID_UPDATE_PRODUIT = 3;
    private static final int METHODID_DELETE_PRODUIT = 4;
    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitRequest,
            com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitResponse> getGetAllProduitMethod;
    private static volatile io.grpc.MethodDescriptor<com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitRequest,
            com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitResponse> getGetOneProduitMethod;
    private static volatile io.grpc.MethodDescriptor<com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitRequest,
            com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitResponse> getSaveProduitMethod;
    private static volatile io.grpc.MethodDescriptor<com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitRequest,
            com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitResponse> getUpdateProduitMethod;
    private static volatile io.grpc.MethodDescriptor<com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitRequest,
            com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitResponse> getDeleteProduitMethod;
    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    private ProduitServiceGrpc() {
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "getAllProduit",
            requestType = com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitRequest.class,
            responseType = com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitRequest,
            com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitResponse> getGetAllProduitMethod() {
        io.grpc.MethodDescriptor<com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitRequest, com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitResponse> getGetAllProduitMethod;
        if ((getGetAllProduitMethod = ProduitServiceGrpc.getGetAllProduitMethod) == null) {
            synchronized (ProduitServiceGrpc.class) {
                if ((getGetAllProduitMethod = ProduitServiceGrpc.getGetAllProduitMethod) == null) {
                    ProduitServiceGrpc.getGetAllProduitMethod = getGetAllProduitMethod =
                            io.grpc.MethodDescriptor.<com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitRequest, com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "ProduitService", "getAllProduit"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new ProduitServiceMethodDescriptorSupplier("getAllProduit"))
                                    .build();
                }
            }
        }
        return getGetAllProduitMethod;
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "getOneProduit",
            requestType = com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitRequest.class,
            responseType = com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitRequest,
            com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitResponse> getGetOneProduitMethod() {
        io.grpc.MethodDescriptor<com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitRequest, com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitResponse> getGetOneProduitMethod;
        if ((getGetOneProduitMethod = ProduitServiceGrpc.getGetOneProduitMethod) == null) {
            synchronized (ProduitServiceGrpc.class) {
                if ((getGetOneProduitMethod = ProduitServiceGrpc.getGetOneProduitMethod) == null) {
                    ProduitServiceGrpc.getGetOneProduitMethod = getGetOneProduitMethod =
                            io.grpc.MethodDescriptor.<com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitRequest, com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "ProduitService", "getOneProduit"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new ProduitServiceMethodDescriptorSupplier("getOneProduit"))
                                    .build();
                }
            }
        }
        return getGetOneProduitMethod;
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "saveProduit",
            requestType = com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitRequest.class,
            responseType = com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitRequest,
            com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitResponse> getSaveProduitMethod() {
        io.grpc.MethodDescriptor<com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitRequest, com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitResponse> getSaveProduitMethod;
        if ((getSaveProduitMethod = ProduitServiceGrpc.getSaveProduitMethod) == null) {
            synchronized (ProduitServiceGrpc.class) {
                if ((getSaveProduitMethod = ProduitServiceGrpc.getSaveProduitMethod) == null) {
                    ProduitServiceGrpc.getSaveProduitMethod = getSaveProduitMethod =
                            io.grpc.MethodDescriptor.<com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitRequest, com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "ProduitService", "saveProduit"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new ProduitServiceMethodDescriptorSupplier("saveProduit"))
                                    .build();
                }
            }
        }
        return getSaveProduitMethod;
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "updateProduit",
            requestType = com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitRequest.class,
            responseType = com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitRequest,
            com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitResponse> getUpdateProduitMethod() {
        io.grpc.MethodDescriptor<com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitRequest, com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitResponse> getUpdateProduitMethod;
        if ((getUpdateProduitMethod = ProduitServiceGrpc.getUpdateProduitMethod) == null) {
            synchronized (ProduitServiceGrpc.class) {
                if ((getUpdateProduitMethod = ProduitServiceGrpc.getUpdateProduitMethod) == null) {
                    ProduitServiceGrpc.getUpdateProduitMethod = getUpdateProduitMethod =
                            io.grpc.MethodDescriptor.<com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitRequest, com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "ProduitService", "updateProduit"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new ProduitServiceMethodDescriptorSupplier("updateProduit"))
                                    .build();
                }
            }
        }
        return getUpdateProduitMethod;
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "deleteProduit",
            requestType = com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitRequest.class,
            responseType = com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitRequest,
            com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitResponse> getDeleteProduitMethod() {
        io.grpc.MethodDescriptor<com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitRequest, com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitResponse> getDeleteProduitMethod;
        if ((getDeleteProduitMethod = ProduitServiceGrpc.getDeleteProduitMethod) == null) {
            synchronized (ProduitServiceGrpc.class) {
                if ((getDeleteProduitMethod = ProduitServiceGrpc.getDeleteProduitMethod) == null) {
                    ProduitServiceGrpc.getDeleteProduitMethod = getDeleteProduitMethod =
                            io.grpc.MethodDescriptor.<com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitRequest, com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "ProduitService", "deleteProduit"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new ProduitServiceMethodDescriptorSupplier("deleteProduit"))
                                    .build();
                }
            }
        }
        return getDeleteProduitMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static ProduitServiceStub newStub(io.grpc.Channel channel) {
        return new ProduitServiceStub(channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static ProduitServiceBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        return new ProduitServiceBlockingStub(channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static ProduitServiceFutureStub newFutureStub(
            io.grpc.Channel channel) {
        return new ProduitServiceFutureStub(channel);
    }

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (ProduitServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new ProduitServiceFileDescriptorSupplier())
                            .addMethod(getGetAllProduitMethod())
                            .addMethod(getGetOneProduitMethod())
                            .addMethod(getSaveProduitMethod())
                            .addMethod(getUpdateProduitMethod())
                            .addMethod(getDeleteProduitMethod())
                            .build();
                }
            }
        }
        return result;
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public static abstract class ProduitServiceImplBase implements io.grpc.BindableService {

        /**
         *
         */
        public void getAllProduit(com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitRequest request,
                                  io.grpc.stub.StreamObserver<com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetAllProduitMethod(), responseObserver);
        }

        /**
         *
         */
        public void getOneProduit(com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitRequest request,
                                  io.grpc.stub.StreamObserver<com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetOneProduitMethod(), responseObserver);
        }

        /**
         *
         */
        public void saveProduit(com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitRequest request,
                                io.grpc.stub.StreamObserver<com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSaveProduitMethod(), responseObserver);
        }

        /**
         *
         */
        public void updateProduit(com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitRequest request,
                                  io.grpc.stub.StreamObserver<com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getUpdateProduitMethod(), responseObserver);
        }

        /**
         *
         */
        public void deleteProduit(com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitRequest request,
                                  io.grpc.stub.StreamObserver<com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getDeleteProduitMethod(), responseObserver);
        }

        @java.lang.Override
        public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            getGetAllProduitMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitRequest,
                                            com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitResponse>(
                                            this, METHODID_GET_ALL_PRODUIT)))
                    .addMethod(
                            getGetOneProduitMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitRequest,
                                            com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitResponse>(
                                            this, METHODID_GET_ONE_PRODUIT)))
                    .addMethod(
                            getSaveProduitMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitRequest,
                                            com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitResponse>(
                                            this, METHODID_SAVE_PRODUIT)))
                    .addMethod(
                            getUpdateProduitMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitRequest,
                                            com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitResponse>(
                                            this, METHODID_UPDATE_PRODUIT)))
                    .addMethod(
                            getDeleteProduitMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitRequest,
                                            com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitResponse>(
                                            this, METHODID_DELETE_PRODUIT)))
                    .build();
        }
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public static final class ProduitServiceStub extends io.grpc.stub.AbstractStub<ProduitServiceStub> {
        private ProduitServiceStub(io.grpc.Channel channel) {
            super(channel);
        }

        private ProduitServiceStub(io.grpc.Channel channel,
                                   io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected ProduitServiceStub build(io.grpc.Channel channel,
                                           io.grpc.CallOptions callOptions) {
            return new ProduitServiceStub(channel, callOptions);
        }

        /**
         *
         */
        public void getAllProduit(com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitRequest request,
                                  io.grpc.stub.StreamObserver<com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetAllProduitMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         *
         */
        public void getOneProduit(com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitRequest request,
                                  io.grpc.stub.StreamObserver<com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetOneProduitMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         *
         */
        public void saveProduit(com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitRequest request,
                                io.grpc.stub.StreamObserver<com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSaveProduitMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         *
         */
        public void updateProduit(com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitRequest request,
                                  io.grpc.stub.StreamObserver<com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getUpdateProduitMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         *
         */
        public void deleteProduit(com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitRequest request,
                                  io.grpc.stub.StreamObserver<com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getDeleteProduitMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public static final class ProduitServiceBlockingStub extends io.grpc.stub.AbstractStub<ProduitServiceBlockingStub> {
        private ProduitServiceBlockingStub(io.grpc.Channel channel) {
            super(channel);
        }

        private ProduitServiceBlockingStub(io.grpc.Channel channel,
                                           io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected ProduitServiceBlockingStub build(io.grpc.Channel channel,
                                                   io.grpc.CallOptions callOptions) {
            return new ProduitServiceBlockingStub(channel, callOptions);
        }

        /**
         *
         */
        public com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitResponse getAllProduit(com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetAllProduitMethod(), getCallOptions(), request);
        }

        /**
         *
         */
        public com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitResponse getOneProduit(com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetOneProduitMethod(), getCallOptions(), request);
        }

        /**
         *
         */
        public com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitResponse saveProduit(com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSaveProduitMethod(), getCallOptions(), request);
        }

        /**
         *
         */
        public com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitResponse updateProduit(com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitRequest request) {
            return blockingUnaryCall(
                    getChannel(), getUpdateProduitMethod(), getCallOptions(), request);
        }

        /**
         *
         */
        public com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitResponse deleteProduit(com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitRequest request) {
            return blockingUnaryCall(
                    getChannel(), getDeleteProduitMethod(), getCallOptions(), request);
        }
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public static final class ProduitServiceFutureStub extends io.grpc.stub.AbstractStub<ProduitServiceFutureStub> {
        private ProduitServiceFutureStub(io.grpc.Channel channel) {
            super(channel);
        }

        private ProduitServiceFutureStub(io.grpc.Channel channel,
                                         io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected ProduitServiceFutureStub build(io.grpc.Channel channel,
                                                 io.grpc.CallOptions callOptions) {
            return new ProduitServiceFutureStub(channel, callOptions);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitResponse> getAllProduit(
                com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetAllProduitMethod(), getCallOptions()), request);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitResponse> getOneProduit(
                com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetOneProduitMethod(), getCallOptions()), request);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitResponse> saveProduit(
                com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSaveProduitMethod(), getCallOptions()), request);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitResponse> updateProduit(
                com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getUpdateProduitMethod(), getCallOptions()), request);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitResponse> deleteProduit(
                com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getDeleteProduitMethod(), getCallOptions()), request);
        }
    }

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final ProduitServiceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(ProduitServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_GET_ALL_PRODUIT:
                    serviceImpl.getAllProduit((com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitRequest) request,
                            (io.grpc.stub.StreamObserver<com.mba.produitservice.stubs.ProduitOuterClass.GetAllProduitResponse>) responseObserver);
                    break;
                case METHODID_GET_ONE_PRODUIT:
                    serviceImpl.getOneProduit((com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitRequest) request,
                            (io.grpc.stub.StreamObserver<com.mba.produitservice.stubs.ProduitOuterClass.GetOneProduitResponse>) responseObserver);
                    break;
                case METHODID_SAVE_PRODUIT:
                    serviceImpl.saveProduit((com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitRequest) request,
                            (io.grpc.stub.StreamObserver<com.mba.produitservice.stubs.ProduitOuterClass.SaveProduitResponse>) responseObserver);
                    break;
                case METHODID_UPDATE_PRODUIT:
                    serviceImpl.updateProduit((com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitRequest) request,
                            (io.grpc.stub.StreamObserver<com.mba.produitservice.stubs.ProduitOuterClass.UpdateProduitResponse>) responseObserver);
                    break;
                case METHODID_DELETE_PRODUIT:
                    serviceImpl.deleteProduit((com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitRequest) request,
                            (io.grpc.stub.StreamObserver<com.mba.produitservice.stubs.ProduitOuterClass.DeleteProduitResponse>) responseObserver);
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
                default:
                    throw new AssertionError();
            }
        }
    }

    private static abstract class ProduitServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        ProduitServiceBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.mba.produitservice.stubs.ProduitOuterClass.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("ProduitService");
        }
    }

    private static final class ProduitServiceFileDescriptorSupplier
            extends ProduitServiceBaseDescriptorSupplier {
        ProduitServiceFileDescriptorSupplier() {
        }
    }

    private static final class ProduitServiceMethodDescriptorSupplier
            extends ProduitServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        ProduitServiceMethodDescriptorSupplier(String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }
}

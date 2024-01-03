package com.mba.venteservice.stubs;

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
        comments = "Source: vente.proto")
public final class VenteServiceGrpc {

    public static final String SERVICE_NAME = "VenteService";
    private static final int METHODID_GET_ALL_VENTE = 0;
    private static final int METHODID_GET_ONE_VENTE = 1;
    private static final int METHODID_SAVE_VENTE = 2;
    private static final int METHODID_UPDATE_VENTE = 3;
    private static final int METHODID_DELETE_VENTE = 4;
    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteRequest,
            com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteResponse> getGetAllVenteMethod;
    private static volatile io.grpc.MethodDescriptor<com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteRequest,
            com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteResponse> getGetOneVenteMethod;
    private static volatile io.grpc.MethodDescriptor<com.mba.venteservice.stubs.VenteOuterClass.SaveVenteRequest,
            com.mba.venteservice.stubs.VenteOuterClass.SaveVenteResponse> getSaveVenteMethod;
    private static volatile io.grpc.MethodDescriptor<com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteRequest,
            com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteResponse> getUpdateVenteMethod;
    private static volatile io.grpc.MethodDescriptor<com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteRequest,
            com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteResponse> getDeleteVenteMethod;
    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    private VenteServiceGrpc() {
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "getAllVente",
            requestType = com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteRequest.class,
            responseType = com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteRequest,
            com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteResponse> getGetAllVenteMethod() {
        io.grpc.MethodDescriptor<com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteRequest, com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteResponse> getGetAllVenteMethod;
        if ((getGetAllVenteMethod = VenteServiceGrpc.getGetAllVenteMethod) == null) {
            synchronized (VenteServiceGrpc.class) {
                if ((getGetAllVenteMethod = VenteServiceGrpc.getGetAllVenteMethod) == null) {
                    VenteServiceGrpc.getGetAllVenteMethod = getGetAllVenteMethod =
                            io.grpc.MethodDescriptor.<com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteRequest, com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "VenteService", "getAllVente"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new VenteServiceMethodDescriptorSupplier("getAllVente"))
                                    .build();
                }
            }
        }
        return getGetAllVenteMethod;
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "getOneVente",
            requestType = com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteRequest.class,
            responseType = com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteRequest,
            com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteResponse> getGetOneVenteMethod() {
        io.grpc.MethodDescriptor<com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteRequest, com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteResponse> getGetOneVenteMethod;
        if ((getGetOneVenteMethod = VenteServiceGrpc.getGetOneVenteMethod) == null) {
            synchronized (VenteServiceGrpc.class) {
                if ((getGetOneVenteMethod = VenteServiceGrpc.getGetOneVenteMethod) == null) {
                    VenteServiceGrpc.getGetOneVenteMethod = getGetOneVenteMethod =
                            io.grpc.MethodDescriptor.<com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteRequest, com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "VenteService", "getOneVente"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new VenteServiceMethodDescriptorSupplier("getOneVente"))
                                    .build();
                }
            }
        }
        return getGetOneVenteMethod;
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "saveVente",
            requestType = com.mba.venteservice.stubs.VenteOuterClass.SaveVenteRequest.class,
            responseType = com.mba.venteservice.stubs.VenteOuterClass.SaveVenteResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.mba.venteservice.stubs.VenteOuterClass.SaveVenteRequest,
            com.mba.venteservice.stubs.VenteOuterClass.SaveVenteResponse> getSaveVenteMethod() {
        io.grpc.MethodDescriptor<com.mba.venteservice.stubs.VenteOuterClass.SaveVenteRequest, com.mba.venteservice.stubs.VenteOuterClass.SaveVenteResponse> getSaveVenteMethod;
        if ((getSaveVenteMethod = VenteServiceGrpc.getSaveVenteMethod) == null) {
            synchronized (VenteServiceGrpc.class) {
                if ((getSaveVenteMethod = VenteServiceGrpc.getSaveVenteMethod) == null) {
                    VenteServiceGrpc.getSaveVenteMethod = getSaveVenteMethod =
                            io.grpc.MethodDescriptor.<com.mba.venteservice.stubs.VenteOuterClass.SaveVenteRequest, com.mba.venteservice.stubs.VenteOuterClass.SaveVenteResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "VenteService", "saveVente"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.venteservice.stubs.VenteOuterClass.SaveVenteRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.venteservice.stubs.VenteOuterClass.SaveVenteResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new VenteServiceMethodDescriptorSupplier("saveVente"))
                                    .build();
                }
            }
        }
        return getSaveVenteMethod;
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "updateVente",
            requestType = com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteRequest.class,
            responseType = com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteRequest,
            com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteResponse> getUpdateVenteMethod() {
        io.grpc.MethodDescriptor<com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteRequest, com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteResponse> getUpdateVenteMethod;
        if ((getUpdateVenteMethod = VenteServiceGrpc.getUpdateVenteMethod) == null) {
            synchronized (VenteServiceGrpc.class) {
                if ((getUpdateVenteMethod = VenteServiceGrpc.getUpdateVenteMethod) == null) {
                    VenteServiceGrpc.getUpdateVenteMethod = getUpdateVenteMethod =
                            io.grpc.MethodDescriptor.<com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteRequest, com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "VenteService", "updateVente"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new VenteServiceMethodDescriptorSupplier("updateVente"))
                                    .build();
                }
            }
        }
        return getUpdateVenteMethod;
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "deleteVente",
            requestType = com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteRequest.class,
            responseType = com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteRequest,
            com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteResponse> getDeleteVenteMethod() {
        io.grpc.MethodDescriptor<com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteRequest, com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteResponse> getDeleteVenteMethod;
        if ((getDeleteVenteMethod = VenteServiceGrpc.getDeleteVenteMethod) == null) {
            synchronized (VenteServiceGrpc.class) {
                if ((getDeleteVenteMethod = VenteServiceGrpc.getDeleteVenteMethod) == null) {
                    VenteServiceGrpc.getDeleteVenteMethod = getDeleteVenteMethod =
                            io.grpc.MethodDescriptor.<com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteRequest, com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "VenteService", "deleteVente"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new VenteServiceMethodDescriptorSupplier("deleteVente"))
                                    .build();
                }
            }
        }
        return getDeleteVenteMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static VenteServiceStub newStub(io.grpc.Channel channel) {
        return new VenteServiceStub(channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static VenteServiceBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        return new VenteServiceBlockingStub(channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static VenteServiceFutureStub newFutureStub(
            io.grpc.Channel channel) {
        return new VenteServiceFutureStub(channel);
    }

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (VenteServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new VenteServiceFileDescriptorSupplier())
                            .addMethod(getGetAllVenteMethod())
                            .addMethod(getGetOneVenteMethod())
                            .addMethod(getSaveVenteMethod())
                            .addMethod(getUpdateVenteMethod())
                            .addMethod(getDeleteVenteMethod())
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
    public static abstract class VenteServiceImplBase implements io.grpc.BindableService {

        /**
         *
         */
        public void getAllVente(com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteRequest request,
                                io.grpc.stub.StreamObserver<com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetAllVenteMethod(), responseObserver);
        }

        /**
         *
         */
        public void getOneVente(com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteRequest request,
                                io.grpc.stub.StreamObserver<com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetOneVenteMethod(), responseObserver);
        }

        /**
         *
         */
        public void saveVente(com.mba.venteservice.stubs.VenteOuterClass.SaveVenteRequest request,
                              io.grpc.stub.StreamObserver<com.mba.venteservice.stubs.VenteOuterClass.SaveVenteResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSaveVenteMethod(), responseObserver);
        }

        /**
         *
         */
        public void updateVente(com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteRequest request,
                                io.grpc.stub.StreamObserver<com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getUpdateVenteMethod(), responseObserver);
        }

        /**
         *
         */
        public void deleteVente(com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteRequest request,
                                io.grpc.stub.StreamObserver<com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getDeleteVenteMethod(), responseObserver);
        }

        @java.lang.Override
        public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            getGetAllVenteMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteRequest,
                                            com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteResponse>(
                                            this, METHODID_GET_ALL_VENTE)))
                    .addMethod(
                            getGetOneVenteMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteRequest,
                                            com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteResponse>(
                                            this, METHODID_GET_ONE_VENTE)))
                    .addMethod(
                            getSaveVenteMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.mba.venteservice.stubs.VenteOuterClass.SaveVenteRequest,
                                            com.mba.venteservice.stubs.VenteOuterClass.SaveVenteResponse>(
                                            this, METHODID_SAVE_VENTE)))
                    .addMethod(
                            getUpdateVenteMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteRequest,
                                            com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteResponse>(
                                            this, METHODID_UPDATE_VENTE)))
                    .addMethod(
                            getDeleteVenteMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteRequest,
                                            com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteResponse>(
                                            this, METHODID_DELETE_VENTE)))
                    .build();
        }
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public static final class VenteServiceStub extends io.grpc.stub.AbstractStub<VenteServiceStub> {
        private VenteServiceStub(io.grpc.Channel channel) {
            super(channel);
        }

        private VenteServiceStub(io.grpc.Channel channel,
                                 io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected VenteServiceStub build(io.grpc.Channel channel,
                                         io.grpc.CallOptions callOptions) {
            return new VenteServiceStub(channel, callOptions);
        }

        /**
         *
         */
        public void getAllVente(com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteRequest request,
                                io.grpc.stub.StreamObserver<com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetAllVenteMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         *
         */
        public void getOneVente(com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteRequest request,
                                io.grpc.stub.StreamObserver<com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetOneVenteMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         *
         */
        public void saveVente(com.mba.venteservice.stubs.VenteOuterClass.SaveVenteRequest request,
                              io.grpc.stub.StreamObserver<com.mba.venteservice.stubs.VenteOuterClass.SaveVenteResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSaveVenteMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         *
         */
        public void updateVente(com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteRequest request,
                                io.grpc.stub.StreamObserver<com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getUpdateVenteMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         *
         */
        public void deleteVente(com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteRequest request,
                                io.grpc.stub.StreamObserver<com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getDeleteVenteMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public static final class VenteServiceBlockingStub extends io.grpc.stub.AbstractStub<VenteServiceBlockingStub> {
        private VenteServiceBlockingStub(io.grpc.Channel channel) {
            super(channel);
        }

        private VenteServiceBlockingStub(io.grpc.Channel channel,
                                         io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected VenteServiceBlockingStub build(io.grpc.Channel channel,
                                                 io.grpc.CallOptions callOptions) {
            return new VenteServiceBlockingStub(channel, callOptions);
        }

        /**
         *
         */
        public com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteResponse getAllVente(com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetAllVenteMethod(), getCallOptions(), request);
        }

        /**
         *
         */
        public com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteResponse getOneVente(com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetOneVenteMethod(), getCallOptions(), request);
        }

        /**
         *
         */
        public com.mba.venteservice.stubs.VenteOuterClass.SaveVenteResponse saveVente(com.mba.venteservice.stubs.VenteOuterClass.SaveVenteRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSaveVenteMethod(), getCallOptions(), request);
        }

        /**
         *
         */
        public com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteResponse updateVente(com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteRequest request) {
            return blockingUnaryCall(
                    getChannel(), getUpdateVenteMethod(), getCallOptions(), request);
        }

        /**
         *
         */
        public com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteResponse deleteVente(com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteRequest request) {
            return blockingUnaryCall(
                    getChannel(), getDeleteVenteMethod(), getCallOptions(), request);
        }
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public static final class VenteServiceFutureStub extends io.grpc.stub.AbstractStub<VenteServiceFutureStub> {
        private VenteServiceFutureStub(io.grpc.Channel channel) {
            super(channel);
        }

        private VenteServiceFutureStub(io.grpc.Channel channel,
                                       io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected VenteServiceFutureStub build(io.grpc.Channel channel,
                                               io.grpc.CallOptions callOptions) {
            return new VenteServiceFutureStub(channel, callOptions);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteResponse> getAllVente(
                com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetAllVenteMethod(), getCallOptions()), request);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteResponse> getOneVente(
                com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetOneVenteMethod(), getCallOptions()), request);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<com.mba.venteservice.stubs.VenteOuterClass.SaveVenteResponse> saveVente(
                com.mba.venteservice.stubs.VenteOuterClass.SaveVenteRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSaveVenteMethod(), getCallOptions()), request);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteResponse> updateVente(
                com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getUpdateVenteMethod(), getCallOptions()), request);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteResponse> deleteVente(
                com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getDeleteVenteMethod(), getCallOptions()), request);
        }
    }

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final VenteServiceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(VenteServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_GET_ALL_VENTE:
                    serviceImpl.getAllVente((com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteRequest) request,
                            (io.grpc.stub.StreamObserver<com.mba.venteservice.stubs.VenteOuterClass.GetAllVenteResponse>) responseObserver);
                    break;
                case METHODID_GET_ONE_VENTE:
                    serviceImpl.getOneVente((com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteRequest) request,
                            (io.grpc.stub.StreamObserver<com.mba.venteservice.stubs.VenteOuterClass.GetOneVenteResponse>) responseObserver);
                    break;
                case METHODID_SAVE_VENTE:
                    serviceImpl.saveVente((com.mba.venteservice.stubs.VenteOuterClass.SaveVenteRequest) request,
                            (io.grpc.stub.StreamObserver<com.mba.venteservice.stubs.VenteOuterClass.SaveVenteResponse>) responseObserver);
                    break;
                case METHODID_UPDATE_VENTE:
                    serviceImpl.updateVente((com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteRequest) request,
                            (io.grpc.stub.StreamObserver<com.mba.venteservice.stubs.VenteOuterClass.UpdateVenteResponse>) responseObserver);
                    break;
                case METHODID_DELETE_VENTE:
                    serviceImpl.deleteVente((com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteRequest) request,
                            (io.grpc.stub.StreamObserver<com.mba.venteservice.stubs.VenteOuterClass.DeleteVenteResponse>) responseObserver);
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

    private static abstract class VenteServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        VenteServiceBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.mba.venteservice.stubs.VenteOuterClass.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("VenteService");
        }
    }

    private static final class VenteServiceFileDescriptorSupplier
            extends VenteServiceBaseDescriptorSupplier {
        VenteServiceFileDescriptorSupplier() {
        }
    }

    private static final class VenteServiceMethodDescriptorSupplier
            extends VenteServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        VenteServiceMethodDescriptorSupplier(String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }
}

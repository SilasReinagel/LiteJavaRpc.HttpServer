package io.theo.rpc.http;

import rpc.IRpcApi;
import rpc.RpcApiInfrastructure;

public final class HttpJsonRpcApiServer
{
    private final JsonRpcWebApiServer _webApiServer;

    public HttpJsonRpcApiServer(final JsonRpcWebApiServer webApiServer, final IRpcApi rpcApi)
    {
        _webApiServer = webApiServer;
        webApiServer.addCallHandlers(RpcApiInfrastructure.addAllInfrastructureCalls(rpcApi).getCallHandlers());
    }

    public void serve()
    {
        _webApiServer.serve();
    }
}


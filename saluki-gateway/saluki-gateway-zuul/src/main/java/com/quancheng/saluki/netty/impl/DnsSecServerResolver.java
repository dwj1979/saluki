package com.quancheng.saluki.netty.impl;

import java.net.InetSocketAddress;
import java.net.UnknownHostException;

import org.littleshoot.dnssec4j.VerifiedAddressFactory;

import com.quancheng.saluki.netty.HostResolver;

public class DnsSecServerResolver implements HostResolver {
  @Override
  public InetSocketAddress resolve(String host, int port) throws UnknownHostException {
    return VerifiedAddressFactory.newInetSocketAddress(host, port, true);
  }
}

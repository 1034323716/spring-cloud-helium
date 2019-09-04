package org.helium.redis.sentinel.pipeline;

import redis.clients.jedis.Response;
import redis.clients.jedis.SortingParams;
import redis.clients.jedis.ZParams;

import java.util.List;
import java.util.Set;

public interface IMultiKeyBinaryRedisPipeline {

    Response<Long> del(byte[]... keys);
    
    Response<List<byte[]>> blpop(byte[]... args);

    Response<List<byte[]>> brpop(byte[]... args);

    Response<Set<byte[]>> keys(byte[] pattern);

    Response<List<byte[]>> mget(byte[]... keys);

    Response<String> mset(byte[]... keysvalues);

    Response<Long> msetnx(byte[]... keysvalues);

    Response<String> rename(byte[] oldkey, byte[] newkey);

    Response<Long> renamenx(byte[] oldkey, byte[] newkey);

    Response<byte[]> rpoplpush(byte[] srckey, byte[] dstkey);

    Response<Set<byte[]>> sdiff(byte[]... keys);

    Response<Long> sdiffstore(byte[] dstkey, byte[]... keys);

    Response<Set<byte[]>> sinter(byte[]... keys);

    Response<Long> sinterstore(byte[] dstkey, byte[]... keys);

    Response<Long> smove(byte[] srckey, byte[] dstkey, byte[] member);

    Response<List<byte[]>> sort(byte[] key, SortingParams sortingParameters, byte[] dstkey);

    Response<List<byte[]>> sort(byte[] key, byte[] dstkey);

    Response<Set<byte[]>> sunion(byte[]... keys);

    Response<Long> sunionstore(byte[] dstkey, byte[]... keys);

    Response<String> watch(byte[]... keys);

    Response<Long> zinterstore(byte[] dstkey, byte[]... sets);

    Response<Long> zinterstore(byte[] dstkey, ZParams params, byte[]... sets);

    Response<Long> zunionstore(byte[] dstkey, byte[]... sets);

    Response<Long> zunionstore(byte[] dstkey, ZParams params, byte[]... sets);

    Response<byte[]> brpoplpush(byte[] source, byte[] destination, int timeout);

    Response<Long> publish(byte[] channel, byte[] message);

    Response<byte[]> randomKeyBinary();

}

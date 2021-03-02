package com.hld.item.item.Entity;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUt
{
    public JedisPool  initJedisPool()
    {
        // 构建连接池配置信息
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        // 设置最大连接数
        jedisPoolConfig.setMaxTotal(50);
        // 构建连接池
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, "47.101.54.97",6379,5000);

        return jedisPool;
    }



    public Jedis getJedis(JedisPool jedisPool)
    {
        // 从连接池中获取连接
        Jedis jedis = jedisPool.getResource();
        return jedis;
    }

    //读取数据
    public String getByKey(Jedis jedis,String key)
    {
        String result = jedis.get(key);
        return result;
    }

    //添加数据
    public Long appendKV(Jedis jedis,String key,String value)
    {
        return jedis.append(key,value);
    }

    public String setKV(Jedis jedis ,String key, String value)
    {
        return jedis.set(key,value);
    }

    public void close(JedisPool jedisPool,Jedis jedis)
    {
        // 将连接还回到连接池中
        jedisPool.returnResource(jedis);

        // 释放连接池
        jedisPool.close();

    }



}

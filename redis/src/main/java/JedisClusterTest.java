import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 250481
 * @date: 2021/06/02/23:32
 * @description: 集群的Jedis开发
 */
public class JedisClusterTest {
    public static void main(String[] args) {
        Set<HostAndPort> set = new HashSet<HostAndPort>();
        set.add(new HostAndPort("192.168.10.104", 6379));
        set.add(new HostAndPort("192.168.10.104", 6380));
        set.add(new HostAndPort("192.168.10.104", 6381));
        set.add(new HostAndPort("192.168.10.104", 6389));
        set.add(new HostAndPort("192.168.10.104", 6390));
        set.add(new HostAndPort("192.168.10.104", 6391));
        JedisCluster jedisCluster = new JedisCluster(set);
        jedisCluster.set("k1", "v1");
        System.out.println(jedisCluster.get("k5"));

    }
}

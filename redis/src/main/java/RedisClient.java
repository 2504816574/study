import redis.clients.jedis.Jedis;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 250481
 * @date: 2021/06/02/20:59
 * @description:
 * 3)	Jedis测试连通性
 */
public class RedisClient {


    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("192.168.10.104",6379);
        String ping = jedis.ping();
        //查看服务是否运行，打出pong表示OK
        System.out.println(ping);
    }
}

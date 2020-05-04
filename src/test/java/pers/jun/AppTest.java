package pers.jun;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */

public class AppTest {

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void test1() {
        System.out.println(Math.pow(2,2-1));
    }


    @Test
    public void test2() {
        int[] arr = {4,8,6};
        int t  =0;
        int len = arr.length;
        while(arr[t] < arr[len-1]){
            t ++;
        }
        System.out.println(t);
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0,t)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,t,arr.length - 1)));
        //int len = arr.length;
        //if(len == 0)
        //    System.out.println(false);
        //int t = 0;
        //while(arr[t] < arr[len-1]){
        //    t ++;
        //}
        //while(arr[t] > arr[len - 1]){
        //    t ++;
        //}
        //System.out.println(t == len -1 ? true : false);
    }

}

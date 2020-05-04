/**
 * Author:   Yujun Zhang
 * Date:     2020/2/27 15:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package pers.jun.util;

import java.util.Random;

/**
 * @author Yujun Zhang
 * @title Test
 * @create 2020/2/27
 * @since 1.0.0
 */
public class Test {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 3; j++) {
                int i1 = random.nextInt(8);
                float v = random.nextFloat();
                v = i1 + v;
                System.out.print(v+",");
            }
            float v1 = random.nextFloat();
            System.out.print(v1+",");
            if(i > 25)
                System.out.println("lynt");
            else
                System.out.println("ryebrand");
        }

    }

}